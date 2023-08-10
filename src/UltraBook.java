public class UltraBook extends Laptop{
    private int batteryLife;

    public UltraBook(String brand, double screenSize, int batteryLife) {
        super(brand, screenSize);
        this.batteryLife = batteryLife;
    }




    @Override
    public void print() {
        super.print();
        System.out.println("Battery Life: " + batteryLife + " hours");

    }
}
