import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no. of vehicles : ");
	    int v = sc.nextInt();
	    System.out.println("Enter no. of wheels : ");
	    int w = sc.nextInt();
	    if(w>=2 && w%2==0 && v<w){
	        int y = w/2 -v;
	        int x = v-y;
	        System.out.println("TW=" + x + " FW=" + y);
	    }
	    else{
	        System.out.println("Invalid input !");
	    }
}
}
