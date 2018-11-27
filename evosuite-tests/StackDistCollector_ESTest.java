/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 14 14:04:57 GMT 2018
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StackDistCollector_ESTest extends StackDistCollector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StackDistCollector stackDistCollector0 = new StackDistCollector();
      stackDistCollector0.access(1);
      int int0 = stackDistCollector0.getTime();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StackDistCollector stackDistCollector0 = new StackDistCollector();
      // Undeclared exception!
      try { 
        stackDistCollector0.processSequence((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StackDistCollector stackDistCollector0 = new StackDistCollector();
      try { 
        stackDistCollector0.processSequence("", "");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         //  (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[4];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("inputs");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "sAD+ ^B20*pQDI~i&<");
      try { 
        StackDistCollector.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StackDistCollector stackDistCollector0 = new StackDistCollector();
      stackDistCollector0.pastAccesses = null;
      // Undeclared exception!
      try { 
        stackDistCollector0.access(1149);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("StackDistCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StackDistCollector stackDistCollector0 = new StackDistCollector();
      stackDistCollector0.processSequence("inputs/input1_reverse.txt", "inputs/input1_reverse.txt");
      assertEquals(10, stackDistCollector0.getTime());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StackDistCollector stackDistCollector0 = new StackDistCollector();
      stackDistCollector0.access(43);
      stackDistCollector0.access(787);
      stackDistCollector0.access(43);
      assertEquals(3, stackDistCollector0.getTime());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StackDistCollector stackDistCollector0 = new StackDistCollector();
      MySequence<Integer> mySequence0 = new MySequence<Integer>();
      stackDistCollector0.pastAccesses = mySequence0;
      stackDistCollector0.access(435);
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      mySequence0.sequence = treeSet0;
      stackDistCollector0.access(2147483645);
      stackDistCollector0.access(435);
      assertEquals(3, stackDistCollector0.getTime());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StackDistCollector stackDistCollector0 = new StackDistCollector();
      int int0 = stackDistCollector0.getTime();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[0];
      StackDistCollector.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }
}