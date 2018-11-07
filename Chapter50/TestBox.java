public class TestBox
{
    public static void main(String[] args)
    {
        Box box = new Box();
        box.boxStuff(6.0,6.0,6.0);
        System.out.println(box.area);
        System.out.println(box.volume);
    }
}