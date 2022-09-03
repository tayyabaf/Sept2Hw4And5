public class MovieTestDrive {
    public static void main (String[]args){
        Movie one = new Movie("Gone with the Stock", "Tragic", -2);
        Movie two = new Movie("Lost in Cubicle space", "Comedy", 5);
        Movie three = new Movie("byte Club", "Tragic but ultimately uplifiting", 127);

        //Calling method on movie 2
        two.playIt();
    }
}
