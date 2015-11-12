package ro.pub.cs.aipi.lab03.businesslogic;

import ro.pub.cs.aipi.lab03.entities.Language;

public class LanguageManager extends PersistentEntityManager<Language> {
	
	public LanguageManager() {
		super(Language.class);
	}

}
