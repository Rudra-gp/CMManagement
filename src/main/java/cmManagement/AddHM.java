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

@WebServlet("/addhm")
public class AddHM extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String department=req.getParameter("department");
		String party=req.getParameter("party");
		
		HM mh=new HM();
		mh.setId(id);
		mh.setName(name);
		mh.setDepartment(department);
		mh.setParty(party);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ganesh");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(mh);
		et.commit();
		
		System.out.println("added sucessfully");
		
		RequestDispatcher rd=req.getRequestDispatcher("AddHM.html");
		rd.forward(req, resp);
	}
	

}
