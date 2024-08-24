/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import static Main.Engine.rlj;
import com.raylib.java.models.Material;
import com.raylib.java.models.Model;
import com.raylib.java.models.ModelAnimation;
import com.raylib.java.raymath.Quaternion;
import com.raylib.java.raymath.Vector3;
import com.raylib.java.shapes.Rectangle;
import com.raylib.java.textures.Image;
import com.raylib.java.textures.Texture2D;
import com.raylib.java.textures.rTextures;
import java.util.ArrayList;
import java.util.List;

public class Engine_characters {
    
    Vector3 character_position = new Vector3(0,0,0);
    Vector3 character_scale = new Vector3(0,0,0);
    Quaternion character_rotation = new Quaternion();
    
    Model mdl2 = rlj.models.LoadModel("src/nivres_the_sheep.iqm");
    Image img2 = rlj.textures.LoadImage("src/nivres_texture.png");
    Texture2D tex;
    float model_frame;
    Material mtl = rlj.models.LoadMaterialDefault();    
    ModelAnimation[] anim;
    boolean playing = false;
    boolean visible = true;
    
    public Engine_characters()
    {
        tex = rlj.textures.LoadTextureFromImage(img2);
        mtl.maps[0].texture = tex;
        mdl2.materials[0] = mtl;
        anim = rlj.models.LoadModelAnimations("src/nivres_the_sheep.iqm");      
    }
    
    public void input_character()
    {
        
    }
    
    public void update_character()
    {
        
    }
    
    public void render_character()
    {
        
    }
       
}
