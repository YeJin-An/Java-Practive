import java.util.Scanner;

class Ex4_6 {
	public static void main(String[] args) { 
		System.out.print("당신의 month는? ");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();  

		switch(month) {
			case 3: case 4: case 5:
				System.out.println("spring");
				break;
			case 6: case 7: case 8:
				System.out.println("summer");
				break;
			case 9: case 10: case 11:
				System.out.println("autumn");
				break;
			
			case 12: case 1: case 2:
				System.out.println("winter");
			default:
				System.out.println("잘못 입력했어요!");
		}
	} 
}