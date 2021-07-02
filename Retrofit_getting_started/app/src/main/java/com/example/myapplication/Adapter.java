package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

public class Adapter extends ArrayAdapter<Images> {

    private List<Images> images = new ArrayList<>();

    public Adapter(Context context, int imageViewResourceId, List<Images> image) {
        super(context, imageViewResourceId, image);
        images = image;
    }

    private LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    public View getView(final int position, final View view, @NonNull ViewGroup parent) {
        final View rowViews;

        rowViews = inflater.inflate(R.layout.list_images, null);

        ImageView imageView = (ImageView) rowViews.findViewById(R.id.imageView);
        ImageView imageView2 = (ImageView) rowViews.findViewById(R.id.imageView2);

        try {
            if(position%2==0){
                Picasso.get()
                        .load("https://image.tmdb.org/t/p/w500" + images.get(position).getPoster_path())
                        .into(imageView);
                Picasso.get()
                        .load("https://image.tmdb.org/t/p/w500" + images.get(position+1).getPoster_path())
                        .into(imageView2);
            }else{

            }

        } catch (Exception ignored) {

        }

        return rowViews;
    }
}