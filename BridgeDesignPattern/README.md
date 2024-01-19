# Bridge Design Pattern

Implementation of Bridge Design Pattern   

Bridge Pattern (Structural Pattern):
<ul>
  <li>Intent: Decouple an abstraction from its implementation so that the two can vary independently.</li>
</ul>

## How does it work?
Example: We would like to have an app that can encrypt two kinds of information: user-profile and message. The user-profile is in terms of name and id. The message is in terms of strings stored in an array. The app supports two types of encryption: EncryptionOne and Encryption Two.
When EncryptionOne is applied to a string, it is encrypted by reversing it. When EncryptionOne is applied to an integer, it is encrypted by multiplying it by 2 and then adding 1 to the result of that multiplication.
When EncryptionTwo is applied to a string, it is encrypted by prefixing and suffixing it with 2. When EncryptionIwo is applied to an integer, it is encrypted by multiplying it by 3 and then adding 2 to the result of that multiplication.
Let's explain the encryption types with examples: When EncryptionOne is applied to a user-profile with name "john" and id 5, the name is encrypted to "nhoj"; and the id is encrypted to 11 (i.e. [5*2]+1). But, when EncryptionOne is applied to a message with strings "hello" and "world", they are encrypted to "olleh" and
"drow". When EncryptionTwo is applied to the same user-profile, the name is encrypted to "2john2"; and the id is encrypted to 17 (i.e. [5*3]+2). But when EncryptionTwo is applied to the same message, the strings in it are encrypted to "2hello2" and "2world2".
The bridge design pattern is to be applied to address this situation. In this regard, the root class of the
"Abstraction" hierarchy of the pattern is named Abstraction and the root class of the "Implementor" hierarchy of the pattern is named Implementation. Fill up the code fragments given below so that the design pattern is captured appropriately, and the program can be run. When the given main method is run, the output should be as follows:   

<img width="654" alt="Screenshot 2024-01-19 at 1 45 22 AM" src="https://github.com/CoboAr/Design-Patterns-Java/assets/144629565/b79d5805-7477-4d19-b975-d3879dc8f9b3">

## Demo

https://github.com/CoboAr/Design-Patterns-Java/assets/144629565/043d4a79-03ed-4680-bf9a-7f09c88fb4d6

Enjoy! And please do let me know if you have any comments, constructive criticism, and/or bug reports.
## Author
## Arnold Cobo
