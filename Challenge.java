public class Challenge {
    public static void main(String[] args) {
        Finch bird = new Finch("A");
        
        while(bird.getDistance() < 60){
            bird.setMotors(5, -5);
        }
        
        bird.pause(0.5);
        bird.setMotors(50, 50);
        bird.pause(1.5);
        bird.setMotors(20, -20);
        bird.pause(0.5);
        bird.stopAll();
        for(int i = 0; i < 1000; i+= 1)
        {
            bird.setMotors(50, 40 - (0.005 * i));
            bird.pause(0.1);
            if(bird.getDistance() < 12){
                bird.setMotors(25, 25);
                bird.pause(3);
                bird.setMotors(-25, -25);
                bird.pause(3);
                bird.setTurn("R", 20, 20);
            }
            if(bird.getButton("A"))
            {
                bird.stopAll();
                break;
            }
        }
    }
}