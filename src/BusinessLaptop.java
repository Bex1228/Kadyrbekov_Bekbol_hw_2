public class BusinessLaptop extends Laptop{
    private String securityFeatures;

    public BusinessLaptop(String brand, double screenSize, String securityFeatures) {
        super(brand, screenSize);
        this.securityFeatures = securityFeatures;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("Security Features: " + securityFeatures);
    }
}
