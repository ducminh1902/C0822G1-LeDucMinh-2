package case_study_furama.service;

import case_study_furama.model.person.Employee;
import ss17_binary_file_serialization.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl extends Employee {
    static List<Employee> employeeList  = new ArrayList<>();
    static {
        Employee employee1 = new Employee("doreamon","12","male",12,"0901231214123",1,"student","1.000.000","manager","doreamon@123");
        Employee employee2 = new Employee("nobita","10","male",11,"09012421214123",2,"student","2.000.000","secretary","nobita@123");

        employeeList.add(employee1);
        employeeList.add(employee2);
    }

    public void display(){
        for (Employee employee : employeeList) {
            System.out.println(employeeList);
        }

    }

    public void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("hãy nhập tuổi nhân viên");
        String old = scanner.nextLine();
        System.out.println("hãy nhập giới tính của nhân viên ");
        String gender = scanner.nextLine();
        System.out.println("hãy nhập số CMND của nhân viên");
        int idNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("hãy nhập số điện thoại của nhân viên");
        String phoneNumber = scanner.nextLine();
        System.out.println("hãy nhập id của nhân viên");
        int idEmployee = Integer.parseInt(scanner.nextLine());
        System.out.println("hãy nhập trình độ của nhân viên");
        String level = scanner.nextLine();
        System.out.println("hãy nhập lương");
        String wage = scanner.nextLine();
        System.out.println("hãy nhập chức vụ của nhân viên ");
        String position  = scanner.nextLine();
        System.out.println("hãy nhập email");
        String email = scanner.nextLine();

        Employee employee = new Employee(name,old,gender,idNumber,phoneNumber,idEmployee,level,wage,position,email);
        employeeList.add(employee);
        display();
    }

    public void edit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập id của nhân viên bạn cần sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        int index =0;
        boolean check = false;

        for (int i = 0; i <employeeList.size() ; i++) {
            if (idEdit == employeeList.get(i).getIdEmployee()){
                check = true;
                index = i;
            }
        }
        if (!check){
            System.out.println("id không hợp lệ");
        }else {
            System.out.println("hãy nhập tên nhân viên");
            String name = scanner.nextLine();
            System.out.println("hãy nhập tuổi nhân viên");
            String old = scanner.nextLine();
            System.out.println("hãy nhập giới tính của nhân viên ");
            String gender = scanner.nextLine();
            System.out.println("hãy nhập số CMND của nhân viên");
            int idNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("hãy nhập số điện thoại của nhân viên");
            String phoneNumber = scanner.nextLine();
            System.out.println("hãy nhập id của nhân viên");
            int idEmployee = Integer.parseInt(scanner.nextLine());
            System.out.println("hãy nhập trình độ của nhân viên");
            String level = scanner.nextLine();
            System.out.println("hãy nhập lương");
            String wage = scanner.nextLine();
            System.out.println("hãy nhập chức vụ của nhân viên ");
            String position  = scanner.nextLine();
            System.out.println("hãy nhập email");
            String email = scanner.nextLine();

            Employee employee = new Employee(name,old,gender,idNumber,phoneNumber,idEmployee,level,wage,position,email);
            employeeList.set(index,employee);
            display();
        }
    }

}
