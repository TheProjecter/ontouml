# Contents #


# Installing the Transformation: #
  1. Download the version 3.4.2 of Eclipse Modeling Tools package for your OS at http://www.eclipse.org/downloads/packages/eclipse-modeling-tools-includes-incubating-components/ganymedesr2 and unzip it (in case you do not have a working Eclipse);
  1. Execute Eclipse;
  1. Create an ATL project (if you do not have one): Click in File → New → Project... → ATL → ATL Project → Next → in “Name” put “OntoUML2Alloy” (without quotes) → Finish → Click in “Yes” in the “Open Associated Perspective” window;
  1. Open your ﬁle manager and ﬁnd the folder of your just created OntoUML2Alloy ATL project. Then, download the ﬁles that are at http://ontouml.googlecode.com/svn/trunk/OntoUML2Alloy to this folder;
  1. Download the latest version of Alloy Analyzer from http://alloy.mit.edu/community/software to your OntoUML2Alloy project folder;

# Transforming an OntoUML Model into an Alloy Specification: #
  1. Execute Eclipse;
  1. Click on Run → Run Conﬁgurations... → ATL Transformation → New launch conﬁguration → In “Name” put “OntoUML2Alloy” (without quotes), inside “Project”, in “Name” choose “OntoUML2Alloy” and in “ATL ﬁle” choose “/OntoUML2Alloy/OntoUML2Alloy.atl”. Within “Metamodels”, click on the “Workspace...” button, open “OntoUML2Alloy” and select “OntoUML.ecore”. Within “Source Models”, click on the “Workspace...” button and search and open your OntoUML model (the ﬁle with the “.ontouml” extension and not the “.ontouml\_diagram” one). Within “Target Models”, put “/OntoUML2Alloy/you\_can\_delete\_this\_file” (without quotes) in the “Out:” ﬁeld;
  1. Click on the “Common” tab and select “Debug” and “Run” within “Display in favorites menu”;
  1. Click in “Apply” → “Close”;
  1. Click in the right side of the “Run” button → “OntoUML2Alloy”. The OntoUML2Alloy transformation will generate a ﬁle named “specification.als”;
  1. Open your ﬁle manager and ﬁnd the folder of your OntoUML2Alloy ATL project. Then, execute the ﬁle “alloy4.jar” (the Alloy Analyzer). Within Alloy Analyzer, click in “Open” and ﬁnd the ﬁle “specification.als”. Then, click in “Options” → “Visualize Automatically”. Finally, click in “Execute” → “Run run$1”;
  1. You can optionally use our predeﬁned theme to visualize the generated Kripke structure: Within the window of the generated ﬁgure, click in “Theme” → “Load Theme...” → Select “alloy\_analyzer\_theme\_world\_structure.thm” → “Open”.

_Thank you for using the OntoUML2Alloy ATL transformation!_