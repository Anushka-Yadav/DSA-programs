public class TowerofHanoi {
    public static void TOH(int n, String src, String help, String dest){
        if(n==1){
            System.out.println(n+" Disc Tranferred "+src+" to "+dest);
            return;
        }
        
        TOH(n-1, src, dest, help);
        System.out.println(n+" Disc Tranferred "+src+" to "+dest);
        TOH(n-1, help, src,dest);
    }
    
public static void main(String[] args) {
    TOH(3, "s","h", "d");
}

    }

