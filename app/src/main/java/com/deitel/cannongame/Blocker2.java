package com.deitel.cannongame;

public class Blocker2 extends GameElement {
    private int missPenalty; // the miss penalty for this Blocker

    // constructor
    public Blocker2(CannonView view, int color, int missPenalty, int x,
                    int y, int width, int length, float velocityY) {
        super(view, color, CannonView.BLOCKER_SOUND_ID, x, y, width, length,
                velocityY);
        this.missPenalty = missPenalty;
    }

    // returns the miss penalty for this Blocker
    public int getMissPenalty() {
        return missPenalty;
    }
}
