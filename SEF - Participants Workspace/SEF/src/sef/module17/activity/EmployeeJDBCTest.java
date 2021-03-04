package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.util.ArrayList;

import junit.framework.TestCase;

public class EmployeeJDBCTest extends TestCase {

	EmployeeJDBC emp;
	
	protected void setUp() throws Exception {
	//setUp() is used to initialize member data which would be used by all/most of its methods
		emp = new EmployeeJDBC();
	}

	public void testCreateConnection() {
		Connection con = emp.createConnection();
		assertNotNull(con);
		
	}
	public void testFindEmployeeById_MatchFound() {
		//complete the code here
		Employee em = emp.findEmployeeById(1);
		assertEquals("atif-1", em.getFirstName());
		assertEquals("Mahmood-1", em.getLastName());
		assertEquals(10, em.getSalary());
	}

	public void testFindEmployeeById_NoMatchFound() {
		//complete the code here
		Employee em = emp.findEmployeeById(4);
		assertEquals("atif-1", em.getFirstName());
		assertEquals("Mahmood-1", em.getLastName());
		assertEquals(10, em.getSalary());
	}

	public void testFindEmployeeByName_MatchFound() {
		//complete the code here
		Employee em = emp.findEmployeeById(1);
		assertEquals("atif-1", em.getFirstName());
		assertEquals("Mahmood-1", em.getLastName());
		assertEquals(10, em.getSalary());
	}
	
	public void testFindEmployeeByName_NoMatchFound() {
		//complete the code here
		Employee em = emp.findEmployeeById(1);
		assertEquals("atif-2", em.getFirstName());
		assertEquals("Mahmood-1", em.getLastName());
		assertEquals(10, em.getSalary());
	}

	public void testFindEmployeeBySalary_MatchFound() {
		//complete the code here
		Employee em = emp.findEmployeeById(1);
		assertEquals("atif-1", em.getFirstName());
		assertEquals("Mahmood-1", em.getLastName());
		assertEquals(10, em.getSalary());
	}

	public void testFindEmployeeBySalary_NoMatchFound() {
		//complete the code here
		Employee em = emp.findEmployeeById(1);
		assertEquals("atif-1", em.getFirstName());
		assertEquals("Mahmood-1", em.getLastName());
		assertEquals(1000, em.getSalary());
	}
	
	public void testInsertEmployee(){
		//complete the code here
		emp.insertEmployee();
		Employee em = emp.findEmployeeById(5);
		assertEquals("atif-5", em.getFirstName());
		assertEquals("Mahmood-5", em.getLastName());
		assertEquals(10000, em.getSalary());

	}
}
