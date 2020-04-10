package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Departamentos;
import util.Conector;
/*
 * 
 * create table depto(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(20)
	);
 */
public class DepartamentoDao implements Dao {

	@Override
	public void insert(Object o) {
		// TODO Auto-generated method stub
		Departamentos d = (Departamentos) o;
		String sql = "INSERT INTO depto(nome) VALUES(?)";
		try {
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			ps.setString(1, d.getNome());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(Object o) {
		// TODO Auto-generated method stub
		Departamentos d = (Departamentos) o;
		String sql = "UPDATE depto SET nome=? WHERE id=?";
		try {
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			ps.setString(1, d.getNome());
			ps.setLong(2, d.getId());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Object o) {
		// TODO Auto-generated method stub
		Departamentos d = (Departamentos) o;
		String sql = "DELETE FROM depto WHERE id=?";
		try {
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			ps.setLong(1, d.getId());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Object select(int i) {
		// TODO Auto-generated method stub
		Departamentos d = new Departamentos();
		String sql = "SELECT * FROM depto WHERE id=?";
		try {
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				d.setNome(rs.getString("nome"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}

	@Override
	public List<Departamentos> select() {
		List<Departamentos> list = new ArrayList<Departamentos>();
		String sql = "SELECT * FROM depto";
		PreparedStatement ps;
		
		 try {
			Departamentos d = new Departamentos();
			ps = Conector.getConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				d.setNome(rs.getString("nome"));
				list.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		// TODO Auto-generated method stub
		return null;
	}

}
