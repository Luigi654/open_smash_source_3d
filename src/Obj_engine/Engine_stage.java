package Obj_engine;

import com.raylib.java.models.Model;
import com.raylib.java.raymath.Quaternion;
import com.raylib.java.raymath.Vector3;
import com.raylib.java.textures.Image;
import com.raylib.java.textures.Texture2D;
import java.util.ArrayList;
import java.util.List;

public class Engine_stage {
    Vector3 stage_position = new Vector3();
    Vector3 stage_scale = new Vector3(1,1,1);
    Quaternion stage_rotation = new Quaternion();
    
    List<Model> stage_models = new ArrayList<>();
    List<Image> stage_images = new ArrayList<>();
    List<Texture2D> stage_textures = new ArrayList<>();
    
    
    public void update_stage()
    {
        
    }
    
    public void render_stage()
    {
        
    }
}
