/*
*****
*   * 
*   *
*  **    
*****
     *
*/


public class AlphabetQ{
	public static void main(String[] args){
		for(int i=1; i<=6;i++){
			for(int j=1;j<=6;j++){
				if((i==1 & j<=5) || (i==5 & j<=5) ||(j==1 & i<=5) || (j==5 & i<=5) || (i==4 & j==4) || (i==6 & j==6)){
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