class employee {
    private int salary;
    private String name;
    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String Newname){
        this.name=Newname;
    }
}
public class employeedetails {
    public static void main(String[] args) {
        employee em=new employee();
        em.setName("Sourav Saha");
        em.setSalary(32000);
        System.out.println("The employee name is : "+em.getName());
        System.out.println("The employee salary is : "+em.getSalary());
    }
}
