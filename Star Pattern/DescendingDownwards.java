/*
***** //o space
 **** //1 space
  *** //2 space
   ** //3 space 
    * //4 space
*/



public class DescendingDownwards{
	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=n;i++){				
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--){
				System.out.print("*");
			}
		System.out.println();
		}
		}
}