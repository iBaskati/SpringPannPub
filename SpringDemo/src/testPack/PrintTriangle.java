package testPack;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory bean = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle t = (Triangle) bean.getBean("triangle");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t  = (Triangle) context.getBean("triangle");
		t.draw();
		System.out.println(t.getType()+" "+t.getHeight());
	}

}
