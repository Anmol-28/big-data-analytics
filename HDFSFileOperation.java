package project1;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
 
public class HDFSFileOperation {
  private static String driverName = "org.apache.hive.jdbc.HiveDriver";
 
  /**
   * @param args
   * @throws SQLException
   */
  public static void main(String[] args) throws SQLException {
      try {
        Class.forName(driverName);
      } 
      
      catch (ClassNotFoundException e) {
          e.printStackTrace();
          System.exit(1);
      }
    //replace "hive" here with the name of the user the queries should run as
      String location =(Project1.filePath).toLowerCase();
      if(location.contains("deliveries")){
          Connection con = DriverManager.getConnection("jdbc:hive2://localhost:10000/default", "hduser", "anmol2810");
          Statement stmt = con.createStatement();
          String tableName = "deliveries";
          stmt.execute("drop table if exists " + tableName);
          System.out.println("Dropped");
          stmt.execute("create table " + tableName + "(match_id int,inning int,batting_team string,"
              + "bowling_team string,current_over int,ball int,batsman string,non_striker string,"
              + "bowler string,is_super_over int,wide_runs int,bye_runs int,legbye_runs int,"
              + "noball_runs int,penalty_runs int,batsman_runs int,extra_runs int,total_runs int,"
              + "player_dismissed string,dismissal_kind string,fielder string) ROW FORMAT "
              + "DELIMITED FIELDS TERMINATED BY ','");
    // show tables
          String sql = "show tables '" + tableName + "'";
          System.out.println("Running: " + sql);
          ResultSet res = stmt.executeQuery(sql);
          if (res.next()) {
              System.out.println(res.getString(1));
          }
       // describe table
           sql = "describe " + tableName;
         System.out.println("Running: " + sql);
         res = stmt.executeQuery(sql);
      
         while (res.next()) {
             System.out.println(res.getString(1) + "\t" + res.getString(2));
         }
 
    // load data into table
    // NOTE: filepath has to be local to the hive server
    // NOTE: /tmp/a.txt is a ctrl-A separated file with two fields per line
         String filepath = Project1.filePath;
         sql = "load data local inpath '" + filepath + "' into table " + tableName;
         System.out.println("Running: " + sql);
         stmt.execute(sql);
 
    // select * query
         sql = "select non_striker, batsman from " + tableName + " where batsman = 'DA Warner'";
         System.out.println("Running: " + sql);
         res = stmt.executeQuery(sql);
         System.out.println("Got Result Set");
         while (res.next()) {
             System.out.println(String.valueOf(res.getString(1)) + "\t" + res.getString(2));
         }
 
    // regular hive query
         sql = "select count(*) from " + tableName;
         System.out.println("Running: " + sql);
         res = stmt.executeQuery(sql);
         while (res.next()) {
             System.out.println(res.getString(1));
         }
       }
      if(location.contains("matches")){
          Connection con = DriverManager.getConnection("jdbc:hive2://localhost:10000/default", "hduser", "anmol2810");
          Statement stmt = con.createStatement();
          String tableName = "matches";
          stmt.execute("drop table if exists " + tableName);
          System.out.println("Dropped");
          stmt.execute("create table " + tableName + "(match_id int,season int,city string,"
              + "date string,team1 String,team2 String,toss_winner String,toss_decision string,"
              + "result string,dl_applied int,winner string,win_by_runs int,win_by_wickets int,"
              + "player_of_the_match string,venue string,umpire1 string,umpire2 string,umpire3 string) ROW FORMAT "
              + "DELIMITED FIELDS TERMINATED BY ','");
    // show tables
          String sql = "show tables '" + tableName + "'";
          System.out.println("Running: " + sql);
          ResultSet res = stmt.executeQuery(sql);
          if (res.next()) {
              System.out.println(res.getString(1));
          }
       // describe table
           sql = "describe " + tableName;
         System.out.println("Running: " + sql);
         res = stmt.executeQuery(sql);
      
         while (res.next()) {
             System.out.println(res.getString(1) + "\t" + res.getString(2));
         }
 
    // load data into table
    // NOTE: filepath has to be local to the hive server
    // NOTE: /tmp/a.txt is a ctrl-A separated file with two fields per line
         String filepath = Project1.filePath;
         sql = "load data local inpath '" + filepath + "' into table " + tableName;
         System.out.println("Running: " + sql);
         stmt.execute(sql);
 
    // select * query
         sql = "select city, date from " + tableName + " where season = '2017'";
         System.out.println("Running: " + sql);
         res = stmt.executeQuery(sql);
         System.out.println("Got Result Set");
         while (res.next()) {
             System.out.println(String.valueOf(res.getString(1)) + "\t" + res.getString(2));
         }
 
    // regular hive query
         sql = "select count(*) from " + tableName;
         System.out.println("Running: " + sql);
         res = stmt.executeQuery(sql);
         while (res.next()) {
             System.out.println(res.getString(1));
         }
      }
  }
}