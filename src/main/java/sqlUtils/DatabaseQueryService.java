package sqlUtils;

import sqlUtils.models.MaxProjectCountClient;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DatabaseQueryService {
    private String ReadQueryFromFile(String fileName) {

        String str;
        StringBuilder sb = new StringBuilder();
        while (true) {
            try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
                if ((str = in.readLine()) == null) break;

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            sb.append(str).append("\n ");
        }
        return sb.toString();
    }

    public List<MaxProjectCountClient> findMaxProjectsClient(){
    String query = ReadQueryFromFile("sql/find_max_projects_client.sql");
        try {
            Statement statement = new Database().getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                System.out.println(rs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return null;
    }
}
