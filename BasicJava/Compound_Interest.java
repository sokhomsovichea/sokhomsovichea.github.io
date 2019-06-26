public class CompoundInterest {
    public static void main(String args[]){
        double amount;
        double principle = 10000;
        double rate = .01;

        for(int day = 1; day<=20; day++){
            amount = principle*Math.pow(1 + rate, day); // (1+rate^day(time))  ex:...Math.pow(4,3)=4*4*4
            System.out.println(day + "   " + amount);
        }
    }
}
