//package net.newProject.journalApp.controller;
//
//import net.newProject.journalApp.entity.JournalEntry;   // Importing Package (schema) from entity package
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//@RestController
//@RequestMapping("/journalTest")
//public class BasicRestApiNoDB {
//
//    // Acting Database
//    private HashMap<Long, JournalEntry> journalEntries = new HashMap<>();
//
//    // Get request All data
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    // Post request
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){
//        journalEntries.put(myEntry.getId(), myEntry);
//        return true;
//    }
//
//    // Get by Id request
//    @GetMapping("id/{myId}")
//    public JournalEntry getJournalEntryById(@PathVariable Long myId){
//        return journalEntries.get(myId);
//    }
//
//    //Delete Request
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteJournalEntryById(@PathVariable Long myId){
//        return journalEntries.remove(myId);
//    }
//
//    //Update Or Put request by Id and value
//    @PutMapping("id/{myId}")
//    public JournalEntry updateJournalById(@PathVariable Long myId, @RequestBody JournalEntry myEntry){
//        return journalEntries.put(myId, myEntry);
//    }
//
//}



//Notes :-
/*
1. What is Spring ? --------------------------------------------
Ans. The Spring Framework is a comprehensive, modular framework for building enterprise-level Java applications.
It provides a wide range of functionality, such as dependency injection, aspect-oriented programming, transaction management, and more.
Spring is highly configurable, which can be both powerful and complex.
Use Case: Spring is ideal when you need full control over the configuration and architecture of your application. It’s more flexible but requires more setup.

2. What is Spring Boot ? --------------------------------------------
Ans. Spring Boot is an extension of the Spring Framework that simplifies the setup and development process of Spring applications.
It provides pre-configured templates, embedded servers, and a “convention over configuration” approach, meaning you can get started quickly with minimal setup.
Core Concepts:
Auto-Configuration: Spring Boot automatically configures your application based on the dependencies you have added. This reduces the boilerplate code and configuration.
Embedded Servers: Spring Boot includes embedded servers like Tomcat or Jetty, so you don’t have to deploy your application to an external server.
Starter Dependencies: Spring Boot offers “starter” dependencies that bundle commonly used libraries together, making it easier to add functionality.
Use Case: Spring Boot is ideal for most modern Java applications, especially when you want to build a production-ready application quickly.
It handles most of the complex configuration for you, so you can focus on writing business logic.

3. What is Spring Initializer ? --------------------------------------------
Ans.  It's a web-based tool provided by Spring to quickly generate a base project with the necessary dependencies and structure for a Spring Boot application.
It simplifies the setup process by letting you select the components you need.

4. What is Maven ? --------------------------------------------
Ans. Maven is a powerful build automation tool used primarily for Java projects. It simplifies the build process, manages dependencies,
and handles project lifecycle management. Let's break down what Maven is, its actual usage, where to use it, and the purpose of the Maven lifecycle.

Maven is a project management and comprehension tool that provides a way to manage builds, documentation, reporting, and dependencies of Java projects.
It uses an XML file called pom.xml (Project Object Model) to manage project configuration, dependencies, plugins, and other project-related information.
Actual Usage and Purpose of Maven
Dependency Management:

What it does: Maven makes it easy to manage libraries and dependencies. You specify the libraries you need in your pom.xml,
and Maven downloads them automatically from a central repository.
Why it's important: It simplifies the process of adding libraries to your project. You don’t have to manually download JAR files and configure them;
Maven handles that for you.

Build Management:
What it does: Maven automates the build process, including compilation, packaging, and running tests.
Why it's important: It ensures consistency across different environments. You can build your project on any machine with Maven installed, and it will behave the same way.
Standard Project Structure:

What it does: Maven enforces a standard directory layout for projects, which makes it easier to navigate and understand.
Why it's important: It provides a uniform way to structure projects, reducing the learning curve when working with new projects or teams.
Project Lifecycle Management:

What it does: Maven defines a standard lifecycle that includes phases such as validate, compile, test, package, install, and deploy.
Why it's important: These lifecycle phases help automate the process of building, testing, and deploying your application, ensuring that these tasks are
performed in a consistent and predictable manner.

5. WAR v/s JAR ? --------------------------------------------
Ans. JAR (Java Archive)
What it is:

JAR is a file format used to package Java classes, metadata, and resources (such as images, property files, etc.) into a single compressed file.
It is essentially a zipped collection of Java-related files that can be executed or used as a library.
Purpose:

Executable JAR: Used to package standalone Java applications that can be run directly from the command line.
Library JAR: Used to bundle classes and resources as a reusable library that other Java applications can depend on.
Structure:

Contains a manifest file (MANIFEST.MF) that can specify the main class to be executed if it is an executable JAR.
May include compiled class files, configuration files, and other resources needed by the application.
Usage:

Ideal for standalone applications, such as desktop applications or microservices.
Used for Spring Boot applications because Spring Boot comes with an embedded server (like Tomcat), allowing it to run as a standalone JAR file.
Example:

Running an executable JAR: java -jar my-application.jar
WAR (Web Application Archive)
What it is:

WAR is a file format used to package web applications. It includes all the components necessary to deploy a web application, such as servlets,
JSPs, HTML files, JavaScript, and other resources.
WAR files are deployed to a web server or servlet container.
Purpose:

Designed specifically for web applications that run on a Java EE (Enterprise Edition) server.
Allows easy deployment of web applications to a web server like Apache Tomcat, JBoss, or WebLogic.
Structure:

Contains a WEB-INF directory that includes:
web.xml: The deployment descriptor file that specifies the configuration for the web application.
classes directory: Contains compiled servlet and other Java classes.
lib directory: Contains JAR files that the application depends on.
Contains other directories for static resources like HTML, CSS, and JavaScript files.
Usage:

Used for deploying web applications to a server, where the server handles the HTTP requests and responses.
Traditional Java EE web applications use WAR files for deployment.
Example:

Deploying a WAR file: Copy the WAR file to the webapps directory of the Tomcat server, or use a deployment tool provided by the application server.

6. What is IOC container ? --------------------------------------------
Ans. Definition: An IoC (Inversion of Control) Container is a core part of the Spring framework that is
responsible for managing the lifecycle and configuration of application objects, or "beans." It creates the objects,
wires them together, configures them, and manages their complete lifecycle.

When to Use: IoC Containers are used when you want to manage the dependencies of your objects centrally and automatically,
rather than manually instantiating and managing these dependencies.

Where to Use: In any Java application using Spring, the IoC container is implicitly used to manage beans and their dependencies.
It's a fundamental part of building Spring applications.

7. What is Bean ? --------------------------------------------
Ans. Definition: In Spring, a bean is an object that is instantiated, assembled, and managed by the Spring IoC container.
Beans are the components of the application that Spring manages; they are typically used to represent service objects, data access objects, etc.

When to Use: Beans are used to represent the main objects of your application that Spring should manage.
This includes services, repositories, controllers, and other components.

Where to Use: You define beans in your Spring configuration (either using annotations or XML), and Spring takes care of their lifecycle.
 Beans can be defined explicitly or scanned automatically if you use annotations like @Component, @Service, @Repository, or @Controller.

8. What is ApplicationContext ? --------------------------------------------
Ans. ApplicationContext is a more advanced and feature-rich IoC container in Spring. It is a sub-interface of BeanFactory and adds
 more enterprise-specific functionality, like event propagation, declarative mechanisms to create a bean, and various AOP features.

When to Use: Use ApplicationContext to manage your application’s beans and provide support for enterprise features,
such as transactions, resource loading, and event handling.

Where to Use: It's used throughout Spring applications as the core interface to manage beans. Whenever your application starts,
 Spring creates an ApplicationContext instance, loads all bean definitions, and wires them together.

9. What is Spring Data MongoDB (ODM) ? --------------------------------------------
Ans. Similar to Mongoose in the Node.js world, Spring Data MongoDB provides an Object-Document Mapping (ODM) layer for working with MongoDB
in a more Java-centric way. It allows you to define Java classes that represent documents in your MongoDB collections and perform CRUD
operations using these classes.

10. What is ORM ? --------------------------------------------
Ans. ORM stands for Object-Relational Mapping. It's a programming technique used to convert data between incompatible type
systems using object-oriented programming languages. In simpler terms, ORM allows developers to interact with a relational database using
 the language of objects, without needing to write raw SQL queries.

How ORM Works
Objects: In an object-oriented language like Java, Python, or C#, data is represented as objects. These objects have attributes (fields) and methods (behaviors).
Relational Databases: In databases like MySQL, PostgreSQL, or Oracle, data is stored in tables. These tables have rows and columns.
Mapping: ORM tools map the objects in the application to the tables in the database. Each class in the code represents a table in the database,
each instance of the class represents a row, and each attribute represents a column.

Common ORM Frameworks
Java: Hibernate, EclipseLink, JPA (Java Persistence API)

11. Difference between JDBC & JPA ? --------------------------------------------
Ans. JDBC (Java Database Connectivity): Provides a direct way to interact with a relational database using SQL.
It requires manual management of database connections and SQL queries. It's more flexible but also involves more boilerplate code.

JPA (Java Persistence API): Provides an abstraction layer over JDBC by allowing you to work with Java objects instead of SQL queries.
It simplifies database operations through object-relational mapping (ORM) and can automatically handle tasks like transactions and caching.
JPA implementations like Hibernate provide additional features to make working with databases easier.

12. What is JSP ? --------------------------------------------
Ans. JSP (JavaServer Pages)
Definition: JSP is a server-side technology used to create dynamic web pages based on HTML, XML, or other document types.
 It allows embedding Java code directly into HTML pages.

Usage: JSP pages are compiled into servlets by the server and then executed to generate dynamic content.
It's often used for creating web-based applications and is part of the Java EE (Enterprise Edition) standard.

Example: A JSP file might contain HTML with embedded Java code that executes on the server to generate dynamic content for a web page.

13. What is Servlets & do we need it with spring boot? --------------------------------------------
Ans. Servlets are Java programs that run on a web server and handle requests and responses in a web application.
They act as intermediaries between client requests (usually coming from a web browser) and the server-side processing.
Servlets are a core part of Java EE (Enterprise Edition) and are used to create dynamic web content.

When to Use Servlets
Handling HTTP Requests: Servlets are used to handle HTTP requests and responses, making them suitable for web applications.
Dynamic Content Generation: Servlets can generate dynamic content based on client requests, user input, or data processing.
Session Management: Servlets can manage user sessions, making them useful for applications that need to maintain state across multiple requests.
Database Interaction: Servlets can interact with databases, perform CRUD operations, and generate dynamic content based on database data.
Data Processing: Servlets can process data, such as form submissions, file uploads, and more.

In Spring Boot, you generally don't need to work directly with servlets because Spring Boot abstracts away the low-level details and provides a higher-level,
more convenient way to build web applications and REST APIs. Here's how Spring Boot handles things and why direct use of servlets is often unnecessary:

 Spring Boot and Servlets: The Abstraction
Spring MVC Framework: Spring Boot is built on top of the Spring Framework, which includes Spring MVC.
Spring MVC itself is built on the servlet API but provides a higher-level abstraction. In a typical Spring Boot application,
you define controllers using the @RestController and @Controller annotations, which handle web requests. Under the hood,
these controllers are mapped to servlets, but you don't need to interact with the servlets directly.

Embedded Servlet Container: Spring Boot applications typically run in an embedded servlet container like Tomcat, Jetty,
 or Undertow. The Spring Boot application is packaged as a standalone JAR file, and the embedded servlet
 container handles the low-level HTTP request and response processing. This setup eliminates the need to manage servlets explicitly.

 Using REST APIs in Spring Boot
REST Controllers: In Spring Boot, you define REST endpoints using the @RestController annotation.
These endpoints handle HTTP requests directly, such as GET, POST, PUT, and DELETE. This is more straightforward and less error-prone than managing servlets manually.

14. What is Spring MVC & do we need it with spring boot? --------------------------------------------
Ans. Spring MVC is a part of the broader Spring Framework. It's a module within the Spring ecosystem that specifically
focuses on the Model-View-Controller (MVC) design pattern for building web applications.

Here's a breakdown:
Spring Framework:

The Spring Framework is a comprehensive framework that provides a wide range of functionalities for Java applications,
including dependency injection, transaction management, data access, security, and more.
It is modular, meaning you can use the entire framework or just specific parts of it as needed for your application.
Spring MVC:

Spring MVC is a module within the Spring Framework that provides the necessary components to develop web applications following the MVC design pattern.
It is specifically designed to handle web-based requests and provide a clear separation of concerns:
Model: Represents the data of the application. This could be in the form of Java objects or data received from a database.
View: Represents the presentation layer (e.g., HTML, JSP) that displays the data to the user.
Controller: Handles user input, manipulates the model, and returns the appropriate view.
It provides features like:
Handling HTTP requests (GET, POST, etc.)
URL routing
Form handling
View rendering (JSP, Thymeleaf, etc.)
Exception handling
Spring Boot and Spring MVC:

Spring Boot is a project that makes it easier to set up, configure, and run both simple and web-based applications.
When you create a Spring Boot web application, Spring Boot automatically configures Spring MVC behind the scenes.
Spring Boot simplifies the process by handling most of the configurations and dependencies, allowing you to focus more on writing the business logic.

15. What is Apache Tomcat ? --------------------------------------------
Ans. Apache Tomcat is an open-source web server and servlet container developed by the Apache Software Foundation.
It is specifically designed to execute Java servlets and render web pages that include Java Server Pages (JSP).
 Here’s a more detailed look at what Tomcat is and how it works:

Key Features of Tomcat
Servlet Container:

Tomcat is primarily a servlet container, meaning it can run Java servlets. Servlets are Java programs that run on a web server and handle web requests.
They can be used to generate dynamic content, interact with databases, manage sessions, and more.
Tomcat provides the environment and the APIs necessary to execute servlets, manage their lifecycle, and handle requests and responses.
JSP Engine:

JSP (JavaServer Pages) is a technology for creating dynamic web content using Java. Tomcat includes a JSP engine that compiles JSPs into servlets,
 which can then be executed by the servlet container.
JSP allows developers to embed Java code directly into HTML pages, making it easier to develop web applications with a combination of static and dynamic content.
Web Server:

Although primarily a servlet and JSP engine, Tomcat also functions as a basic HTTP web server.
It can serve static content (like HTML, CSS, JavaScript, and images) as well as dynamic content generated by servlets and JSP.
Tomcat is often used in development and testing environments as a standalone web server due to its simplicity and lightweight nature.
Java EE Support:

Tomcat implements several Java EE (Enterprise Edition) specifications, including servlets, JSP, and WebSocket.
However, it's important to note that Tomcat is not a full-fledged Java EE application server (like WildFly or GlassFish)
and does not support all Java EE features (such as EJB or JTA).
Configuration and Management:

Tomcat provides configuration files (like server.xml and web.xml) for fine-tuning server behavior, defining servlet mappings, setting up security constraints, etc.
It also includes an administration interface and tools for deploying and managing web applications.
Typical Use Cases
Web Application Development:

Tomcat is widely used in the development of Java-based web applications. Developers can run Tomcat locally to test and debug their applications.
It's popular in development environments because of its ease of setup, lightweight footprint, and adherence to standard Java web technologies.
Hosting Java Web Applications:

Many organizations use Tomcat in production to host web applications. It’s suitable for applications that rely on servlets, JSPs,
 and other web technologies supported by Tomcat.
It's often used in conjunction with other technologies and components, such as a front-end web server
(e.g., Apache HTTP Server) to handle static content, load balancing, and SSL.
Microservices and Cloud Deployments:

Tomcat is also used in microservices architectures and cloud environments due to its small size and ability to start up quickly.
In these scenarios, Tomcat may be embedded directly within a Spring Boot application, making the deployment unit self-contained.

16. Diff between JSP and Thymeleaf ? --------------------------------------------
Ans. Both JSP (JavaServer Pages) and Thymeleaf are templating engines used to generate dynamic content for web applications,
 but they have different approaches and features. Here's a comparison between the two:

JSP (JavaServer Pages)
Definition:

JSP is a server-side technology that allows embedding Java code directly into HTML pages. JSP pages are compiled into servlets by the server.
Syntax and Structure:

JSP uses a combination of HTML, Java code, and JSP tags (<% ... %> for scriptlets, ${...} for expressions, etc.).
JSP allows embedding Java code directly into the HTML, which can sometimes lead to complex and hard-to-maintain code if not managed properly.
When to Use:

JSP is suitable for simple dynamic content generation where you might need to mix a small amount of Java logic directly with HTML.

Thymeleaf
Definition:

Thymeleaf is a modern server-side Java template engine for web and standalone environments. It focuses on natural templates,
which can be directly rendered in web browsers as static prototypes without the need for a server.
Syntax and Structure:

Thymeleaf uses standard HTML syntax with additional attributes (e.g., th:text, th:if, th:each). It’s designed to integrate seamlessly with HTML,
 meaning it can be rendered directly by web browsers without a server.
Encourages separating logic from the view using templates, expressions, and layout dialects.
When to Use:

Thymeleaf is ideal for modern web applications where you want to maintain a clean separation between front-end HTML and back-end Java logic.
It's particularly suited for applications using Spring MVC, where it can seamlessly integrate.

17. Explain Query Method DSL and Criteria API ? --------------------------------------------
Ans. Both Query Method DSL and Criteria API are approaches in Spring Data JPA (Java Persistence API) for building database queries
in a type-safe, object-oriented manner. These methods make interacting with the database more flexible and readable,
reducing the need for hard-coded SQL queries. Here's an explanation of both:

Query Method DSL
Definition: Query Method Domain-Specific Language (DSL) is a feature in Spring Data JPA that allows you to
define query methods in repository interfaces based on the method names. Spring Data JPA interprets these method names and generates the corresponding SQL queries.

When to Use: Use Query Method DSL when you need to perform common and straightforward database operations,
such as finding records by specific fields, counting records, checking existence, etc., without writing explicit queries.

How It Works:

You define methods in your repository interfaces with names that follow a specific naming convention.
Spring Data JPA will automatically generate the query based on the method name.

Criteria API
Definition: Criteria API is a part of JPA that provides a programmatic way to create dynamic and complex queries in a type-safe manner.
It uses a fluent API to construct queries, which are then translated to SQL.

When to Use: Use Criteria API when you need to build dynamic queries based on various conditions, require type-safety,
 or when your queries are too complex for Query Method DSL.

How It Works:

You build queries by chaining methods together using the CriteriaBuilder, CriteriaQuery, and Root classes.
These classes allow you to define the FROM, WHERE, SELECT, and other clauses programmatically.

While the mechanisms and some terminologies differ, the idea of managing data interactions via repository patterns,
query DSLs, and criteria-like objects remains consistent across both relational and NoSQL paradigms.
This approach helps maintain a clean separation between business logic and data access code, regardless of the underlying data storage technology.
 */
