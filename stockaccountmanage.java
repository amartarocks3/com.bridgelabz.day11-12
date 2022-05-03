package day11;

	public class stockaccountmanage {

	String stock_name;
	int NumberOfShares;
	float SharePrice;
	float per=0;
	float total=0;
	public stockaccountmanage(String stock_name,int NumberOfShares,float SharePrice) {
	this.stock_name=stock_name;
	this.NumberOfShares=NumberOfShares;
	this.SharePrice=SharePrice;
	}

	public String name() {
	return stock_name;
	}
	public int num() {
	return NumberOfShares;
	}
	public float Price() {
	return SharePrice;
	}
	public float per() {
	per=this.num()*this.Price();
	return per;
	}


	public String print() {

	return ("The value for "+ this.name() + " is "+this.per());
	}

	public float total() {
	float fi_total=0;
	fi_total+=this.per();
	return(fi_total);
	}


	public static void main(String[] args) {
	// TODO Auto-generated method stub
	stockaccountmanage sc = new stockaccountmanage("microsoft",5,255);
	stockaccountmanage sc1 = new stockaccountmanage("google",11,25);
	System.out.println(sc.print());
	System.out.println(sc1.print());
	System.out.println("Total "+sc.per()+sc1.per());
	}
}


