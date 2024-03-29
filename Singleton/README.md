# Singleton Design Pattern
Implementation of Singleton design pattern.

Singleton Pattern (Creational Pattern):
<ul>
    <li>Intent: Ensure a class only has one instance and provide a global point of access to it.</li>
    <li>Motivation:It is important for some classes to have exactly one instance. A good solution is to make the class itself responsible for keeping track of its sole instance. The class can ensure that no other instance can be created and it provides a way to access the instance.</li>
</ul>

## How does it work?

Record class is a java class that should have only instance of the class. Applying the singleton design pattern to this class, will make it work.
When the main method is run for the first time, a text file called record.txt should get created contain-ing two lines as follows:     
    
Currently the file record.txt contains the following lines:     
Hello-1     
Hello-2     

When the main method is run again, the file record.txt should have two more lines appended. There-fore, the file then should contain the following lines as follows:

Currently the file record.txt contains the following lines:      
Hello-1      
Hello-2     
Hello-1      
Hello-2      

Thus, every run should append the two lines to the record.txt file. And, consequently the console out-put changes.

## Demo

https://github.com/CoboAr/Design-Patterns-Java/assets/144629565/02883eca-2116-4c72-a337-0c6d1c513008

Enjoy! And please do let me know if you have any comments, constructive criticism, and/or bug reports.
## Author
## Arnold Cobo
