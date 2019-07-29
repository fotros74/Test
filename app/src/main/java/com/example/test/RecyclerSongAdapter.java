package com.example.test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mikhaellopez.hfrecyclerview.HFRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class RecyclerSongAdapter extends HFRecyclerView<SongList> {

    private  List<SongList> mlist = new ArrayList<>();


    public RecyclerSongAdapter(List<SongList> data, boolean withHeader, boolean withFooter) {
        super(data, withHeader, withFooter);
        mlist = data;
    }

    @Override
    protected RecyclerView.ViewHolder getItemView(LayoutInflater inflater, ViewGroup parent) {
        return new ItemViewHolder(inflater.inflate(R.layout.cards,parent,false)) ;
    }

    @Override
    protected RecyclerView.ViewHolder getHeaderView(LayoutInflater inflater, ViewGroup parent) {
        return new HeaderViewHolder(inflater.inflate(R.layout.header,parent,false));
    }

    @Override
    protected RecyclerView.ViewHolder getFooterView(LayoutInflater inflater, ViewGroup parent) {
        return new FooterViewHolder(inflater.inflate(R.layout.footer,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ItemViewHolder) {
            ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
            itemViewHolder.bind(getItem(position));
        } else if (holder instanceof HeaderViewHolder) {

        } else if (holder instanceof FooterViewHolder) {

        }
    }

    public class VH extends RecyclerView.ViewHolder {

        public VH(@NonNull View itemView) {
            super(itemView);

        }
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.image)
        ImageView image;
        @BindView(R.id.songsName)
        TextView songsName;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
        void bind(SongList item) {

            songsName.setText(item.getTitle());

            Glide.with(this.itemView)
                    .load(item.getPicHuge())
                    .into(image);

        }
    }

    private class HeaderViewHolder extends RecyclerView.ViewHolder {
        public HeaderViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    private class FooterViewHolder extends RecyclerView.ViewHolder {
        public FooterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
