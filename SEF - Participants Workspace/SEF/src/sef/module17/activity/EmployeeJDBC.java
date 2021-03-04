package sef.module17.activity;
//Needs to be completed
import junit.framework.Assert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeJDBC {
	Employee emp = new Employee();

	public static void main(String arg[]) {
		Connection con = createConnection();
		Employee e1 = new Employee();
		e1= findEmployeeById(2);
		Assert.assertEquals("atif-2", e1.getFirstName());

		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps = findEmployeesByName("atif-2");
		Assert.assertEquals(2, emps.get(0).getId());
		Assert.assertEquals(4, emps.get(1).getId());

		ArrayList<Employee> empsal = new ArrayList<Employee>();
		empsal = findEmployeesBySalary(10);
		Assert.assertEquals(1, empsal.get(0).getId());
		Assert.assertEquals(4, empsal.get(1).getId());

		insertEmployee();

	}

	public static Connection createConnection()
	{
		Connection con=null;
		String url = "jdbc:mysql://localhost/activity";
		String user = "root";
		String pass = "Dobrota=1";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public static Employee findEmployeeById(int id)
	{
		Connection con = createConnection();

		try {
		// 1 - Create a PreparedStatement with a query
			PreparedStatement pStmt = con.prepareStatement("select * from employee where id = ?");
		// 2 - Search for the given id
			pStmt.setInt(1,id);
		// 3 - Execute this query
		ResultSet rs = pStmt.executeQuery();
		// 4 - If resultset is not null, then initialize emp object with data
			if (rs.next()){
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setSalary(rs.getInt(4));
				return emp;
			}

		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static ArrayList<Employee> findEmployeesByName(String name)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();

		try {
		// 1 - Create a PreparedStatement with a query
			PreparedStatement pStmt = con.prepareStatement("select * from employee where firstName = ?");
		// 2 - Search for the given id
			pStmt.setString(1, name);
		// 3 - Execute this query
			ResultSet rs = pStmt.executeQuery();
		// 4 - While there are some records, continue
			while (rs.next()){
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setSalary(rs.getInt(4));
				list.add(emp);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public static ArrayList<Employee> findEmployeesBySalary(int salary)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();

		try {
		// 1 - Create a PreparedStatement with a query
			PreparedStatement pStmt = con.prepareStatement("select * from employee where salary = ?");
		// 2 - Search for the given salary
			pStmt.setInt(1, salary);
		// 3 - Execute this query
			ResultSet rs = pStmt.executeQuery();
		// 4 - While there are records, continue
			while (rs.next()){
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setSalary(rs.getInt(4));
				list.add(emp);
			}
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public static void insertEmployee()
	{
		Connection con = createConnection();
		Employee e4 = new Employee(5, "atif-5", "Mahmood-5", 10000);
		try {
			con.setAutoCommit(false);

			//1 - Create a PreparedStatement with a query "insert into employee values(?,?,?,?)"
			PreparedStatement statement = con.prepareStatement("INSERT INTO employee (ID, firstName, lastName, Salary) VALUES (?,?,?,?)");
			//	Substitute the ? now.
			statement.setInt(1, e4.getId());
			statement.setString(2, e4.getFirstName());
			statement.setString(3, e4.getLastName());
			statement.setInt(4, e4.getSalary());
			//2 - Execute this query using executeUpdate()
			int result = statement.executeUpdate();
			if (result == 1) {
				System.out.println("You updated your database successfully");
			} else {
				System.out.println("Unfortunately, operation failed!");
			}
			con.commit();
			con.close();
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
