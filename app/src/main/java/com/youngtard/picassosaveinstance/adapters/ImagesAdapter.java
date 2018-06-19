package com.youngtard.picassosaveinstance.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import com.youngtard.picassosaveinstance.MainActivity;
import com.youngtard.picassosaveinstance.R;
import com.youngtard.picassosaveinstance.model.ImageViewModel;

import java.util.ArrayList;

public class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.ImagesViewHolder>{

    private int mNumberItems;
    private ArrayList images;

    public ImagesAdapter(int numberItems) {
        mNumberItems = numberItems;
        images = new ArrayList<Picasso>();
    }

    @NonNull
    @Override
    public ImagesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        Context context = viewGroup.getContext();
        int layoutForImagesItem = R.layout.images_item;
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutForImagesItem, viewGroup, false);
        ImagesViewHolder imagesViewHolder = new ImagesViewHolder(view);

        return imagesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ImagesViewHolder holder, int position) {
        holder.bind(position);

    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    class ImagesViewHolder extends RecyclerView.ViewHolder {
        ImageView mImage;

        public ImagesViewHolder(View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.iv_image);

        }

        void bind(int position) {
//            Picasso.get().load("https://source.unsplash.com/random").into(new Target() {
//                @Override
//                public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
//                    mImage.setImageBitmap(bitmap);
//                }
//
//                @Override
//                public void onBitmapFailed(Exception e, Drawable errorDrawable) {
//
//                }
//
//                @Override
//                public void onPrepareLoad(Drawable placeHolderDrawable) {
//
//                }
//
//                @Override
//                public int hashCode() {
//                    return super.hashCode();
//                }
//
//                @Override
//                public boolean equals(Object obj) {
//                    return super.equals(obj);
//                }
//            });
            String path = "https://source.unsplash.com/random/";
            Picasso.get().load(path + position)
                    .networkPolicy(NetworkPolicy.NO_CACHE)
                    .memoryPolicy(MemoryPolicy.NO_CACHE)
                    .into(mImage);
        }
    }
}
//            I CAN RESIZE IMAGE WITH PICASSO.resize or using layoutmanager methods
