package test;
import java.util.Scanner;
class Manager {
	private int password;
	Scanner scan = new Scanner(System.in);
	Manager(){
		this.password = 9999;
	}
	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	public void managerMode(Seat[][] movieTheater) {
		int totalResevation = 0;
		int totalPopCorn = 0;
		int totalCoke = 0;
		int totalPrices = 0;
		System.out.println("비밀 번호를 입력해주세요");
		int password = scan.nextInt();
		if(getPassword() == password) {
			for(int i = 0; i < movieTheater.length; i++) {
				for(int j = 0; j < movieTheater[i].length; j++) {
					if(movieTheater[i][j].getIsEmpty() == false) totalResevation++;
					if(movieTheater[i][j].geIsBuyPopCorn()) totalPopCorn++;
					if(movieTheater[i][j].getIsBuyCoke()) totalCoke++;
					totalPrices += movieTheater[i][j].getTotalPrice();
				}
			}
			
			System.out.println("총 예약석 : " + totalResevation);
			System.out.println("총 팝콘판매량 : " + totalPopCorn);
			System.out.println("총 콜라판매량 : " + totalCoke);
			System.out.println("총 수익량 : " + totalPrices);
		}
		else {
			System.out.println("비밀번호가 틀렸습니다.");	
	}
}

	
}
