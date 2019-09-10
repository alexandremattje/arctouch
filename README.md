# ArcTouch
ArcTouch Code Challenge

## Architecture
For this challenge I created a MVC kind application. Model and Controller was write in Java with Springboot and View was write using React. All external call to TMDb API was make from Models class. User interface was created on View and user´s interact was send to Controllers and Controllers call Models.

I created one service for each group for request, in that way I can scale app creating a micro service for each service.

I assumpt the TMDb data have a low frequency changes and adopt a Spring Cache to improve performance. This cache was reset once a day with ```@Schedule``` annotation and ```CacheManager```.

For back-end test I used ```Assertions``` to validate test, because, for me, is more clear to read asserts.

## Back-end
### Springboot
Springboot was used to reduce Development time and to ease the development web applications very easily compared to existing Spring Framework, which really takes more time. Annotations like ```@RestController, @RequestMapping and @GetMapping```.

### 
### Third party libarys
#### Lombok
[Link](https://projectlombok.org/ "Lombok")

Project Lombok is a java library that automatically plugs into your editor and build tools, is very usefull and we don´t need write another getter or equals method again. Other annotations was used on project like: ```@Data, @Builder and @AllArgsConstructor```.
#### Jodatime
A library to work with ```DateTime``` data type
#### Jackson Json 
[Link](https://github.com/FasterXML/jackson "Jackon Json github")

I choose Jackson Json library to work with json data loaded from TMDb and to delivery to application front-end. This library provide some annotations that make conversions, read and write date from Json easier.

## Front-end
### React and Material-UI
I choose these because both are frameworks that improve speed and are useful to create web pages easier.
### Typescript
Typescript bring typing to javascript, using typescript coding became easier and less susceptible to write some error.
### Hooks
It make use of State and other React resources easier to use.

## Build
```mvn clean install```

## Run
```java -jar .\target\arctouch-0.0.1-SNAPSHOT.jar```

## Deploy
Application was deployed in Heroku with this [link](https://mattje-alexandre-arctouch.herokuapp.com/, "Herokuapp")
