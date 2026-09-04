public class Interfaces {
    interface Controllable{
        void turnOn();
        void turnOff();
    }
    static class SmartLight implements Controllable{
        String lightName;
        int lightBrightness;
        SmartLight(String lightName, int lightBrightness){
            this.lightName = lightName;
            this.lightBrightness = lightBrightness;
        }
        @Override 
        public void turnOn(){
            System.out.println("Light turned On");
        }
        @Override 
        public void turnOff(){
            System.out.println("Light turned Off");
        }
        void changeBrightness(int newBrightness){
            this.lightBrightness = newBrightness;
            System.out.println("Light brightness changed to " + lightBrightness);
        }  
    }
    static class SmartFan implements Controllable{
        String fanName;
        int fanSpeed;
        SmartFan(String fanName, int fanSpeed){
            this.fanName = fanName;
            this.fanSpeed = fanSpeed;
        }
        @Override 
        public void turnOn(){
            System.out.println("Fan turned On");
        }
        @Override 
        public void turnOff(){
            System.out.println("Fan turned Off");
        }
        void changeSpeed(int newSpeed){
            this.fanSpeed = newSpeed;
            System.out.println("Fan speed changed to " + fanSpeed);
        }  
    }

    public static void main(String[] args){
        SmartLight philips = new SmartLight("philips", 4);
        SmartFan havells = new SmartFan("Havells", 400);
        philips.turnOn();
        philips.changeBrightness(8);
        philips.turnOff();
        havells.turnOn();
        havells.changeSpeed(600);
        havells.turnOff();
    }
}
