package Chapter16.exercise8;

public class main
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(18);
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(39);
        list.add(18);
        list.add(40);

        System.out.println(list.hasTwoConsecutive());
    }
}
