package Componentes;

import java.awt.Color;
import java.util.Observable;
import java.util.Random;
import java.util.TimerTask;

public class Parpadeo extends Observable{

    public void Parpadeo ()
    {
        java.util.Timer timer = new java.util.Timer();
        timer.scheduleAtFixedRate(timerTask, 0, 100);
    }

    TimerTask timerTask = new TimerTask() {

        @Override
        public void run() {
            Color c = Color.BLACK;
            Random rnd = new Random();
            int x = rnd.nextInt(3) + 1;
            switch (x)
            {
                case 1 : c = Color.BLUE;break;
                case 2 : c = Color.RED;break;
                case 3 : c = Color.DARK_GRAY;break;
            }
        }
    };
}
