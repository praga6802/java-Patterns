/*
E E E E E
D D D D  
C C C 
B B
A
*/

public class CharacterPattern6{
	public static void main(String[] args){
		char ch='E';
		for(int i=1;i<=5;i++){
		for(int j=5; j>=i;j--){
			System.out.print(ch + " ");
		}
		System.out.println();
		ch--;
	}
}
}