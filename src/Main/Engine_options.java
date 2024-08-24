package Main;

import static Main.Engine.engine_input;
import com.raylib.java.core.Color;
import com.raylib.java.core.rCore;
import com.raylib.java.raymath.Vector2;


public class Engine_options extends Engine{
    
    int selection_num = 0;
    int delay_selection = 0;
    Vector2 point_position = new Vector2();
    
    boolean stamina_mode = false;
    double damage_multiply = 1.0;
    boolean team_attack = true;
    boolean show_score = false;
    int default_lives = 5;
    
    public Engine_options(){}
    
    public void input_options()
    {
        if(delay_selection <= 0)
        {
            if(rCore.IsKeyDown(engine_input.player1_up))
            {
                selection_num -= 1;
                delay_selection = 5;
            }else if(rCore.IsKeyDown(engine_input.player1_down))
            {
                selection_num += 1;
                delay_selection = 5;
            }else if(rCore.IsKeyDown(engine_input.player2_up))
            {
                selection_num -= 1;
                delay_selection = 5;
            }else if(rCore.IsKeyDown(engine_input.player2_down))
            {
                selection_num += 1;
                delay_selection = 5;
            }
        }
        
    }
    
    public void update_options()
    {
        
        delay_selection -= 1;
        
        if(delay_selection <= -1)
        {
            delay_selection = 0;
        }
        
        
        switch(selection_num)
        {
            case 0:
            {
                point_position = new Vector2(0,32);
                break;     
            }
            case 1:
            {
                point_position = new Vector2(0,64);
                break;
            }
            case 2:
            {
                point_position = new Vector2(0,96);
                break;
            }
            case 3:
            {
                point_position = new Vector2(0,128);
                break;
            }
            case 4:
            {
                point_position = new Vector2(0,160);
                break;
            }
            case 5:
            {
                point_position = new Vector2(0,192);
                break;
            }
        }
        
        if(selection_num <= 0)
        {
            selection_num = 0;
        } else if (selection_num >= 5)
        {
            selection_num = 5;
        }
        
    }
    
    public void render_options()
    {
        rlj.core.BeginDrawing();
        rlj.core.ClearBackground(Color.BLACK);
        
        rlj.text.DrawText(" >>",(int) point_position.x,(int) point_position.y, 24, Color.GREEN);
        rlj.text.DrawText("Starmina mode: "+String.valueOf(stamina_mode), 32, 32, 24, Color.GOLD);
        rlj.text.DrawText("Damage: "+String.valueOf(damage_multiply)+"%", 32, 64, 24, Color.GOLD);
        rlj.text.DrawText("Team Damage: "+String.valueOf(team_attack), 32, 96, 24, Color.GOLD);
        rlj.text.DrawText("Show score: "+String.valueOf(show_score), 32, 128, 24, Color.GOLD);
        rlj.text.DrawText("Default lives: "+String.valueOf(default_lives), 32, 160, 24, Color.GOLD);
        rlj.text.DrawText("Back", 32, 192, 24, Color.GOLD);
        
        rlj.core.EndDrawing();
    }
    
}
