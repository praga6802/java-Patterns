/*
*     *
*	  *
*  *  *
* * * *
**   ** 
*     * 


*/


public class AlphabetW{
	public static void main(String[] args){
		for(int i=1; i<=6;i++){
			for(int j=1;j<=7;j++){
				if(j==1 || j==7 ||(i==5 & j==2) || (i==5 & j==6) ||(i==4 & j==3) || (i==4 & j==5) || (i==3 & j==4)){
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