# 1.2.1 (only for the OntoUML Editor Eclipse plug-in): #

## Bugs fixed: ##

[Issue 26](https://code.google.com/p/ontouml/issues/detail?id=26):	It is not possible to install the OntoUML Editor Eclipse plug-in because of a missing requirement (bundle com.abstratt.content 1.1.0).

# 1.2.0: #

## Enhancements: ##

[Issue 9](https://code.google.com/p/ontouml/issues/detail?id=9):	Inseparable, Essential and Read-only properties.

[Issue 16](https://code.google.com/p/ontouml/issues/detail?id=16):	When the user set the meta-attribute isExtensional to true in a «collective», then all of its meronymic relationship should have its meta-attributes isEssential automatically set to true.

[Issue 17](https://code.google.com/p/ontouml/issues/detail?id=17):	When the user set the meta-attribute isEssential to true in a «memberOf» relationship, then the «collective» representing the whole should have its meta-attribute isExtensional automatically set to true.

[Issue 18](https://code.google.com/p/ontouml/issues/detail?id=18):	When the user creates a «datatypeRelationship» that have a «structuredDatatype» in its source association end, then the target association end should have its meta-attribute isReadOnly set to true.

[Issue 19](https://code.google.com/p/ontouml/issues/detail?id=19):	When the user sets the meta-attribute isEssential to true in a meronymic relationship (viz. «componentOf», «memberOf», «subCollectionOf» and «subQuantityOf»), then the meta-attribute isImmutablePart should be automatically set to true and, in the target association end, the meta-attribute isReadOnly should be automatically set to true.

[Issue 20](https://code.google.com/p/ontouml/issues/detail?id=20):	When the user sets the meta-attribute isInseparable to true in a meronymic relationship (viz. «componentOf», «memberOf», «subCollectionOf» and «subQuantityOf»), then the meta-attribute isImmutableWhole should be automatically set to true and, in the source association end, the meta-attribute isReadOnly should be automatically set to true.

[Issue 21](https://code.google.com/p/ontouml/issues/detail?id=21):	When the user sets the meta-attribute isImmutablePart to true in a meronymic relationship (viz. «componentOf», «memberOf», «subCollectionOf» and «subQuantityOf»), then the meta-attribute isReadOnly should be automatically set to true in the target association end.

[Issue 22](https://code.google.com/p/ontouml/issues/detail?id=22):	When the user sets the meta-attribute isImmutableWhole to true in a meronymic relationship (viz. «componentOf», «memberOf», «subCollectionOf» and «subQuantityOf»), then the meta-attribute isReadOnly should be automatically set to true in the source association end.

## Bugs fixed: ##

[Issue 11](https://code.google.com/p/ontouml/issues/detail?id=11):	The editor does not allow a class to be the target of more than one «mediation» relationship.

[Issue 12](https://code.google.com/p/ontouml/issues/detail?id=12):	The editor allows the creation of two «mediation» relationships x and y having the same ground, i.e., domain(x) = domain(y) and codomain(x) = codomain(y).

[Issue 13](https://code.google.com/p/ontouml/issues/detail?id=13):	There should be a syntactical constraint to guarantee that when a (meronymic) relationship is non-shareable, then the extremity connected to the whole must have a cardinality of exactly one.

[Issue 14](https://code.google.com/p/ontouml/issues/detail?id=14):	The editor allows the creation of a «datatypeRelationship» from a «simpleDatatype».

[Issue 15](https://code.google.com/p/ontouml/issues/detail?id=15):	There should be a syntactical constraint to guarantee that every relationship stereotyped as «datatypeRelationship» that have a «structuredDatatype» in its source association end must have the meta-attribute isReadOnly = true in its target association end.

[Issue 23](https://code.google.com/p/ontouml/issues/detail?id=23):	In both toolbar and class stereotype, the name "structuralDatatype" should be "structuredDatatype".