package ro.pub.cs.aipi.lab03.entities;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Collection.class)
public class Collection_ {
	public static volatile SingularAttribute<Collection, Long> id;
	public static volatile SingularAttribute<Collection, String> name;
	public static volatile SingularAttribute<Collection, String> description;
	public static volatile SingularAttribute<Collection, PublishingHouse> publishingHouse;
}
