# CT548 Assignment 4
Ethan Kane
09620371

* Source Code: CT548A4\CT548A4\src\main\java
* Source Code: CT548A4\CT548A4\src\main\java\a4\controller - \model - \view 
* Test Code: CT548A4\CT548A4\src\test\java\a4\tests
* UML Diagrams: \CT548A4\CT548A4\UML - Component - Class - UseCase - Sequence

## Specification
Design and Implement a media catalogue which allows the user to browse through films and TV series and to create their own media library from the catalogue. For each item, the catalogue contains title, description, year, genre, director and cast. Each view to be sorted by the selected dimensions either genre or year. People must be modelled as objects in the code. Generation of new objects using the factory pattern. Initial data in the catalogue must be loaded from JSON file. Unit tests for the model classes.

## Documentation
### Reasoning
* Thin Controller and Large Model. Controller just to coordinate data flowing between view and model. Model containing the code responsible for representing and manipulating the data. UI code does not directly access the data.

* Factory Pattern: This was implemented by having a factory class which read in a boolean from a checkbox selected by the User, if clicked then it would return a TvSeries object and if not then it would return a Films object.
* Strategy Pattern: Implemented by having a Strategy interface with two concrete classes which implemented different types of a sort method, one by year and the other by genre. A context class to choose how the behavior varied as per its strategy object.

* Model Package: 
1. Each of the fields in the JSON file has a Class: Films, TvSeries, People, Genres, Profiles. An abstract Items class was made for Films and TvSeries to extend from for sorting purposes. 
2. The ItemContainer class was created as a bucket for the unsorted JSON data. The Model class Was created to sort the data from the this class. 
3. The SortedGenre and SortedYear classes are concrete implementations of the Strategy patterns and the Context class uses the strategy. 
4. The Factory class is to do with the implementation of The Factory method.
* Views Package:
1. VideoCatalogueView is the main view a user sees when they run the application. Containing buttons for switch profile, add new, list by year and list by genre.
2. SwitchUserProfileView is almost entirely empty as the buttons the user sees on it are piped in form the controller class.
3. AddNewItemView is the where users input details about new Films or TV Shows they wish to add, including model/schema fields.
4. YearView is the screen that contains the films/TvSeries ordered by their year.
5. GenreView is the screen that contains the films/TvSeries ordered by their genre.
6. ItemDetails uses mostly the same code as AddNewItemDetails but with some of the fields disabled, it's the screen where users see info about Items they have clicked on.
* Controller Package
This contains just one class, Controller. This contains all the methods that updates both the Model and the Views. neither of which ever make any contact with each other. Everything goes through the controller. Aside from the controller constructor, six of it's seven methods are directly mapped to user input, employing lambda expressions to reduce the amount of code.

### Test Scenarios
* 10 JUnit tests for Films, TvSeries, Genres, Profiles People, Factory, Context, ItemContainer, SortedGenre and SortedYear.
* The Tests were simple assertNotNull tests to make sure they initiated and did not fail.

### Guide For User
* Start The Program
* Films and TV Series are recommended for you, if you click on their title you will get details about them, such as Title, Description, Year, Creator or Director and Cast.
* You may change user by clicking on the "Switch Profile" button and see different recommended films. These are hard coded profiles at present, no linking of DB, could use Hibernate for ORM.
* You may see the films and TV series in the catalogue ordered by both Year and by Genre by clicking the "List by Genre" button and the "List by Year" buttons respectively.
* You may add a new Item, film or TV, You must specify, the Title, Description, Year, Genres (seperated by a comma and a space) Creator or Director and Cast (also seperated by a comma and a space).
* When you are finished, you may exit the program.


### Ways To Extend The System
* To truly make it a full media catalogue, I think audio should be introduced.
* Music could be added, as could podcasts and audiobooks
* Items could be categorised by language and region also.