class Author 
{
private String name;
private String email;
private char gender;
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
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}

}
public class Book {
	private String name;
	private Double price;
	private int qtyInStock;
	private Author obj;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public Author getObj() {
		return obj;
	}
	public void setObj(Author obj) {
		this.obj = obj;
	}
	public static void main(String[] args) {
		Author obj=new Author();
		obj.setName("Dinesh");
		obj.setEmail("jkl@gmail.com");
		obj.setGender('M');
		Book b=new Book();
		b.setName("JAVA REF");
		b.setPrice(500d);
		b.setQtyInStock(10);
		b.setObj(obj);
		System.out.println("NAME OF BOOK\t"+"AUTHOR NAME\t"+"PRICE\t"+"STOCK QTY\t"+"GENDER\t"+"EMAIL");
		System.out.println(b.getName()+"\t"+b.getObj().getName()+"\t\t"+b.getPrice()+"\t"+b.getQtyInStock()+"\t\t"+b.getObj().getGender()+"\t"+b.getObj().getEmail());
	}

}
