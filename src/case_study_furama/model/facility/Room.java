package case_study_furama.model.facility;

public class Room extends Facility {
    private String freeServe;

    public Room() {
    }

    public Room(String freeServe) {
        this.freeServe = freeServe;
    }

    public Room(String nameServe, int roomArea, int costRent, int numberPeople, int typeRent, String freeServe) {
        super(nameServe, roomArea, costRent, numberPeople, typeRent);
    }

    public String getFreeServe() {
        return freeServe;
    }

    public void setFreeServe(String freeServe) {
        this.freeServe = freeServe;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServe='" + freeServe + '\'' +
                '}';
    }
}
