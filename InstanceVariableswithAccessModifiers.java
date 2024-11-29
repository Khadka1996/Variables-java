public class InstanceVariableswithAccessModifiers {
    
        // Instance variables with private access

    private String name;
    private double doublesallery;

    // Constructor

    public InstanceVariableswithAccessModifiers(String name, double doublesallery) {
        this.name = name;
        this.doublesallery = doublesallery;
    }
    
       // Getter for name
 public String getName() {
    return name;
    }

//setter for name
public void setName(String name) {
    this.name = name;
    }


       // Getter for salary
 public double getSallery(){
        return doublesallery;
    }
   
        // Setter for salary
public void setSalary(double salary){
        this.doublesallery = salary;
    }
    public static void main(String[] args) {
        InstanceVariableswithAccessModifiers employee = new InstanceVariableswithAccessModifiers("Manish", 5050);

  // Accessing instance variables using getters
  System.out.println("Employee Name: " + employee.getName());
  System.out.println("Employee Salary: " + employee.getSallery());

  // Modifying instance variables using setters
  employee.setName("Manish Khadka");
  employee.setSalary(60000);

  System.out.println("Updated Employee Name: " + employee.getName());
  System.out.println("Updated Employee Salary: " + employee.getSallery());
    }

}
