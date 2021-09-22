import java.util.Objects;

public class Employee {
    private String email;
    private String firstName;
    private String lastName;
    private Money money;

    public Employee (String firstName, String lastName, String email, Money salary) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.money = salary;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Money getSalary() {
        return money;
    }

    public void setSalary(Money money) {
        this.money = money;
    }


    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Employee) {
            Employee other = (Employee)o;
            return this.email == other.email;
        } else {
            return false;
        }
    }
    

    @Override
    public String toString() {
        return String.format("Employee{%s, %s, %s, %s}", this.email, this.firstName, this.lastName, this.money);
    }

}