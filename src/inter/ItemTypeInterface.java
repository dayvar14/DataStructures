package inter;

public interface ItemTypeInterface
{
    String getName();
    void setName(String name);


    int getId();
    void setId(int id);

    @Override
    String toString();
}
