/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 14 13:59:59 GMT 2018
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MyPriorityQueue_ESTest extends MyPriorityQueue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MyPriorityQueue<Integer> myPriorityQueue0 = new MyPriorityQueue<Integer>();
      Integer integer0 = Integer.valueOf((-2182));
      myPriorityQueue0.insert(integer0, (-1));
      int int0 = myPriorityQueue0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MyPriorityQueue<Integer> myPriorityQueue0 = new MyPriorityQueue<Integer>();
      myPriorityQueue0.insert((Integer) null, 846);
      myPriorityQueue0.peek();
      assertEquals(1, myPriorityQueue0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MyPriorityQueue<Integer> myPriorityQueue0 = new MyPriorityQueue<Integer>();
      Integer integer0 = Integer.valueOf((-2182));
      myPriorityQueue0.insert(integer0, 31);
      myPriorityQueue0.peek();
      assertEquals(1, myPriorityQueue0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MyPriorityQueue<String> myPriorityQueue0 = new MyPriorityQueue<String>();
      myPriorityQueue0.insert((String) null, 973);
      // Undeclared exception!
      try { 
        myPriorityQueue0.updatePriority("tf P#b#'>@Q*#*:o", 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MyPriorityQueue<String> myPriorityQueue0 = new MyPriorityQueue<String>();
      myPriorityQueue0.insert("]", 162);
      myPriorityQueue0.insert("qK%f~\"M&sJ<TNj}}?", 162);
      // Undeclared exception!
      try { 
        myPriorityQueue0.remove();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MyPriorityQueue<String> myPriorityQueue0 = new MyPriorityQueue<String>();
      myPriorityQueue0.insert("", 2092);
      // Undeclared exception!
      try { 
        myPriorityQueue0.insert((String) null, 2092);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MyPriorityQueue<String> myPriorityQueue0 = new MyPriorityQueue<String>();
      myPriorityQueue0.insert("", 0);
      // Undeclared exception!
      try { 
        myPriorityQueue0.contains((String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MyPriorityQueue<Integer> myPriorityQueue0 = new MyPriorityQueue<Integer>();
      Integer integer0 = Integer.valueOf((-2182));
      myPriorityQueue0.insert(integer0, (-1));
      boolean boolean0 = myPriorityQueue0.contains(integer0, (-1));
      assertEquals(1, myPriorityQueue0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MyPriorityQueue<Integer> myPriorityQueue0 = new MyPriorityQueue<Integer>();
      Integer integer0 = Integer.valueOf((-2182));
      myPriorityQueue0.insert(integer0, 31);
      boolean boolean0 = myPriorityQueue0.contains(integer0, (-1));
      assertEquals(1, myPriorityQueue0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MyPriorityQueue<String> myPriorityQueue0 = new MyPriorityQueue<String>();
      myPriorityQueue0.insert("L4oENWCbM7/", 10);
      myPriorityQueue0.insert(":s.1v", 10);
      myPriorityQueue0.updatePriority("R4:JdAA%O;7", 10);
      assertEquals(2, myPriorityQueue0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MyPriorityQueue<Integer> myPriorityQueue0 = new MyPriorityQueue<Integer>();
      Integer integer0 = Integer.valueOf((-2182));
      myPriorityQueue0.insert(integer0, 31);
      Integer integer1 = new Integer((-1));
      myPriorityQueue0.updatePriority(integer1, (-1));
      assertEquals(1, myPriorityQueue0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MyPriorityQueue<String> myPriorityQueue0 = new MyPriorityQueue<String>();
      myPriorityQueue0.insert("", 2);
      myPriorityQueue0.insert("", (-465));
      myPriorityQueue0.updatePriority("", 2);
      assertEquals(2, myPriorityQueue0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MyPriorityQueue<String> myPriorityQueue0 = new MyPriorityQueue<String>();
      myPriorityQueue0.insert("", 2);
      myPriorityQueue0.remove();
      assertEquals(0, myPriorityQueue0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MyPriorityQueue<String> myPriorityQueue0 = new MyPriorityQueue<String>();
      myPriorityQueue0.remove();
      assertEquals(0, myPriorityQueue0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MyPriorityQueue<String> myPriorityQueue0 = new MyPriorityQueue<String>();
      // Undeclared exception!
      try { 
        myPriorityQueue0.peek();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0; size 0
         //
         verifyException("weiss.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MyPriorityQueue<Integer> myPriorityQueue0 = new MyPriorityQueue<Integer>();
      int int0 = myPriorityQueue0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MyPriorityQueue<String> myPriorityQueue0 = new MyPriorityQueue<String>();
      myPriorityQueue0.insert("XII5Wm!;h&ZDdY%<kh,", 0);
      boolean boolean0 = myPriorityQueue0.contains("'Y>0L[ZU", 0);
      assertEquals(1, myPriorityQueue0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MyPriorityQueue<Integer> myPriorityQueue0 = new MyPriorityQueue<Integer>();
      Integer integer0 = Integer.valueOf((-2182));
      myPriorityQueue0.insert(integer0, (-1));
      Integer integer1 = new Integer((-1));
      myPriorityQueue0.insert(integer1, (-1));
      myPriorityQueue0.remove();
      assertEquals(3, myPriorityQueue0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MyPriorityQueue.main((String[]) null);
  }
}
