package java_two.sagid_irrkuev.hw2;

public class Cat implements Sport {
    private String name;
    private int access = 0;
    private int accessRun = 0;

    Cat(String name) {
        this.name = name;
    }

    public void run(int minDistance) {
        if (access == 0) {
            if (accessRun == 0) {
                int runDistance = rnd.nextInt(200);
                if (minDistance < runDistance) {
                    System.out.println(this + " пробежал расстояние в " + minDistance + "м");
                } else {
                    System.out.println(this + " не смог пробежать расстояние в " + minDistance + "м");
                    accessRun = 2;
                }
            } else {
                System.out.println(this + " провалил предыдущий уровень по бегу и не допускается к следующему уровню");
            }
        } else {
            System.out.println(this + " провалил соревнования по прыжкам через стену и не допускается к бегу");
        }
    }

    public void jump(int minJump) {
        int jumpHeight = rnd.nextInt(20);
        if (access == 0) {
            if (jumpHeight > minJump) {
                System.out.println(this + " перепрыгнул через стену в " + minJump + "м");
            } else {
                System.out.println(this + " не смог перепрыгнуть через стену в " + minJump + "м");
                access = 1;
            }
        } else {
            System.out.println(this + " провалил предыдущий уровень по прыжкам, и не допускается к следующему уровню");
        }
    }

    @Override
    public String toString() {
        return "Кот " + name;
    }
}