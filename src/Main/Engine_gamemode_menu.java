package Main;

import static Main.Engine.rlj;
import com.raylib.java.core.Color;
import com.raylib.java.raymath.Vector2;

public class Engine_gamemode_menu {
    
    int selection_num = 0;
    int delay_selection = 0;
    Vector2 point_position = new Vector2();
    
    public void input_gamemode_menu()
    {
    
    }
    
    public void update_gamemode_menu()
    {
    
    }
    
    public void render_gamemode_menu()
    {
        rlj.core.BeginDrawing();
        rlj.core.ClearBackground(Color.BLACK);
        
        rlj.text.DrawText(" >>",(int) point_position.x,(int) point_position.y, 24, Color.GREEN);
        rlj.text.DrawText("Single player", 32, 32, 24, Color.GOLD);
        rlj.text.DrawText("Free for all", 32, 64, 24, Color.GOLD);
        rlj.text.DrawText("Team battle", 32, 96, 24, Color.GOLD);
        rlj.text.DrawText("Survival", 32, 96, 24, Color.GOLD);
        rlj.text.DrawText("Back", 32, 96, 24, Color.GOLD);
        
        rlj.core.EndDrawing();
    }
    
}
