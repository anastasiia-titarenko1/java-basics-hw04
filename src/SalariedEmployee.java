public class SalariedEmployee extends Employee {
  // TODO fix class declaration and declare variables here
  double fixedMonthlyPayment;
  String socialSecurityNumber;

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    // TODO fill in code here
    super(employeeId, name);
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    // TODO fill in code here and replace the return statement
    return this.socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    // TODO fill in code here
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    // TODO fill in code here and replace the return statement
    return this.fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    // TODO fill in code here
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  public double getAverageMonthlySalary() {
    // TODO fill in code here and replace the return statement
    return fixedMonthlyPayment;
  }


}
