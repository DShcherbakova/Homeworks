package l31;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

class Main30 {
    public static void main(String[] args) {
        Calculator sub = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };
        int result1 = sub.operate(3, 2);
        System.out.println("3 - 2 = " + result1);

        Calculator add = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int result2 = add.operate(3, 2);
        System.out.println("3 + 2 = " + result2);
    }
}

class Main3 {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;

        System.out.println("Сумма 5 и 3 равна " + add.operate(5, 3));
        System.out.println("Разность 5 и 3 равна " + subtract.operate(5, 3));
    }
}
