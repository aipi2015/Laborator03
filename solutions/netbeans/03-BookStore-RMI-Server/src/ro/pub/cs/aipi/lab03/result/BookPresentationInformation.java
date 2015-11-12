package ro.pub.cs.aipi.lab03.result;

import java.io.Serializable;

import ro.pub.cs.aipi.lab03.entities.PersistentEntity;

public class BookPresentationInformation extends PersistentEntity implements Serializable {

	private static final long serialVersionUID = 20152015L;
	protected Long id;
	protected Long bookId;
	protected Long formatId;
	protected Double price;

	public BookPresentationInformation() {
	}

	public BookPresentationInformation(Long id, Long bookId, Long formatId, Double price) {
		this.id = id;
		this.bookId = bookId;
		this.formatId = formatId;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Long getFormatId() {
		return formatId;
	}

	public void setFormatId(Long formatId) {
		this.formatId = formatId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
