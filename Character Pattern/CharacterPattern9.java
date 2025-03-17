/*
A B C D E
F G H I
J K L
M N
O
*/


public class CharacterPattern9{
	public static void main(String[] args){
		char ch='A';
		for(int i=1;i<=5;i++){
		for(int j=5; j>=i;j--){
			System.out.print(ch + " ");
			ch++;
		}
		System.out.println();
	}
}
}