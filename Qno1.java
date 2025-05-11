 
 public class Qno1 {
    String title;
    String author;
    String ISBN;

    
    Qno1(String t, String a, String i) {
        title = t;
        author = a;
        ISBN = i;
    }

    
    void showDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN  : " + ISBN);
        
    }

    
    public static void main(String[] args) {
        
        Qno1 book1 = new Qno1("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "978-0747532743");
        Qno1 book2 = new Qno1("The Hobbit", "J.R.R. Tolkien", "978-0261103344");
        Qno1 book3 = new Qno1("1984", "George Orwell", "978-0451524935");
        Qno1 book4 = new Qno1("To Kill a Mockingbird", "Harper Lee", "978-0060935467");
        Qno1 book5 = new Qno1("The Alchemist", "Paulo Coelho", "978-0061122415");

        
        book1.showDetails();
        book2.showDetails();
        book3.showDetails();
        book4.showDetails();
        book5.showDetails();
    }
 }
