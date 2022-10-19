package case_study_furama.model.person;

public class Employee extends People {
    private int idEmployee;
    private String level;
    private double wage;
    private int position;
    private String email;

    public Employee() {
    }

    public Employee(String name, int old, String gender, int idNumber, int phoneNumber, int idEmployee, String level, double wage, int position, String email) {
        super(name, old, gender, idNumber, phoneNumber);
        this.idEmployee = idEmployee;
        this.level = level;
        this.wage = wage;
        this.position = position;
        this.email = email;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", level='" + level + '\'' +
                ", wage=" + wage +
                ", position=" + position +
                ", email='" + email + '\'' +
                '}';
    }
}
