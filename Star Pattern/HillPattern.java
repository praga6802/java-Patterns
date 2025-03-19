/*
     *
    ***
   *****
  *******
 *********
*/


public class HillPattern{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=i;j<=5;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			for(int l=1;l<i;l++){ // we can reduce either k or l to make tip of hill otherwise we dont get tip of mountain
				System.out.print("*");
			}
		System.out.println();
		}
	}
}