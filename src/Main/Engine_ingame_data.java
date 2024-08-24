package Main;

import Obj_engine.Engine_character;
import Obj_engine.Engine_stage;
import java.util.ArrayList;
import java.util.List;

public class Engine_ingame_data{
    
    
    String ingame_gamemode = "";
    int freeze_ingame_delay = 0;
    boolean is_pause = false;
    Engine_stage current_stage;
    List<Engine_character> chr_list = new ArrayList<>();
    
    public void ingame_data_input()
    {
        for(Engine_character chr : chr_list)
        {
            chr.input_character();
        }
    }
    
    public void update_ingame_data()
    {
        
    }
    
    public void render_ingame_data()
    {
        
    }
            
    
}
