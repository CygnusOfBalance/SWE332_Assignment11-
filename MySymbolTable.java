// your implementation of SymbolTable interface
// header comments here
// Noah Hansen
// April 17, 2018
// MySymbolTable

import java.util.HashMap;
public class MySymbolTable<SymbolType, RecordType> implements SymbolTable<SymbolType, RecordType>{

	// you decide the internal design of your class:
	//  - it must implement the provided SymbolTable interface
	//  - it cannot have any other public members (attributes or method) other than
	//    the public constructor and the methods defined in SymbolTable interface

	HashMap<SymbolType, RecordType> symRec = new HashMap(0);
	//------------------------------------------------------------------------------
	//constructor
	//------------------------------------------------------------------------------
	public MySymbolTable(){
	    this.symRec = symRec;
	}


	//------------------------------------------------------------------------------
	//size()
	//count how many individual symbols are present inside of the table
	//@return the count
	//O(1) (average)
	//------------------------------------------------------------------------------
	public int size(){
			return symRec.size();
	}

	//------------------------------------------------------------------------------
	//hasSymbol(SymbolType s)
	//check whether specific symbol is present in symbolArr
	//@return true if the symbol exists, false otherwise
	//O(1)
	//------------------------------------------------------------------------------
    public boolean hasSymbol(SymbolType s){
		return symRec.containsKey(s);
	}


	//------------------------------------------------------------------------------
	//getRecord(SymbolType s)
	//find and return the specific record of SymbolType s
    //@return the symbol if present, null otherwise
	//O(1)
	//------------------------------------------------------------------------------
    public RecordType getRecord(SymbolType s){
		return symRec.get(s);
	}

	//------------------------------------------------------------------------------
	//putRecord(SymbolType s, RecordType r)
	//set the record of symbol s to r
	//if s is not present add it into the table
	//@return void
	//O(1)
	//------------------------------------------------------------------------------
    public void putRecord(SymbolType s, RecordType r){
		symRec.put(s, r);
	}

	//------------------------------------------------------------------------------
    //removeSymbol(SymbolType s)
	//find and remove the entry of symbol s from the table
    //if symbol is not present return null
	//O(1)
	//------------------------------------------------------------------------------
    public RecordType removeSymbol(SymbolType s){
		return symRec.remove(s);
	}



	// make sure you implement all methods in SymbolTable interface




	//------------------------------------
	// example test code... edit this as much as you want!
	public static void main(String[] args){
		MySymbolTable<String,Integer> table = new MySymbolTable<String,Integer>();
		
		if(table.size()==0 && !table.hasSymbol("a")) 	{
			System.out.println("Yay 1");
		}

		table.putRecord("a",new Integer(136));
		table.putRecord("b",new Integer(112));
		
		if(table.size()==2 && table.hasSymbol("a") && table.getRecord("b").equals(new Integer(112))) 	{
			System.out.println("Yay 2");
		}

		table.putRecord("b",new Integer(211));
		Integer v = table.removeSymbol("a");
		if(table.size()==1 && v.equals(new Integer(136)) && !table.hasSymbol("a") 
			&& table.getRecord("b").equals(new Integer(211))) 	{
			System.out.println("Yay 3");
		}
		table.putRecord("d", new Integer(2112));
		if(table.getRecord("d").equals(new Integer(2112))){
			System.out.println("Yay 4");
		}
	}
}


