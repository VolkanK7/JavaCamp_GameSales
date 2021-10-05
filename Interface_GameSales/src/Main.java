
public class Main {

	public static void main(String[] args) {

		Verify Verifys[] = { new NameVerify(), new IdentityVerify() };
		Players player1 = new Players(1, "volkan", "kaya", "kaya@gmail.com", "1997", "male");
		Players player2 = new Players(2, "kaya", "volkan", "volkan@gmail.com", "1988", "male");
		PlayersManager playersManager = new PlayersManager(Verifys);
		playersManager.add(player1);
		playersManager.add(player2);

		Games game = new Games(1, "Call of Duty", "FPS Shooter", 190);
		Games game2 = new Games(2, "Knight Online", "MMORPG", 50);
		GameSalesManager gameSalesManager = new GameSalesManager();
		Offers offer = new Offers(1, "indirim", 20);
		Offers offer2 = new Offers(2, "sezon indirimi", 15);
		gameSalesManager.gameSale(game, player1, offer);
		gameSalesManager.gameSale(game2, player2, offer2);

	}

}
