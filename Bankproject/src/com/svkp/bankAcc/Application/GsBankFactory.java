package com.svkp.bankAcc.Application;

public class GsBankFactory extends GsCurrentAcc{
	private String diposit;

public GsBankFactory(int accno, String accname, float accBal, boolean deposit) {
	super(accno, accname, accBal, deposit);
	// TODO Auto-generated constructor stub
}


public void diposit (float charges) {
	System.out.println("Dear custmer your balance:" + "+accountbalance" + "diposit:" + diposit);
}


public String toString() {
	
	return "GsBankFactory [diposit=" + diposit + ", accountbalance=" + accountbalance + "]";
}


public void getNewCurrentAcc(int i, String string, int j, boolean b) {
	// TODO Auto-generated method stub
	
}


public void getNewSavingAcc(int i, Object object, int j, boolean b) {
	// TODO Auto-generated method stub
	
}

}
