#This text will teach how to generate the code needed to run the OntoUML.
# Introduction #

Any change needed, in the procedure to generate code, please write it here.

## GenModel ##
In the Genmodel open the genmodel click on the OntoUML icon ( not in the package ), go to the properties(righ click "show properties view") window and make this settings:
-Model
> - Model Plug-in Variables = OCL\_ECORE=org.eclipse.ocl.ecore
-Templates & Merge
> - Dynamic Templates = true
> - Template Directory = Files where **.javajet files where ( Usualy /OntoUML/templates )**


After generate the code of the URML maybe could be needed to change the MANIFEST FILE.
add the lines(with space) in the Export package property:
> OntoUML.URML,
> OntoUML.URML.impl,
> OntoUML.URML.util

## GMFGen ##

Turn on OCL Validation.
Gen Diagram Container EditPart:

**Validation Decorators -> True**

**Validation Enabled ->True**

**Validation Decorator Provider Priority -> highest**

**Validation Provider Priority ->  highest**

**LiveValidation UI Feedback-> true**

# Details #

Add your content here.  Format your content with:
  * Text in **bold** or _italic_
  * Headings, paragraphs, and lists
  * Automatic links to other wiki pages