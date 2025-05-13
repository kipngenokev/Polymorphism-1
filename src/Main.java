import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//        Movie movie =Movie.getMovie("Adventure", "Star Wars");
//        movie.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Enter type (A for Adventure, C for Comedy"
                    +"S for ScienceFiction, or Q to Quit");
            String type = s.nextLine();
            if("Qq".contains(type)) {
                break;
            }

            System.out.println("Enter Movie Title:");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}

