package case_study_furama.model.person;

public class Customer extends People {
    private int idCustomer;
    private int typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String name, int old, String gender, int idNumber, int phoneNumber, int idCustomer, int typeCustomer, String address) {
        super(name, old, gender, idNumber, phoneNumber);
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(int typeCustomer) {
        this.typeCustomer = typeCustomer;
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
                "idCustomer=" + idCustomer +
                ", typeCustomer=" + typeCustomer +
                ", address='" + address + '\'' +
                '}';
    }
}
