package l32;

import java.util.Scanner;

enum Moon {
     NEW_MOON("\uD83C\uDF11"),
     WAXING_CRESCENT("\uD83C\uDF12"),
     FIRST_QUARTER("\uD83C\uDF13" ),
     WAXING_GIBBOUS("\uD83C\uDF14"),
     FULL_MOON("\uD83C\uDF15"),
     WANING_GIBBOUS("\uD83C\uDF16"),
     LAST_QUARTER( "\uD83C\uDF17"),
     WANING_CRESCENT( "\uD83C\uDF18");

     private final String description;

     Moon(String description) {

                this.description = description;
     }
     public String getDescription(){

                return description;
     }

}
class Main1 {
    public static void main(String[] args) {

        for (Moon moons : Moon.values()) {
            System.out.println(moons + ":" + moons.getDescription());
        }
        System.out.println("Введите значение: ");
        Scanner scanner = new Scanner(System.in);
        String moonPhaseName = scanner.nextLine();
        //Moon moonPhase = Moon.valueOf("Новолуние");

        switch (moonPhaseName) {
            case "NEW_MOON":
                System.out.println("Новолуние");
                break;
            case "WAXING_CRESCENT":
                System.out.println("Растущий серп");
                break;
            case "FIRST_QUARTER":
                System.out.println("Первая четверть");
                break;
            case "WAXING_GIBBOUS":
                System.out.println("Растущая Луна");
                break;
            case "FULL_MOON":
                System.out.println("Полнолуние");
                break;
            case "WANING_GIBBOUS":
                System.out.println("Убывающая Луна");
                break;
            case "LAST_QUARTER":
                System.out.println("Последняя четверть");
                break;
            case "WANING_CRESCENT":
                System.out.println("Убывающий серп");
                break;
            default:
                System.out.println("Неверное указание фазы");
        }
    }
}
class Main2 {
     public static void main(String[] args) {
         // Season[] values() - это статический метод енама,
         // он возвращает все элементы этого енама в
         // том эе порядке в котором мы их указывали
         Moon[] moons = Moon.values();

         for (Moon moon : moons) {
             System.out.println(moon + ": " + moon.getDescription());
         }

         // Season valueOf(String name) - это статический метод енама,
         // который возвращает тот или иной элемент енама по названию
         Moon NEW_MOON = Moon.valueOf("NEW_MOON");

         if (NEW_MOON == Moon.NEW_MOON) {
             System.out.println(
                     "ДА"
             );
         }

         // int compareTo(Season other) - это метод енама,
         // который возвращает результат сравнения порядкого номера енамов
         int comparingValue = Moon.NEW_MOON.compareTo(Moon.NEW_MOON);
         System.out.println(comparingValue);

     }
}
