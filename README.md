# ArcTouch
ArcTouch Code Challenge

## Architeture
For this challenge I created a MVC kind application. Model and Controller was write in Java with Springboot and View was write using React. All external call to TMDb API was make from Models class. User interface was created on View and user´s interact was send to Controllers and Controllers call Models.

I assumpt the TMDb data have a low frequency changes and adopt a Spring Cache to improve performance. This cache was reset once a day with ```@Schedule and @CacheEvict``` anootations.

For back-end test I used ```Assertions``` to validate test, because, for me, is more clear to read asserts.

## Back-end
### Springboot
Springboot was used to reduce Development time and to ease the development web applications very easily compared to existing Spring Framework, which really takes more time. Annotations like ```@RestController, @RequestMapping and @GetMapping```.

### 
### Third party libarys
#### Lombok
Project Lombok is a java library that automatically plugs into your editor and build tools, is very usefull and we don´t need write another getter or equals method again. Other annotations was used on project like: ```@Data, @Builder and @AllArgsConstructor```.
#### Jodatime
A libary to work with ```DateTime``` data type

## Front-end
### React and Material-UI
I choose these because both are frameworks that improve speed and are usefull to create web pages easier.
### Hooks
It make use of State and other React resources easier to use.

## Build
```mvn clean install```

## Run
```java -jar .\target\arctouch-0.0.1-SNAPSHOT.jar```

## Deploy
Application was deployed in Heroku with this link. https://mattje-alexandre-arctouch.herokuapp.com/
