
public class PlayersManager {

	private Verify[] verifys;

	public PlayersManager(Verify[] verifys) {
		this.verifys = verifys;
	}

	public void add(Players player) {
		System.out.println("oyuncu eklendi : " + player.getFirstName());
		Utils.runVerify(verifys, player.getEmail());
	}

	public void delete(Players player) {
		System.out.println("oyuncu silindi : " + player.getFirstName());
		Utils.runVerify(verifys, player.getEmail());
	}

	public void update(Players player) {
		System.out.println("oyuncu güncellendi : " + player.getFirstName());
		Utils.runVerify(verifys, player.getEmail());
	}
}
