import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/users")
public class userServlet extends HttpServlet {

    private UserDao userDao;

    public  void init() {
        userDao = new UserDao();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Users> users = userDao.getAllUsers();
        request.setAttribute("users", users);
        request.getRequestDispatcher("listUsers.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("add".equals(action)) {
            try {
                addUser(request, response);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else if ("edit".equals(action)) {
            editUser(request, response);
        } else if ("delete".equals(action)) {
            deleteUser(request, response);
        }
    }

    private void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        Users newUser = new Users(name, email);
        userDao.insertUser(newUser);
        response.sendRedirect("users");
    }

    private void editUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        Users user = new Users(id, name, email);
        userDao.updateUser(user);
        response.sendRedirect("users");
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        userDao.deleteUser(id);
        response.sendRedirect("users");
    }

}
