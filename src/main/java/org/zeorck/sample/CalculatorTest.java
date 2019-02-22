package org.zeorck.sample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testSum() {
		Calculator cal = new Calculator();
		assertEquals(30,cal.sum(20,10));
		System.out.println("test1");
		
	}
	@Test
	public void testSum1() {
		Calculator cal = new Calculator();
		assertEquals(60, cal.sum(50,10));
		System.out.println("test2");
	}
	@BeforeClass //Ŭ���� ���� ��
	public static void beforeTest() {
		System.out.println("BeforeClass");
	}
	@AfterClass //Ŭ���� ���� �� 
	public static void afterTest() {
		System.out.println("AfterClass");
	}
	@Before //�� test�� ȣ�� �Ǳ���
	public void setUp() {
		System.out.println("Before setUp");
	}
	@After //�� test�� ȣ�� �� ����
	public void tearDown() {
		System.out.println("after tearDown");
	}
	

}
