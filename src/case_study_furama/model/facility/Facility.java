package case_study_furama.model.facility;

public abstract class Facility {
    private String nameServe;
    private double roomArea;
    private double costRent;
    private int numberPeople;
    private int typeRent;

    public Facility() {
    }

    public Facility(String nameServe, double roomArea, double costRent, int numberPeople, int typeRent) {
        this.nameServe = nameServe;
        this.roomArea = roomArea;
        this.costRent = costRent;
        this.numberPeople = numberPeople;
        this.typeRent = typeRent;
    }

    public String getNameServe() {
        return nameServe;
    }

    public void setNameServe(String nameServe) {
        this.nameServe = nameServe;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    public double getCostRent() {
        return costRent;
    }

    public void setCostRent(double costRent) {
        this.costRent = costRent;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public int getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(int typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Facility " +
                "nameServe='" + nameServe + '\'' +
                ", roomArea=" + roomArea +
                ", costRent=" + costRent +
                ", numberPeople=" + numberPeople +
                ", typeRent=" + typeRent ;

    }
}
