public class Main {
    public static void main(String[] args) {
        Printable[] laptops = new Printable[3];

        laptops[0] = createObject("GamingLaptop", "ASUS", 15.6, 1500);
        laptops[1] = createObject("Ultrabook", "Dell", 13.3, 10);
        laptops[2] = createObject("BusinessLaptop", "Lenovo", 14.0, "Fingerprint Scanner");

        for (Printable laptop : laptops) {
            laptop.print();
            System.out.println();
        }
    }

    public static Printable createObject(String className, String brand, double screenSize, Object additionalInfo) {
        switch (className) {
            case "GamingLaptop":
                return new GamingLaptop(brand, screenSize, (int) additionalInfo);
            case "Ultrabook":
                return new UltraBook(brand, screenSize, (int) additionalInfo);
            case "BusinessLaptop":
                return new BusinessLaptop(brand, screenSize, (String) additionalInfo);
            default:
                throw new IllegalArgumentException("Unknown class name");
        }
    }


    }
