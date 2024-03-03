
public class Employee {
    
    int salary;
    String name;

    public void setname(String str){
        name=str;
    }
    public int setsalary(int n){
        salary=n;
        return salary;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    
}
class Trial extends Employee{
    public static void main(String[] args) {
        Employee em=new Employee();
        em.name="suraj";
        em.salary=300;
        System.out.println(em.getName());
        System.out.println(em.getSalary());

    }
}
