package java_two.sagid_irrkuev;

public class Wall {
    private int minJump;
    Wall(int heightJump) {
        minJump = heightJump;
    }
    public void jump(Sport sportsmen) {
        sportsmen.jump(minJump);
    }
}