package org.wintrisstech;

import java.awt.Color;

class GreenAlien extends Alien {
    
    private int t = 0;
    private int startingX;
    private int startingY;

    public GreenAlien() {
        color = Color.green;
        x = startingX = r.nextInt(SpaceDodger.windowWidth) - SpaceDodger.windowWidth;
        y = startingY = r.nextInt(SpaceDodger.windowHeight);
        w = r.nextInt(20) + 20;
        t = r.nextInt(20);

    }

    @Override
    public void update(Ship ship) {
        t++;
        x = startingX + 5*t;
        y = (int) (startingY + 40*Math.sin(Math.toRadians(15*t)));
        if (x > SpaceDodger.windowWidth) {
            visible = false;
        }
    }
    
    
}
