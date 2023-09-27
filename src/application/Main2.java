package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("===== Teste 1: seller findById =====");
        System.out.print("Digite um Id para encontrar o departamento desejado: ");
        Department department = departmentDao.findById(sc.nextInt());
        System.out.println(department);


        System.out.println("\n===== Teste 2: seller findAll =====");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list){
            System.out.println(obj);
        }

    }
}
