package Calendar;

import java.util.Scanner;

public class Print {

	Scanner sc = new Scanner(System.in);
	Calendar cal = new Calendar();

	public void printMenu() {
		System.out.println("+-----------------------+");
		System.out.println("��1. ���� ���");
		System.out.println("��2. ���� �˻�");
		System.out.println("��3. �޷� ����");
		System.out.println("��h. ���� / q. ����"); 
		System.out.println("+-----------------------+");

		System.out.println("�Է� > ");
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
		System.out.println("<�� ���� ���>");
		System.out.println("��¥�� �Է��� �ּ���.(yyyy-mm-dd)");
		String gotDate = sc.next();
		System.out.println("������ �Է��� �ּ���.");
		String gotPlan = sc.nextLine();
		cal.savePlan(gotDate, gotPlan);
		
	}

	public void lookUpPlan() {
		System.out.println("<���� �˻�>");
		System.out.println("��¥�� �Է��� �ּ���.(yyyy-mm-dd)");
		String date = sc.next();
		String plan = cal.searchPlan(date);
		System.out.println(plan);
	}

	public void showCalendar() {
		
		while (true) {
			System.out.println("�⵵�� �Է����ּ���");
			int year = sc.nextInt();
			while (true) {
				System.out.println("���� �Է����ּ���");
				int month = sc.nextInt();

				if (month < 1 || month > 12) {
					System.out.println("�߸� �Է��Ͽ����ϴ�.");
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
