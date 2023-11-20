package dessertShopApplication;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

abstract class DessertItem{
    abstract double getCost();
}
class Candy extends DessertItem{
    private double priceInDollars;

    Candy(double priceInDollars){
        this.priceInDollars = this.priceInDollars;
    }
    @Override
    double getCost(){
        return priceInDollars * 1.1 * 60;
    }
}
class Cookie extends DessertItem{
    private double priceInEuro;
    Cookie(double priceInEuro){
        this.priceInEuro=priceInEuro;
    }
    @Override
    double getCost(){
        return priceInEuro * 1.1 * 70;
    }
}
class IceCream extends DessertItem{
    private double priceInRupees;

    IceCream(double priceInRupees){
        this.priceInRupees=priceInRupees;

    }
    @Override
    double getCost(){
        return priceInRupees * 1.1;
    }
}
public class DessertShop {
    private static ArrayList<DessertItem> dessertStorage = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your role (Owner/ Customer): ");
        String role =scanner.next();

        if (role.equalsIgnoreCase("Owner")){
            addDessertItems();
        }
        else if (role.equalsIgnoreCase("Customer")){
            placeOrder();
        }
        else {
            System.out.println("Invalid Role Entered.");
        }
        scanner.close();
    }
    private static void addDessertItems(){
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.println("Enter Dessert Item Type i.e., Candy, Cookie, IceCream or 'done' to finish");
            String itemType=scanner.next();

            if (itemType.equalsIgnoreCase("done")){
                break;
            }
            DessertItem dessertItem= createDessertItem(itemType);
            if (dessertItem != null){
                dessertStorage.add(dessertItem);
                System.out.println("Dessert Item added to Storage.");
            }
            else{
                System.out.println("Invalid Dessert Item Type.");
            }
        }
        scanner.close();
    }
      private static DessertItem createDessertItem(String itemType){
        Scanner scanner= new Scanner(System.in);

        switch(itemType.toLowerCase()){
            case "Candy":
                System.out.println("Enter Candy Price In Dollars: ");
                double candyPrice = scanner.nextDouble();
                return new Candy (candyPrice);

            case "Cookie":
                System.out.println("Enter Cookie price in euros: ");
                double cookiePrice=scanner.nextDouble();
                return new Cookie(cookiePrice);

            case "IceCream":
                System.out.println("Enter IceCream price in rupees: ");
                double iceCreamPrice= scanner.nextDouble();
                return new IceCream(iceCreamPrice);

            default:
                return null;
        }

      }
      private static void placeOrder(){
        double totalCost = 0;
        for (DessertItem dessertItem :dessertStorage){
            totalCost += dessertItem.getCost();
        }
          System.out.println("Total cost of the Order: "+ totalCost + "rupees");
      }
}
