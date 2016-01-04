package myspring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMessageApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        MyHello obj1 = (MyHello) context.getBean("myhello");
     //   obj1.setMessage("Hello World!");
          obj1.getMymessage();
          ((AbstractApplicationContext) context).registerShutdownHook();
	}

}
