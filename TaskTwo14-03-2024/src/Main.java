import codeflow.Cinema;

public class Main {
    public static void main(String[] args){

        Cinema cinema = new Cinema(10, 10);

        cinema.reserve(2,5);

        cinema.cancelReservation(2,5);

        System.out.println(cinema);

    }
}