package com.example.miwoklang;

public class Word {
    private     String mdefaultTranslation,mMiwokTranslation;
    private int mImageResId=NO_IMAGE;
    private static final int NO_IMAGE=-1;
    private int mAudioResID=NO_SOUND;
    private static final int NO_SOUND=-1;


    public Word(String defaultTranslation,String MiwokTranslation,int audioResID){
        mdefaultTranslation=defaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mAudioResID=audioResID;
    }

    public Word(String defaultTranslation,String MiwokTranslation,int imageResId,int audioResID){
        mdefaultTranslation=defaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mImageResId=imageResId;
        mAudioResID=audioResID;
    }

    public Word(String defaultTranslation,String MiwokTranslation){
        mdefaultTranslation=defaultTranslation;
        mMiwokTranslation=MiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mdefaultTranslation;
    }

    public String getMiwokTrannslation(){
        return mMiwokTranslation;
    }

    public int getImageResId(){
        return mImageResId;
    }

    public int getAudioResID(){
        return mAudioResID;
    }


    public boolean hasImage(){
        return mImageResId!=NO_IMAGE;
    }

}
