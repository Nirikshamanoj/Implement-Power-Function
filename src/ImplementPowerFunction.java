import java.util.Scanner;
public class ImplementPowerFunction {
    static int findPower(int a,int b,int c)
    {
        if(b == 1){
            return a % c;
        }
        return findPower(a, b - 1, c) * a % c;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int remainder=findPower(a,b,c);
        System.out.println(remainder);
    }
}
