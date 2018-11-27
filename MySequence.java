// your implementation of Sequence interface
// header comments here
//Noah Hansen
//April 17, 2018
//MySequence

import java.util.TreeSet;
public class MySequence<T extends Comparable<T>> implements Sequence<T>{

	// you decide the internal design of your class:
	//  - it must implement the provided Sequence interface
	//  - it cannot have any other public members (attributes or method) other than
	//    the public constructor and the methods defined in Sequence interface

	TreeSet<T> sequence = new TreeSet();

	public MySequence(){
		this.sequence = sequence;
	}
	//------------------------------------------------------------------------------
	// add a new value v into the collection
	// return true if added successfully
	// return false if value is already present (no duplicate added)
	//
	// O(logN) given N as the number of values stored in sequence
	//------------------------------------------------------------------------------
	public boolean insert (T v){
		return sequence.add(v);
	}
	//------------------------------------------------------------------------------
	// delete value v from the collection
	// return true if removed successfully
	// return false if value is not present
	//
	// O(logN) given N as the number of values stored in sequence
	//------------------------------------------------------------------------------
	public boolean remove (T v){
		return sequence.remove(v);
	}

	//------------------------------------------------------------------------------
	// find whether value v is present in collection
	// return true if value is present
	// return false otherwise
	//
	// O(logN) given N as the number of values stored in sequence
	//------------------------------------------------------------------------------
	public boolean contains (T v){
		return sequence.contains(v);
	}

	//------------------------------------------------------------------------------
	// count how many values in collection are greater than or equal to v
	// return the integer count
	//
	//  Note: T must implement .compareTo(T another) to define how to determine
	//        which one is greater than the other one between any two values of type T
	//
	// O(logN) given N as the number of values stored in sequence
	//------------------------------------------------------------------------------
	public int countNoSmallerThan (T v){
		TreeSet<T> count = (TreeSet<T>)(sequence.tailSet(v));
		System.out.println("ok");
		return count.size();
	}
	//------------------------------------------------------------------------------
	// count how many values present in collection
	// return the integer count
	//
	// O(1)
	//------------------------------------------------------------------------------
	public int size(){
		return sequence.size();
	}
	//------------------------------------------------------------------------------
	// return a string representation of all values in collection, in ascending order
	// - exactly one space should be appended after every value (including the last value)
	//
	// O(N) given N as the number of values stored in sequence
	//------------------------------------------------------------------------------
	public String toStringAscendingOrder(){
		String returned = "";
		TreeSet<T> clone = (TreeSet<T>)(sequence.clone());
		while(!clone.isEmpty()){
			returned += clone.first() + " ";
			clone.remove(clone.first());
		}
		return returned;
	}
	
	// make sure you implement all methods in Sequence interface


	//------------------------------------
	// example test code... edit this as much as you want!
	public static void main(String[] args){
		MySequence<Integer> seq = new MySequence<Integer>();
		
		if(seq.size()==0 && !seq.contains(11) && seq.countNoSmallerThan(10) == 0 
			&& seq.toStringAscendingOrder().equals("")) 	{
			System.out.println("Yay 1");
		}
		
		seq.insert(11);
		seq.insert(5);
		
		if(seq.insert(200) && seq.size()==3 && seq.contains(11) 
			&& seq.countNoSmallerThan(10) == 2 && !seq.remove(20)) 	{
			System.out.println("Yay 2");
		}
		
		seq.insert(112);
		seq.insert(50);
		seq.insert(20);
		
		if(seq.remove(20) && !seq.contains(20) && !seq.insert(200)
			&& seq.countNoSmallerThan(50) == 3 
			&& seq.toStringAscendingOrder().equals("5 11 50 112 200 ")) 	{
			System.out.println("Yay 3");
		}

	}
}


