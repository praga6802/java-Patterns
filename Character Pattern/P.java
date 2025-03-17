/*
    P
   R R
  AAAAA
 G     G	
A		A

*/

public class P{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j;j++){
				if(i==1 & j==5){
					System.out.print("P");
				}
		
				else if((i==2 & j==4) || (i==2 & j==6)){
					System.out.print("R");
				}
		
				else if((i==3 & j==7)||(i==3 & j==5) || (i==3 & j==4) || (i==3 & j==6)|| (i==3 & j==3)|| (i==5 & j==1) || (i==5 & j==9)){
					System.out.print("A");
				}
				else if((i==4 & j==8)||(i==4 & j==2) ){
					System.out.print("G");
				}
				else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}