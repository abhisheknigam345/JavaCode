package com;

import java.util.ArrayList;

public class EngineInventory {
	ArrayList<Engine> engines=new ArrayList<Engine>();
	EngineInventory(){
		
	}
	public  int addEngine(Engine e){
		boolean flag=false;
		if(e==null)
			return -1;
		for(int i=0;i<engines.size();i++){
			if(e.getId()==engines.get(i).getId())
				flag=true;
		}
		if(flag)
			return -1;
		else{
			engines.add(e);
			return engines.size();
		}
	}
	public  int searchEngine(char c){
		int count=0;
		for(int i=0;i<engines.size();i++){
			
			if(engines.get(i).getFuelType()==c)
				count++;
		}
		return count;
	}
	public int enginesWithMileageGreaterThan (double d)throws NoEngineExistException{
		
		int count=0;
		for(int i=0;i<engines.size();i++){
			if(engines.get(i).getMileage()>d)
				count++;
		}
		if(count==0)
			throw new NoEngineExistException();
		else
		return count;
	
	}
}
class NoEngineExistException extends Exception{
//	private static final long serialVersionUID = 1L;

	public String getMessage(){
		
	return "No Engine Exists With Greater Mileage" ;
		
	}
}