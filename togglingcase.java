import java.util.*;
class togglingcase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        s^=32;
        System.out.println(s);
        if((s&32)==0)
        System.out.println("upper case");
        else
        System.out.println("lower case");

    }
}