package SnackBar;

public class Main
{
    public static void workWithData()
    {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());

        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

        // 1
        c1.buySnack(s4.completePurchase(3));
        System.out.println(c1.getCashOnHand());
        System.out.println(s4.getQuantity());
        // 2
        c1.buySnack(s3.completePurchase(1));
        System.out.println(c1.getCashOnHand());
        System.out.println(s3.getQuantity());
        // 3
        c2.buySnack(s4.completePurchase(2));
        System.out.println(c2.getCashOnHand());
        System.out.println(s4.getQuantity());
        // 4
        c1.addCash(10);
        c1.getCashOnHand();
        // 5
        c1.buySnack(s2.completePurchase(1));
        System.out.println(c1.getCashOnHand());
        System.out.println(s2.getQuantity());
        // 6
        s3.addQuantity(12);
        System.out.println(s3.getQuantity());
        // 7
        c2.buySnack(s3.completePurchase(3));
        System.out.println(c2.getCashOnHand());
        System.out.println(s3.getQuantity());

        // Stretch
        System.out.println(s1.getName());
        System.out.println(v1.getNameFromId(s1.getVendingMachineId()));
        System.out.println(s1.getQuantity());
        System.out.println(s1.totalCost(s1.getQuantity()));

        System.out.println(s2.getName());
        System.out.println(v1.getNameFromId(s2.getVendingMachineId()));
        System.out.println(s2.getQuantity());
        System.out.println(s2.totalCost(s2.getQuantity()));

        System.out.println(s3.getName());
        System.out.println(v1.getNameFromId(s3.getVendingMachineId()));
        System.out.println(s3.getQuantity());
        System.out.println(s3.totalCost(s3.getQuantity()));

        System.out.println(s4.getName());
        System.out.println(v2.getNameFromId(s4.getVendingMachineId()));
        System.out.println(s4.getQuantity());
        System.out.println(s4.totalCost(s4.getQuantity()));

        System.out.println(s5.getName());
        System.out.println(v2.getNameFromId(s5.getVendingMachineId()));
        System.out.println(s5.getQuantity());
        System.out.println(s5.totalCost(s5.getQuantity()));
    }
    public static void main(String[] args)
    {
        workWithData();
    }
    
}