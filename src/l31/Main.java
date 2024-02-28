package l31;

@FunctionalInterface
interface Animal {
    void sayPhrase();
}
class Main1 {
    public static void main(String[] args) {

        Animal cat = new Animal() {
            @Override
            public void sayPhrase() {

                System.out.println("Кот говорит 'Мяяяяяуууу!'");
            }
        };
        Animal cow = new Animal() {
            @Override
            public void sayPhrase() {

                System.out.println("Корова говорит 'Мууууу!'");
            }

        };
        Animal dog = new Animal() {
            @Override
            public void sayPhrase() {

                System.out.println("Собака говорит 'Гааав-гааав!'");
            }

        };
        cat.sayPhrase();
        cow.sayPhrase();
        dog.sayPhrase();

    };
}
class Main2 {
    public static void main(String[] args) {

        Animal cat = () -> System.out.println("The cat says 'Meow!'");
        Animal cow = () -> System.out.println("The cow says 'Mooooooo!'");
        Animal dog = () -> System.out.println("The dog says 'Gaaaav!'");

        cat.sayPhrase();
        cow.sayPhrase();
        dog.sayPhrase();


    }
}

