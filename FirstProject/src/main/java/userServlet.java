import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class userServlet extends HttpServlet {

    private  UsersDao usersDao;

    public  void init() {
        usersDao = new UsersDao();
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        String action = req.getServletPath();
        if(action.equals("/new")) {
            usersDao.insertUser();
        }
    }

}
