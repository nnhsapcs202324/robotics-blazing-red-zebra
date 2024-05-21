public class Encoder 
{
    static Finch bird = new Finch("A");

    public static double getWheelDistance(String side)
    {
        return bird.getEncoder(side);
    }
    
    public static void drawCircle(int left, int right)
    {
        boolean result = true;
        while(result == true){
            bird.setMotors(left, right);
            double lAngle = ((bird.getEncoder("L")*2*Math.PI*2.5)*180)/(Math.PI*10);
            double rAngle = ((bird.getEncoder("R")*2*Math.PI*2.5)*180)/(Math.PI*10);
            double difference = Math.abs(lAngle - rAngle);
            if(difference == 360){
                bird.stopAll();
                result = false;
            }
        }
    }
    
    
    public static void main(String[] args) {
        Finch bird = new Finch("A");
        
        drawCircle(10, 20);
    }
}
