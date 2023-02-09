package sqlUtils;

import sqlUtils.models.MaxProjectCountClient;

import java.sql.SQLException;
import java.util.List;

public class RUN {
    public static void main(String[] args) throws SQLException {
        Database database = new Database();
        List<MaxProjectCountClient> maxProjectCountClients = new DatabaseQueryService().findMaxProjectsClient();
        new Database().getConnection().close();
    }





}
