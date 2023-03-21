package MyPack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

		Resource rs = new ClassPathResource("applicationContext.xml");
		
		BeanFactory factory = new XmlBeanFactory(rs);
		
		Student s = (Student)factory.getBean("stu");
		
		s.Info();
	}

}
