package Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class JavaCalendar {

	public static void main(String[] args) {
		// Calendar Ŭ������  �޷� �����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ȸ �� �⵵�� �Է�: ");
		int year = scan.nextInt();
		
		System.out.print("��ȸ �� ���� �Է�: ");
		int month = scan.nextInt();
		
		Calendar cal = Calendar.getInstance(); // �߻�Ŭ����
		
		cal.set(year, month -1, 1);
		
		int week = cal.get(Calendar.DAY_OF_WEEK); 
		// ���� �������� ��´�
		// 1 ~ 7 ������ ���� ��ȯ (�� ~ ������� �ǹ�)
		
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		// �ش� ���� ��Ÿ�� �� �ִ� �ִ� ��¥���� ��´�
		
		System.out.println("week: " + week + ", lastDay: " + lastDay);
		System.out.println();
		
		System.out.println("\t\t" + year + "�� " + month + "��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		for(int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		for(int i = 1; i <= lastDay; i++) {
			System.out.print(i + "\t");
			week++;
			if(week > 7) {
				week = 1;
				System.out.println();
			}
		}
	}

}
