public class Employee implements Payable {
  // TODO fix class declaration and declare variables here
  String employeeId;
  String name;
  double avg;


  public Employee(String employeeId, String name) {
    // TODO fill in code here
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    // TODO fill in code here and replace the return statement
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    // TODO fill in code here
    this.employeeId = employeeId;
  }

  public String getName() {
    // TODO fill in code here and replace the return statement
    return name;
  }

  public void setName(String name) {
    // TODO fill in code here
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    // TODO fill in code here and replace the return statement
    return avg;
  }

  @Override
  public double calculatePay() {
    return avg;
  }

  @Override
  public String toString() {
    // TODO fill in code here and replace the return statement, be sure to format double value
    return this.name + " (" +this.employeeId + ") has salary - " + String.format("%.2f", getAverageMonthlySalary()) ;

  }


}

