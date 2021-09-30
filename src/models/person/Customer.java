package models.person;

public class Customer extends Person{
    private String kindsOfCustomer;
    private String address;
    public Customer(){

    }

    public Customer(String kindsOfCustomer, String address) {
        this.kindsOfCustomer = kindsOfCustomer;
        this.address = address;
    }

    public Customer(int id, String name, String dayOfBirth, String sex, int identityCard, int phoneNumber, String email, String kindsOfCustomer, String address) {
        super(id, name, dayOfBirth, sex, identityCard, phoneNumber, email);
        this.kindsOfCustomer = kindsOfCustomer;
        this.address = address;
    }

    public String getKindsOfCustomer() {
        return kindsOfCustomer;
    }

    public void setKindsOfCustomer(String kindsOfCustomer) {
        this.kindsOfCustomer = kindsOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + getId() +
                ", name='" + getName() +
                ", dayOfBirth='" + getDayOfBirth() +
                ", gender='" + getGender() +
                ", identityCard=" + getIdentityCard() +
                ", phoneNumber=" + getPhoneNumber() +
                ", email='" + getEmail() +
                "kindsOfCustomer='" + kindsOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
