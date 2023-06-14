import java.util.ArrayList;

public class ArrayListLibrary {
    public ArrayList<Book> library;

    public ArrayListLibrary() {
        library = new ArrayList<Book>();
    }

    public int insertSorted(Book newBook, int counter) {
        Book currBook;

        library.add(null);

        for (int i = library.size() - 2; i >= 0; --i) {
            currBook = library.get(i);
            if (currBook.getBookISBN() > newBook.getBookISBN()) {
                library.set(i + 1, currBook);
                ++counter;
            } else {
                library.set(i + 1, newBook);
                ++counter;
                return counter;
            }
        }

        library.set(0, newBook);
        ++counter;

        return counter;
    }

    public void printLibrary() {
        for (int i = 0; i < library.size(); ++i) {
            library.get(i).printInfo();
            System.out.println();
        }
    }
}