package com.example.test0509.Adapter;

/**
 * date：2021/5/9 on 11:40
 * author: 老鬼
 * e-mail: 3625988453@qq.com
 * description:
 */
public class ThirdInfo {
    private int imageId;

    public ThirdInfo(int imageId,String iconId){
        this.imageId=imageId;
        this.iconId=iconId;

    }
    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getIconId() {
        return iconId;
    }

    public void setIconId(String iconId) {
        this.iconId = iconId;
    }

    private String iconId;

}
