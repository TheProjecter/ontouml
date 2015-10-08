# Contents #


# Installing the OntoUML Editor #

## Installing the Standalone OntoUML Editor ##

**Pre-requisite: a working JRE (Java Runtime Environment).**

In the [Downloads](http://code.google.com/p/ontouml/downloads/list) tab, there are binaries for different combinations of operational systems (_viz_.: AIX, HP-UX, Linux, Mac OS X, Solaris and Windows), processor types (_viz_.: IA64-32, PowerPC, SPARC, x86 and x86-64) and widget toolkits (_viz_.: Carbon, GTK, Motif, Win32 API and WPF). You have to choose a suitable combination. The options are:

  * OS: AIX
    * Processor type: PowerPC
      * Widget toolkit: Motif
  * OS: HP-UX
    * Processor type: IA64-32
      * Widget toolkit: Motif
  * OS: Linux
    * Processor type: PowerPC
      * Widget toolkit: GTK
    * Processor type: x86
      * Widget toolkit: GTK
    * Processor type: x86-64
      * Widget toolkit: GTK
  * OS: Mac OS X
    * Processor type: PowerPC
      * Widget toolkit: Carbon
    * Processor type: x86
      * Widget toolkit: Carbon
  * OS: Solaris
    * Processor type: SPARC
      * Widget toolkit: GTK
  * OS: Windows NT and Windows 95 up to Windows 7 (The versions of Windows that use the Win32 API)
    * Processor type: x86
      * Widget toolkit: Win32 API
      * Widget toolkit: WPF
    * Processor type: x86-64
      * Widget toolkit: Win32 API

If you have no idea of what are those options, just download [OntoUMLEditor1.2.0.win32.win32.x86.zip](http://ontouml.googlecode.com/files/OntoUMLEditor1.2.0.win32.win32.x86.zip) (you are probably using a 32 bit Windows).

After downloading, unzip the file, enter in the folder "eclipse" and run OntoUMLEditor`[.exe`].

## Installing the OntoUML Editor Eclipse plug-in ##

**Pre-requisite: a working JRE (Java Runtime Environment).**

  1. Download the Eclipse Modeling Tools package for your OS at http://www.eclipse.org/downloads and unzip it (in case you do not have a working Eclipse);
  1. If you have manually installed a previous version of OntoUML Editor in the "dropins" Eclipse folder, just delete the OntoUML Editor files from "dropins";
  1. Installing:
    * Installing from the repository (Recomended):
      * In Eclipse 3.5.x to 3.7.x (attention, the OntoUML Editor still does not properly work with these versions of Eclipse!), go to Help → Install New Software... → Add..., then put "OntoUML Editor" (without quotes) in the "Name" field and "http://ontouml.googlecode.com/svn/trunk/OntoUMLUpdateSite" (without quotes) in the "Location" field and then click OK. Now, deselect the button "Group items by catgory", select "OntoUML Editor" and click on Next → Next → Read and accept the terms of the license → Finish. If Eclipse complains about unsigned content, just click OK;
      * In Eclipse 3.4.2 (one can get this version at http://www.eclipse.org/downloads/packages/eclipse-modeling-tools-includes-incubating-components/ganymedesr2), go to Help → Software Updates → Available Software → Add Site and add the address http://ontouml.googlecode.com/svn/trunk/OntoUMLUpdateSite and click on OK. After, click on "Manage Sites", select this url or "OntoUML Editor Update Site" (if it was not selected by default) and click on OK. Click on Refresh. Now, open the repository "OntoUML Editor Update Site", select OntoUML Editor and click on Install.
    * Installing manually (warning: if you install manually, you will not be notified of updates): Download the latest zip file from the Downloads tab and unzip it in the "dropins" folder of your Eclipse.
  1. Restart Eclipse when the installation finishes;
  1. It is recommended to periodically make a search for updates (only works if installed from the repository): Go to Help → Software Updates → Installed Software and click on Update. You should make a backup of your models before opening them with a new version of the editor.

# Creating an OntoUML model #

## Creating an OntoUML Model in the Standalone OntoUML Editor ##

  1. Execute the standalone OntoUML Editor;
  1. Click on File → New → OntoUML Diagram → Name the file → Next → Finish;
  1. You are ready to create an OntoUML model!

## Creating an OntoUML model in the OntoUML Editor Eclipse Plug-in ##

  1. Execute Eclipse;
  1. Create a project (if you don't have one): Click in File → New → Project... → General → Project → Next → Name it → Next → Next → Finish;
  1. Create an OntoUML diagram: Right click on the folder just created → New → Example → OntoUML Diagram → Next → Give a name for the file → Next → Next → Finish;
  1. You are ready to create an OntoUML model!

_Thank you for using the OntoUML Editor!_