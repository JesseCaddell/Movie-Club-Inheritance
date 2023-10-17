public class PlatinumClub extends GoldClub{
    public PlatinumClub(double ticketPrice, String benefits, double yearlyFee) {
        super(ticketPrice, benefits, yearlyFee);
    }

    //Overrides for 5 key values
    @Override
    public double getTicketPrice(){
        return super.getTicketPrice()*0.9;
    }
    @Override
    public String getBenefits(){
        return super.getBenefits()+" , free soda refill and popcorn refill,";
    }
    @Override
    public double getYearlyFee(){
        return super.getYearlyFee();
    }
    public int freePass(){
        return 1;
    }
    @Override
    public String toString() {
        return super.toString() + " +" + freePass() + " free buddy passes.";
    }
}
