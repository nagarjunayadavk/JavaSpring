package Food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Food {

	private static ApplicationContext appContext;

	public static void main(String[] args) {
		//Fruit f = new Fruit();
		//Rice r = new Rice();
		//==========Using Spring =========
		  //=== Ex: FileSystemXmlApplicationContext Path ............
		//appContext = new FileSystemXmlApplicationContext("appContext.xml");
		  //=== Ex: ClassPathXmlApplicationContext ====== Path ............
				appContext = new ClassPathXmlApplicationContext("classPath/appContext.xml");
		Fruit f = appContext.getBean("fruit", Fruit.class);
		Rice r = (Rice)appContext.getBean("rice");
		
		
		
		Fruit f1 = appContext.getBean("fruitName", Fruit.class);
		Fruit f2 = appContext.getBean("multiplefruitName", Fruit.class);
		
		System.out.println(f1.myself());
		System.out.println(f2.myself());
		
		System.out.println(f.myself());
		System.out.println(r.myself());
		
		Fruit propertyFrruit = appContext.getBean("setPropertyName", Fruit.class);
		System.out.println(propertyFrruit.getFruitName());
		
		Rice r1 = (Rice)appContext.getBean("setPropertyRiceName");
		System.out.println(r1.myself());
		
       //((FileSystemXmlApplicationContext) appContext).close();
       
       ((ClassPathXmlApplicationContext) appContext).close();
	}

}
