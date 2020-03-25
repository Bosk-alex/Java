package java_two.sagid_irrkuev;

public class Main {

    public static void main(String[] args) {
        Sport[] sportsmen = {new Cat("Барс"), new Human("Иван"),
                new Cat("Базилио"), new Human("Михаил"),
                new Robot("Александр"), new Robot("Олег")};

        Track[] runHardLevel = {new Track(50), new Track(100), new Track(150)};
        Wall[] jumpHardLevel = {new Wall(3), new Wall(5), new Wall(7)};
        System.out.println("Чемпионат по Прыжкам");
        for (int i = 0; i < jumpHardLevel.length; i++) {
            System.out.println("--------------------");
            System.out.println("******** Уровень: " + (i + 1) + " ***********");
            System.out.println("--------------------");
            for (int j = 0; j < sportsmen.length; j++) {
                jumpHardLevel[i].jump(sportsmen[j]);
                System.out.println("***");
            }
        }
        System.out.println("Чемпионат по Бегу");
        for (int i = 0; i < runHardLevel.length; i++) {
            System.out.println("-------------------");
            System.out.println("******* Уровень: " + (i + 1) + " *******");
            System.out.println("-------------------");
            for (int j = 0; j < sportsmen.length; j++) {
                runHardLevel[i].run(sportsmen[j]);
                System.out.println("***");
            }
        }

    }
}