/**
 * @Author Jesse C.
 * @param
 */

public abstract class MovieClub {

    private double ticketPrice;
    private String benefits;
    private double yearlyFee;

    public MovieClub() {
        this(10, "none", 0);
    }

    public MovieClub(double ticketPrice, String benefits, double yearlyFee) {
        if (ticketPrice < 0 || yearlyFee < 0) {
            throw new IllegalArgumentException("Values must not be negative");
        }
        if (benefits == null) {
            throw new NullPointerException("Required string entry");
        }

        this.ticketPrice = ticketPrice;
        this.benefits = benefits;
        this.yearlyFee = yearlyFee;
    }
    public double getTicketPrice(){
        return ticketPrice;
    }
    public String getBenefits(){
        return benefits;
    }
    public double getYearlyFee() {
        return yearlyFee;
    }
    public String toString() {
        return "Club Name: " + this.getClass().getSimpleName() + "\n" +
                "Ticket Price: " + getTicketPrice() + "\n" +
                "Yearly Fee: " + getYearlyFee();
    }
}
