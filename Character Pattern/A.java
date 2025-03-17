/*
    *
   * *
  *****
 *     *	

*/

public class A{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=8;j++){
				if((i==1 & j==5)  || (i==2 & j==4) || (i==2 & j==6)){
					System.out.print("A");
				}
				else if((i==3 & j==7)||(i==3 & j==5) || (i==3 & j==4) || (i==3 & j==6)|| (i==3 & j==3)){
					System.out.print("B");
				}
				else if((i==4 & j==8)||(i==4 & j==2) ){
					System.out.print("U");
				}
				else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}