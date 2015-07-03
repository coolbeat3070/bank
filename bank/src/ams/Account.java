package ams;
/*
 * @ Date :
 * @ Author :
 * @ Story : 은행 고객 쪽 기능 정의
 * */
public interface Account {
	public static final String BANK_NAME = "아이티뱅크";
	public void deposit(int money); // 예금
	public void withdraw(int money); // 출금
}
