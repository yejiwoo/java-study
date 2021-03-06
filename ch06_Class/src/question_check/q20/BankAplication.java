package question_check.q20;

import java.util.Scanner;

public class BankAplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int cnt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		while(run) {
			System.out.println("---------------");
			System.out.println("1계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("---------------");
			System.out.print("선택>");
			
			int selectNo=scanner.nextInt();
			scanner.nextLine();
			
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run=false;
			}
			
		}
		System.out.println("프로그램 종료");
	}
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		System.out.print("계좌번호:");
		String ano=scanner.nextLine();
		
		System.out.print("계좌주:");
		String owner=scanner.nextLine();
		
		System.out.print("초기입금액:");
		int balance=scanner.nextInt();
		
		Account a=new Account(ano, owner, balance);
		accountArray[cnt++]=a;
		
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
//		for(Account a: accountArray) {
//			if(a==null) break;
//			System.out.println(a.getAno()+"\t"+a.getOwner()+"\t"+a.getBalance());
//		}
		for(int i=0;i<cnt;i++) {
			String ano=accountArray[i].getAno();
			String owner=accountArray[i].getOwner();
			int balance = accountArray[i].getBalance();
			System.out.println(ano+"\t"+owner+"\t"+balance);
		}
	}
	private static void deposit() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		
		System.out.print("계좌번호:");
		String ano=scanner.nextLine();
		
		System.out.print("예금액:");
		int balance=scanner.nextInt();
		
		Account myAcc=findAccount(ano);
		int sum=myAcc.getBalance()+balance;
		myAcc.setBalance(sum);
		
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		
		System.out.print("계좌번호:");
		String ano=scanner.nextLine();
		
		System.out.print("출금액:");
		int money=scanner.nextInt();
		
		Account myAcc=findAccount(ano);
		int sub=myAcc.getBalance()-money;
		myAcc.setBalance(sub);
		
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	private static Account findAccount(String ano) {
		for(Account a : accountArray) {
			if(a.getAno().equals(ano)) return a;
		}
		return null;
	}
	

}
