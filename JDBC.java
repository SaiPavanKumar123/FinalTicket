package com.ticket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBC {

	public ArrayList<Stations> connection() throws ClassNotFoundException {
		ArrayList<Stations> ar1 = new ArrayList<>();
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://192.168.110.48:5432/plf_training?user=plf_training_admin&password=pff123";

		try {
			Connection conn = DriverManager.getConnection(url);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from train");

			while (rs.next()) {
				ar1.add(new Stations(rs.getString(3), rs.getString(4), rs.getString(2)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ar1;

	}

	public void insert(String from, String to, String train, String clas, String dt, ArrayList<Passenger> ap)
			throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection c = DriverManager.getConnection(
				"jdbc:postgresql://192.168.110.48:5432/plf_training?user=plf_training_admin&password=pff123");
		PreparedStatement ps = c
				.prepareCall("insert into train_schedule(from_station,to_station,train,class,dt) values(?,?,?,?,?)");
		ps.setString(1, from);
		ps.setString(2, to);
		ps.setString(3, train);
		ps.setString(4, clas);
		ps.setString(5, dt);
		ps.execute();
		String pn = "12345";
		for (Passenger p : ap) {
			PreparedStatement ps1 = c.prepareCall("insert into pavan_passenger(name,age,gender,pnrno) values(?,?,?,?)");
			ps1.setString(1, p.getName());
			ps1.setInt(2, Integer.parseInt(p.getAge()));
			ps1.setString(3, p.getGender());
			ps1.setString(4, pn);
			ps1.executeUpdate();
		}

	}

}