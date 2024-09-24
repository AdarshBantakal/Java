

class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void raiseSalary(double percent){
        if(percent>0){
            double increment=salary*percent/100;
            salary=salary+increment;
            System.err.println("New Salary: "+salary);
        }
        else{
            System.out.println("Salary: "+salary);}}
    public void getEmpDetails(){
        System.out.println(name + " " + id + " "+ salary);
    }

}

public class Lab3_Employee {
    public static void main(String[] args){
        Employee emp1=new Employee(101,"Adarsh",5000);
        emp1.getEmpDetails();

        emp1.raiseSalary(10);
        emp1.getEmpDetails();

    }
}