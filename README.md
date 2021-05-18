# spring-boot-clean-architecture-demo
An example of clean architecture with Spring Boot.

# Description
This application is designed using a [Clean Architecture pattern](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html) (also known as Hexagonal Architecture). Therefore SOLID principles are used in code, especially the Dependency Inversion Principle (do not mix up with the classic dependency injection in Spring for example).

Concretely, there are 4 main packages: Entity, use_cases(interactors), interface adapters(controller/ database) and infrastructure. These packages have to respect these rules:


* Entities :  Encapsulate Enterprise wide business rules. An entity can be an object with methods, or it can be a set of data structures and functions. 
* Use Case : It encapsulates and implements all of the use cases of the system. These use cases orchestrate the flow of data to and from the entities, and direct those entities to use their enterprise wide business rules to achieve the goals of the use case.
* Interface Adapters : This layer is a set of adapters that convert data from the format most convenient for the use cases and entities, to the format most convenient for some external agency such as the Database or the Web (Controller).


# Install
```
mvnw spring-boot:run
```
 * Model Class Generation :  
 ```
mvn test -PWithout-getter-setter
 ```
# Diagram
An example web app structured with a Clean Architecture, implemented using Spring Boot.

![Alt text](https://camo.githubusercontent.com/c330f914a721e595bd0a60af5c6001c4b0e4251025493571f1971f68aa32011f/68747470733a2f2f6269742e6c792f32766842577a37)

# Tools
JMapper is the mapping framework that aims to provide an easy-to-use, high-performance mapping between Java Beans.
* The framework aims to apply the DRY principle using Annotations and relational mapping.
* The framework allows for different ways of configuration: annotation-based, XML or API-based.

Related links: 
* [Benchmark Testing](https://www.baeldung.com/java-performance-mapping-frameworks#1averagetime)
* [JMapper Docs](https://www.baeldung.com/jmapper)
* [SquareTest](https://plugins.jetbrains.com/plugin/10405-squaretest) (Java Unit Test Generator for IntelliJ IDEA)

