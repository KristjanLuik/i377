package testtest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ab.Yksus;

public class Dao extends AbstractDao {

	
	
		public List<Yksus> findByKey(String key) throws SQLException {
		      List<Yksus> otsitavad = new ArrayList<Yksus>();
		      try {
		         st = getConnection().createStatement();
		         rs = st.executeQuery("SELECT * FROM unit WHERE LCASE(name) LIKE '%" + key.toLowerCase() + "%'");
		         while(rs.next()) {
		            Yksus temp = new Yksus();
		            temp.setId(rs.getInt("id"));
		            temp.setName(rs.getString("name"));
		            temp.setCode(rs.getString("code"));
		            otsitavad.add(temp);
		         }
		      }
		      finally {
		         closeResources();
		      }
		      return otsitavad;
		   }

		public List<Yksus> getAllYksus() throws SQLException {

		List<Yksus> yksused = new ArrayList<Yksus>();
		try {
			st = getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM unit");
			while (rs.next()) {
				Yksus temp = new Yksus();
				temp.setId(rs.getInt("id"));
				temp.setName(rs.getString("name"));
				temp.setCode(rs.getString("code"));
				yksused.add(temp);
			}
		} finally {
			closeResources();
		}

		return yksused;
	}
	
		public void addYksus(String name, String code) throws SQLException {
		try {
	         st = getConnection().createStatement();
	         rs = st.executeQuery("INSERT INTO unit VALUES (NEXT VALUE FOR seq1), '" + name + "', '" + code + "'");
	      }
	      finally {
	         closeResources();
	      }
		
	}
	
		public void deleteYksus(int id) throws SQLException {
			try {
		         st = getConnection().createStatement();
		         rs = st.executeQuery("DELETE FROM unit WHERE id =" + id );
		      }
		      finally {
		         closeResources();
		      }
			
		}
	
		public void deleteAll() throws SQLException {
			try {
		         st = getConnection().createStatement();
		         rs = st.executeQuery("DELETE * FROM unit");
		      }
		      finally {
		         closeResources();
		      }
		}









}
