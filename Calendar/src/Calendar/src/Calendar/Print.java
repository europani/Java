package Calendar;

import java.util.Scanner;

public class Print {

	Scanner sc = new Scanner(System.in);
	Calendar cal = new Calendar();

	public void printMenu() {
		System.out.println("+-----------------------+");
		System.out.println("│1. 일정 등록");
		System.out.println("│2. 일정 검색");
		System.out.println("│3. 달력 보기");
		System.out.println("│h. 도움말 / q. 종료"); 
		System.out.println("+-----------------------+");

		System.out.println("입력 > ");
		String menu = sc.next();

		switch (menu) {
		case "1": registerPlan(); break;
		case "2": lookUpPlan(); break;
		case "3": showCalendar(); break;
		case "h": showHelp();
		case "q": System.out.println("T hank you. bye!"); break;
		}
	}

	public void showHelp() {
		printMenu();
	}

	public void registerPlan() {
		System.out.println("<새 일정 등록>");
		System.out.println("날짜를 입력해 주세요.(yyyy-mm-dd)");
		String gotDate = sc.next();
		System.out.println("일정을 입력해 주세요.");
		String gotPlan = sc.nextLine();
		cal.savePlan(gotDate, gotPlan);
		
	}

	public void lookUpPlan() {
		System.out.println("<일정 검색>");
		System.out.println("날짜를 입력해 주세요.(yyyy-mm-dd)");
		String date = sc.next();
		String plan = cal.searchPlan(date);
		System.out.println(plan);
	}

	public void showCalendar() {
		
		while (true) {
			System.out.println("년도를 입력해주세요");
			int year = sc.nextInt();
			while (true) {
				System.out.println("월을 입력해주세요");
				int month = sc.nextInt();

				if (month < 1 || month > 12) {
					System.out.println("잘못 입력하였습니다.");
					continue;
				}
				cal.printCalendar(year, month);
				break;
			}
		
			

		}
	}

	public static void main(String[] args) {
		Print p = new Print();
		p.printMenu();

	}
}
