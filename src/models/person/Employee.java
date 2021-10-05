package models.person;

public class Employee extends Person {
    private String standard;
    private String position;
    public double salary;

    public Employee() {
    }

    public Employee(String standard, String position, double salary) {
        this.standard = standard;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String id, String name, String dayOfBirth, String gender, String identityCard,
                    String phoneNumber, String email, String standard, String position, double salary) {
        super(id, name, dayOfBirth, gender, identityCard, phoneNumber, email);
        this.standard = standard;
        this.position = position;
        this.salary = salary;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id= " + getId() +
                ", name= " + getName() +
                ", dayOfBirth= " + getDayOfBirth() +
                ", gender= " + getGender() +
                ", identityCard= " + getIdentityCard() +
                ", phoneNumber= " + getPhoneNumber() +
                ", email= " + getEmail() +
                "standard= " + standard + '\'' +
                ", position= " + position + '\'' +
                ", salary= " + salary +
                '}';
    }

    public String getInfoEmployee() {
        return super.getId() + "," + super.getName() + "," + super.getDayOfBirth() + "," + super.getGender() + ","
                + super.getIdentityCard() + "," + super.getPhoneNumber() + "," + super.getEmail() + "," + standard +
                "," + position + "," + salary;
    }
}
