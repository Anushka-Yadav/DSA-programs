import java.io.IOException;
import java.util.Scanner;

public class test {

 public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    int t=in.nextInt();
    
    for(int i=0;i<t;i++){
    int a = in.nextInt();
    int b = in.nextInt();
    int n = in.nextInt();
         a = a+(i*b);
        System.out.print(a+" ");
        }       
    }

}
