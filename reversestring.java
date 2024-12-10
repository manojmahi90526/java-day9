import java.util.*;
class rev{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char b[]=a.toCharArray();
        int n=b.length;
        int i=0;
        int h=n-1;
        while(i<=h){
            char temp=b[i];
            b[i]=b[h];
            b[h]=temp;
            i++;
            h--;

        }
        String res=new String(b);
        System.out.println(res);


    }
}