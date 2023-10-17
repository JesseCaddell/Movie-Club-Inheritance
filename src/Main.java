public class Main {
    public static void main(String[] args) {

        int currentTicketPrice = 10;

        MovieClub[] clubs = new MovieClub[4];

        clubs[0] = new SeniorClub(currentTicketPrice, "Senior Benefits", 5);
        clubs[1] = new GoldClub(currentTicketPrice, "Gold Benefits", 15);
        clubs[2] = new PlatinumClub(currentTicketPrice, "Platinum Benefits", 30);
        clubs[3] = new PlatinumPlusClub(currentTicketPrice, "Platinum Plus Benefits", clubs[2].getYearlyFee());

        for (MovieClub mc : clubs) {
            System.out.println(mc.toString()+"\n");

        }
//        System.out.println(clubs[0].toString());
//        System.out.println(clubs[1].toString());
//        System.out.println(clubs[2].toString());
//        System.out.println(clubs[3].toString());


    }
}