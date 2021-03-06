package ru.javabegin.training.spring.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.aop.objects.FileManager;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		FileManager fileManager = (FileManager) context.getBean("fileManager");
		
		// если у вас другая операционная система, измените путь к папке (в которую есть доступ у вашей учетной записи)
		fileManager.getExtensionCount("c:\\Windows\\System32");
		fileManager.getExtensionCount("c:\\Windows\\");
		fileManager.getExtensionCount("c:\\Windows\\system32\\drivers");
		fileManager.getExtensionList("c:\\Windows\\system32\\drivers");
		
		((ConfigurableApplicationContext)context).close();// закрытие контекста вручную

	}
}
