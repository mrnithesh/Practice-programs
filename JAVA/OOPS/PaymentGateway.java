//OOP practice - interfaces - full abstraction

interface Payment {
    void pay(double amount);
}

class UpiPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid amount Rs." + amount + "using UPI sucessfully");
    }
}
class CardPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid amount Rs." + amount + " using card sucessfully");
    }
}
public class PaymentGateway {
    public static void main(String[] args) {
        UpiPayment upi = new UpiPayment();
        CardPayment card = new CardPayment();
        upi.pay(5000);
        card.pay(6900);
    }
}
