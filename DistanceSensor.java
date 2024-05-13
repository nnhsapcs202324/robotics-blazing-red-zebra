public class DistanceSensor {
    public static void main(String[] args) {
        Finch myFinch = new Finch("A");

        while(!myFinch.getButton("A")){
            if(myFinch.getDistance() < 30){
                myFinch.setTail("all", 100, 0, 0);
                myFinch.setMotors(50, -50);
                myFinch.pause(0.75);
            }
            else{
                myFinch.setTail("all", 0, 100, 0);
                myFinch.setMotors(50, 50);
            }
        }

        myFinch.stopAll();
        myFinch.disconnect();
    }
}
