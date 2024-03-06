package l33;


class myBox<T> {     // Объявление обобщенного класса myBox с типом-параметром T
    private T data;    // Поле "data" типа T
    public T get() {        // Метод для получения значения поля "content"

        return data;
    }
    public void set(T data) {    // Метод для установки значения поля "content"

        this.data = data;
    }
    public static <T> boolean isEqual(myBox<T> box1, myBox<T> box2) {

        return box1.get().equals(box2.get());           // Сравнение содержимого двух Box объектов
    }
    static boolean checkBox(myBox<String> stringBox) {

        return stringBox.get() != null;
    }
}

