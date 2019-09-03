package SnackBar;

public class Snack
{
    // fields
    private static int maxId;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    // constructor

    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // methods
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int id)
    {
        this.vendingMachineId = id;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int quantity)
    {
        this.quantity += quantity;
    }

    public void subtractQuantity(int quantity)
    {
        this.quantity -= quantity;
    }

    public double totalCost(int quantity)
    {
        double total = this.cost * quantity;
        return total;
    }

    public double completePurchase(int quantity)
    {
        subtractQuantity(quantity);
        return totalCost(quantity);
    }
}