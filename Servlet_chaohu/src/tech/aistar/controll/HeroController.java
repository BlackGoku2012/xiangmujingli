package tech.aistar.controll;

import tech.aistar.dao.IHeroDao;
import tech.aistar.dao.impl.HeroImpl;
import tech.aistar.pojo.Hero;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author wubin
 * @date 2019/11/16
 * @本类用来演示：
 */
@WebServlet("/hero")
public class HeroController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        IHeroDao dao = new HeroImpl();
        List<Hero> list = dao.findhero();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/hero.jsp").forward(req,resp);

    }
}
