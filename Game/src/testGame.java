import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tests.TileMapTest;
import org.newdawn.slick.tiled.TiledMap;


public class testGame extends BasicGame {
	private TiledMap grassMap;
	private Animation sprite, up, down, left, right;
	
	public testGame() {
		super ("TestGame");
	}
	
	public static void main(String[] arguments) {
        try
        {

           AppGameContainer app = new AppGameContainer(new testGame());
           app.setDisplayMode(320, 320, false);
           app.start();
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }
	
	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		grassMap.render(0, 0);
		
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		grassMap = new TiledMap("data/grassmap.tmx");
    	Image [] movementUp = {new Image("data/sprites/kazekguy1.png"), new Image("data/kazekguy2.png")};
		Image [] movementDown = {new Image("data/sprites/kazekguy1.png"), new Image("data/kazekguy2.png")};
		Image [] movementLeft = {new Image("data/sprites/kazekguy1.png"), new Image("data/kazekguy2.png")};
		Image [] movementRight = {new Image("data/sprites/kazekguy1.png"), new Image("data/kazekguy2.png")};
		int [] duration = {300, 300};
		up = new Animation(movementUp, duration, false);
        down = new Animation(movementDown, duration, false);
        left = new Animation(movementLeft, duration, false);
        right = new Animation(movementRight, duration, false);
        sprite = right;
        //blocked = new boolean[grassMap.getWidth()][grassMap.getHeight()];
		System.out.println("Hola Mundo");
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

}
