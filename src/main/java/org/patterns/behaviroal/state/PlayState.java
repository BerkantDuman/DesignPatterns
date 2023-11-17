package org.patterns.behaviroal.state;

public class PlayState implements State{
    @Override
    public void pause(MediaPlayer player) {
        player.setState(new PauseState());
        player.setIcon("play button");
        System.out.println("Video paused icon: " + player.getIcon());
    }

    @Override
    public void play(MediaPlayer player) {

    }
}
