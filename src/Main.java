import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//Main Untuk Duck
//public class Main {
//    public static void main(String[] args){
//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();
//
//        Duck modelduck = new ModelDuck();
//        modelduck.performFly(); // Akan memanggil constructor modelduck(FlyNoWay())
//        modelduck.setFlyBehavior(new FlyWithRocketPower());
//        modelduck.performFly();
//    }
//}

//Main Untuk Tugas Shipping Strategy
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShippingCostCalculator calculator = new ShippingCostCalculator();

        // Input berat barang dari pengguna
        System.out.print("Masukkan berat barang (dalam kilogram): ");
        double weight = scanner.nextDouble();

        System.out.print("Masukkan jarak pengiriman (dalam kilometer): ");
        double distance = scanner.nextDouble();

        // Pengiriman reguler
        ShippingStrategy regularShipping = new RegularShipping();
        double regularCost = calculator.calculateShippingCost(regularShipping, weight, distance);

        // Pengiriman kilat
        ShippingStrategy expressShipping = new ExpressShipping();
        double expressCost = calculator.calculateShippingCost(expressShipping, weight, distance);

        // Pengiriman berdasarkan jarak
        ShippingStrategy distanceBasedShipping = new DistanceBasedShipping();
        double distanceBasedCost = calculator.calculateShippingCost(distanceBasedShipping, weight, distance);

        // Pengiriman dengan tarif tetap
        ShippingStrategy flatRateShipping = new FlatRateShipping();
        double flatRateCost = calculator.calculateShippingCost(flatRateShipping, weight, distance);

        // Menampilkan biaya pengiriman untuk semua strategi
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("\nBiaya pengiriman untuk berat " + weight + "kg dan jarak " + distance + "km:");
        System.out.println("1. Pengiriman reguler: " + currencyFormat.format(regularCost));
        System.out.println("2. Pengiriman kilat: " + currencyFormat.format(expressCost));
        System.out.println("3. Pengiriman berdasarkan jarak: " + currencyFormat.format(distanceBasedCost));
        System.out.println("4. Pengiriman dengan tarif tetap: " + currencyFormat.format(flatRateCost));

        // Meminta pengguna memilih strategi pengiriman
        System.out.print("\nPilih strategi pengiriman (1/2/3/4): ");
        int choice = scanner.nextInt();

        // Mengatur strategi pengiriman yang dipilih
        ShippingStrategy chosenShipping = null;
        String chosenShippingName = "";
        switch (choice) {
            case 1:
                chosenShipping = regularShipping;
                chosenShippingName = "Pengiriman reguler";
                break;
            case 2:
                chosenShipping = expressShipping;
                chosenShippingName = "Pengiriman kilat";
                break;
            case 3:
                chosenShipping = distanceBasedShipping;
                chosenShippingName = "Pengiriman berdasarkan jarak";
                break;
            case 4:
                chosenShipping = flatRateShipping;
                chosenShippingName = "Pengiriman dengan tarif tetap";
                break;
            default:
                System.out.println("Pilihan tidak valid. Menggunakan pengiriman reguler secara default.");
                chosenShipping = regularShipping;
                chosenShippingName = "Pengiriman reguler";
        }

        // Menghitung biaya pengiriman dengan strategi yang dipilih
        double chosenCost = calculator.calculateShippingCost(chosenShipping, weight, distance);

        // Menampilkan hasil pemilihan strategi pengiriman
        System.out.println("\nAnda telah memilih: " + chosenShippingName);
        System.out.println("Biaya pengiriman yang dipilih: " + currencyFormat.format(chosenCost));

        scanner.close();
    }
}
