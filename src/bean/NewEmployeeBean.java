package bean;

public class NewEmployeeBean {
	private String name;
	private int employeeNumber;
	/*
	 * nameへのgetter
	 * */
	public String getName() {
		return name;
	}
	/*
	 * nameへのsetter
	 * */
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * employeeNumberへのgetter
	 * */
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	/*
	 * employeeNumberへのsetter
	 * */
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
}
