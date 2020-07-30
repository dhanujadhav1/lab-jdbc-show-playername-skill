package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	 public Skill getSkillBylD(Long id) throws SQLException {
		 
		 ConnectionManager cm = new ConnectionManager();
		 Connection con =null;
		 String sql ="SELECT skill FROM player where ID="+id;
		 Statement ps = con.createStatement();
	ResultSet rs=ps.executeQuery(sql);
		while(rs.next()) {
			
			
		}
	return null;
		 
	 }
}
