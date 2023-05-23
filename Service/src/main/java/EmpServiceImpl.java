import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@WebService(targetNamespace = "AnyThing")
@SOAPBinding
public class EmpServiceImpl implements EmpService{
	
//	private static Map<Integer,EmpRepo> persons = new HashMap<Integer,EmpRepo>();
	
	private SessionFactory sessionFactory;
	

	@WebMethod
	public String getEmployee(int id) {
		// TODO Auto-generated method stub
		return "Hello "+id;
	}
	
	@WebMethod
	public boolean addEmp(EmpRepo e) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("Employee added successfully");
		return true;
	}
	
	public void getAllEmployees() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
		EntityManager em = emf.createEntityManager();
		
		CriteriaBuilder cb = emf.getCriteriaBuilder();
		CriteriaQuery<EmpRepo> q = cb.createQuery(EmpRepo.class);
		Root<EmpRepo> p = q.from(EmpRepo.class);
		
		List<EmpRepo> empList = em.createQuery(q).getResultList();
		
		for(EmpRepo emp : empList) {
		
		System.out.println(emp.getName());
		
		em.close();
		emf.close();
	}
	}
	
	@WebMethod
	public void empCount() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
		EntityManager em = emf.createEntityManager();
		
		Query q = (Query) em.createQuery("SELECT COUNT(e) FROM EmpRepo e");
		System.out.println("Total Employees: " + q.getSingleResult());
		
		em.close();
		emf.close();
	}
	
	@WebMethod
	public void updateEmployee(EmpRepo e) {
	    EntityManagerFactory emf = null;
	    EntityManager em = null;
	    EntityTransaction transaction = null;

	    try {
	        emf = Persistence.createEntityManagerFactory("emp");
	        em = emf.createEntityManager();
	        transaction = em.getTransaction();
	        transaction.begin();

	        String jpql = "UPDATE EmpRepo e SET e.name = :name, e.age = :age WHERE e.id = :id";
	        int updatedCount = em.createQuery(jpql)
	                .setParameter("name", e.getName())
	                .setParameter("age", e.getAge())
	                .setParameter("id", e.getId())
	                .executeUpdate();

	        transaction.commit();

	        System.out.println("Number of employees updated: " + updatedCount);
	    } catch (Exception ex) {
	        if (transaction != null && transaction.isActive()) {
	            transaction.rollback();
	        }
	        ex.printStackTrace();
	    } finally {
	        if (em != null) {
	            em.close();
	        }
	        if (emf != null) {
	            emf.close();
	        }
	    }
	}
	
//	@WebMethod
//	public void updateEmp(EmpRepo e) {
//		
//		Configuration configuration = new Configuration().configure();
//        sessionFactory = configuration.buildSessionFactory();
//		
//		
//        Session session = sessionFactory.openSession();
//        
//        Transaction transaction = session.beginTransaction();
//		
//        String updateQuery ="UPDATE EmpRepo SET name = 'toqaa', age = 22 WHERE id = 3";
//        String name = e.getName();
//        
//        session.createQuery(updateQuery)
////        .setParameter("name", name)
////        .setParameter("age", e.getAge())
////        .setParameter("id", e.getId())
//        .executeUpdate();
//		
//     
//        transaction.commit();
//        
//        session.close();
//		
//		
//	}
//		public EmpRepo getEmpById(int id) {
//			
//			Configuration configuration = new Configuration().configure("hibernate.properties");
//			SessionFactory sessionFactory = configuration.buildSessionFactory();
//			
//			Session session = sessionFactory.openSession();
//			
//			Query<EmpRepo> query = session.createQuery("select * FROM EmpRepo e where e.id = :id", EmpRepo.class);
//			query.setParameter("id", id);
//			
//			EmpRepo emp = new EmpRepo();
//			
//			emp = query.getSingleResult();
//			return emp;
//			
//		}
//		
//		Configuration configuration = new Configuration().configure("src/main/hibernate/hibernate.properties");
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		
//		Session session = sessionFactory.openSession();
//		
//		Query<EmpRepo> query = session.createQuery("FROM Product", EmpRepo.class);
//		List<EmpRepo> empList = query.list();
//		
//		for(EmpRepo emp : empList) {
//			
//			System.out.println(emp.getName());
//		}
//		
		
	
	
//	public EmpRepo[] getAllPersons() {
//		Set<Integer> ids = persons.keySet();
//		EmpRepo[] p = new EmpRepo[ids.size()];
//		int i=0;
//		for(Integer id : ids){
//			p[i] = persons.get(id);
//			i++;
//		}
//		return p;
//	}

}
