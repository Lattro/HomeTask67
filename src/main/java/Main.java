public class Main
{
    public static void main(String[] args)
    {
        // TASK 1
        Task1 task = new Task1(22.1, 145.00);
        Task1 task1 = new Task1("ddd", 145.00);

        //TASK 2
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal bird = new Bird();
        Task2 task21 = new Task2();
        task21.getNameAndColor(cat);
        task21.getNameAndColor(bird);
        task21.getNameAndColor(dog);
    }
}
