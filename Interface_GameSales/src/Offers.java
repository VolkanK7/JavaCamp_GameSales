
public class Offers {
	private int id;
	private String offerName;
	private int discount;

	public Offers(int id, String offerName, int discount) {
		super();
		this.id = id;
		this.offerName = offerName;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
