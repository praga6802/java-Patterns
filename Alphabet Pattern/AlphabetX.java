/*

*     *
  *	*
   *  
  * * 
 *   * 
*     * 


*/


public class AlphabetX{
	public static void main(String[] args){
		for(int i=1; i<=6;i++){
			for(int j=1;j<=7;j++){
				if((i==1 & j==1) ||(i==1 & j==7) ||(i==2 & j==3) || (i==2 & j==5) ||(i==3 & j==4) || (i==4 & j==3) || (i==4 & j==5) || (i==5 & j==2) || (i==5 & j==6) || (i==6 & j==1) ||(i==6 & j==7)){
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