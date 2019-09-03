package SnackBar;

public class VendingMachine
{
    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;

        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getNameFromId(int id)
    {
        if(getId() == id) {
           return getName();
        } else {
            return "can't find that id";
        }
    }

    public void setName(String name)
    {
        this.name = name;
    }
}