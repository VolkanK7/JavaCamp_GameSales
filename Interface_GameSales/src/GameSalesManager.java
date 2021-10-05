
public class GameSalesManager implements GameSales {

	@Override
	public void gameSale(Games game, Players player, Offers offer) {

		double lastPrice = game.getGamePrice() - (game.getGamePrice() * offer.getDiscount() / 100);

		System.out.println(game.getGameName() + " oyununa " + offer.getDiscount() + "% indirim yap�ld�. \nYeni Fiyat: "
				+ lastPrice);

		System.out.println(game.getGameName() + " oyunu " + player.getFirstName() + " ki�isine " + lastPrice
				+ " TL fiyata sat�lm��t�r!");

	}

}
