import java.util.Scanner;

class Convert {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------Welcome to the money exchanger--------------------------");
        System.out.println();

        System.out.println("First enter the money type (USD / EURO / JPY / POUND / AUD):");
        String type = scanner.nextLine();

        System.out.println();
        System.out.println("Enter your amount:");
        double amount= scanner.nextDouble();

        double result = 0;
        currency c = new currency();


        if (type.equalsIgnoreCase("USD")) {
            c.setusd(amount);
        } else if (type.equalsIgnoreCase("EURO")) {
            c.seteuro(amount);
        } else if (type.equalsIgnoreCase("JPY")) {
            c.setjpy(amount);
        } else if (type.equalsIgnoreCase("POUND")) {
            c.setpound(amount);
        } else if (type.equalsIgnoreCase("AUD")) {
            c.setAud(amount);
        } else {
            System.out.println("Invalid currency type entered!");
            System.exit(0);
        }

        double usdRate = 300.0;
        double euroRate = 340.29;
        double jpyRate = 2.08;
        double poundRate = 398.82;
        double audRate = 191.63;

        result = 0;

        if(c.getusd()!= 0){
            result = c.getusd() * usdRate;
            System.out.println(c.getusd() +" Usd " +result +"LKR");
        }
        else if (c.geteuro()!= 0){
            result = c.geteuro() *euroRate ;
			 System.out.println(c.geteuro() +" Usd " +result +"LKR");
        }
        else if (c.getjpy()!= 0){
            result = c.getjpy() * jpyRate;
			 System.out.println(c.getjpy() +" Usd " +result +"LKR");
        }
        else if (c.getpound()!= 0){
            result = c.getpound() * poundRate;
			 System.out.println(c.getpound() +" Usd " +result +"LKR");
        }
        else if(c.getAud()!=0){
            result = c.getAud() * audRate;
			 System.out.println(c.getAud() +" Usd " +result +"LKR");
        }

        scanner.close();
    }
}











      