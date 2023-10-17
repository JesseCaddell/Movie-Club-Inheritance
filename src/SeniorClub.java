public class SeniorClub extends MovieClub{
    public SeniorClub(double ticketPrice, String benefits, double yearlyFee) {
        super(ticketPrice, benefits, yearlyFee);
    }

    //Overrides for 4 key values
    @Override
    public double getTicketPrice(){
        return super.getTicketPrice()*0.5;
    }
    @Override
    public String getBenefits(){
        return "Free child-sized popcorn and drink";
    }
    @Override
    public double getYearlyFee(){
        return super.getYearlyFee();
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Additional benefits: " + getBenefits();
    }
}
