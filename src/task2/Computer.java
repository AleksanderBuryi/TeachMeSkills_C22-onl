package task2;

public class Computer {
    private double price;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer(double price, String model) {
        this(price, model, new RAM(), new HDD());
    }

    public Computer(double price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public RAM getRam() {
        return ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "\n\tprice = " + price +
                ", \n\tmodel = '" + model + '\'' +
                ", \n\tram = " + ram +
                ", \n\thdd = " + hdd +
                "\n}";
    }
}
