package l28;

import java.util.ArrayList;
import java.util.List;

class BookShelf {
    private List<Book> books = new ArrayList<>();

    static class Book {
        String title;
        String author;
        int year;

        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return "'" + title + "'" + "-" + " автор " + author + "(" + year + ")";
        }
    }
    class Iterator {
        int index;

        Iterator() {

            this.index = 0;
        }

        public void bookIterator() {
            System.out.println("\nКниг на полке: ");
            for (index = 0; index < books.size(); index++) {
                System.out.println(books.get(index));
            }
        }
    }

    void addBook(String title, String author, int year) {

        books.add(new Book(title, author, year));

    }

    void removeBook(int index) {
         books.remove(index);
         System.out.println("\nКнига по индексу " + index + " убрана с полки");

    }

    void infoBooks() {
          System.out.println("\nКниги на полке: ");
          for (Book book : books) {
              System.out.println(book);
          }
    }
}
