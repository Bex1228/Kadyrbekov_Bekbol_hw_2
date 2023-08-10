public class Laptop implements Printable{
    String brand ;
    double screenSize ;

    public Laptop(String brand, double screenSize) {

        this.brand = brand;
        this.screenSize = screenSize;
    }

    @Override
    public void print() {
        System.out.println("Brand: " + brand);
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}
