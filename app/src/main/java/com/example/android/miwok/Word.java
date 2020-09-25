package com.example.android.miwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId ;

   

    public Word(String defaultTranslation, String miwokTranslation, int AudioResourceId ) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=AudioResourceId;

    }

    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId,int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId=AudioResourceId;
    }



    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return NO_IMAGE_PROVIDED != mImageResourceId;
    }
}
