package Main;

import com.raylib.java.raymath.Vector3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Engine_particles_base {
    
    List<Engine_particle> particle_list = new ArrayList<>();
    int max_particles = 10;
    int particle_delay_creation = 1;
    int current_particle_delay_creation = 0;
    Vector3 particle_base_position = new Vector3(0,0,0);
    Random r = new Random();
            
    
    public void particles_update()
    {
        
        current_particle_delay_creation -= 1;
        
        
        if (current_particle_delay_creation < 0 && particle_list.size() <= max_particles)
        {
            current_particle_delay_creation = particle_delay_creation;
            
            Engine_particle new_ep = new Engine_particle();
            new_ep.particle_gravity_force = 0.01f;
            
            float a = (float) ((Math.random() * 1) - 0.5)/10;
            //System.out.println(a);
            new_ep.particle_speed = new Vector3(a,a,a);
            new_ep.particle_lifetime = 100;
            Vector3 particle_new_position = new Vector3(0,0,0);
            
            particle_new_position.x = particle_base_position.x;
            particle_new_position.y = particle_base_position.y;
            particle_new_position.z = particle_base_position.z;
            
            new_ep.particle_position = particle_new_position;
            particle_list.add(new_ep);
        }
        
        if (!particle_list.isEmpty())
        {
            for(Engine_particle ep : particle_list)
            {
                ep.particle_update();
                
            }
        }
        
        for(Engine_particle ep : particle_list)
            {
                if (ep.particle_lifetime <= 1)
                {
                    particle_list.remove(ep);
                    //ep = null;
                    break;
                    
                }
            }
    
    }
    
}
