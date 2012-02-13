package org.wintrisstech;

import java.awt.Color;

class BlueAlien extends Alien {

    public BlueAlien() {
        color = Color.blue;
        x = r.nextInt(SpaceDodger.windowWidth);
        y = r.nextInt(SpaceDodger.windowHeight) - SpaceDodger.windowHeight;
    }

    @Override
    public void update(Ship ship) {
        x += r.nextInt(30) - 15;
        y += r.nextInt(25) - 5;
        if (y > SpaceDodger.windowHeight) {
            visible = false;
        }
    }
    
    
    
}
