public class LineTracker {
    public static void main(String[] args) {
        Finch myFinch = new Finch("A");
        int threshold = 10;

        while(!myFinch.getButton("A")){
            if(myFinch.getLine("R") < threshold){
                myFinch.setMotors(30,0);
            }
            else if (myFinch.getLine("L") < threshold){
                myFinch.setMotors(0, 30);
            }
            else if (myFinch.getLine("L") == myFinch.getLine("R")){
                myFinch.setMotors(30,30);
            }
        }

        myFinch.stopAll();
        myFinch.disconnect();
    }
}
