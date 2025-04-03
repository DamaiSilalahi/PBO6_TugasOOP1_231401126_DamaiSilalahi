public class Payment {
    double totalPrice;
    String paymentMethod ;
    boolean paymentStatus;

    public Payment(double totalPrice, String paymentMethod) {
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
    }

    public void beforeDiscount(String name) {
        System.out.println("Nama: " + name);
        System.out.println("Total Harga Sebelum Diskon: Rp " + String.format("%,.0f", totalPrice));
    }

    public void getPaymentMethod() {
        System.out.println("Metode Pembayaran: " + paymentMethod);
    }

    public void getPaymentMethod(double diskon) {
        System.out.println("Metode Pembayaran: " + paymentMethod);
        System.out.println("Voucher diskon: " + String.format("%,.0f", diskon) + "%");
    }

    public void paymentDetails (boolean paymentStatus) {
        this.paymentStatus = paymentStatus;

        if (paymentStatus) {
            System.out.println("Status Pembayaran: Pembayaran Berhasil dengan " + paymentMethod);
        } else {
            System.out.println("Status Pembayaran: Pembayaran Gagal dengan " + paymentMethod);
        }
    }

    public double afterDiscount(double diskon) {
        totalPrice =  totalPrice - (totalPrice * (diskon/100));
        System.out.println("Total Harga Setelah Diskon: Rp " + String.format("%,.0f", totalPrice));
        return totalPrice;
    }
}
