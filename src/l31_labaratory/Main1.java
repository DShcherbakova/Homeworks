package l31;

interface Greeting {
    void sayHello();
    void sayGoodBye();
}

/*class MyGreeting implements Greeting{

    @Override
    public void sayHello(){
        System.out.println("Привет из обычного класса");
    }
}

 */



class Main1 {
    public static void main(String[] args) {
        // MyGreeting myGreeting = new MyGreeting();
        //myGreeting.sayHello();

        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Привет из анонимного класса!");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("Пока из анонимного класса!");
            }
        };

        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Здравствуйте!");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("До свидания!");
            }
        };
        Greeting greeting3 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Приветствую!");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("До встречи!");
            }
        };

        greeting1.sayHello();
        greeting2.sayHello();
        greeting3.sayHello();
        greeting1.sayGoodBye();
        greeting2.sayGoodBye();
        greeting3.sayGoodBye();
    }
}
