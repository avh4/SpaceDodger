package org.wintrisstech;

import java.awt.Color;

class RedAlien extends Alien {

    public RedAlien() {
        x = r.nextInt(SpaceDodger.windowWidth);
        y = r.nextInt(SpaceDodger.windowHeight) - SpaceDodger.windowHeight;
        color = Color.RED;
    }

    @Override
    public void update(Ship ship) {
        y += 10;
        if (y > SpaceDodger.windowHeight) {
            visible = false;
        }
    }

    
}
