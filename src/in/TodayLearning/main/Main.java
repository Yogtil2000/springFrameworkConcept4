package in.TodayLearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.TodayLearning.beans.Student;
import in.TodayLearning.resources.SpringConfigFile;

public class Main 
{
    public static void main(String args[])
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	
    	Student bean = context.getBean(Student.class);
    	
    	bean.display();
    	
    }
}