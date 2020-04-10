package dao;

import java.util.List;

import entidades.Departamentos;

public interface Dao {
	public void insert(Object o);
	public void update(Object o);
	public void delete(Object o);
	public Object select(int i);
	public List<Departamentos> select();
}
