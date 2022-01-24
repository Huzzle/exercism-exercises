public class SalaryCalculator {
    private final double BASE_SALARY = 1000.00;
    private final double MAX_SALARY = 2000.00;

    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped > 5 ? 0.85 : 1.0;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold > 20 ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        return this.multiplierPerProductsSold(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = BASE_SALARY * this.multiplierPerDaysSkipped(daysSkipped) + this.bonusForProductSold(productsSold);
        return Math.min(salary, MAX_SALARY);
    } 
}
