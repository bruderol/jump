# Jump

A Simple Example Project for courses for teaching project automation and test automation and other things.

## Dev Environment

How to setup your dev environment to work with the course examples and exercises.

1. You need a Java JDK 7 or 8 installation (maybe doesn't matter)

2. You need **GIT** tooling for command line installed and configured correctly
    * Download and install from https://git-scm.com/downloads
       * take newest version (2.7 or higher)
    * Documentation for using GIT can be found here:
       * https://git-scm.com/doc
       * Especialy we recommend the online version of the book https://git-scm.com/book
    * **Initial Configuration (important!!):** Make sure that you personalize your GIT by setting your username and email for commits (!! important !!):
           ```
            $ git config --global user.name "John Doe"             
            $ git config --global user.email <yourname>@<your-email-domain>.com
           ```
           see also here: https://git-scm.com/book/en/v2/Getting-Started-First-Time-Git-Setup
       
3. IntelliJ
    * You need latest version of IntelliJ IDEA Community Edition
    * Download from https://www.jetbrains.com/idea/
    
4. Gradle
    * Gradle tooling is included as gradle wrapper allready :) 

  
## Open points / Decissions

* Will they need to install a JDK or is the bundled JDK in IntelliJ sufficient? 
        * not sure about that, but it is preferrable to install it, that is why I described it above
        
* Will they need to install Gradle or Maven?
        * I decided to go for gradle in the new setup (because cooler and more state of the art)
        * Gradle is included as a wrapper allready :)
     