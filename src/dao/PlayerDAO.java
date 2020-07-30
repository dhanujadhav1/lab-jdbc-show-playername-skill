package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.Player;
import model.Skill;
import utility.ConnectionManager;

public class PlayerDAO{
	
	 public  List<Player> getAllPlayers() throws SQLException{
		 
		 ConnectionManager cm = new ConnectionManager();
		 Connection con =null;
		 String sql ="SELECT * FROM player";
		 Statement ps = con.createStatement();
	ResultSet rs=ps.executeQuery(sql);
		while(rs.next()) {
			
			
		}
	return null;
		 
	 }
}

