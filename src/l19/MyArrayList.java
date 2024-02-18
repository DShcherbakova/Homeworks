package l19;
import l19.transport.Car;
import java.util.Arrays;

class MyArrayList {
    static int INITIAL_SIZE = 10; // начальный размер массива
    private Car[] carShowroom; // массив для хранения элементов
    private int count = 0; // количество элементов списка

    public MyArrayList(){
        this.carShowroom = new Car[INITIAL_SIZE];  // создание массива
    }

    public void add(Car element){
        carShowroom[count] = element; // реализация метода добавления
        count++;
    }

    public void removeByIndex(int index){
            for (int i = index; i < carShowroom.length; i++) {  // метод remove удаляет из списка переданный элемент 0
                carShowroom[i] = carShowroom[i++];
            }
    }
    public Car getByIndex(int index){  //метод get возвращает значение поля
        return carShowroom[index];
    }

    public String toString() {
        return Arrays.toString(this.carShowroom);
    }
}