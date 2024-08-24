package Main;

import com.raylib.java.raymath.Vector3;

public class Engine_particle {
    
    Vector3 particle_position = new Vector3(0,0,0);
    float particle_gravity;
    float particle_gravity_force;
    float particle_max_gravity_force;
    Vector3 particle_speed = new Vector3(0,0,0);
    int particle_lifetime;
    
    public void particle_update()
    {
        particle_position.x += particle_speed.x;
        particle_position.y += particle_speed.y;
        particle_position.z += particle_speed.z;
        
        particle_position.y -= particle_gravity;
        particle_gravity += particle_gravity_force;
        
        particle_lifetime -= 1;
    }
    
}
