public class FinchTest {
    public static void main(String[] args) {
        Finch myFinch = new Finch("A");

        for (int i = 0; i < 4; i++) {
            myFinch.setMove("F", 50, 50);
            myFinch.setTurn("R", 95, 50);
        }
        
        
        myFinch.stopAll();
        myFinch.disconnect();
    }
}
