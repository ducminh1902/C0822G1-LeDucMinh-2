package case_study_furama.model.person;

public class People {
    private String name;
    private String old;
    private String gender;
    private int idNumber;
    private String phoneNumber;


    public People() {
    }

    public People(String name, String old, String gender, int idNumber, String phoneNumber) {
        this.name = name;
        this.old = old;
        this.gender = gender;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", gender='" + gender + '\'' +
                ", idNumber=" + idNumber +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
