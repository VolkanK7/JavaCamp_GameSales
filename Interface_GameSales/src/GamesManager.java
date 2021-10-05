
public class GamesManager {
	public void add(Games game) {
		System.out.println(game.getGameName() + " eklendi.");
	}
	
	public void delete(Games game) {
		System.out.println(game.getGameName() + " silindi.");
	}
	
	public void update(Games game) {
		System.out.println(game.getGameName() + " güncellendi.");
	}
}
