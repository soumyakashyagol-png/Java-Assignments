public class Appliences {
    static abstract class Appliance {
        public abstract void turnOn();

        public abstract void turnOff();
    }

    static class Fan extends Appliance {
        public void turnOn() {
            System.out.println("Fan is turned ON.");
        }

        public void turnOff() {
            System.out.println("Fan is turned OFF.");
        }
    }

    static class Light extends Appliance {
        public void turnOn() {
            System.out.println("Light is turned ON.");
        }

        public void turnOff() {
            System.out.println("Light is turned OFF.");
        }
    }

    static class AC extends Appliance {
        public void turnOn() {
            System.out.println("AC is turned ON.");
        }

        public void turnOff() {
            System.out.println("AC is turned OFF.");
        }
    }



    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnOn();
        Light light = new Light();
        light.turnOn();
        AC ac = new AC();
        ac.turnOn();
        fan.turnOff();
        light.turnOff();
        ac.turnOff();
    }
    
}