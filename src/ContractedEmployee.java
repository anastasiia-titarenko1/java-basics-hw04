public class ContractedEmployee extends Employee {
  // TODO fix class declaration and declare variables here
  double hourlyRate;
  double numberOfHoursWorked;
  String federalTaxId;

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId, name);
    // TODO fill in code here
     this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    // TODO fill in code here and replace the return statement
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    // TODO fill in code here
    this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    // TODO fill in code here and replace the return statement
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    // TODO fill in code here
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    // TODO fill in code here and replace the return statement
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    // TODO fill in code here
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

  public double getAverageMonthlySalary() {
    // TODO fill in code here and replace the return statement
    return  hourlyRate * numberOfHoursWorked;
  }

}
