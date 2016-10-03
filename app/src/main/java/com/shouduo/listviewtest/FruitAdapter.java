package com.shouduo.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 刘亨俊 on 2016/5/1.
 */
public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {   //此方法在每个子项被滚动到屏幕内的时候会被调用
        Fruit fruit = getItem(position);  //获取当前项Fruit实例
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            viewHolder.fruitName = (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);  //将ViewHolder存储在View中

        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();  //重新获取ViewHolder
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());

//        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);  //为子项加载传入的布局

//        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
//        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
//        fruitImage.setImageResource(fruit.getImageId());
//        fruitName.setText(fruit.getName());

        return view;
    }

    class ViewHolder {
        ImageView fruitImage;
        TextView fruitName;
    }
}
