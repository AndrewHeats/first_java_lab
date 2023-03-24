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