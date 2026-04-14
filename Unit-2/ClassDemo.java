public class ClassDemo{
    public static void main(String[] arg){
       //object
       Book b1 = new Book();
       b1.nameOfTheBook = "Harry potter and the sorcer's stone";
       b1.authorName = "J.K.Rowling";
       b1.price = 500;

        Book b2 = new Book();
        b2.nameOfTheBook = "Wings of Fire";
        b2.authorName = "A.P.J.Abdul kalam";
        b2.price=300;

        b1.showDetails();
        b2.showDetails();

    }
}
class Book{
    String nameOfTheBook;
    String author Name;
    int price;
    
    void showDetails(){
        System.out.println(nameOfTheBook);
        System.out.println(authorName);
        System.out.println(price);
    }
}