import java.sql.*;

public class UsersDao {
    private String url = "jdbc:mysql://localhost:3306/firstproject";
    private String userName = "root";
    private String passWordForDb = "Password";


    private static final String INSERT_USER = "INSERT INTO users (name, email) VALUES (?,?)";
    private static final String READ_USER_FOR_ID = "SELECT id, name, email FROm users WHERE id = ?";
    private static final String READ_ALL_USERS = "SELECT * FROM users";
    private static final String UPDATE_USER = "UPDATE users SET name = ?, email = ? WHERE id = ?";
    private static final String DELETE_USER = "DELETE FROM users WHERE id = ?";

    public Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, userName, passWordForDb);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public void insertUser(Users users) {
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER);
            preparedStatement.setString(1, users.getName());
            preparedStatement.setString(2, users.getEmail());
            ResultSet rs =  preparedStatement.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
