package librarybook_2016;
import java.util.ArrayList;
/**
 * Library.java models a collection of Library Books. 
 * 
 * @author (add name) 
 * @version (add date)
 */
public class Library {
   private ArrayList<LibraryBook> bookCollection;


    /**
     * Creates an empty Library.
     */
    public Library()
    {
        ArrayList<LibraryBook> bookCollection = new ArrayList<LibraryBook>();
    }

    /**
     * Store details of a new Book into this Library.
     * @param newBook The LibraryBook to be added to this Library.
     */
    public void addBook(LibraryBook newBook)
    {
        bookCollection.add(newBook);
    }

    /**
     * @return The number of Books currently in this Library.
     */
    public int numberOfBooks()
    {
        int librarySize = bookCollection.size();
        
        return librarySize;
    }

    /**
     * To search this Library for a LibraryBook with a given library reference.
     * @param givenRef      the reference of the LibraryBook whose details are 
     *                      required.
     * @return              the LibraryBook with the given ref if found in this 
     *                      Library; otherwise null is returned.
     */
    public LibraryBook findByRef(String givenRef){
        // Your code here
    }

    /**
     * Returns an array in which the LibraryBooks in this Library
     * are sorted in order of increasing library reference number.
     * @return      the sorted array.
     */
    public LibraryBook [] sortByLibraryReference(){
        // Your code here
    }

    /**
     * @return      the details of every LibraryBook in this Library.
     */
    public String toString()
    {
        
        StringBuilder sb = new StringBuilder(30);
        sb.append("Book Reference: ");
        for(int i = 0; i < bookCollection.size(); i++)
        {
            sb.append(bookCollection
        }
    }
}
