public class Dog extends Animal
{
    private String name = "Jack";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    private String color ="white";
}
