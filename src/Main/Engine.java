package Main;

import static Main.Engine.rlj;
import com.raylib.java.Config.ConfigFlag;
import com.raylib.java.Raylib;
import com.raylib.java.core.Color;
import com.raylib.java.core.input.Keyboard;
import com.raylib.java.core.rCore;
import com.raylib.java.core.ray.Ray;
import com.raylib.java.core.rcamera.Camera3D;
import com.raylib.java.models.BoundingBox;
import com.raylib.java.raymath.Vector3;
import com.raylib.java.textures.Texture2D;
import java.util.ArrayList;
import java.util.List;

public class Engine {
    
    static Raylib rlj = new Raylib();
    
    static Engine_characters asd;
    
    static List<Engine_characters> character_data_list = new ArrayList<>();
    static List<Engine_particles_base> particles_list = new ArrayList<>();
    
    static String game_state = "main_menu";
    
    static Engine_input engine_input = new Engine_input();
    static Engine_data_base engine_data_base = new Engine_data_base();
    
    static Engine_main_menu engine_main_menu = new Engine_main_menu();
    static Engine_options engine_options = new Engine_options();
    static Engine_character_selection engine_character_selection = new Engine_character_selection();
    static Engine_stage_selection engine_stage_selection = new Engine_stage_selection();
    
    public static void main(String [] args)
    {         
        rlj.core.InitWindow(800, 600, "Raylib 3d test v0.1");
        rlj.core.SetWindowState(ConfigFlag.FLAG_WINDOW_RESIZABLE);
        rlj.core.SetTargetFPS(60);        
        asd = new Engine_characters();        
        float model_frame = 0;         
        //cam3d.SetCameraMode(Camera3D.CameraMode.CAMERA_FIRST_PERSON);
        
        init_engine();
        
        while(!rlj.core.WindowShouldClose())
        { 
            input_engine();
            update_engine();
            render_engine();           
        }
    }
    
    public static void init_engine()
    {
        
        
        
    }
    
    public static void input_engine()
    {   
        switch(game_state)
        {
            case "main_menu":
            {
                engine_main_menu.input_main_menu();
                break;
            }
            case "options":
            {
                engine_options.input_options();
                break;
            }
        } 
    }
    
    public static void update_engine()
    {
//        double players_top_left = Double.NEGATIVE_INFINITY;
//        double players_top_right = Double.POSITIVE_INFINITY;
//        double players_top_down = Double.NEGATIVE_INFINITY;
//        double players_top_up = Double.POSITIVE_INFINITY;
//        
//        for(Engine_character_test plr : player_list)
//        {
//            if(players_top_left <= plr.player_position.x)
//            {
//                players_top_left = plr.player_position.x;
//            }
//        }
//        
//        for(Engine_character_test plr : player_list)
//        {
//            if(players_top_right >= plr.player_position.x)
//            {
//                players_top_right = plr.player_position.x;
//            }
//        }
//        
//        for(Engine_character_test plr : player_list)
//        {
//            if(players_top_down <= plr.player_position.y)
//            {
//                players_top_down = plr.player_position.y;
//            }
//        }
//        
//        for(Engine_character_test plr : player_list)
//        {
//            if(players_top_up >= plr.player_position.y)
//            {
//                players_top_up = plr.player_position.y;
//            }
//        }
//        
//        float total_players_pos_x = 0;
//        for(Engine_character_test plr : player_list)
//        {
//            total_players_pos_x += plr.player_position.x;
//        }
//        
//        float total_players_pos_y = 0;
//        for(Engine_character_test plr : player_list)
//        {
//            total_players_pos_y += plr.player_position.y;
//        }
//        cam3d.position.x = total_players_pos_x/player_list.size();
//        cam3d.target.x = total_players_pos_x/player_list.size();
//        
//        cam3d.position.y = total_players_pos_y/player_list.size();
//        cam3d.target.y = total_players_pos_y/player_list.size();
//        
//        double players_lrud = (players_top_left - players_top_right) + (players_top_down - players_top_up);
//        
//        cam3d.position.z = (float) (Math.abs(players_lrud) * 1.1)+10;
        
        switch(game_state)
        {
            case "main_menu":
            {
                engine_main_menu.update_main_menu();
                break;
            }
            case "options":
            {
                engine_options.update_options();
                break;
            }
        }   
    }
    
    public static void render_engine()
    {
        
        switch(game_state)
        {
            case "main_menu":
            {
                engine_main_menu.render_main_menu();
                break;
            }
            case "options":
            {
                engine_options.render_options();
                break;
            }
        }       
    }    
}
