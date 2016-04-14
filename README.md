# Jump

A very very basic and simple example Java project for teaching courses and as a quick start for examples.

## Dev Environment

How to setup your dev environment to work with the course examples and exercises.

1. **Java JDK 8**:
    * Download and install from http://www.oracle.com/technetwork/java/javase/downloads
   
2. **GIT** (version 2.7 or higher)
    * Download and install from https://git-scm.com/downloads
    * Recommended tutorials for using GIT:
        * https://git-scm.com/doc
        * online version of the book https://git-scm.com/book
    * **Initial Configuration (important!!):**
         * personalize your GIT by setting your username and email for commits:
         ```
          > git config --global user.name "<your-username>"             
          > git config --global user.email <yourname>@<your-email-domain>.com
          ```
         see also here: https://git-scm.com/book/en/v2/Getting-Started-First-Time-Git-Setup
       
3. IntelliJ
    * latest version of IntelliJ IDEA Community Edition 
       (this tutorial is based on version 15)    
    * Download from https://www.jetbrains.com/idea/
    
4. Gradle
    * Gradle tooling is included as gradle wrapper allready :smile: 

5. Clone Source Repository from GIT:
   * Create a folder on your local disk, where you want to work with the example sources
   * Open command line (under Windows use the GIT Bash) inside this folder
   * type following git command:
   ```
   git clone https://github.com/bruderol/jump.git
   ```
   This needs to be done from command line, 
   because IntelliJ can not import a gradle project directly from source control somehow
      
6. Open project in IntelliJ
    * File / New / Project from Existing Sources ...
    * Select the `jump` project folder that has been checked out to your directory
    * Select `Import project from external model:` - `Gradle`
    * Select `Use default gradle wrapper` and a JVM (the installed JDK 8) 

7. Starting the application from IntelliJ
    * In Project Explorer: Browse to the Java Class `JumpExampleApp` (in `src` folder ...)
    * Select `Run JumpExampleApp` from context menu
    * See output in the run window console    

8. Running the tests from IntelliJ:
    * Browse to `src/test/java`
    * Select `Run All Tests` from context menu
    * all tests should be passed and green (currently one)
  
9. For more information on how to work with GIT in IntelliJ we recommend to read:
   https://www.jetbrains.com/help/idea/2016.1/using-git-integration.html

   
## Open points / Decissions

* Will we need to install Gradle or Maven?
        * I decided to go for gradle in the new setup (because cooler and more state of the art)
        * Gradle is included as a wrapper allready :)
 
