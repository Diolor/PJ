PJ
==

Full documentation is at [pj.lorentzos.com](http://pj.lorentzos.com)

PJ (stands for Pythonic Java) is a template language for Java that resembles Python's indent grammar and compiles into native Java. Inspired by Python and [Jade](http://jade-lang.com).


---

The grammar is currently under development.

The aim is to create more a readable source code of Java. Ommiting braces can create 30% reduction in lines of the source code.



Syntax
------
PJ is a clean, whitespace sensitive syntax for writing Java. Here is a simple example:


Classic Java:
```java
public class HelloWorld {

    public static void main(String[] args) {
        printHello();
    }
    
    private void printHello(){
        System.out.println("Hello, World");
    }
    
}
```

PJ:
```java
public class HelloWorld

    public static void main(String[] args)
        printHello()
    
    private void printHello()
        System.out.println("Hello, World")
```





Development
------

The grammar is being designed with Antlr4. A visitor is used to emit the results from the parsed tree.


License
------

MIT