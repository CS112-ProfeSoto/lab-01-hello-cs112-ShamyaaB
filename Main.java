/**
 * Main class demonstrating basic Java concepts:
 * printing messages, static methods, and a simple class with one instance variable.
 * 
 * Part 1: Print welcome message.
 * Part 2: Use void and value-returning static methods.
 * Part 3: Create and manipulate objects of the Book class.
 * 
 * @author  Mya Baxter
 */
public class Main {
    public static void main(String[] args) 
    {
        System.out.println("Welcome to CS 112!");
        printMotivation(); // Part 2: void static method

        int result = doubleNumber(5); // Part 2: value-returning static method with parameter
        System.out.println("5 doubled is " + result);

        // Part 3: create object from a class with 1 instance variable
        Book myBook = new Book("Java Basics"); // full constructor
        System.out.println(myBook.toString()); // toString method

        myBook.setTitle("Advanced Java"); // setter/mutator
        System.out.println(myBook.getTitle()); // getter/accessor

        Book anotherBook = new Book("Advanced Java");
        System.out.println("Books are equal? " + myBook.equals(anotherBook)); // equals method
    }
    /**
     * Prints a motivational message.
     */
    public static void printMotivation() 
    {
        System.out.println("Keep pushing forward!");
    }

    /**
     * Returns double the given number.
     * 
     * @param num the number to double
     * @return twice the value of num
     */
    public static int doubleNumber(int num) 
    {
        return num * 2;
    }
}
    /**
    * Class representing a Book with a title.
    */
    class Book 
{
    /** The title of the book */
    private String title;  // instance variable

    /**
     * Default constructor that sets title to "Unknown Title".
     */
    public Book() 
    {
        this.title = "Unknown Title";  // default constructor
    }
    /**
     * Full constructor that sets the title to the given value.
     * 
     * @param title the title of the book
     */
    public Book(String title) 
    {
        this.title = title;  // full constructor
    }
    /**
     * Returns the string representation of the Book.
     * 
     * @return string containing the book title
     */
    public String toString() 
    {
        return "Book title: " + title;
    }
     /**
     * Sets the title of the book.
     * 
     * @param title new title of the book
     */
     public void setTitle(String title) 
    {
        this.title = title;
    }
    /**
     * Returns the current title of the book.
     * 
     * @return the book's title
     */
    public String getTitle() 
    {
        return title;
    }
    /**
     * Checks if this book is equal to another object.
     * Two books are equal if they have the same title.
     * 
     * @param obj the object to compare with
     * @return true if obj is a Book with the same title, false otherwise
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.title.equals(other.title);
    }

}