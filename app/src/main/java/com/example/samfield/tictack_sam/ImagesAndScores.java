package com.example.samfield.tictack_sam;

import android.widget.ImageView;

/**
 * Created by Samfield on 4/14/2018.
 */



class ImagesAndScores {
    int score;
    ImageView im;
    String name;
    String TAG="ImagesANDScores";
    ImagesAndScores(int score, ImageView im, String name) {
        this.score = score;
//        Log.d(TAG,"Score: "+score+"Box : "+name);
        this.im = im;
        this.name=name;
    }
}
