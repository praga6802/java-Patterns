/*
*****  *****
*	*  *   *
*****  ****
*      *  *
*      *   *

*/


public class Praga{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){ //P
			for(int j=1;j<=5;j++){
				if(j==1 || i==1 || i==3 ||(i==2 & j==5)){ 
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				}
			System.out.println(" ");

			}
		System.out.print();
		for(int i=1; i<=5;i++){ //R
			for(int j=1;j<=5;j++){
				if(i==1 || j==1 ||(i==2 & j==5) || (i==3 & j<=4) || (i==4 & j==4) || (i==5 & j==5)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}