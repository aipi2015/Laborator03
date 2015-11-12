package ro.pub.cs.aipi.lab03.businesslogic;

import ro.pub.cs.aipi.lab03.entities.Category;

public class CategoryManager extends PersistentEntityManager<Category> {

	public CategoryManager() {
		super(Category.class);
	}

}
