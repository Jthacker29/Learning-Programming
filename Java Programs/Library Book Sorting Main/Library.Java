/* Two sorted lists have been created one implemented using a link list the other an ArrayList.
Complete main() by inserting a book into each list using their respective methods. 
Then, output the number of operations the computer must perform to insert the new book.
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Library {
    public static void fillLibraries(LinkedListLibrary linkedListLibrary, ArrayListLibrary arrayListLibrary) throws IOException {
        FileInputStream fileByteStream = null;
        Scanner inFS = null;
        int linkedListOperations = 0;
        int arrayListOperations = 0;

        BookNode currNode;
        Book tempBook;

        String bookTitle;
        String bookAuthor;
        long bookISBN;

        fileByteStream = new fileByteStream("Books.txt");
        inFS = new Scanner(fileByteStream);

        while (inFS.hasNextLine()) {
            bookTitle = inFS.nextLine();
            bookISBN = inFS.nextLong();
            inFS.nextLine();
            bookAuthor = inFS.nextLine();

            currNode = new BookNode(bookTitle, bookAuthor, bookISBN);
            linkedListOperations = linkedListLibrary.insertSorted(currNode, linkedListOperations);
            linkedListLibrary.lastNode = currNode;

            tempBook = new Book(bookTitle, bookAuthor, bookISBN);
            arrayListOperations = arrayListLibrary.insertSorted(tempBook, arrayListOperations);
        }

        fileByteStream.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        int linkedListOperations = 0;
        int arrayListOperations = 0;

        LinkedListLibrary linkedListLibrary = new LinkedListLibrary();
        ArrayListLibrary arrayListLibrary = new ArrayListLibrary();

        fillLibraries(linkedListLibrary, arrayListLibrary);

        BookNode currNode;
        Book tempBook;

        String bookTitle;
        String bookAuthor;
        long bookISBN;

        bookTitle = scnr.nextLine();
        bookISBN = scnr.nextLong();
        scnr.nextLine();
        bookAuthor = scnr.nextLine();

        currNode = new BookNode(bookTitle, bookAuthor, bookISBN);
        linkedListLibrary.insertSorted(currNode, linkedListOperations);
        linkedListLibrary.lastNode = currNode;

        tempBook = new Book(bookTitle, bookAuthor, bookISBN);
        arrayListLibrary.insertSorted(tempBook, arrayListOperations);

        System.out.println("Number of linked list operations: " + linkedListLibrary.insertSorted(currNode, linkedListOperations));
        System.out.println("Number of ArrayList operations: " + arrayListLibrary.insertSorted(tempBook, arrayListOperations));
    }
}