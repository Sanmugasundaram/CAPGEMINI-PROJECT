package CG_info.com;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello Cg_Employeer!");
		System.out.println("hi..This is sanmugam table-per-subclass project");
		Session s = Cg_Helper.getSession();
		System.out.println(s);
		Cg_SalariedEmployee se = new Cg_SalariedEmployee(101, "san", 25000);
		Cg_HourlyEmployee he = new Cg_HourlyEmployee(201, "suman", 300, 5);
		
		Transaction tr = s.beginTransaction();
		s.save(se);
		
		s.save(he);
		
		tr.commit();
		s.close();
		System.out.println("saved....");

	}
}
