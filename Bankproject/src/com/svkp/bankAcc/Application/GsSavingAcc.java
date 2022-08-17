package com.svkp.bankAcc.Application;

import com.svkp.bankAcc.FramWork.SavingAcc;

public class GsSavingAcc extends SavingAcc {
	

	private static 	final float accountbalance = 0;
		private String accno;

		public GsSavingAcc(int accno, String accname, float accBal, boolean deposit) {
			super(accno, accname, accBal, deposit);
			// TODO Auto-generated constructor stub
		}

		public GsSavingAcc(int accno2, String accname, int accBal, boolean deposit) {
			// TODO Auto-generated constructor stub
		}

		public void withdrow(float accBal) {
				System.out.println("Dear custamer,your Accoutbal"+ accountbalance);
			}
		    public void deposit(float accBal) {
		    	System.out.println("dear custamer,your acccoutbal"+ accountbalance);
		    }

			public String toString() {
				return "GsSavingAcc [accno=" + accno + ", diposit=" + diposit + ", accountbalance=" + accountbalance + "]";
			}
}
