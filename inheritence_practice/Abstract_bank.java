package inheritence_practice;

public class Abstract_bank {
	public static void main(String[] args) {
		BankA a = new BankA();
		System.out.println("Balance of Bank A = $"+a.getBalance());
		BankB b = new BankB();
		System.out.println("Balance of Bank B = $"+b.getBalance());
		BankC c = new BankC();
		System.out.println("Balance of Bank C = $"+c.getBalance());
	}
}
abstract class Bank {
	abstract int getBalance();
	
}
class BankA extends Bank {
	int getBalance() {
		int amt=100;
		return amt;
	}
}
class BankB extends Bank {
	int getBalance() {
		int amt=200;
		return amt;
	}
}
class BankC extends Bank {
	int getBalance() {
		int amt=300;
		return amt;
	}
}

