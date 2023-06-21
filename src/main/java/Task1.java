public  class  Task1
{

    public <T,V> Task1(T value, V value2)
    {
            if(value.getClass().getName()==value2.getClass().getName())
                System.out.println("Классы параметров идентичны");
            else  System.out.println("Классы парметров не идентичны");
    }
}
