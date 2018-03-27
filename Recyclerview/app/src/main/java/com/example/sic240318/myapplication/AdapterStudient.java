package com.example.sic240318.myapplication;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by SIC240318 on 3/24/2018.
 */

public class AdapterStudient extends RecyclerView.Adapter<AdapterStudient.ViewHolder> {
    List<Student> list;

    public AdapterStudient(List<Student> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.edtName.setText(list.get(position).getName());
        holder.imgAvata.setImageResource(list.get(position).getImgAvata());
        holder.txtNumberSize.setText(list.get(position).getNumberSize()+"");
        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               list.remove(position);
             notifyDataSetChanged();

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAvata;
        EditText edtName;
        TextView txtNumberSize;
        Button btnGetData;
        Button btnDelete;

        public ViewHolder(View itemView) {
            super(itemView);
            txtNumberSize=itemView.findViewById(R.id.txt_number_size);
            imgAvata = itemView.findViewById(R.id.img_avata);
            btnDelete = itemView.findViewById(R.id.btn_delete);
            btnGetData = itemView.findViewById(R.id.btn_get_data);
            edtName = itemView.findViewById(R.id.edtName);
        }
    }
}
