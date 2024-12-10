import java.util.*;
class charequal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        System.out.println(((s&32)==0));
    }
}