package com.svkp.bankAcc.FramWork;

public interface BankFactory {

		 public abstract SavingAcc getNewSavingAccount(int accno, String accname, float accBal, boolean withdraw);
		 public abstract SavingAcc getNewSavingAccount1(int accno, String accname, float accBal, boolean withdraw);
		   
		   
		    public abstract CurrentAcc getNewCurrentAccount1(int accno, String accname, float accBal, boolean deposit);
		    public abstract CurrentAcc getNewCurrentAccount(int accno, String accname, float accBal, boolean deposit);
		}
		

