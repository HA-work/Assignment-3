// Name: Hassan Akbar
// Class: CISC 3115 
// Section: TY9
// Professor Chuang
// Assignment 3



//*********************************************************************************

import java.io.*; // import file, scanner and print writer class



// it is easier to print things immediately than to compile them into string for later
// this breaks convention though
// storing as a string also has a problem of eventually storing too much data
// if the data is really big


public class Trial {
  
//*********************************************************************************
 public static void main(String[] args) throws IOException {
   

   String fileName = "moviesinput.txt"; // the file name
   
   MovieBinaryTree movies = new MovieBinaryTree(fileName);
   
   
   PrintWriter outFile1 = new PrintWriter("output1.txt");
   
   outFile1.println("Full list of movies in alphabetical order");
   
   outFile1.println("Using Binary Tree Inorder Traversal");
   
   outFile1.println();
   
   outFile1.println("Number of movies : " + movies.count );
   
   outFile1.println();
   
   outFile1.println("In the order of");
   
   outFile1.println("Movie Name//Release Year//Movie ID//Genre|Genre|Genre//Alternat Name 1//Alternat Name 2//Alternat Name 3 ");
   
   outFile1.println();
   
   outFile1.println(movies);
   // prints the tree in alphabetical order to a file using inorder sequence
   
   // could print in different orders
   
   outFile1.close();
 
   
   
   
//*********************************************************************************   
  
   
   String subsetStart = "D"; // where the subset starts from
   
   String subsetEnd = "Lassie"; // where the subset ends
   
   
   String subset1 = movies.subSet(subsetStart, subsetEnd); // returns a string of the subset in alphabetical order
   
   PrintWriter outFile2 = new PrintWriter("output2.txt");
   
   outFile2.println("Subset of movies");
   
   outFile2.println("In Alphabetical Order");
   
   
   outFile2.println("From: " + subsetStart + "    To: " + subsetEnd);
   
   outFile2.println();
   
   outFile2.println("Movie Name//Release Year//Movie ID//Genre|Genre|Genre//Alternat Name 1//Alternat Name 2//Alternat Name 3 ");
   
   outFile2.println();
   
   outFile2.println(subset1);
   // possible errors if the list is empty
   
   // found the subset in a linear way
   
   // could find in a recursive way
   // using the properties of a tree
   
   // find the first item that is a member of the subset and then prune the children that
   // are not part of the subset
   
   // could not think of a straightforward way to do this though
   
   // will try to make this method though
   
  
   
   outFile2.close();
 
      
//*********************************************************************************
     
    System.out.println("****************************************"+
                       "*********************************************");
    System.out.println("The program is terminating");
    System.out.println("********************************************"+
                       "********************************************");
    // outputs to the screen the program has finished
     
    
//*********************************************************************************    
 }
 

 
//*********************************************************************************
 
 
 
}
//*********************************************************************************