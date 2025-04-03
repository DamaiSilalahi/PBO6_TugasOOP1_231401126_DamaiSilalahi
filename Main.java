public class Main {
    public static void main (String[] args) {
        Payment Siti = new Payment(3500000, "Kartu Kredit");

        Siti.beforeDiscount("Siti");
        Siti.getPaymentMethod();
        Siti.paymentDetails(true);
        System.out.println();

        Payment Ciciripi = new Payment(10000000, "Voucher Diskon");

        Ciciripi.beforeDiscount("Ciciripi");
        Ciciripi.getPaymentMethod(15);
        Ciciripi.afterDiscount(15);
        Ciciripi.paymentDetails(true);
        System.out.println();

        Payment Asnawi = new Payment(1200000, "Transfer Bank");

        Asnawi.beforeDiscount("Asnawi");
        Asnawi.getPaymentMethod();
        Asnawi.paymentDetails(true);
    }
}
