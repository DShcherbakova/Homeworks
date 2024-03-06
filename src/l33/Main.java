package l33;

public class Main {
    public static void main(String[] args) {
        myBox<Integer> box1 = new myBox<>(); // Создание двух Box объектов для Integer
        box1.set(134);                       // Установка значения для первого Box

        myBox<Integer> box2 = new myBox<>();
        box2.set(134);

        boolean isEqual;
        isEqual = myBox.isEqual(box1, box2);
        System.out.println("Ответ: " + isEqual);
    }
}
