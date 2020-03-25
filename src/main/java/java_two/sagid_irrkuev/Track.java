package java_two.sagid_irrkuev;

public class Track {
    private int minDistance;
    Track(int runLength) {
        minDistance = runLength;
    }
    public void run(Sport sportsmen) {
        sportsmen.run(minDistance);
    }
}