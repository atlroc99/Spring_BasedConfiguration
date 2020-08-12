# Spring_BasedConfiguration
3 ways supply metadata configuration( via XML file,Annotation and Java Code), using c: and p: namespce,beans Scope and test the scope using JUnit, 3 ways Spring container create beans(by using Contractor/setter-method, static factory-method and instance-factory-method

Summary:
1.  Dependency injection is the technique to implement IoC in applications.

2.  in traditional java program we create an object by using new keyword, thats is make our app tight coupling, To achieve loose coupling and dynamic binding of the    objects at runtime, objects dependencies are injected by other assembler object,this is where Spring Ioc Come to the picture. Spring IoC is the mechanism to        achieve loose-coupling between Objects dependencies. Spring IoC container is the program that injects dependencies into an object and make it ready for our use.

3.  there are 2 types of Spring IOc:
    - Bean Factory
    - ApplicationContext interfaces is extend Bean factory so by default ApplicationContext has all the fungtionality of the BeanFactory plus some other extra             advance Fearures.
    
    Some of the useful ApplicationContext implementations that we use are;

      - AnnotationConfigApplicationContext: If we are using using annotations for Configuration, then we can use this to initialize the container and get the bean            objects.
      - ClassPathXmlApplicationContext: If we are using configuration xml  then we can use this class to load the file and get the container object.
      - FileSystemXmlApplicationContext: This is similar to ClassPathXmlApplicationContext except that the xml configuration file can be loaded from anywhere in the        file system.
      - AnnotationConfigWebApplicationContext and XmlWebApplicationContext for web applications.
      
4.  Spring Bean Scopes
    Sping Beans is any java object that initialized by Spring IoC, There are five scopes defined for Spring Beans:

  - singleton – Only one instance of the bean will be created for each container. This is the default scope for the spring beans.
  - prototype – A new instance will be created every time the bean is requested.
  - request – This is same as prototype scope, however it’s meant to be used for web applications. A new instance of the bean will be created for each HTTP request.
  - session – A new bean will be created for each HTTP session by the container.
  - global-session – This is used to create global session beans for Portlet applications.
  
5.  Spring Framework provides 3 ways to configure beans to be used in the application.

    - Annotation Based Configuration – By using @Service or @Component annotations. Scope details can be provided with @Scope annotation.
    - XML Based Configuration – By creating Spring Configuration XML file to configure the beans. 
    - Java Based Configuration – Starting from Spring 3.0, we can configure Spring beans using java programs. Some important annotations used for java based              configuration are @Configuration, @ComponentScan and @Bean.
6.  there is 2 ways of Spring IoC to inject the dependency to the application object:
    - Constructor based DI
    - Setter method based DI
