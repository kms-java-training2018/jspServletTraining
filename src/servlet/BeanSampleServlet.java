package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.NewEmployeeBean;

public class BeanSampleServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        bean.NewEmployeeBean bean = new NewEmployeeBean();
        bean.setName("花輪朋典");
        bean.setEmpNum(123);

        req.setAttribute("bean", bean);
        req.getRequestDispatcher("/beanSample.jsp").forward(req, res);
    }
}
