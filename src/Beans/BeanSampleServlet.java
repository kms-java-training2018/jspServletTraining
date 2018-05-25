package Beans;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeanSampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        // Beanの生成とフィールドへのアクセス
        NewEmployeeBean bean = new NewEmployeeBean();
        bean.setName("石井");
        bean.setEmployeeNumber(232);

        // リクエストスコープにアクセス
        req.setAttribute("bean", bean);

        req.getRequestDispatcher("/beanSample.jsp").forward(req, res);
    }
}
