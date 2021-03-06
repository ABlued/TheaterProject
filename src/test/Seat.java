package test;
import java.util.Scanner;
public class Seat {
	Scanner scan = new Scanner(System.in);
	private boolean isEmpty;
	private int numberOfPopcorns;
	private int numberOfCoke;
	private int totalPrice;
	private int password;
	
	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public boolean getIsEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public int getNumberOfPopcorns() {
		return numberOfPopcorns;
	}

	public void setBuyPopCorn(int numberOfPopcorns) {
		this.numberOfPopcorns = numberOfPopcorns;
	}

	public int getNumberOfCoke() {
		return numberOfCoke;
	}

	public void setBuyCoke(int numberOfCoke) {
		this.numberOfCoke = numberOfCoke;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Seat() {
		// TODO Auto-generated constructor stub
		this.isEmpty = true;
		this.numberOfPopcorns = 0;
		this.numberOfCoke = 0;
		this.totalPrice = 0;
	}
	
	public void seatReservation() {
		if(this.isEmpty) {
			System.out.println("비밀 번호를 입력해주세요");
			int password = scan.nextInt();
			setPassword(password);
			System.out.println("예약되셨습니다.");
			this.isEmpty = false;
			this.totalPrice = 8000;
		}
		else {
			System.out.println("이미 예약된 자리입니다.");
		}
	}
	
	public void cancellationOfReservation() {
		if(this.isEmpty) {
			System.out.println("예약되있지 않는 자리입니다..");	
		}
		else {
			System.out.println("비밀 번호를 입력해주세요");
			int password = scan.nextInt();
			if(getPassword() == password) {
			System.out.println("예약취소되었습니다.");
			this.totalPrice = 0;
			this.numberOfPopcorns = 0;
			this.numberOfCoke = 0;
			this.isEmpty = true;
			}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
	}
	public void groceryPurchase() {
		if(this.isEmpty) {
			System.out.println("예약되있지 않는 자리입니다..");	
		}
		else {
			System.out.println("비밀 번호를 입력해주세요");
			int password = scan.nextInt();
			if(getPassword() == password) {
			System.out.println("구입할 물품을 고르시오.");
			System.out.println("-------------------------");
			System.out.println("1. 팝콘(5000원)");
			System.out.println("2. 콜라(3000원)");
			System.out.println("-------------------------");
			System.out.println();
			
			int input = scan.nextInt();
			if(input == 1) {
				this.numberOfPopcorns++;
				this.totalPrice += 5000;
			}
			else if(input == 2) {
				this.numberOfCoke++;
				this.totalPrice += 3000;
			}
			System.out.println("고객님이 내실 총 금액은 " + this.totalPrice + "원입니다.");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
	}
}
