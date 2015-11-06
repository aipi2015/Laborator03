package ro.pub.cs.aipi.lab03.result;

import ro.pub.cs.aipi.lab03.entities.PersistentEntity;

public class SupplyOrderInformation extends PersistentEntity {

	// TODO: exercise 5c

	protected Long publishingHouseId;
	protected Long bookPresentationId;
	protected Long quantity;

	public SupplyOrderInformation() {
	}

	public SupplyOrderInformation(Long publishingHouseId, Long bookPresentationId, Long quantity) {
		this.publishingHouseId = publishingHouseId;
		this.bookPresentationId = bookPresentationId;
		this.quantity = quantity;
	}

	public Long getPublishingHouseId() {
		return publishingHouseId;
	}

	public void setPublishingHouseId(Long publishingHouseId) {
		this.publishingHouseId = publishingHouseId;
	}

	public Long getBookPresentationId() {
		return bookPresentationId;
	}

	public void setBookPresentationId(Long bookPresentationId) {
		this.bookPresentationId = bookPresentationId;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
