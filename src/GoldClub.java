public class GoldClub extends SeniorClub{
    public GoldClub(double ticketPrice, String benefits, double yearlyFee) {
        super(ticketPrice, benefits, yearlyFee);
    }

    //Overrides for 4 key values
    @Override
    public double getTicketPrice(){
        return super.getTicketPrice()*0.9;
    }
    @Override
    public String getBenefits(){
        return super.getBenefits()+", Free soda refill";
    }
    @Override
    public double getYearlyFee(){
        return super.getYearlyFee();
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
