package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCLooseCoupling.xml");

        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        UserManager userManagerWithWebService = (UserManager) context.getBean("userManagerWithWebServiceProvider");
        System.out.println(userManagerWithWebService.getUserInfo());

        UserManager userManagerWithNewDatabase = (UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        System.out.println(userManagerWithNewDatabase.getUserInfo());

    }
}
