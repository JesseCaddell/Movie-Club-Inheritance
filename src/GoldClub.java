public class GoldClub extends MovieClub{
    public GoldClub(double ticketPrice, String benefits, double yearlyFee) {
        super(ticketPrice, benefits, yearlyFee);
    }

    //Overrides for 3 key values
    @Override
    public double getTicketPrice(){
        return super.getTicketPrice()*0.9;
    }
    @Override
    public String getBenefits(){
        return "Free soda refill";
    }
    @Override
    public double getYearlyFee(){
        return super.getYearlyFee()+15;
    }
    @Override
    public String toString() {
        String goldClubInfo = super.toString() + "\n" +
                "Additional benefits: " + getBenefits();
        return goldClubInfo;
    }
}
