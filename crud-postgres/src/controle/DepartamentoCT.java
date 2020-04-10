package controle;

import java.util.List;

import dao.DepartamentoDao;
import entidades.Departamentos;

public class DepartamentoCT {
	public void insert(Departamentos d) {
		DepartamentoDao dao = new DepartamentoDao();
		dao.insert(d);
	}
	
	public void update(Departamentos d) {
		DepartamentoDao dao = new DepartamentoDao();
		dao.update(d);
	}
	
	public void delete(Departamentos d) {
		DepartamentoDao dao = new DepartamentoDao();
		dao.delete(d);
	}
	
	public Departamentos select(int i) {
		DepartamentoDao dao = new DepartamentoDao();
		Departamentos d = (Departamentos) dao.select();
		return d;
	}
	
	public List<Departamentos> select() {
		DepartamentoDao dao = new DepartamentoDao();
		List<Departamentos> d = dao.select();
		return d;
	}
}
