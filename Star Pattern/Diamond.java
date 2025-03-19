/*
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
*/


public class Diamond{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){ // first half is for straight pyramid with decreasing space and 2 increasing triangle and one column is reduced to get hill top
			for(int j=i;j<=5;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			for(int l=1;l<i;l++){ 
				System.out.print("*");
			}
		System.out.println();
		}
		for(int i=2;i<=5;i++){ // second half is for downward pyramid with increasing space and 2 decreasing triangle and one row is reduced to avoid duplicate row star
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++){
				System.out.print("*");
			}
			for(int l=i;l<5;l++){ 
				System.out.print("*");
			}
		System.out.println();
		}
	}
}