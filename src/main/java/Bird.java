public class Bird extends Animal
{
    private String name = "Coco";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    private String color ="green";
}
