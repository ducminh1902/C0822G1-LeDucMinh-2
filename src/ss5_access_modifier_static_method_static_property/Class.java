package ss5_access_modifier_static_method_static_property;

public class Class {
    private String name = "John";
    private String classes = "C02";

    public Class() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return  name + '\'' +
                 classes + '\'' +
                '}';
    }
}
