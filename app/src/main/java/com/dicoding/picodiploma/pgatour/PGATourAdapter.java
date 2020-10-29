package com.dicoding.picodiploma.pgatour;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class PGATourAdapter extends RecyclerView.Adapter<PGATourAdapter.ListViewHolder> {
    private final ArrayList<PGATour> listPGA;
    public PGATourAdapter(ArrayList<PGATour> list) {
        this.listPGA = list;
    }
    private OnItemClickCall onItemClickCall;

    public void setOnItemClickCall(OnItemClickCall onItemClickCall) {
        this.onItemClickCall = onItemClickCall;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_pgatour, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int p) {
        PGATour pgaTour = listPGA.get(p);
        Glide.with(holder.itemView.getContext())
                .load(pgaTour.getPlayerimage())
                .apply(new RequestOptions().override(80,80))
                .into(holder.playerimage);
        holder.playername.setText(pgaTour.getPlayername());
        holder.location.setText(pgaTour.getLocation());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCall.onItemClick(listPGA.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPGA.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        final CircleImageView playerimage;
        final TextView playername;
        final TextView location;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            playerimage = itemView.findViewById(R.id.playerimg);
            playername = itemView.findViewById(R.id.tv_item_playername);
            location = itemView.findViewById(R.id.tv_item_location);
        }
    }
    public interface OnItemClickCall {
        void onItemClick(PGATour pgaTourData);
    }
}
