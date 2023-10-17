public class PlatinumPlusClub extends PlatinumClub{
    public PlatinumPlusClub(double ticketPrice, String benefits, double yearlyFee) {
        super(ticketPrice, benefits, yearlyFee);
    }

    //Overrides for 5 key values
    public double getTicketPrice(){
        return super.getTicketPrice();
    }
    public String getBenefits(){
        return super.getBenefits();
    }
    @Override
    public double getYearlyFee(){
        return super.getYearlyFee()+10;
    }
    @Override
    public int freePass(){
        return super.freePass()+2;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
