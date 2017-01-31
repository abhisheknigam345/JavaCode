package com;

public class ItemDemo {

	public static void main(String[] args) {
		try{
			Item[] i=new Item[5];
			i[0]=new Item(1,"asd",200,300);
			i[1]=new Item(2,"asde",2300,3400);
			i[2]=new Item(3,"asfd",2000,3000);
			i[3]=new Item(4,"asdd",200,300);
			i[4]=new Item(5,"asd",2000,30089);
			System.out.println(getLeastPriceItem(i).getItemName());
		}
		catch(Exception e){
			
		}

	}
	public static Item getLeastPriceItem(Item[] a){
		try{
			int i;
			double price,leastprice;
			for(i=0;i<a.length;i++){
				price=a[i].getItemPrice()-(a[i].getItemDiscount()*a[i].getItemPrice())/100;
				a[i].setItemPrice(price);
			}
			leastprice=a[0].getItemPrice();
		for(i=0;i<a.length;i++){
			if(leastprice>a[i].getItemPrice()){
				leastprice=a[i].getItemPrice();
			}
		}
		for(i=0;i<a.length;i++){
			if(leastprice==a[i].getItemPrice())
				break;
		}
		return a[i];
	}
		catch(NullPointerException e){
			return null;
		}
	}

}
class Item{
	private int itemId;
	private String itemName;
	private double itemPrice;
	private double itemDiscount;
	Item(int itemId,String itemName,double itemPrice,double itemDiscount){
		this.itemId=itemId;
		this.itemPrice=itemPrice;
		this.itemName=itemName;
		this.itemDiscount=itemDiscount;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public double getItemDiscount() {
		return itemDiscount;
	}
	public void setItemDiscount(double itemDiscount) {
		this.itemDiscount = itemDiscount;
	}
	
}
