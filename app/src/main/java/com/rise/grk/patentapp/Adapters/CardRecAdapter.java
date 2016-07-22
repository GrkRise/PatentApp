package com.rise.grk.patentapp.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rise.grk.patentapp.Entities.PatentInfo;
import com.rise.grk.patentapp.R;

import java.util.List;

/**
 * Created by GrK_Rise on 12.01.2016.
 */
public class CardRecAdapter extends RecyclerView.Adapter<CardRecAdapter.CardViewHolder> {

    private List<PatentInfo> patentInfoList;

    public CardRecAdapter(List<PatentInfo> patentInfoList) {
        this.patentInfoList = patentInfoList;
    }



    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.patent_card, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        PatentInfo patentInfo = patentInfoList.get(position);
        holder.imageView.setImageResource(R.mipmap.ic_launcher);
        holder.textView_title.setText(patentInfo.getTitlePrefix() + " // #" + patentInfo.getNumber());
        holder.textView_preview.setText(patentInfo.getPreview());

    }

    @Override
    public int getItemCount() {
        return patentInfoList.size();
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder{
        protected ImageView imageView;
        protected TextView textView_title;
        protected TextView textView_preview;


        public CardViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.img);
            textView_title = (TextView) itemView.findViewById(R.id.card_title);
            textView_preview = (TextView) itemView.findViewById(R.id.preview);

        }
    }
}
