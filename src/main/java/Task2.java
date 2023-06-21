public class Task2 <T extends Animal>
{
    public <T extends Animal> void  getNameAndColor(T animal)
    {
        System.out.println(animal.getName());
        System.out.println(animal.getColor());
    }
}
