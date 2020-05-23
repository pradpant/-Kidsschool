import java.util.*;
class Main{    
    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int x=sc.nextInt();
        int y=sc.nextInt();
        String s=repeat(st, x);
        if(s.charAt(y)==s.charAt(x))
          System.out.println("Same");
        else
          System.out.println("Not Same");
         
    }
}