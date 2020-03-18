// Name: Hassan Akbar
// Class: CISC 3115 
// Section: TY9
// Professor Chuang
// Assignment 3

//*********************************************************************************

 public class Movie {
  
    public String movieTitle; // main movie name
    public String secondName; // alternate name
    public String thirdName; // alternate name
    public String fourthName; // alternate name
    // it looks like the movie with the most names has 3 names
    
    public int releaseYear; // release year
    public int movieID; // movie ID
    
    public String genres; // could make a string array this is easier for printing though
    // could parse using | as that seperates the genres
    // there are movies with no genrs though
    
    public Movie parent; // parent node movie
    public Movie leftChild; // child smaller or equal to it
    public Movie rightChild; // child greater than it
    
    
//*********************************************************************************    
//Parametized Constructor
 
 /* Method public  Movie(String mt, String id, String g):
  * 
  * Input:
  *    String mt the movie name
  *    String an the artist name
  *    int v the views of the artist
  * Process:
  *    creates a movie object and sets the parameters
  *    cannot set certain parameters immediately becuase of parsing
  *    so I set the remaining data members after parsing
  *    
  * Output:
  *    None
  */
   
 public Movie(String mt, String id, String g){
      
      movieTitle = mt.trim(); // set name and removes white spaces
      
     
   
      
      id = id.trim(); // set id and trims white spaces
      
      movieID = Integer.parseInt(id);
     
      genres = g.trim(); // sets genre and trims white spaces
      // could parse this and make an array list of genres
      // this is easier though
     
      
      secondName = "" ; // set alternate names to null for now
      thirdName = "" ;
      fourthName = "" ;
      
      
      
     
     
      parent = null; // set pointers to null for now
      leftChild = null;
      rightChild = null;
     
     
     
     
     
     
    }
    
//*********************************************************************************    
    
    
 /* Method String toString():
  * 
  * Input:
  *    None
  * Process:
  *    makes a formatted string
  * Output:
  *    Returns a formated string of the Movie object for printing
  */
 //toString() method - uses String static method .format()
 
 public String toString() {
   
  String str1 = String.format("%s//%d//%d//%s", movieTitle, releaseYear, movieID, genres);
  // title names can be too long and too inconsistent so decided to not reserve space
  // the table would have a lot of empty space because of outliers
  // will have a header that gives the sequence of data
  
  String str2;
  
  if ( secondName.compareTo("") != 0  )  {
    
    str2 = String.format("//%s ", secondName);
    
    str1 = str1 + str2;
    
  }
    
  // checks if any alternate names exist
  
  
  if ( thirdName.compareTo("") != 0  )  {
    
    str2 = String.format("//%s ", thirdName);
    
    str1 = str1 + str2;
    
  }
  
  
  
  if ( fourthName.compareTo("") != 0  )  {
    
    str2 = String.format("//%s ", fourthName);
    
    str1 = str1 + str2;
    
  }
  
  
  return str1;
 }

    
//*********************************************************************************   
    
}
//*********************************************************************************    