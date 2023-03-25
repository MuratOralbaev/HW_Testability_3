package sample;

public class CreditPaymentService {
    public int calculate(double interestRatePerYear, int creditAmount, int creditPeriodYear) {
        int creditPeriodMonth = creditPeriodYear * 12;
        double interestRatePerMonth = (interestRatePerYear / creditPeriodMonth / 12) / 100;
        double annuRate = (interestRatePerMonth * (Math.pow(1 + interestRatePerMonth, creditPeriodMonth))) / ((Math.pow(1 + interestRatePerMonth, creditPeriodMonth) - 1));
        int monthlyPayment = (int) (creditAmount * annuRate);
        return monthlyPayment;
    }
}
