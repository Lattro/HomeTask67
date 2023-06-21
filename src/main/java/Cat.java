public class Cat extends Animal
{
    private String name = "Tom";
    private String color ="red";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }
}
