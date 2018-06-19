package com.youngtard.picassosaveinstance.model;

import android.widget.ImageView;

public class ImageViewModel {
    private ImageView mImage;

    public ImageViewModel(ImageView imageView) {
        setmImage(imageView);
    }

    public ImageView getmImage() {
        return mImage;
    }

    public void setmImage(ImageView newImage) {
        mImage = newImage;
    }
}
