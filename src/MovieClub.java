/**
 * @Author Jesse C.
 * @param
 */

public abstract class MovieClub {

    private double ticketPrice;
    private String benefits;
    private double yearlyFee;

public MovieClub(double ticketPrice, String benefits, double yearlyFee) {
    this.ticketPrice = ticketPrice;
    this.benefits = benefits;
    this.yearlyFee = yearlyFee;
}
}
