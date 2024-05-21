public class FinchSensor {
    public static void main(String[] args) {
        Finch bird = new Finch("A");
        
        int left = bird.getLight("L");
        int right = bird.getLight("R");
        
        int difference = Math.abs(left - right); 
        System.out.println("Difference: " + difference);
        
        
        bird.stopAll();
        bird.disconnect();
    }
}
