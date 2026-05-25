abstract class ATM{
    double amount;
    public ATM(){
        
    }
    abstract public void withdraw();
    public void paymentStatus(){
        System.out.println("Payment done");
    }
}
class SBI extends ATM{
    @Override
    public void withdraw(){
        System.out.println("Amount withdrawn from SBI ATM");
    }
}
class HDFC extends ATM{
    @Override
    public void withdraw(){
        System.out.println("Amount withdrawn from HDFC ATM");
    }
}
public class AbstractionExample{
    public static void main(String args[]){
        ATM atm= new ATM();
    
    }
}