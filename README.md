# second_java_lab

Task of lab


Modify the code of the first lab as follows: Create an abstract class Building with the following fields:
isResidential whether this building is residential
yearOfBuilding: year of building construction
The Building abstract class must contain the calculateConstructionPrice() abstract method, which will be overridden in subclasses of places to implement a specific construction mechanism.
Modify the Zoo class so that it inherits from the Building class and reuses fields and attributes from the parent class
Create a Bank class - this class should have additional fields, such as the number of cashiers, opening and closing hours, the maximum number of people that can be in the bank.
For all classes, you should implement the conversion of the object into a string representation (the use of the @ToString annotation from the lombok library is preferred)
Also create a class BuildingManager to demonstrate the working of the created classes. In the main() method, create class objects by adding them to a List parameterized by the Building type and output them to the console using a for-each loop
For the task described in the first level, you should add:

a method that allows you to add a new object in the *Manager class, which is a descendant of the abstract class add* (for example, the method addReptile(final Reptile reptile), if the abstract class is called Reptile)
  two methods for finding objects in the *Manager class (for example, ReptileManager). For example, it can be a method for finding all reptiles that weigh more than a given number of kilograms -findAllWithWeightGreaterThan(int weight) , or a method for finding all reptiles that have legs - findWithLegs()
Search methods should use streams and lambda expressions

It's also worth adding two more child classes for your abstract class. The choice of classes should be done independently, while the defense should explain your choice

When performing the Level-2 task, the implemented main method has
create 2 objects of each of the created classes
add them to the *Manager class object,
call the created search methods and output the search result to the console

Task description
For the Level 2 task, draw a UML class diagram.
Recommendations for performing this task
When writing a program, you must use the java code convention.
It is not necessary to display all set/get pairs (aka setters/getters) for class attributes to avoid cluttering the diagram
To implement search/sort operations, you should implement a separate class (the name of which must contain the word Manager)
UML class diagram can be drawn in draw.io, MS Visio or any other convenient tools. The resulting diagram should be uploaded to Google Drive in the format ClassDiagram_Programming_FirstName_LastName_GroupNumber.pdf
Level 1

Convert the project with the 2nd job code so that it can be built with maven.
At the same time, it is worth doing a merge command of the previous work into the master (or main) branch
Important: the assembly of the project should be performed from the console with the mvn clean package command

To create a Maven project, you can use the "mvn archetype:generate" command, which creates the basic structure of the project using the selected template (archetype).
To create a project, you need to open a command line or terminal and execute the following command:

mvn archetype:generate -DgroupId=ua.lviv.iot -DartifactId=work -Dversion=1.0-SNAPSHOT -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.0 -DinteractiveMode=false

This command uses the "maven-archetype-quickstart" template, which contains a basic set of files and directories for creating a Java project.
The "-DgroupId" option specifies the project group ID, and "-DartifactId" specifies the artifact identifier (project name).

When the command is executed, Maven creates a directory with the name specified in "-DartifactId" and populates it with the base set of files and directories for the Maven project.
Level 2

Unit testing (unit testing) is a method of software testing that takes place in the separate testing of each module of the program code. A module is the smallest part of a program that can be tested. In procedural programming, we consider a module to be a separate function or procedure. In object-oriented programming — interface, class. Unit tests, or unit tests, are developed during the development process by programmers and, sometimes, white-box testers.

Test-driven development (TDD), Test-driven development (TDD) is a software development technology that uses short development iterations that begin with preliminary writing of tests that begin to improve new features or functions. Each iteration aims to develop code that passes these tests. Finally, a programmer or group refines the code to accept the changes. One of the key points TDD makes is that preparing tests before writing the code itself speeds up the process of making changes. It is worth noting that test-driven development is a software development methodology, not software testing.

When using TDD, the coverage will go towards 100% - the last test simulates a real scenario, and the code should implement this scenario. A test with 100% coverage is sometimes difficult (when bugs appear at the last moment and need to be fixed now). A separate issue is testing the setXXX() and getXXX() methods (where XXX is the name of the private field of the class, aka setters and getters). The golden rule is that these methods do not require writing tests if they only assign the value of a class attribute or return its value. regardless, it is possible to use libraries, also called EntityTests - which automatically perform tests on setters and getters, as well as methods equal to hashCode()


At this level, you should write unit tests for the code of laboratory work #3 and reach the test coverage level of 80%. Obviously, 100% coverage (ie every line of code is covered by tests) is ideal. It is also obvious that writing tests requires a significant amount of time, which is always married. One of the options to avoid
avoiding this problem is the TDD approach. For this laboratory, the compromise value will be 80% test coverage

To add JUnit 5 to your Maven project, you need to change the dependency(s) in the pom.xml file:
<dependency>
    <groupId>org.junit.vintage</groupId>
    <artifactId>junit-vintage-engine</artifactId>
    <version>5.8.1</version>
    <scope>test</scope>
</dependency>

After that, you should update the project in your IDE to use the annotations and code from this dependency
Level 3
At this level, you should enable the following plugins in pom.xml
- the Jacoco plugin, which performs code verification with tests (in the build section):
- Spotbugs plugin, which leaves an automatic code quality check and detected errors in the code (in the reporting section):
- PMD plugin (in the reporting section):
- Checkstyle plugin - checks compliance with the code (in the reporting section):


After completing the work, execute the mvn site command and view the result of its execution in the target/site folder (by opening the index.html file)
All errors detected by Spotbugs, PMD, and Checkstyle plugins should be corrected in the code (except errors related to missing comments).

To add SpotBugs to your Maven project, add the following code to the <build> and <plugins> sections:

Note that we specified the scope limitation for SpotBugs as "provided". This means that SpotBugs will only be used during code review and will not be added to the main JAR file of the project.

You can start SpotBugs with the following command from the console:
mvn spotbugs: check

You can also run SpotBugs with additional options using the command:
mvn spotbugs