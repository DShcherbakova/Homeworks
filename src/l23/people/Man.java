package l23.people;

    public class Man extends People {
        public Man(String name, int age){

            super(name, "Man", age);
        }
        public void applySkill() {

            playGames();
        }

        public void playGames() {

            System. out.println("Я умею играть в игры\n");
        }
    }
