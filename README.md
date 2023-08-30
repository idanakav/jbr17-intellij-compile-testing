# jbr17-intellij-compile-testing
Demonstrate the issue of compile-testing usage with jbr17 

```
./gradlew test

Demo > test() FAILED
    java.lang.NullPointerException at Demo.kt:27


java.lang.NullPointerException: Null javaCompiler
	at com.google.testing.compile.AutoValue_Compiler.<init>(AutoValue_Compiler.java:30)
	at com.google.testing.compile.Compiler.compiler(Compiler.java:63)
	at com.google.testing.compile.Compiler.javac(Compiler.java:57)
	at com.google.testing.compile.JavaSourcesSubject$CompilationClause.compilation(JavaSourcesSubject.java:308)
	at com.google.testing.compile.JavaSourcesSubject$CompilationClause.compilesWithoutError(JavaSourcesSubject.java:286)
	at com.google.testing.compile.JavaSourcesSubject.compilesWithoutError(JavaSourcesSubject.java:126)
	at Demo.test(Demo.kt:27)
```
