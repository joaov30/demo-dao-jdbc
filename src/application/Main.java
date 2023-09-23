package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
        Department obj = new Department(1, "Books");

        Department obj2 = new Department(2,"Eletronics");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

        Seller seller2 = new Seller(23, "Guilherme FS","guilhermerj@gmail.com",new Date(), 2000.0, obj2);

        System.out.println(seller);
        System.out.println();
        System.out.println(seller2);
    }
}