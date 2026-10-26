public class Laptop {
    private PowerStrategy powerStrategy;
    private String model;

    public Laptop(String model) {
        this.model = model;
    }

    public void setPowerStrategy(PowerStrategy powerStrategy) {
        this.powerStrategy = powerStrategy;
    }

    public void operate() {
        System.out.print(model + " is operating. ");
        if (powerStrategy == null) {
            System.out.println("No strategy selected");
        } else {
            powerStrategy.applyStrategy();
        }
    }
}