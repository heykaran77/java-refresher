# Java Refresher

A structured walkthrough of Java concepts from fundamentals to concurrency. Follow the stages in order — each stage builds on the previous one.

---

## Stage 1 — Basics

| # | File | Covers |
|---|------|--------|
| 1 | [basic/hello.java](basic/hello.java) | First program, `println`, int arithmetic |
| 2 | [basic/datatype.java](basic/datatype.java) | Primitive types — `int`, `float`, `long`, `short`, `boolean`, numeric literals |
| 3 | [basics/UserInputs.java](basics/UserInputs.java) | Reading input via `Scanner`, `BufferedReader` |
| 4 | [basics/Enums.java](basics/Enums.java) | Simple enums, enums with fields and constructors |

---

## Stage 2 — Control Flow

| # | File | Covers |
|---|------|--------|
| 5 | [control/forloop.java](control/forloop.java) | `for` loop |
| 6 | [control/dowhile.java](control/dowhile.java) | `do-while` loop |
| 7 | [algorithms/largestthree.java](algorithms/largestthree.java) | `if-else` chains |

---

## Stage 3 — Strings

| # | File | Covers |
|---|------|--------|
| 8 | [strings/string.java](strings/string.java) | String immutability, `==` vs value equality, concatenation |
| 9 | [strings/stringbuffer.java](strings/stringbuffer.java) | `StringBuffer` — `append`, `insert`, `length`, `capacity` |

---

## Stage 4 — Arrays

| # | File | Covers |
|---|------|--------|
| 10 | [arrays/arrays.java](arrays/arrays.java) | 1D arrays, 2D arrays, `Math.random()` |
| 11 | [arrays/jaggedarrays.java](arrays/jaggedarrays.java) | Jagged (ragged) arrays |
| 12 | [arrays/arrofobj.java](arrays/arrofobj.java) | Arrays of objects |

---

## Stage 5 — OOP: Objects & Classes

| # | File | Covers |
|---|------|--------|
| 13 | [objects/classndobj.java](objects/classndobj.java) | Defining a class, creating objects, calling methods |
| 14 | [objects/encapsulation.java](objects/encapsulation.java) | `private` fields, getters and setters |
| 15 | [objects/statickey.java](objects/statickey.java) | `static` fields, static blocks, constructors |
| 16 | [objects/inheritance.java](objects/inheritance.java) | Inheritance, varargs (`int...`) |

---

## Stage 6 — OOP: Advanced

| # | File | Covers |
|---|------|--------|
| 17 | [oop/inheritance.java](oop/inheritance.java) | `extends`, `super`, method overriding |
| 18 | [oop/Poly.java](oop/Poly.java) | Polymorphism — runtime dispatch |
| 19 | [oop/FinalKey.java](oop/FinalKey.java) | `final` keyword — preventing override and subclassing |
| 20 | [oop/AbstractKey.java](oop/AbstractKey.java) | Abstract classes and abstract methods |
| 21 | [oop/Interface.java](oop/Interface.java) | Interfaces — constants, abstract methods |
| 22 | [oop/InterfaceImplements.java](oop/InterfaceImplements.java) | Implementing interfaces |
| 23 | [oop/Calc.java](oop/Calc.java) | Basic calculator class |
| 24 | [oop/AdvCalc.java](oop/AdvCalc.java) | Extended calculator |
| 25 | [oop/VAdvCalc.java](oop/VAdvCalc.java) | Further extended calculator |
| 26 | [oop/AnonInnerClass.java](oop/AnonInnerClass.java) | Inner classes, anonymous classes |

---

## Stage 7 — Functional Programming

| # | File | Covers |
|---|------|--------|
| 27 | [functional/LambdaFunc.java](functional/LambdaFunc.java) | Lambda syntax vs anonymous class |
| 28 | [functional/LambdaFunc02.java](functional/LambdaFunc02.java) | Lambda with return value |
| 29 | [functional/Functional_Interface.java](functional/Functional_Interface.java) | `@FunctionalInterface`, default and static methods in interfaces |

---

## Stage 8 — Exception Handling

| # | File | Covers |
|---|------|--------|
| 30 | [exceptions/TryCatch01.java](exceptions/TryCatch01.java) | `try-catch`, catching `Exception` |
| 31 | [exceptions/FinallyExc.java](exceptions/FinallyExc.java) | `finally` block, resource cleanup |
| 32 | [exceptions/Exceptionshandling.java](exceptions/Exceptionshandling.java) | Multiple exception types, `NullPointerException`, `ArrayIndexOutOfBoundsException` |
| 33 | [exceptions/ThrowCustomExceptions.java](exceptions/ThrowCustomExceptions.java) | Custom exceptions, `throw` and `throws` |

---

## Stage 9 — Collections & Stream API

| # | File | Covers |
|---|------|--------|
| 34 | [Collections/forEach.java](Collections/forEach.java) | Enhanced `for-each` loop |
| 35 | [Collections/ArrayListC.java](Collections/ArrayListC.java) | `ArrayList`, `Collection`, `List` interface |
| 36 | [Collections/SetsCollection.java](Collections/SetsCollection.java) | `HashSet`, `LinkedHashSet`, `TreeSet`, `Iterator` |
| 37 | [Collections/MapsJava.java](Collections/MapsJava.java) | `HashMap`, iterating key-value pairs |
| 38 | [Collections/ComparableNComparator.java](Collections/ComparableNComparator.java) | Sorting with `Comparable` and `Comparator` |
| 39 | [Collections/StreamAPI.java](Collections/StreamAPI.java) | Stream API — `filter`, `map`, `forEach` |

---

## Stage 10 — Concurrency

| # | File | Covers |
|---|------|--------|
| 40 | [Threads/Threads01.java](Threads/Threads01.java) | Creating threads by extending `Thread` |
| 41 | [Threads/Threads02.java](Threads/Threads02.java) | `Runnable` interface — avoids multiple-inheritance limitation |
| 42 | [RaceConditions89.java](RaceConditions89.java) | Race conditions, `synchronized` keyword |
