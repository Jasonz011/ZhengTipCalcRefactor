public class tipCalculator {

    // declaring variables
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip;

    public tipCalculator(int numPeople, double tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }
    public double getTipPercentage() {
        return tipPercentage * 100;
    }
    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }
    public double tipAmount() {
        return (double) Math.round(100 * tipPercentage * totalBillBeforeTip) / 100;
    }
    public double totalBill() {
        return (double) Math.round(100 * (tipAmount() + totalBillBeforeTip)) / 100;
    }
    public double perPersonCostBeforeTip() {
        return (double) Math.round(100 * (totalBillBeforeTip / numPeople)) / 100;
    }
    public double perPersonTipAmount(){
        return (double) Math.round(tipAmount() / numPeople * 100) / 100;
    }
    public double perPersonTotalCost() {
        return perPersonCostBeforeTip() + perPersonTipAmount();
    }
}