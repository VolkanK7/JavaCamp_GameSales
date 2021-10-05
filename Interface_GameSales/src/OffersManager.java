
public class OffersManager implements Offer{
	public void makeOffer(Games game, Offers offer) {
		double lastPrice = game.getGamePrice() - (game.getGamePrice() * offer.getDiscount() / 100);
		System.out.println(game.getGameName() + " oyununa " + offer.getDiscount() + "% indirim yapýldý. \nYeni Fiyat: "
				+ lastPrice);
	}
}
