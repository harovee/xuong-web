package lab1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "RectangleInfo", value = "/calc")
public class RectangleInfo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("rectangle-info/rectangle.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        double width = Double.parseDouble(req.getParameter("width"));
        double length = Double.parseDouble(req.getParameter("length"));
        double perimeter = (width + length) * 2;
        double area = width * length;

        req.setAttribute("perimeter", perimeter);
        req.setAttribute("area", area);

        req.getRequestDispatcher("rectangle-info/result.jsp").forward(req, res);
    }
}
