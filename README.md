PJ
==

Full documentation is at  [pj.lorentzos.com](http://pj.lorentzos.com).

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


Installation
---------

TODO: <s>Download the latest version [directly](PJ/raw/master/PJ-latest.jar). <s>

Or via gradle:
```
dependencies {
    compile 'com.lorentzos.pj:PJ:x.x.x'
}
```

Find the latest version at [Gradle please](http://gradleplease.appspot.com/#pj)


Use
---

To create a Java file from PJ simply:

```sh
$ java -jar PJ-0.1.0.jar <file> [-options]
```

Options include:

  -c | -compile
      To generate .java files and compile them.
      
  -cd
      To compile but not generate .java files.
      
  -o: outputpath
      To specify the output path.




Development
------

The grammar is being designed with Antlr4. A visitor is used to emit the results from the parsed tree.
The project can easily be imported with Gradle. Todo<s>`assembleCompiler` task generates the latest Compiler jar<s>

Also in plans there is Intellij Plugin from Syntax Highlightting and a probably a Gradle plugin to automate Compiler's job (+Android support).


License
------

MIT
