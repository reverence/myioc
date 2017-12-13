package com.my.ioc;

/**
 * Created by tufei on 2017/12/10.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)context.getBean("user");
        System.out.println(user.toString());

        IocServlet servlet = new IocServlet();
        servlet.init(null);
        user = (User)BeanUtils.getBean("user");
        System.out.println(user.toString());
        servlet.destroy();
    }
}
