package case_study_furama.model.person;

public class Employee extends People {
    private int idEmployee;
    private String level;
    private String wage;
    private String position;
    private String email;

    public Employee() {
    }

    public Employee(String name, String old, String gender, int idNumber, String phoneNumber, int idEmployee, String level, String wage, String position, String email) {

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

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
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
