package day11;

import java.util.Scanner;

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

	return (this.name() + "				"+this.num()+"    		"+this.Price()+"    		"+this.per());
	}

	public float total() {
	float fi_total=0;
	fi_total+=this.per();
	return(fi_total);
	}


	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Enter the number of company to enter the records ");
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	Scanner sc3 = new Scanner(System.in);
	int n = sc.nextInt();
	String[] company_name = new String[n];
	int[] company_shares = new int[n];
	int[] company_share_price = new int[n];
	for(int i=0;i<n;i++) {
	System.out.println("Enter company name ");
	company_name[i]=sc1.nextLine();
	System.out.println("Enter number of shares");
	company_shares[i]=sc2.nextInt();
	System.out.println("Enter price of shares");
	company_share_price[i]=sc3.nextInt();
	
	}float per,total=0;
	System.out.println("Company name      Number of shares      Price of shares    Total cost of each shares");
	for(int j=0;j<n;j++) {
		stockaccountmanage st = new stockaccountmanage(company_name[j],company_shares[j],company_share_price[j]);
		System.out.println(st.print());
		per = st.per;
		total=total+st.per;
		
	}
	System.out.println("Total "+total);
}}


