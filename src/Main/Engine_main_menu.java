package Main;

import com.raylib.java.core.Color;
import com.raylib.java.core.rCore;
import com.raylib.java.raymath.Vector2;

public class Engine_main_menu extends Engine{
    
    int selection_num = 0;
    int delay_selection = 0;
    Vector2 point_position = new Vector2();
    
    public Engine_main_menu(){}
    
    public void input_main_menu()
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
        
        switch(selection_num)
        {
            case 0:
            {
                if(rCore.IsKeyDown(engine_input.player1_start))
                {  
                    
                }
                break;
            }
            case 1:
            {
                if(rCore.IsKeyDown(engine_input.player1_start))
                {  
                    game_state = "options";
                }
                break;
            }
            case 2:
            {
                if(rCore.IsKeyDown(engine_input.player1_start))
                {
                    
                }
                break;
            }
        }
        
    }
    
    public void update_main_menu()
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
        }
        
        if(selection_num <= 0)
        {
            selection_num = 0;
        } else if (selection_num >= 2)
        {
            selection_num = 2;
        }
        
    }
    
    public void render_main_menu()
    {
        rlj.core.BeginDrawing();
        rlj.core.ClearBackground(Color.BLACK);
        
        rlj.text.DrawText(" >>",(int) point_position.x,(int) point_position.y, 24, Color.GREEN);
        rlj.text.DrawText("Start game", 32, 32, 24, Color.GOLD);
        rlj.text.DrawText("Options", 32, 64, 24, Color.GOLD);
        rlj.text.DrawText("Exit", 32, 96, 24, Color.GOLD);
        
        rlj.core.EndDrawing();
    }
    
}
