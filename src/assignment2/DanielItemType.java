package assignment2;

import assignment2.adt.CS304ItemType;

public class DanielItemType extends CS304ItemType
{
    private static int idCounter = 0;

    public DanielItemType() {
        this.id = idCounter;
        this.name = "DanielItemType";
        ++idCounter;
    }

    @Override
    public String toString()
    {
        return name + " " + id;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getId()
    {
        return id;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void setId(int id)
    {
        this.id = id;
    }
}