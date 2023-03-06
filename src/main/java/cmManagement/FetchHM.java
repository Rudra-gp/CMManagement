package cmManagement;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetchhm")
public class FetchHM extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ganesh");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Query q=em.createQuery("select b from HM b");
		List<HM> hm=q.getResultList();
		for(HM h:hm)
		{
			System.out.println(h.getId());
			System.out.println(h.getName());
			System.out.println(h.getDepartment());
			System.out.println(h.getParty());
		}
	}

}
