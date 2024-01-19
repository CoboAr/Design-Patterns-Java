# Adapter Design Pattern    

Implementation of Adapter Design Pattern

Adapter Pattern (Structural Pattern):
<ul>
  <li>Intent: Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.</li>
  <li>Motivation: Sometimes a class that’s designed for reuse is not reusable only because its interface does not match the domain specific interface an application requires.</li>
</ul>


## How does it work?
Example:   
There is a class called Utility that provides selective copying of documents. Utility class has a copy(…) method. It
contains a list of documents. It also assumes that the documents it contains implement the Copyable interface. There is also a Document class that works with Utility class by implementing the Adapter Design Pattern.

## Demo

https://github.com/CoboAr/Design-Patterns-Java/assets/144629565/1b4a1cd3-7b6d-4ffc-af60-152730500f22

Enjoy! And please do let me know if you have any comments, constructive criticism, and/or bug reports.
## Author
## Arnold Cobo


