package Searching;

public class StringReview {

    public static void main(String[] args) {
        String x = "The quick brown fox";
        //          0123456789012345678
        //indexOf -> returns an int, start location of something
        int loc = x.indexOf("q");
        System.out.println("q is at location " + loc);
        loc = x.indexOf("o",13); //strat looking at 13
        System.out.println("Starting at 13, the next o is at location " + loc);
        loc = x.indexOf("q", 5); //will return -1 (not found)
        System.out.println("Starting at 5, the next q is at " + loc);
        
        //charAt -> returns a char
        char c = x.charAt(13);
        System.out.println("The letter at pos 13 is "  + c);
        
        //length -> return an int
        int len = x.length();
        System.out.println(x + " is " + len + " letters long");
        
        //substring -> returns String, requires 1 or more ints
        String y = x.substring(10, 13); //13 not included = bro
        System.out.println("Hey " + y);
        y = x.substring(16); //16 to the end
        System.out.println("Crazy like a " + y); //fox
        
        //toLowercase and Uppercase
        //original string does not change
        System.out.println(x.toUpperCase());
        x = x.toLowerCase(); //re-assigning x to all lowercase
        
        //compareTo
        y = "jumped over the lazy dog";
        int z = x.compareTo(y);
        System.out.println("x vs y = " + z);
        
        //compareto does letter math
        //calculates the alphabetical distance between 1st letter of each string (bassed on Ascii chart)
        //"t" vs "j" -> 10 letters apart in alphabet
        //positive means first this is further down the list
        
        //more examples
        System.out.print("Andy va Bob\t");
        System.out.println("Andy".compareTo("Bob")); //-1
        
        System.out.print("Bob va Bob\t");
        System.out.println("Bob".compareTo("Bob")); //0
        
        System.out.print("Dave va Bob\t");
        System.out.println("Dave".compareTo("Bob")); //2
        
        System.out.print("Bib va Bob\t");
        System.out.println("Bib".compareTo("Bob")); //-6
        
        //compareTo = 0 = exact match
    }
    
}
