
public class Main  {
    public static void main(String[] args) {
        //variables
        int cardBalance = 5000;
        int interestRate = cardBalance * 17/100;
        int oneMonthBalance = cardBalance - interestRate;
        int twoMonthBalance = cardBalance - interestRate * 2;

        //code
    System.out.println("The balance after one month is " + oneMonthBalance);
    System.out.println("The balance after two months is " + twoMonthBalance);
    }
}