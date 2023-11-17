package org.patterns.behaviroal.state;

public class PauseState implements State{

    @Override
    public void pause(MediaPlayer player) {

    }

    @Override
    public void play(MediaPlayer player) {
        player.setState(new PlayState());
        player.setIcon("pause button");
        System.out.println("Video playing icon: " + player.getIcon());

    }
}
