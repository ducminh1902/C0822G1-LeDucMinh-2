package case_study_furama.model.facility;

public class Village extends Facility {
    private String roomStandard;
    private int swimmingPool;
    private int floor;

    public Village() {
    }

    public Village(String nameServe, int roomArea, int costRent, int numberPeople, int typeRent) {
        super(nameServe, roomArea, costRent, numberPeople, typeRent);
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(int swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Village{" +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingPool=" + swimmingPool +
                ", floor=" + floor ;

    }
}
