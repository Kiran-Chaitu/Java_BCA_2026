interface Payment{
    void pay();
    default void generateRecipt(){
        commonLogic();
        System.out.println("Reciept Genreated");
    }
    default void refund(){
        commonLogic();
        System.out.println("Refund completed");
    }
    private void commonLogic(){
        System.out.println("Connecting to Server");
        System.out.println("Server process some Logics");
    }
}
class Upi implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment done through UPI");
    }
    @Override
    public void generateRecipt(){
        System.out.println("Reciept Genreated by UPI");
    }
}
class CreditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment done through Creadit Card");
    }
    @Override
    public void refund(){
        System.out.println("Refund completed By Credit Card");
    }
}
public class InterfaceSecondExample{
    public static void main(String args[]){
        Payment  upi = new Upi();
        upi.pay();
        upi.generateRecipt();
        upi.refund();

        Payment creditCard = new CreditCard();
        creditCard.pay();
        creditCard.generateRecipt();
        creditCard.refund();
    }
}