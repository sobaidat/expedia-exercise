# expedia-exercise
Expedia Coding exercise

- Required software
  - Java JDK 7 >= or higher
  - Apache Tomcat 7.0
  - Eclipse (for development purpose)
 
- Configure Eclipse
  - Open Eclipse.
  - In the Eclipse menu bar select "Window > Show View > Servers".
  - In the "Servers" view right click on the white space and select "New > Server".
  - Select the Link "Download additional server adapters". Eclipse now downloads available server adapters.
  - Select "Apache Tomcat 7.0" from the list.

 
- Import Java EE application
  - Open Eclipse.
  - In the menu bar select "File > Import".
  - Enter "Existing" into "Select an import source".
  - Select "Existing Projects into Workspace" and click "Next".
  - Select the root directory of the application.

  
- Configure Eclipse for deployment 
  - In the "Servers" view right click on the Apache Tomcat server and select "Add and Remove".
  - Select your application and press "Add" to move it in the right section.
  - Press "Finish".
 
-Testing
  - Select the Tomcat server in the "Servers" view and richt click into the context menu, then select "Debug" 
    (make sure the Server is not running already, if so stop the Server first).
  - Go to your web browser and enter http://localhost:8080/expedia-exercise/Hotels
