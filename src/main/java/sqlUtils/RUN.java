package sqlUtils;

import sqlUtils.models.LongestProjectCount;
import sqlUtils.models.MaxSalaryWorker;
import sqlUtils.models.ProjectPrices;
import sqlUtils.models.YoungestEldestWorkers;

import java.sql.SQLException;
import java.util.List;

public class RUN {
    public static void main(String[] args) throws SQLException {
//        Database database = new Database();
//        List<MaxProjectCountClient> maxProjectCountClients = new DatabaseQueryService().findMaxProjectsClient();
//        database.getConnection().close();
        DatabaseQueryService databaseQueryService = new DatabaseQueryService();
//        List<MaxProjectCountClient> maxProjectsClient = databaseQueryService.findMaxProjectsClient();
//        for (MaxProjectCountClient projectCountClient:maxProjectsClient ) {
//            System.out.println("projectCountClient = " + projectCountClient);
//        }
//       List<LongestProjectCount> longestProjectCounts = databaseQueryService.findLongestProject();
//        for (LongestProjectCount longestProjectCount : longestProjectCounts) {
//            System.out.println("longestProjectCount = " + longestProjectCount);
//        }
//        List<YoungestEldestWorkers> youngestEldestWorkers = databaseQueryService.findYoungestEldestWorkers();
//        for (YoungestEldestWorkers youngestEldestWorker : youngestEldestWorkers) {
//            System.out.println("youngestEldestWorker = " + youngestEldestWorker);
//        }

        List<ProjectPrices> projectPrices = databaseQueryService.printProjectPrices();
        for (ProjectPrices projectPrice : projectPrices) {
            System.out.println("projectPrice = " + projectPrice);
        }

    }





}
