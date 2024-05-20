public class Challenge {
    public static void main(String[] args) {
        Finch bird = new Finch("A");

        bird.setMotors(50, 50);
        bird.pause(1.5);
        bird.setMotors(20, -20);
        bird.pause(0.5);
        bird.stopAll();
        for(int i = 0; i < 10; i++)
        {
            bird.setMotors(70, 50+ 1 + i);
            bird.pause(5);
            if(bird.getButton("A"))
            {
                bird.stopAll();
                break;
            }
        }
    }
}