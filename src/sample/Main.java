import sample.CreditPaymentService;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double interestRatePerYear = 9.99;
        int creditAmount = 1000000;
        int creditPeriodYear = 1;
        int monthlyPayment = service.calculate(interestRatePerYear, creditAmount, creditPeriodYear);
        System.out.println("Ваш ежемесячный платёж: " + monthlyPayment);
    }
}
