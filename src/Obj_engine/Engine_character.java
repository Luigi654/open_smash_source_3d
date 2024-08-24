package Obj_engine;

import Main.Engine;
import com.raylib.java.models.Model;
import com.raylib.java.models.ModelAnimation;
import com.raylib.java.raymath.Quaternion;
import com.raylib.java.raymath.Vector3;
import com.raylib.java.textures.Image;
import com.raylib.java.textures.Texture2D;
import java.util.ArrayList;
import java.util.List;

public class Engine_character extends Engine{
    
    String chr_name = "";
    int chr_id = 0;
    
    Vector3 chr_position = new Vector3();
    Vector3 chr_scale = new Vector3(1,1,1);
    Quaternion chr_rotation = new Quaternion();
    
    List<Model> chr_models = new ArrayList<>();
    List<Image> chr_images = new ArrayList<>();
    List<Texture2D> chr_textures = new ArrayList<>();
    List<Engine_character_statement> chr_state_list = new ArrayList<>();
    List<Engine_character_helper> chr_helper_list = new ArrayList<>();
        
    Model current_model = new Model();
    ModelAnimation[] current_model_anim;
    Engine_character_statement current_statement;
    
    String chr_state = "reference";
    
    boolean chr_is_bot = false;
    
    public void input_character()
    {
        
    }
    
    public void update_character()
    {
        
        if(current_statement.statement_name != chr_state)
        {
            for(Engine_character_statement chr_statement : chr_state_list)
            {
                current_statement = chr_statement;
                current_statement.frame_animation = 0;
                break;
            }
        }
        
        if(chr_is_bot)
        {
            
        }else
        {
            switch(chr_state)
            {
                case "reference":
                {
                    
                }
            }
        }
            
               
    }
    
    public void render_character()
    {
        
    }
    
}
