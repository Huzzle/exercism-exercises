public class ElonsToyCar {
    private int driven = 0;
    private int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.driven + " meters";
    }

    public String batteryDisplay() {
        if (this.battery > 0) {
            return "Battery at " + this.battery + "%";
        }

        return "Battery empty";
    }

    public void drive() {
        if (this.battery > 0) {
            this.driven += 20;
            this.battery -= 1;
        }
    }
}
