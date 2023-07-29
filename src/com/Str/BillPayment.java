package com.Str;

public class BillPayment {

	int days, amount = 10000;
	int interest = amount * 2 / 100;
	int totalAmt = 0;

	public void countDays(int days) {
		this.days = days;

		if (days <= 10)

		{
			System.out.println("There will be no interest charge");
		} else {
			if (days > 10) {
				totalAmt = amount + interest;
				System.out.println("Total amount will be " + totalAmt);
			}
		}
	}

	public static void main(String[] args) {
		BillPayment bill = new BillPayment();
		bill.countDays(12);
	}
}
