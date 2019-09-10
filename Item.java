/**
 * 
 */

/**
 * @author Lilkunt Sarvesha
 *
 */

public class Item {
	
	private static int counter = 0;
	
	/*attributes*/
	private String name;
	private String description;
	private String category;
	private String suppliername;
	private String suppliercontact;
	private double price;
	private int quantityavailable;
	
	
	/*constructor*/
	public Item() {
		this.name = null;
		this.description = null;
		this.category = null;
		this.suppliername = null;
		this.suppliercontact = null;
		this.price = 0.0;
		this.quantityavailable = 0;
		setcounter((getcounter()+1));
	}

	

	/**
	 * overloaded 7 parameter constructors
	 * @param name
	 * @param description
	 * @param category
	 * @param suppliername
	 * @param suppliercontact
	 * @param price
	 * @param quantityavailable
	 */
	public Item(String name, String description, String category, String suppliername, String suppliercontact, double price, int quantityavailable) {
		this.name = name;
		this.description = description;
		this.category = category;
		this.suppliername = suppliername;
		this.suppliercontact = suppliercontact;
		this.price = price;
		this.quantityavailable = quantityavailable;
		setcounter((getcounter()+1));
	}
	
	/*behaviours*/
	/*getters*/
	public String getname() {
		return this.name;
	}
	
	public String getdescription() {
		return this.description;
	}
	
	public String getcategory() {
		return this.category;
	}
	
	public String getsuppliername() {
		return this.suppliername;
	}
	
	public String suppliercontact() {
		return this.suppliercontact;
	}
	
	public double getprice() {
		return this.price;
	}
	
	public int getquantityavailable() {
		return this.quantityavailable;
	}
	
	
	/*setters*/
	public void setname(String name) {
		this.name = name;
	}
	
	public void setdescription(String description) {
		this.description = description;
	}
	
	public void setcategory(String category) {
		this.category = category;
	}
	
	public void setsuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	
	public void setsuppliercontact(String suppliercontact) {
		this.suppliercontact = suppliercontact;
	}
	
	public void setprice(double price) {
		this.price = price;
	}
	
	public void setquantityavailable(int quantityavailable) {
		this.quantityavailable = quantityavailable;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", description=" + description + ", category=" + category + ", suppliername="
				+ suppliername + ", suppliercontact=" + suppliercontact + ", price=" + price + ", quantityavailable="
				+ quantityavailable + "]";
	}

	private void setcounter(int i) {
		// TODO Auto-generated method stub		
	}

	private int getcounter() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Item.counter = counter;
	}

}



