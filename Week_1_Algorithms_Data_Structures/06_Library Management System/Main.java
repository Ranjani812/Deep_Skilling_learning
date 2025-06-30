public class Main {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager(5);

        library.addBook(new Book(1, "The Alchemist", "Paulo Coelho"));
        library.addBook(new Book(2, "Clean Code", "Robert Martin"));
        library.addBook(new Book(3, "The Pragmatic Programmer", "Andrew Hunt"));
        library.addBook(new Book(4, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(5, "Introduction to Algorithms", "Cormen"));

        System.out.println("\nAll Books:");
        library.displayBooks();

        // Linear search
        System.out.println("\nLinear Search for 'Clean Code':");
        Book book = library.linearSearch("Clean Code");
        System.out.println(book != null ? book : "Book not found.");

        // Sort before binary search
        library.sortBooks();

        System.out.println("\nBinary Search for 'Effective Java':");
        book = library.binarySearch("Effective Java");
        System.out.println(book != null ? book : "Book not found.");
    }
}
