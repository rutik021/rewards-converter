public class RewardValue {
    private double cashValue;
    private double milesValue;

    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts a cash value12
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        // Example usage
        RewardValue rewardFromCash = new RewardValue(100.0);
        System.out.println("Cash value: " + rewardFromCash.getCashValue());
        System.out.println("Miles value: " + rewardFromCash.getMilesValue());

        RewardValue rewardFromMiles = new RewardValue(10000);
        System.out.println("Cash value: " + rewardFromMiles.getCashValue());
        System.out.println("Miles value: " + rewardFromMiles.getMilesValue());
    }
}
