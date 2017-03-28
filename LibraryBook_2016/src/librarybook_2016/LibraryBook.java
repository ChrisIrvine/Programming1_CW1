package librarybook_2016;

/**
 * A class that maintains information on a library book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Geoff McKeown  and Christopher Irvine
 * @version 05/02/2016
 */
public class LibraryBook implements Comparable<LibraryBook>{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String reference;


   /**
    * Constructs a LibraryBook object with  the given details.
    * @param bookAuthor author(s) of this LibraryBook
    * @param bookTitle  title of this LibraryBook
    * @param bookPages  the number of pages of this LibraryBook
    */
    public LibraryBook(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        reference = "";
    }

     /**
      * @return the author(s) of this LibraryBook.
      */
       public String getAuthor()
       {
           return author;
       }

       /**
        * @return   the title of this LibraryBook.
        */
      public String getTitle()
      {
        return title;
      }

      /**
       * @return    the number of pages in this LibraryBook.
       */
       public int getPages()
       {
           return pages;
       }



      /**
       * Sets the library reference for this LibraryBook
       * @param ref     the library reference, which must be a String of the
       *                form "QAxxx", "QBxxx" or "QCxxx", where each x is a
       *                decimal digit.
       * @throws IllegalLibraryReferenceException if ref is not of the required form.
       */
       public void setReference(String ref) throws IllegalLibraryReferenceException
       {
           try
           {
               if(this.reference == "" && this.reference.startsWith != "QA"
                       && this.reference.startsWith != "QB"
                       && this.reference.startsWith != "QC")
               {
                   this.reference = ref;
               }
           }
           catch(Exception IllegalLibraryReferenceException)
           {
               
           }
       }

       public int compareTo(LibraryBook other)
       {
           int referenceCheck = this.reference.compareTo(other.reference);
           
           return referenceCheck;
       }

       /**
        * @return   the library reference for this LibraryBook
        */
        public String getReference()
        {
            return reference;
        }

     /**
      * Prints the name of the author of this LibraryBook in
      * the terminal window.
      */
       public void printAuthor()
       {
           System.out.println("Author: " + author);
       }
       /**
        * Prints the title of this Book in
        * the terminal window.
        */
        public void printTitle()
        {
            System.out.println("Title: " +title);
        }

        /**
         * Determines whether or not the Library reference of
         * this LibraryBook has been set.
         * @return  true if this LibraryBook has been given a
         *          library reference, false otherwise.
         */
        public boolean hasLibReference(){
           return reference.length() > 0;
       }


        public String toString()
        {
            StringBuilder bookDetails = new StringBuilder();

            bookDetails.append("Title: ").append(title).append("\n");
            bookDetails.append("Author: ").append(author).append("\n");
            bookDetails.append("Pages: ").append(pages).append("\n");

            String referenceString;
            if( hasLibReference() ){
                referenceString = reference;
            }
            else {
                referenceString = "has not been set";
            }

            bookDetails.append("Reference: ").append(referenceString);

            return bookDetails.toString();

         }

}
