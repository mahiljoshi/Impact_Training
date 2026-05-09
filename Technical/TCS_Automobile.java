/*Problem Statement – An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :

Input :
200  -> Value of V
540   -> Value of W

Output :
TW =130 FW=70

Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels

Constraints :

2<=W
W%2=0
V<W
Print “INVALID INPUT” , if inputs did not meet the constraints.

The input format for testing 
The candidate has to write the code to accept two positive numbers separated by a new line.

First Input line – Accept value of V.
Second Input line- Accept value for W.
The output format for testing 

Written program code should generate two outputs, each separated by a single space character(see the example)
Additional messages in the output will result in the failure of test case */
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

/*
let x = two wheeler
let	y = four wheeler
v = x+y 
x = v-y ___eq1
w = 2x+4y __eq2
put 1 in 2
2(v-y) + 4y = w
y = w/2 - v
so then x = v - y 
*/

