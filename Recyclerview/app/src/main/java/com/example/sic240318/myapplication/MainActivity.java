package com.example.sic240318.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView recyclerView;
    private Button bnt;
    private List<Student> list;
    private AdapterStudient adpater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unit();
    }


    private void unit() {
        bnt = findViewById(R.id.btn_loading_data);
        bnt.setOnClickListener(this);
        recyclerView = findViewById(R.id.recyclerview);
        list = new ArrayList<>();
        addData();
        adpater = new AdapterStudient(list);
        recyclerView.setAdapter(adpater);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayout.VERTICAL, false);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
//        DefaultItemAnimator animator = new DefaultItemAnimator();
//        animator.setAddDuration(1000);
//        recyclerView.setItemAnimator(animator);
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setLayoutManager(layoutManager);

    }

    private void addData() {
        int k = 0;
        for (int i = 0; i < 5; i++) {
            list.add(new Student(R.drawable.a, k++, ""));
            list.add(new Student(R.drawable.b, k++, ""));
            list.add(new Student(R.drawable.c, k++, ""));
            list.add(new Student(R.drawable.e, k++, ""));
            list.add(new Student(R.drawable.f, k++, ""));
            list.add(new Student(R.drawable.g, k++, ""));
        }

    }

    @Override
    public void onClick(View view) {
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            AdapterStudient.ViewHolder abc = (AdapterStudient.ViewHolder) recyclerView.findViewHolderForAdapterPosition(i);
            Toast.makeText(this, "ten la: " + abc.edtName.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
