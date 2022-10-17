package ss10_danh_sach_bai_1;

public class TestMyArrayList {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1 ,"mèo");
        Student b = new Student(2 ,"méo");
        Student c = new Student(3 ,"meo");
        Student d = new Student(4 ,"mèo");
        Student e = new Student(5 ,"meo");
        Student f = new Student(5 ,"doraemon");


        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();

        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
     studentMyArrayList.add(3,f);
        studentMyArrayList.size();
//        System.out.println(studentMyArrayList.size());
//        System.out.println(studentMyArrayList.get(2).getName());
//        System.out.println(studentMyArrayList.contains(f));
        newMyArrayList = studentMyArrayList.clone();
        newMyArrayList.remove(3);
        for (int i = 0; i <newMyArrayList.size() ; i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }
//        for (int i = 0; i < studentMyArrayList.size() ; i++) {
//            Student student = (Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//            System.out.println();
//        }
    }
}
