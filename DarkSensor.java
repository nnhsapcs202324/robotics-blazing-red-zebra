public class DarkSensor {
    public static void main(String[] args) {
        int threshold = 1;
        Finch bird = new Finch("A");
        bird.setMotors(100, 100);
        while(!bird.getButton("A")){
            if(bird.getLight("L") < threshold || bird.getLight("R") < threshold){
                bird.stopAll();
            }
            else{
                bird.setMotors(100, 100);
            }
        }
    }
}
