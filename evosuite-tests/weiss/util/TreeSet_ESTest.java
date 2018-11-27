/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 14 14:14:23 GMT 2018
 */

package weiss.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import weiss.util.ArrayList;
import weiss.util.Collection;
import weiss.util.Comparator;
import weiss.util.Iterator;
import weiss.util.SortedSet;
import weiss.util.TreeSet;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TreeSet_ESTest extends TreeSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("");
      Integer integer0 = new Integer((-1115));
      boolean boolean0 = treeSet0.contains(integer0);
      assertEquals(1, treeSet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<Object> treeSet0 = new TreeSet<Object>(comparator0);
      treeSet0.add((Object) null);
      treeSet0.first();
      assertEquals(1, treeSet0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparator0).toString();
      TreeSet<String> treeSet0 = new TreeSet<String>(comparator0);
      treeSet0.comparator();
      assertEquals(0, treeSet0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>(comparator0);
      TreeSet<Integer> treeSet1 = new TreeSet<Integer>((Collection<? extends Integer>) treeSet0);
      TreeSet<Integer> treeSet2 = new TreeSet<Integer>((SortedSet<Integer>) treeSet1);
      TreeSet<Object> treeSet3 = new TreeSet<Object>((Collection<?>) treeSet2);
      assertEquals(0, treeSet1.size());
      
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2928, 0).when(comparator1).compare(any() , any());
      TreeSet<String> treeSet4 = new TreeSet<String>(comparator1);
      treeSet4.toString();
      treeSet4.getMatch("Index ");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      TreeSet<Comparable<Integer>> treeSet1 = new TreeSet<Comparable<Integer>>((Collection<? extends Comparable<Integer>>) treeSet0);
      // Undeclared exception!
      try { 
        treeSet1.getMatch((Comparable<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      TreeSet<Object> treeSet0 = new TreeSet<Object>(arrayList0);
      // Undeclared exception!
      try { 
        treeSet0.getMatch(arrayList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      TreeSet<String> treeSet0 = new TreeSet<String>(arrayList0);
      // Undeclared exception!
      try { 
        treeSet0.contains((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("");
      // Undeclared exception!
      try { 
        treeSet0.add((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TreeSet<Object> treeSet0 = new TreeSet<Object>();
      Integer integer0 = new Integer(360);
      treeSet0.add(integer0);
      // Undeclared exception!
      try { 
        treeSet0.add("t(");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TreeSet<Integer> treeSet0 = null;
      try {
        treeSet0 = new TreeSet<Integer>((SortedSet<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weiss.util.TreeSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Collection<String> collection0 = null;
      TreeSet<String> treeSet0 = null;
      try {
        treeSet0 = new TreeSet<String>(collection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weiss.util.TreeSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.remove(0);
      TreeSet<Object> treeSet0 = null;
      try {
        treeSet0 = new TreeSet<Object>(arrayList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weiss.util.ArrayList$ArrayListIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TreeSet<Comparable<String>> treeSet0 = new TreeSet<Comparable<String>>();
      treeSet0.clear();
      assertEquals(0, treeSet0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<String> treeSet0 = new TreeSet<String>(comparator0);
      TreeSet<Comparable<String>> treeSet1 = new TreeSet<Comparable<String>>((Collection<? extends Comparable<String>>) treeSet0);
      int int0 = treeSet1.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<String> treeSet0 = new TreeSet<String>(comparator0);
      Iterator<String> iterator0 = treeSet0.iterator();
      assertFalse(iterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TreeSet<Object> treeSet0 = new TreeSet<Object>((Comparator<? super Object>) null);
      treeSet0.comparator();
      assertEquals(0, treeSet0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TreeSet<Comparable<Object>> treeSet0 = new TreeSet<Comparable<Object>>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      treeSet0.add(comparable0);
      Integer integer0 = new Integer(3172);
      // Undeclared exception!
      try { 
        treeSet0.remove(integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // codegen.java.lang.Comparable$MockitoMock$1705089982 cannot be cast to java.lang.Integer
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TreeSet<Comparable<String>> treeSet0 = new TreeSet<Comparable<String>>();
      boolean boolean0 = treeSet0.remove((Object) null);
      assertFalse(boolean0);
      assertEquals(0, treeSet0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<String> treeSet0 = new TreeSet<String>(comparator0);
      treeSet0.add("");
      TreeSet<Comparable<String>> treeSet1 = new TreeSet<Comparable<String>>((Collection<? extends Comparable<String>>) treeSet0);
      treeSet1.add("[  ]");
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      treeSet1.forEach(consumer0);
      assertEquals(1, treeSet0.size());
      assertEquals(2, treeSet1.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      TreeSet<String> treeSet0 = new TreeSet<String>(comparator0);
      treeSet0.add("");
      boolean boolean0 = treeSet0.add("g4GJC{Xv3)).gs r");
      assertEquals(1, treeSet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator1).compare(any() , any());
      TreeSet<String> treeSet0 = new TreeSet<String>(comparator1);
      treeSet0.add(" ");
      boolean boolean0 = treeSet0.contains(comparator0);
      assertEquals(1, treeSet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(701, 0).when(comparator0).compare(any() , any());
      TreeSet<Object> treeSet0 = new TreeSet<Object>(comparator0);
      boolean boolean0 = treeSet0.contains(treeSet0);
      assertFalse(boolean0);
      assertEquals(0, treeSet0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TreeSet<Comparable<Object>> treeSet0 = new TreeSet<Comparable<Object>>((Comparator<? super Comparable<Object>>) null);
      int int0 = (-1396);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(int0, 0).when(comparable0).compareTo(any());
      Comparable<Object> comparable1 = treeSet0.getMatch(comparable0);
      assertEquals(0, treeSet0.size());
      assertNull(comparable1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      TreeSet<String> treeSet0 = new TreeSet<String>(comparator0);
      treeSet0.add(" ");
      treeSet0.getMatch("kC!J^g");
      assertEquals(1, treeSet0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>(comparator0);
      // Undeclared exception!
      try { 
        treeSet0.last();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weiss.util.TreeSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("weiss.util.Collections$DefaultComparator");
      treeSet0.last();
      assertEquals(1, treeSet0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TreeSet<Integer> treeSet0 = new TreeSet<Integer>();
      // Undeclared exception!
      try { 
        treeSet0.first();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weiss.util.TreeSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<String> treeSet0 = new TreeSet<String>(comparator0);
      treeSet0.add(" ");
      treeSet0.first();
      assertEquals(1, treeSet0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<String> treeSet0 = new TreeSet<String>(comparator0);
      treeSet0.add(" ");
      TreeSet<Comparable<String>> treeSet1 = new TreeSet<Comparable<String>>((Collection<? extends Comparable<String>>) treeSet0);
      int int0 = treeSet1.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("WKPGk-dK<B@");
      boolean boolean0 = treeSet0.add("");
      assertEquals(2, treeSet0.size());
      assertTrue(boolean0);
  }
}