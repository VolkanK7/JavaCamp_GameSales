
public class Games {
	private int id;
	private String gameName;
	private String gameCategory;
	private int gamePrice;

	public Games(int id, String gameName, String gameCategory, int gamePrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gameCategory = gameCategory;
		this.gamePrice = gamePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameCategory() {
		return gameCategory;
	}

	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
}
