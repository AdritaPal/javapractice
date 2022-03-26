package Handson;


class Account{
	private long  account_no;
	private String name, email;
	private float amount;
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}
public class AccountInstance {

	public static void main(String[] args) {
		Account a= new Account();
		a.setAccount_no(428178338);
		System.out.println(a.getAccount_no());
		a.setName("Stanley Hudson");
		System.out.println(a.getName());
		a.setEmail("stanleyhudson.sales@dundermifflin.com");
		System.out.println(a.getAccount_no());
		a.setAmount(34000.55f);
		System.out.println(a.getAmount());
	}

}
