package l28;

public class Main {
    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf();

        bookShelf.addBook("Маленький принц", "Антуан де Сент-Экзюпери", 1943);
        bookShelf.addBook("Джейн Эйр", "Шарлотта Бронте", 1847);
        bookShelf.addBook("Мартин Иден", "Джек Лондон", 1909);
        bookShelf.addBook("Кровь и пепел", "Дженнифер Арментроут", 2020);

        bookShelf.infoBooks();
        bookShelf.removeBook(1);

        BookShelf.Iterator bookShelfIterator = bookShelf.new Iterator();
        bookShelfIterator.bookIterator();

    }
}
