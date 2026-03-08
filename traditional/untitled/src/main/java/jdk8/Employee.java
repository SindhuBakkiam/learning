package main.java.jdk8;

public class Employee {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;
    private Integer id;

    public Employee(String nm, Integer ID){
        this.name=nm;
        this.id=ID;
    }

    @Override
    public int hashCode() {
        return this.getId().hashCode() & this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee) {
            Employee employee = (Employee) obj;
            return employee.getId().equals(this.getId()) &&
                    employee.getName().equals(this.getName());
        }
        return super.equals(obj);
    }
}
