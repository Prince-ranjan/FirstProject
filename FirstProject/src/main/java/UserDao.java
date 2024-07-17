import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private String url = "jdbc:mysql://localhost:3306/firstproject";
    private String userName = "root";
    private String passWordForDb = "Password";


    private static final String INSERT_USER = "INSERT INTO users (name, email) VALUES (?,?)";
    private static final String READ_USER_FOR_ID = "SELECT id, name, email FROM users WHERE id = ?";
    private static final String READ_ALL_USERS = "SELECT * FROM users";
    private static final String UPDATE_USER = "UPDATE users SET name = ?, email = ? WHERE id = ?";
    private static final String DELETE_USER = "DELETE FROM users WHERE id = ?";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, userName, passWordForDb);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void insertUser(Users user) throws SQLException {
        System.out.println(INSERT_USER);
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2: Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // print SQL exception information
            printSQLException(e);
        }
    }

    public Users getUserById(int id) {
        Users user = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(READ_USER_FOR_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                user = new Users(id, name, email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public List<Users> getAllUsers() {
        List<Users> users = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(READ_ALL_USERS)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                users.add(new Users(id, name, email));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public boolean updateUser(Users user) {
        boolean rowUpdated = false;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_USER)) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setInt(3, user.getId());
            rowUpdated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdated;
    }

    public boolean deleteUser(int id) {
        boolean rowDeleted = false;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_USER)) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
