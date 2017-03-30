# CLI-Data-Manager
   Java project with the console interface for 
   library managing. Available such commands:
   
            book add --author 'J.K. Rownling' --title 'Harry Potter' 
            book list    : return a list of all books ordered by name in asceding direction
            book edit --author 'J.K. Rownling' --newAuthor 'N.O. Khimin'             
            book remove --title 'Harry Potter'
          
 ## Prerequisites![Peek 2017-03-30 11-14.gif]({{site.baseurl}}/Peek 2017-03-30 11-14.gif) 
 ## Prerequisites
 * Java 1.8
 * Maven >=3.3.9
 * MongoDB 3.4.3
 ## Deployment
 To run locally execute
 
      mvn package
      java -jar target/*.jar 
      
## Built With
  * [Spring Shell](https://github.com/spring-projects/spring-shell) - Spring Shell is an shell skeleton that can be easily extended with commands using a Spring based programming model. 
  * [Spring Data Mongo](https://github.com/spring-projects/spring-data-mongodb) - Spring Data’s mission is to provide a familiar and consistent, Spring-based programming model for data access while still retaining the special traits of the underlying data store. 
## Authors
* **Khimin Nazar** - *Initial work* - [Khimin Nazar](https://github.com/naz1719)

