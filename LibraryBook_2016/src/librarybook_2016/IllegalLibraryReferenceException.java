package librarybook_2016;

/**
 * IllegalLibraryReferenceException.java    
 *
 * @author Geoff McKeown
 * @version Spring 2016
 */
public class IllegalLibraryReferenceException extends Exception{
     /** Creates an IllegalLibraryReferenceException with a given message
     * @param message   the given message.
     */
    public IllegalLibraryReferenceException(String message) {
        super(message);
    }
}
