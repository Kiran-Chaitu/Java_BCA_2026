public class ExceptionExample{
    public static void main(String args[]){
        try{  
            System.out.println("Outer Try");
            try{
                System.out.println("Inner Try");
                int x = 10/0;
                System.out.println("Inner Try");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Inner Exception: "
            +e.getMessage());
            }
        }catch(Exception e){
            System.out.println("Outer Exception: "
            +e.getMessage());
        }
    }
}