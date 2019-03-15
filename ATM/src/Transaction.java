
public class Transaction {
private double balance;

private String cardnumber;


 public Transaction(){
    	 balance = 0.0;
  }

public void setBalance(double balance) {
	this.balance = balance;
}

public void withdraw (double amount)
	{

	if(amount>balance)
	{
	}
	else
	{
	 balance =balance-amount;
	 operation op=new operation("withdraw",amount);
	 History h=new History(op);
	 
	}


	}
	  
	public void deposit (double depositAmount )
	{
		operation op=new operation("deposit",depositAmount);
		 History h=new History(op);
		balance=depositAmount+balance;
		
	}

 public double getBalance() {
	 operation op=new operation("balance inquiry",balance);
	 History h=new History(op);
		return balance;
	}
 
public boolean validation(String cardnumber) {
		
		if (cardnumber.equals("12345"))
			
		{
		return true;
		}
		else 
return false;
	}

public String getCardnumber() {
	return cardnumber;
}

public void setCardnumber(String cardnumber) {
	this.cardnumber = cardnumber;
}
	

	
	
	
	
	
}
