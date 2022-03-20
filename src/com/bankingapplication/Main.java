package com.bankingapplication;

public class Main {

		public static void main(String[] args) {
			
			Account account = new Account("121",5000,"nikita","nikit@123","5457845");
			account.depositeMoney(2000);
			account.depositeMoney(1000);
			account.withDrowMoney(8000);
		}
}
