package com.ihaandjoe68gmail.recycle_card_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ReyclerViewHolder extends RecyclerView.ViewHolder {

    // ViewHolder akan mendeskripisikan item view yang ditempatkan di dalam RecyclerView.
    TextView tv1,tv2; //deklarasi textview
    ImageView imageView;  //deklarasi imageview


    public ReyclerViewHolder(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.judul);
        //menampilkan text dari widget CardView pada id judul
        tv2= (TextView) itemView.findViewById(R.id.deskripsi);
        //menampilkan text deskripsi dari widget CardView pada id deskripsi
        imageView= (ImageView) itemView.findViewById(R.id.icon);
        //menampilkan gambar atau icon pada widget Cardview pada id icon
    }
}
