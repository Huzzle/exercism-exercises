public class CarsAssemble {
    private final int CARS_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        double successRate = this.getSuccessRate(speed);
        return speed * CARS_PER_HOUR * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) this.productionRatePerHour(speed) / 60;
    }

    private double getSuccessRate(int speed) {
        if (speed <= 4) {
            return 1.0;
        } else if (speed >= 5 && speed <= 8) {
            return 0.9;
        } else if (speed == 9) {
            return 0.8;
        }

        return 0.77;
    }
}
