File list:

Three files for input1-4:

- inputN.txt: a sequence of accesses represented as a sequence of integer numbers separated by space (input of round 2)
- inputN_reverse.txt: the same sequence of inputN.txt but reverse order (input of round 1)
- inputN_distance.txt: a sequence of stack distance corresponding to inputN.txt (output of round 1 and input of round 2)

input 5/6 include only inputN_reverse.txt and inputN_distance.txt for performance comparison of StackDisCollector only.

=========================================================

To test:

- For round 1 (StackDistCollector)
	- Edit the main method and follow the example below to call processSequence() method:
	  
	  collector.processSequence("inputs/input1_reverse.txt","inputs/input1_my_distance.txt");
	
	- "inputs/input1_reverse.txt" is the input file and "inputs/input1_my_distance.txt" will be created as an output file
	- "inputs/input1_distance.txt" is the expected output.  You can compare it against your own output "inputs/input1_my_distance.txt" to see whether all distances match
	
	
- For round 2 (OPTCacheSimulator)

	- Edit the main method and follow the example below to call processSequence() method:
	
		simulator.processSequence("inputs/input1.txt", "inputs/input1_distance.txt");
	
		- both "inputs/input1.txt" and "inputs/input1_distance.txt" are input files

	- Check whether the correct number of hits and misses are reported by calling simulator.getNumHits() / simulator.getNumMisses().  The expected numHits/numMisses are included for each sequence above.


==========================================================

Explanation of each sequence:

Name	| cacheSize	|	numHits		|	numMisses	|	Notes
------------------------------------------------------------------------------------------
input1	|	3		|		5		|		5		|	original test case 
------------------------------------------------------------------------------------------
input2	|	1		|		20		|		1		|	all references to the same address		
------------------------------------------------------------------------------------------
input3	|   100		|		0		|		20		|	no reuse, all distinct addresses
------------------------------------------------------------------------------------------
input4	|	15		|		178		|		12		|	all misses are first-time accesses
		|	10		|		176		|		14		|	
		|	8		|		169		|		21		|
------------------------------------------------------------------------------------------
input5	|	-		|		-		|		-		| 515,438 accesses 
------------------------------------------------------------------------------------------
input6	|	-		|		-		|		-		| 2,061,752 accesses


--------------------------------------------------------------

Performance comparison example of input5 / input6

Version		|	CPU time of input5	|	CPU time of input6
------------------------------------------------------------
version 1	|		1.618s			|	4.014s
------------------------------------------------------------
version 2	|		1.889s			|	56.058s

* shortest user time out of five runs used for comparison
** version 1 is our O(logN) implementation
*** version 2 is our O(N) implementation
**** the actual execution times you observe are likely different from the example above, but it would be interesting to check which trend your program is following.

