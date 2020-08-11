package test;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Seat seat[][] = new Seat[10][10];
		Manager manager = new Manager();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				seat[i][j] = new Seat();
			}
		}		
		
		
		while(true) {
			System.out.println("메뉴를 고르시오");
			System.out.println("1. 좌석 예약 2. 예약 취소 3. 좌석 조회 4. 식료품 구매 5. 관리자 모드 0. 프로그램 종료");
			int input = scan.nextInt();
			switch(input) {
			case 0 :
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			case 1 :
				System.out.println("앉을 좌석의 행과열을 입력하시오");
				int row = scan.nextInt();
				int col = scan.nextInt();
				seat[row][col].seatReservation();
				break;
			case 2 :
				System.out.println("취소할 좌석의 행과열을 입력하시오");
				row = scan.nextInt();
				col = scan.nextInt();
				seat[row][col].cancellationOfReservation();
				break;
			case 3 :
				movieTheaterSeatShow(seat);
				break;
			case 4:
				System.out.println("고객의 좌석의 행과열을 입력하시오");
				row = scan.nextInt();
				col = scan.nextInt();
				seat[row][col].groceryPurchase();
				break;
			case 5:
				manager.managerMode(seat);
				break;
			default :
				System.out.println("잘못 입력하셨습니다 다시 입력해주세요.");
					break;
			}
		}
	}
	static void movieTheaterSeatShow(Seat[][] seat) {
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				if(seat[i][j].getIsEmpty()) {
					System.out.print(" [ empty ] ");
				}
				else {
					System.out.print(" [ reserved ] ");
				}
				
			}
			System.out.println();
		}
	}
}
