module world_structure

some abstract sig World {
	access: set World,
	previousCollapsed: lone CollapsedWorld, // previous immediate moment.
	nextCollapsed: lone CollapsedWorld, // next immediate moment.
	previousPossible: set PossibleWorld, // previous immediate moment.
	nextPossible: set PossibleWorld // next immediate moment.
}{
	access = previousCollapsed + nextCollapsed +previousPossible + nextPossible // The actual moment can access the preview immediate moment, the next immediate moment, or both.
	this not in access // Non local accessibility.
	all w1, w2: CollapsedWorld | (w1 in w2.@previousCollapsed) <=> (w2 in w1.@nextCollapsed) // Iff a moment t1 is the next immediate moment of a moment t2, then t1 is the preview immediate moment of the momemt t2.
	all w1, w2: PossibleWorld | (w1 in w2.@previousPossible) <=> (w2 in w1.@nextPossible) // Iff a moment t1 is the next immediate moment of a moment t2, then t1 is the preview immediate moment of the momemt t2
	all w1: CollapsedWorld, w2: PossibleWorld | (w1 in w2.@previousCollapsed) <=> (w2 in w1.@nextPossible) // Iff a moment t1 is the next immediate moment of a moment t2, then t1 is the preview immediate moment of the momemt t2
	all w1: CollapsedWorld, w2: PossibleWorld | (w1 in w2.@nextCollapsed) <=> (w2 in w1.@previousPossible) // Iff a moment t1 is the next immediate moment of a moment t2, then t1 is the preview immediate moment of the momemt t2
	this not in this.^(@previousCollapsed + @previousPossible) // There are no temporal cicles in the past.
	this not in this.^(@nextCollapsed + @nextPossible) // There are no temporal cicles in the future.
	#((@nextCollapsed + @nextPossible).this) <= 1 // There are no joining histories, i.e., a world cannot be the next immediate moment of more than one world.
}
abstract sig CollapsedWorld extends World {} {
--	#(previousCollapsed + nextCollapsed) >= 1 and #(previousCollapsed + nextCollapsed) <= 2 // The actual moment have to access at least one real moment and at maximum two real moments
	--#access >= 1 and #(previousCollapsed + nextCollapsed) <= 2 // The actual moment have to access at least one real moment and at maximum two real moments
}
abstract sig PossibleWorld extends World {} {
	--#access >= 1 and #(previousCollapsed + nextCollapsed) <= 2 // The actual moment have to access at least one real moment and at maximum two real moments.
}
one sig CurrentWorld extends CollapsedWorld {} {
	--this not in this.^@previousCollapsed // The current world cannot be in its own past. (acho q a linha 16 dá conta disso)
	no nextCollapsed // There is no other current or past world in the future of this current world.
	no x: FutureWorld | x in this.^@previousPossible
	no x: CounterfactualWorld | x in this.^@nextPossible
}
sig PastWorld extends CollapsedWorld {} {
	CurrentWorld in this.^@nextCollapsed // All past worlds can reach the current moment.
	CurrentWorld not in this.^@previousCollapsed
	no x: FutureWorld | x in this.^@previousPossible
}
sig FutureWorld extends PossibleWorld {} {
	CurrentWorld in this.^@previousCollapsed // All future worlds can reach the current moment.
	no x: PastWorld | x in previousCollapsed
	no nextCollapsed
	no x: CounterfactualWorld | x in this.^@previousPossible
	no x: CounterfactualWorld | x in this.^@nextPossible
}
sig CounterfactualWorld extends PossibleWorld {} {
	CurrentWorld in this.^@access // All counterfactual worlds can reach the current moment.
	no nextCollapsed
	no x: FutureWorld | x in this.^@previousPossible
	no x: FutureWorld | x in this.^@nextPossible
}

run{
	no PastWorld
	no FutureWorld
	no CounterfactualWorld
} for 1
