
public class RewardValue {

    // private instance variables
        private double cashValue;
        private double milesValue;

        // Constructor accepting cash value
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = cashValue / 0.0035;
        }

        // Constructor accepting miles value
        public RewardValue(double milesValue, boolean isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035;
        }

        // Get cash value
        public double getCashValue() {
            return cashValue;
        }

        // Get miles value
        public double getMilesValue() {
            return milesValue;
        }
    }