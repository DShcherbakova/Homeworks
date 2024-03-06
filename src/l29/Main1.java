package l29;

import java.util.LinkedList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        list.addFirst(1); // Получение первого элемента
        list.addLast(4);   // Получение последнего элемента

        System.out.println("Первый элемент: " + list.getFirst() + ", последний элемент: " + list.getLast());

        list.removeFirst(); // Удаление первого элемента
        list.removeLast(); // Удаление последнего элемента
        System.out.println(list);

        if (list.contains(3)) {    // Проверка на наличие элемента
            System. out.println("'3' есть в списке");
        }

        int size = list.size();  // Получение размера списка
        System. out.println( "Размер списка: " + size);

        list.add(1, 5);  // Вставка элемента 5 по индексу 1, при этом другие элементы сдвинутся
        System.out.println(list);

        // Очистка списка
        list.clear();
        System. out.println(list);
    }
}
