public class NextMain{
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure)Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var BreakingBad = Movie.getMovie("C","Breaking Bad");
        BreakingBad.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S","Airways Planet");
        if(unknownObject.getClass().getSimpleName()== "Comedy") {
            Comedy c = (Comedy)unknownObject;
            c.watchComedy();
        } else if(unknownObject instanceof Adventure) {
                ((Adventure) unknownObject).watchAdventure();
            } else if(unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}