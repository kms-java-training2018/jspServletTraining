package bean;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeanSampleServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        //
        NewEmployeeBean bean = new NewEmployeeBean();
        bean.setName("増田啓人");
        bean.setId(256);

        //
        req.setAttribute("bean", bean);

        req.getRequestDispatcher("/beanSample.jsp").forward(req, res);
    }

}
