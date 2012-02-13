package org.wintrisstech;

import java.awt.Color;

class BlackAlien extends Alien {

    private int t = 500;

    public BlackAlien() {
        color = Color.black;
        x = r.nextInt(SpaceDodger.windowWidth);
        y = r.nextInt(SpaceDodger.windowHeight);
        if (r.nextBoolean()) {
            y = r.nextBoolean() ? 0 : SpaceDodger.windowHeight;
        } else {
            x = r.nextBoolean() ? 0 : SpaceDodger.windowWidth;
        }
    }

    @Override
    public void update(Ship ship) {
        t--;
        h = w = t / 10;
        if (x < ship.x) {
            x += 2;
        } else {
            x -= 2;
        }
        if (y < ship.y) {
            y += 2;
        } else {
            y -= 2;
        }
        if (w <= 5) {
            visible = false;
        }
    }
}
