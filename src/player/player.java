package player;
import main.game_panel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class player {
    public static final int margin=10;
    public static final int player_x=200 , player_y=180;
    public BufferedImage player_img;
    public player(){
        
    }
    public void update(){

    }

    public void draw(Graphics2D g2){
        BufferedImage image=player_img;
        g2.drawImage(image,(game_panel.WIDTH-player_x)/2,game_panel.HEIGHT-player_y-margin, player_x, player_y,null);
        // PLAYER
        g2.fillRect((game_panel.WIDTH-player_x)/2,game_panel.HEIGHT-player_y-margin, player_x, player_y);
    }

}
