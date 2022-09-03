public class Movie {
    String title;
    String genre;
    int rating;

    Movie(){
    }

    Movie(String title, String genre, int rating){
        this.title=title;
        this.genre = genre;
        this.rating=rating;
    }

    void playIt(){
        System.out.println("Playing the movie " + this.title + ", it is categorized as a " + this.genre + " movie and has a rating of " + this.rating + " stars");
    }
}

