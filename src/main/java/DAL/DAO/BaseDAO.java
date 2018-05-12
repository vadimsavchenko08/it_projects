package DAL.DAO;

import java.util.List;

public interface BaseDAO<TModel> {
	
	public void create(TModel tModel);

	public TModel readById(int id);
	
	public void update(TModel user);
	
	public void deleteById(int id);
	
	public List<TModel> getAll(); 
}
