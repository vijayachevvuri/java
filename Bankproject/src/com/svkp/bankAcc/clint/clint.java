package com.svkp.bankAcc.clint;


import com.svkp.bankAcc.Application.GsBankFactory;
import com.svkp.bankAcc.Application.GsCurrentAcc;
import com.svkp.bankAcc.Application.GsSavingAcc;
public class clint {
		public static void main(String[] args) {
			GsBankFactory gsbankfac= new GsBankFactory(0, null, 0, false);
			gsbankfac.getNewSavingAcc(0, null, 0, false);
			gsbankfac.getNewCurrentAcc(123, "suraj", 23456, true);
			
			GsSavingAcc gssaving = new GsSavingAcc(125,"krishna",123454,true);
			gssaving.withdrow(12344);
			
			GsCurrentAcc gscurrent = new GsCurrentAcc(234,"ram",56478,true);
			gscurrent.diposit(123);
		

	}

}