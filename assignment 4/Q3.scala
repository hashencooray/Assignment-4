class account(id:String,acntNumber:Int,balance:Double)
{
	var nic=id;
	var accNumber=acntNumber;
	var aBalance=balance;

	def withdraw(amount:Double)=if(aBalance>amount) aBalance=aBalance-amount else println("Your  balnce  not sufficient.");
	def deposit(amount:Double)=aBalance=aBalance+amount;
	def transfer(acc:List[account],amount:Double)=
	{
		if(aBalance>amount)
		{
			aBalance=aBalance-amount;
			acc.head.aBalance=acc.head.aBalance+amount;
		}
		else
		{
			println("Your balnce not sufficient.");
		}
	}	
}

object Q3
{
	def main(args:Array[String])
	{
		println("\t   Bank Tranfer");
		var acc1=new account("S888",1000,5000);
		var acc2=new account("S889",1001,10000);
		val bank:List[account]=List(acc1,acc2,acc3);
		
		val x=find(1001,bank);
		acc1.transfer(x,10000);

		println("Transferd account balance : "+acc1.aBalance);
		println("Received account balance  : "+x.head.aBalance);
	}

	val find=(accNumber:Int,list:List[account])=>list.filter(x=>x.accNumber.equals(accNumber));

}
