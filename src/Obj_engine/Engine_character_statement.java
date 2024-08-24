package Obj_engine;

import Main.Engine;
import com.raylib.java.raymath.Vector3;
import java.util.ArrayList;
import java.util.List;

public class Engine_character_statement extends Engine{
    
    List<Chr_hitbox_index_list> chr_hitbox_list = new ArrayList<>();
    List<Chr_hurtbox_index_list> chr_hurtbox_list = new ArrayList<>();
    
    boolean enable_statement = false;
    String statement_name = "";
    int model_animation = 0;
    int frame_animation = 0;
    int max_frames = 0;
    boolean looping = false;
    int loop_to = 0;
    boolean playing_anim = false;
    float anim_speed = 0;
    float anim_delay_speed = 1;
    
    public void update_statement()
    {
        if(playing_anim == true)
        {
            anim_delay_speed -= anim_speed;

            if(anim_delay_speed <= 0)
            {
                frame_animation += 1;
                anim_delay_speed = 1;
            }

            if(looping == true)
            {
                if(frame_animation >= max_frames)
                {
                    frame_animation = loop_to;
                }
            }else
            {
                if(frame_animation >= max_frames)
                {
                    frame_animation = loop_to;
                }
            }
        }   
    }
    
}

class Chr_hitbox_index_list
{
    String type = "";
    boolean enabled_list = false;
    List<Chr_hitbox> chr_hitboxes_list = new ArrayList<>();
}

class Chr_hurtbox_index_list
{
    String type = "";
    boolean enabled_list = false;
    List<Chr_hitbox> chr_hurtboxes_list = new ArrayList<>();
}

class Chr_hitbox
{
    String type = "";
    boolean enabled = false;
    String shape_type = "";
    Vector3 bounding_shape_position = new Vector3(0,0,0);
    Vector3 bounding_shape_size = new Vector3(0,0,0);    
}

class Chr_hurtbox
{
    String type = "";
    boolean enabled = false;
    String shape_type = "";
    Vector3 bounding_shape_position = new Vector3(0,0,0);
    Vector3 bounding_shape_size = new Vector3(0,0,0);
}