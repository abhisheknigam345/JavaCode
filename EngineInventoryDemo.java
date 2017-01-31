package com;

public class EngineInventoryDemo {

	public static void main(String[] args) {
	EngineInventory inv=new EngineInventory();
	Engine e1=new TwoStroke(1,2200,25,'d');
	Engine e2=new FourStroke(2,2400,25,'g');
	Engine e3=new TwoStroke(3,2600,25,'d');
	Engine e4=new FourStroke(4,2800,25,'d');
	System.out.println(inv.addEngine(e1));
	System.out.println(inv.addEngine(e2));
	System.out.println(inv.addEngine(e3));
	System.out.println(inv.addEngine(e4));
	
	//System.out.println(inv.searchEngine('g'));
	
	//System.out.println(inv.searchEngine('d'));
	try{
		System.out.println(inv.enginesWithMileageGreaterThan(20));
	}
	catch(NoEngineExistException e){
		System.out.println(e.getMessage());
	}
	try{
		System.out.println(inv.enginesWithMileageGreaterThan(50));
	}
	catch(NoEngineExistException e){
		System.out.println(e.getMessage());
	}

	}

}
