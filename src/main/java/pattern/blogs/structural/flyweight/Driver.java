package pattern.blogs.structural.flyweight;

public class Driver {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        PaymentService paymentService = new PaymentService(paymentFactory);

        Bill transferInrToUs = new Bill(paymentService.getExchangeFactor("INR:USD"),35000);
        Bill transferAedToInr = new Bill(paymentService.getExchangeFactor("AED:INR"), 2300);

        Bill transferUsToInr = new Bill(paymentService.getExchangeFactor("INR:USD"), 3000);

        /*
        * Since, transferInrToUs and transferUsToInr have same exchange key so we can reuse CurrencyExchange
        * object.
        * Thus, removing redundancy and saving memory
        * */
        transferInrToUs.transferMoney();
        transferAedToInr.transferMoney();
        transferUsToInr.transferMoney();

    }
}
