public class Figure8 {
    public static void main(String[] args) {
        Finch myFinch = new Finch("A");

        myFinch.setMotors(100, 70);
        myFinch.pause(2);
        myFinch.setMotors(50, 100);
        myFinch.pause(3);
        myFinch.setMotors(80, 50);
        myFinch.pause(2);

        myFinch.stopAll();
        myFinch.disconnect();
    }
}
