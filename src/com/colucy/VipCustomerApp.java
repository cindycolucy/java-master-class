package com.colucy;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class VipCustomerApp {

    public static void main(String[] args) {

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", "bob@email.com");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 5000, "tim@email.com");
        System.out.println(person3.getName());
    }
}
