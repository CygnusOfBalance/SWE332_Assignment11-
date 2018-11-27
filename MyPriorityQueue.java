// your implementation of PriorityQueue interface
// header comments here
//Noah Hansen
//April 19, 2018
//CS310

// One additional requirement is the value type T must be Comparable.
// When two items are compared to determine the order in priority queue, follow the rules below:
//  1. use the priority of them to determine the order 
//  2. if they are of the same priority, use their values (of type T) to determine the order
//  3. if they are of the same priority and same value, any order is fine

import weiss.util.TreeSet;
import weiss.util.TreeMap;
import weiss.util.Map;
import weiss.util.ArrayList;
import weiss.util.Collections;
public class MyPriorityQueue<T extends Comparable<T>> implements PriorityQueue<T>
{
	
	// you decide the internal design of your class:
	//  - it must implement the provided PriorityQueue interface
	//  - it cannot have any other public members (attributes or method) other than
	//    the public constructor and the methods defined in PriorityQueue interface


	static final int INF = Integer.MAX_VALUE; // the max priority to use: infinity
    
	
	/**
     * Construct an empty PriorityQueue.
     */
	private TreeMap<Integer, TreeSet<T>> tMap = new TreeMap(Collections.reverseOrder());
	private ArrayList<Map.Entry<Integer, TreeSet<T>>> pQueue = new ArrayList(tMap.entrySet());
	private int size = 0;
    public MyPriorityQueue()
    {
		this.pQueue = pQueue;
    }

	// count how many items present in priority queue
	// return the integer count
	//
	// O(1)
	public int size(){
    	return size;
	}

	// return the top item (of the max priority) in the priority queue
	// return null if empty
	//
	// O(1)
	public T peek(){
		return pQueue.get(0).getValue().first();
	}


	// remove the top item (of the max priority) from the priority queue
	// return that item to be deleted
	// return null if empty
	//
	// O(logN): N is the number of items in priority queue
	public T remove(){
    	if(pQueue.size() < 1){
    		return null;
		}
		if(pQueue.get(0).getValue().size() == 1){
    		Map.Entry<Integer, TreeSet<T>> item = pQueue.remove(0);
    		tMap.remove(item.getKey());
			pQueue = new ArrayList(tMap.entrySet());
			size--;
    		return item.getValue().first();
		}
		Map.Entry<Integer, TreeSet<T>> item = pQueue.get(0);
    	tMap.get(item.getKey()).remove(0);
		pQueue = new ArrayList(tMap.entrySet());
		size++;
    	return item.getValue().first();
	}

	// add an item v with priority p into the priority queue
	// no checking whether a duplicate value is already in queue
	// return: nothing
	//
	// O(logN): N is the number of items in priority queue
	public void insert(T v, int p){
    	if(tMap.containsKey(p)){
    		tMap.get(p).add(v);
    		pQueue = new ArrayList(tMap.entrySet());
    		size++;
		}
		else {
    		TreeSet<T> newer = new TreeSet(Collections.reverseOrder());
    		newer.add(v);
			tMap.put(p, newer);
			pQueue = new ArrayList(tMap.entrySet());
			size++;
		}
	}

	// perform a priority update for items in the priority queue based on the following rules
	//  - If the item is the same as v: set the priority as p
	//  - If the item is different from v, compare their priorities
	//      - For any item x with a priority <= v's priority, decrement x's priority by 1
	//      - Otherwise, do not change x's priority
	//
	// Hint: perform necessary adjustment to ensure a valid priority queue after updating
	//
	// O(N): N is the number of items in priority queue
	public void updatePriority(T v, int p){
        ArrayList<T> updatedValues = new ArrayList();
        int x = pQueue.size();
        boolean hasUpdated = false;
    	for(int i = 0; i < x; i++){
    		for(int z = 0; z < pQueue.get(i).getValue().size(); z++){
    			int pz = pQueue.get(i).getKey();
    			if(pQueue.get(i).getValue().contains(v) && hasUpdated == false){
    				tMap.get(pQueue.get(i).getKey()).remove(v);
    				this.insert(v, p);
    				size--;
    				hasUpdated = true;
				}
				else if(pQueue.get(i).getKey() <= p){
    				T contained = null;
    				Map.Entry<Integer, TreeSet<T>> updated = pQueue.remove(i);
    				if(updated.getValue().contains(v)){
    					contained = v;
    					updated.getValue().remove(v);
    					tMap.get(updated.getKey()).remove(v);
					}
    				while(!updated.getValue().isEmpty() && !updated.getValue().first().equals(v)){
    					if(!updatedValues.contains(updated.getValue().first())) {
    						T removed = updated.getValue().first();
    						updated.getValue().remove(removed);
    						tMap.get(updated.getKey()).remove(removed);
    						this.insert(removed, updated.getKey() - 1);
    						size--;
    						updatedValues.add(removed);
						}
						else{
							T stuff = updated.getValue().first();
							updated.getValue().remove(updated.getValue().first());
    						contained = stuff;
    						updated.getValue().remove(stuff);
    						tMap.get(updated.getKey()).remove(stuff);
						}
    				}
    				if(contained != null){
						this.insert(contained, pz);
						size--;
					}
				}
				if(pQueue.get(i).getValue().size() < 1){
    				tMap.remove(pQueue.get(i).getKey());
    				pQueue.remove(i);
				}
			}
			x = pQueue.size();
		}
	}

	// check whether there is a value v associated with priority p in the priority queue
	// return true if present
	// return false otherwise
	//
	// O(N): N is the number of items in priority queue
	public boolean contains(T v, int p) {
        for(int i = 0; i < pQueue.size(); i++){
        	if(pQueue.get(i).getKey() == p){
        		if(pQueue.get(i).getValue().contains(v)){
        			return true;
				}
			}
		}
		return false;
	}
    
	// make sure you implement all methods in Sequence interface

	//------------------------------------
	// example test code... edit this as much as you want!
	// note: you might want to add a method like printPQ() for debugging purpose
	
	public static void main(String[] args){
		MyPriorityQueue<String> pq = new MyPriorityQueue<String>();
		
		if(pq.size()==0 && pq.remove()==null && !pq.contains("a", 4)) 	{
			System.out.println("Yay 1");
		}
		
		pq.insert("a",4);
		pq.insert("b",10);
		pq.insert("h",2);



		if(pq.size()==3 && (pq.peek()).equals("b") && pq.contains("a", 4) && pq.contains("h", 2)
			&& pq.contains("b",10)) {
			System.out.println("Yay 2");
		}

		if((pq.remove()).equals("b") && !pq.contains("b",10) & pq.size()==2 
			&& (pq.peek().equals("a")) ) {
			System.out.println("Yay 3");
		}

		pq.insert("d",4);
		if ((pq.peek()).equals("d")) {System.out.println("Yay 4");}
				
		pq.insert("b",10);
		pq.insert("f",3);
		pq.updatePriority("a",3);


		System.out.println(pq.size());
		if (pq.size() == 5 && pq.contains("a",3) && pq.contains("b",10) && pq.contains("d",4)
			&& pq.contains("f",2) && pq.contains("h",1)) {
			System.out.println("Yay 5");
		}


	}


}




