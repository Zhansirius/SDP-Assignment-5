public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("ThinkPad");
        myLaptop.setPowerStrategy(new PowerSaverStrategy());
        myLaptop.operate();

        myLaptop.setPowerStrategy(new BalancedStrategy());
        myLaptop.operate();

        myLaptop.setPowerStrategy(new HighPerformanceStrategy());
        myLaptop.operate();
    }
}