public class NextMain{
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();

        Adventure jaws =(Adventure) Movie.getMovie("A","Jaws");
        movie.watchMovie();

        Object comedy =Movie.getMovie("C","Airplane");
        Comedy comedyMovie=(Comedy) comedy;
        comedyMovie.watchComedy();

        var Airplane = Movie.getMovie("C","Airplane");
        Airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();
    }
}