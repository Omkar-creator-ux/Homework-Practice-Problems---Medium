package Medium;

public class Qno5 {
    
    String name;
    String language;
    double rating;

   
    public Qno5(String name, String language, double rating) {
        this.name = name;
        this.language = language;
        this.rating = rating;
    }

    
    public void displayMovieDetails() {
        System.out.println("Movie Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Rating: " + rating + " / 5");
        System.out.println("-------------------------------");
    }


    public static void main(String[] args) {
        
        Qno5 movie1 = new Qno5("Inception", "English", 4.8);
        Qno5 movie2 = new Qno5("Parasite", "Korean", 4.6);
        Qno5 movie3 = new Qno5("Amélie", "French", 4.7);
        Qno5 movie4 = new Qno5("Spirited Away", "Japanese", 4.9);

        movie1.displayMovieDetails();
        movie2.displayMovieDetails();
        movie3.displayMovieDetails();
        movie4.displayMovieDetails();
    }
}
