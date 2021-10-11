package com.moringaschool.nyaranga_social_app1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class Adaptery extends BaseAdapter {
    private Context mContext;

    public Adaptery(Context c){
        mContext =c;
    }

    @Override
    public int getCount(){
        return mThumbsIds.length;
    }
    public Object getItem(int position){
        return  null;
    }
    public long getItemId(int position){
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView;

        if(convertView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(200,200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }else{
            imageView = (ImageView )convertView;
        }
        imageView.setImageResource(mThumbsIds[position]);
        return imageView;
    }

    public Integer[] mThumbsIds ={
            R.drawable.cooking,
            R.drawable.racing,
            R.drawable.social,
            R.drawable.sports,
            R.drawable.social,
            R.drawable.party,
            R.drawable.footer,
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.footer
,
    };
}
