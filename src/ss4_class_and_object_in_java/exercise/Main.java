package ss4_class_and_object_in_java.exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Fan fan1 =new Fan();
        Fan fan2 =new Fan();

        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan1.setColor("blue");

        System.out.println(fan1);
        System.out.println(fan2);
    }
}
