package java_two.sagid_irrkuev.hw2;

public class Track {
    private int minDistance;

    Track(int runLength) {
        minDistance = runLength;
    }
/*
    public void run(Sport sportsmen) {
        sportsmen.run(minDistance);
    }
*/

    public int getMinDistance() {
        return minDistance;
    }
}