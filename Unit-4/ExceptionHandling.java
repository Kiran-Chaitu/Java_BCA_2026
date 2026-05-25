class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

//InSufficientBalance 
public class ExceptionHandling{
    public static void main(String args[]) throws InvalidAgeException{
        try{
            int age = 13; // amount = 499
            // < 500 
            if(age <18){
                throw new InvalidAgeException("Age is less than 18");
            }else{
                System.out.println("You are eligible");
            }
        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}