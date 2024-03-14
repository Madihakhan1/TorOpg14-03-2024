package codeflow;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X

    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rowsMax, int seatsMax) {
        //Her erklære vi arrayet
        this.seats = new String[rowsMax][seatsMax];

        //Vi laver en forloop for at loope igennem rowMax og seatMax, og tildeler værdien "0";
        for(int i = 0; i<rowsMax; i++){
            for(int j = 0; j<seatsMax; j++){
                this.seats[i][j] = "O";

            }
        }

        //Her overskriver vi række 0 og sæde 0 med værdien "X" til arrayet
        this.seats[0][0] = "X";
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.

    //Hvis jeg vil have den til at starte på index 1, så kan jeg minusse.
    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    //X er optaget og O er ikke optaget
    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) {
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}