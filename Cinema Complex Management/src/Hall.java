public class Hall {
    private String movieTitle;
    private int totalSeats;
    private double ticketPrice;
    private int normalTicketsSold;
    private int reducedTicketsSold;

    public Hall(String movieTitle, int totalSeats, double ticketPrice) {
        this.movieTitle = movieTitle;
        this.totalSeats = totalSeats;
        this.ticketPrice = ticketPrice;
        this.normalTicketsSold = 0;
        this.reducedTicketsSold = 0;
    }

    public int availableSeats() {
        return totalSeats - (normalTicketsSold + reducedTicketsSold);
    }

    public void sellTickets(int number, boolean reducedPrice) {
        if (number <= availableSeats()) {
            if (reducedPrice) {
                reducedTicketsSold += number;
                System.out.println("Sale successful (Reduced Price): " + number + " tickets.");
            } else {
                normalTicketsSold += number;
                System.out.println("Sale successful (Normal Price): " + number + " tickets.");
            }
        } else {
            System.out.println("Error: Not enough seats available!");
        }
    }

    public void resetHall() {
        normalTicketsSold = 0;
        reducedTicketsSold = 0;
        System.out.println("Hall has been reset for the next show.");
    }

    public double revenue() {
        double normalRevenue = normalTicketsSold * ticketPrice;
        double reducedRevenue = reducedTicketsSold * (ticketPrice * 0.8);
        return normalRevenue + reducedRevenue;
    }

    public double occupancyRate() {
        int soldSeats = normalTicketsSold + reducedTicketsSold;
        if (totalSeats == 0) return 0.0;
        return (soldSeats / (double) totalSeats) * 100.0;
    }

    @Override
    public String toString() {
        return "Movie: " + movieTitle + "\n" +
               "Ticket Price: " + ticketPrice + " DH\n"+
               "Total Seats: " + totalSeats + "\n" +
               "Normal Tickets Sold: " + normalTicketsSold + "\n" +
               "Reduced Tickets Sold: " + reducedTicketsSold + "\n" +
               "Available Seats: " + availableSeats() + "\n" +
               "Occupancy Rate: " + String.format("%.2f", occupancyRate()) + " %\n" +
               "Revenue: " + revenue() + " DH";
    }

    public String getMovieTitle() { return movieTitle; }
    public void setMovieTitle(String movieTitle) { this.movieTitle = movieTitle; }

    public int getTotalSeats() { return totalSeats; }
    public void setTotalSeats(int totalSeats) { this.totalSeats = totalSeats; }

    public double getTicketPrice() { return ticketPrice; }
    public void setTicketPrice(double ticketPrice) { this.ticketPrice = ticketPrice; }

    public int getNormalTicketsSold() { return normalTicketsSold; }
    public void setNormalTicketsSold(int normalTicketsSold) { this.normalTicketsSold = normalTicketsSold; }

    public int getReducedTicketsSold() { return reducedTicketsSold; }
    public void setReducedTicketsSold(int reducedTicketsSold) { this.reducedTicketsSold = reducedTicketsSold; }
}


class TestHall {
    public static void main(String[] args) {
        Hall hall = new Hall("Titanic", 60, 75.5);

        hall.sellTickets(20, false);
        hall.sellTickets(14, true);  

        System.out.println("\n---- Hall Status -----");
        System.out.println(hall);

        hall.setMovieTitle("Avatar 2");
        System.out.println("\n--- New Movie ---");
        System.out.println("Current Movie: " + hall.getMovieTitle());

        hall.resetHall();
        System.out.println("Available seats after reset: " + hall.availableSeats());
    }
}
