# COSC-310-INDIVIDUAL-PROJECT

Updated README 

For the updated version, two new features were introduced to the program. News and Weather information were installed. New GUI was introduced correspondingly. Library is not only the pool of information, but also the wider windows to the world. The News window will give user an interesting news of the day. The weather window will give user a current location’s weather and another selected city.

Limitation – the 2 APIs is the freemium version so; the data will be delayed and restricted. The amount of data that can be acquire per day is limited correspondingly.

Build path – the JSON library has to be installed in order to run the program.

Additional Feature from Assignment 3


# New Adaptive GUI	-		
    Redesigned GUI was introduced to this new edition program in order to provides an easier way to interact with the new feature
# News Windows	
    NEWSDATA.IO API	
    This API provides a wide range of news from a lot of sources around the world, This API allow the user to search for a specific field, authors,         publication source etc.
    This API is used to shows the news to the public library user. to catch their attention and to update them on the worlds’ new. if they interest in the news, they can read and find an additional information from the books in the library.
URL: https://newsdata.io

# Current Weather Update
    Windows	OpenWeatherMAP API	
    This API provides a very defined details of the weather to selected cities. Including latitudes, longitudes, current weather, conditions, Precipitation, Temperature, Wind, etc.
    Since library is the windows to the wider world, this feature offer user a new information about the weather of each selected cities.
URL: https://openweathermap.org

# library-system
This is an integrated library system that a library can use to keep track of books and help users find books. It will keep track of every single book when it is lent out and returned. It will allow users to search for books by title, using only part of the title. It will allow librarians to create accounts. And it will generate reports.
Class structuring
Some classes like Account, Book, BookGroup, Manager, and User are Serializable. They make objects which are stored inside one instance of the Serializable LocalLibraryData. Overall, these classes serve to both store information, and provide methods for modifying information.
Other classes like main and UserAndManagerTerminal are not Serializable but allow us to run code and call other methods.
Serializable classes
The Account class is the subclass for User and Manager. Any activity both library users and library managers can do, such as searching a book, is implemented by this class.
Each Manager object stores the username and password for one library manager account, and implements activities only managers can do, such as adding books and checking out books.
Each User object stores the username and password and other information for one library user account, and has no methods.
Each Book object stores the information about one book, and has no methods.
Each BookGroup object is a subcategory which stores related books e.g. multiple volumes, and has no methods.
The LocalLibraryData stores the entire collection of these objects in ArrayList and HashMap collections, and currently has no methods.
Other classes
The main class currently just creates a UserAndManagerTerminal and starts it.
The UserAndManagerTerminal is a Thread which communicates with the user using text through the standard input and standard output. It lets the person interacting with the program log in or create an account, and it goes into a loop asking him for the next action. When the program starts, it also loads the LocalLibraryData from a text file if avaiable and allows the person (user or manager) to save it to the text file any time.
Feature Lists
1.	Librarian a. Creating an account i. For the user to easily access to the feature for Librarian b. Adding a book i. For the user to add a book to the system c. Deleting a book i. For the user to delete book from the system d. Searching for a book i. For the user to find the added book by any attributes (Name, ISBN, etc.) e. Checking-out the book i. For the user to check if the book is being lent f. Returning the book i. For the user to get the book back from library user g. Quitting without SAVE i. To quit without saving the progress h. Quitting with SAVE i. To quit with saving the progress
2.	Public User a. Creating an account i. For the user to easily access to the feature for public user b. Searching for a book i. For the user to find the added book by any attributes (Name, ISBN, etc.) c. Borrowing the Book i. For the user to borrow the selected book d. Quitting without SAVE i. To quit without saving the progress e. Quitting with SAVE i. To quit with saving the progress
3.	News Window – providing a news for each day
4.	Weather Window – providing a detailed current weather 
5.	GUI a. For all user to easily interact with the program
