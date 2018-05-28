package bean;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeanSampleServle extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        NewEmployeeBean bean = new NewEmployeeBean();
        bean.setName("稲田雄士");
        bean.setNumber(241);

        req.setAttribute("bean", bean);
        req.getRequestDispatcher("/beanSample.jsp").forward(req, res);
    }

}
