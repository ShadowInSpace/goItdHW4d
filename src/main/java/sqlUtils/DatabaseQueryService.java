package sqlUtils;

import sqlUtils.models.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    protected String ReadQueryFromFile(String fileName) {

        String str;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            while ((str = in.readLine()) != null) {
                sb.append(str).append("\n ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public List<MaxProjectCountClient> findMaxProjectsClient() {
        String query = ReadQueryFromFile("sql/find_max_projects_client.sql");
        List<MaxProjectCountClient> maxProjectCountClient = new ArrayList<>();
        String name;
        int projectCount;
        try {
            Connection connection = new Database().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                name = rs.getString("name");
                projectCount = rs.getInt("project_count");
                maxProjectCountClient.add(new MaxProjectCountClient(name, projectCount));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return maxProjectCountClient;
    }
     public List<MaxSalaryWorker> findMaxSalaryWorker(){
         String query = ReadQueryFromFile("sql/find_max_salary_worker.sql");
         List<MaxSalaryWorker> maxSalaryWorker = new ArrayList<>();
         String name;
         int salary;
         try {
             Connection connection = new Database().getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(query);
             while (rs.next()) {
                 name = rs.getString("name");
                 salary = rs.getInt("salary");
                 maxSalaryWorker.add(new MaxSalaryWorker(name, salary));
             }
             connection.close();
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
         return maxSalaryWorker;
     }

    public List<LongestProjectCount> findLongestProject(){
        String query = ReadQueryFromFile("sql/find_longest_project.sql");
        List<LongestProjectCount> longestProjectCount = new ArrayList<>();
        String name;
        int monthCount;
        try {
            Connection connection = new Database().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                name = rs.getString("name");
                monthCount = rs.getInt("month_count");
                longestProjectCount.add(new LongestProjectCount(name, monthCount));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return longestProjectCount;
    }
    public List<YoungestEldestWorkers> findYoungestEldestWorkers(){
        String query = ReadQueryFromFile("sql/find_youngest_eldest_workers.sql");
        List<YoungestEldestWorkers> youngestEldestWorkers = new ArrayList<>();
        String type;
        String name;
        Date birthday;
        try {
            Connection connection = new Database().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                type = rs.getString("type");
                name = rs.getString("name");
                birthday = rs.getDate("birthday");
                youngestEldestWorkers.add(new YoungestEldestWorkers(type, name, birthday));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return youngestEldestWorkers;
    }

    public List<ProjectPrices> printProjectPrices(){
        String query = ReadQueryFromFile("sql/print_project_prices.sql");
        List<ProjectPrices> projectPrices = new ArrayList<>();
        String name;
        int price;
        try {
            Connection connection = new Database().getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                name = rs.getString("name");
                price = rs.getInt("price");
                projectPrices.add(new ProjectPrices(name, price));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return projectPrices;
    }

}
