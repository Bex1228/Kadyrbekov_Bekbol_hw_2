public class GamingLaptop extends Laptop {
    private int gpuPower;

    public GamingLaptop(String brand, double screenSize, int gpuPower) {
        super(brand, screenSize);
        this.gpuPower = gpuPower;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("GPU Power: " + gpuPower + " units");
    }
}
