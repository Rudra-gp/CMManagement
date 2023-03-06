package cmManagement;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removehm")
public class RemoveHM extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ganesh");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		HM hm=em.find(HM.class,1);
		et.begin();
		em.persist(hm);
		et.commit();
		
		RequestDispatcher rd=req.getRequestDispatcher("AddHM.html");
		rd.forward(req, resp);

}
}