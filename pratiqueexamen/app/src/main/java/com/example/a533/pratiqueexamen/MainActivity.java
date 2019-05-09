package com.example.a533.pratiqueexamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    JobOfferModel jobOfferModel;
    RecyclerView recyclerViewItem ;
    List<JobOfferModel> jobOfferModelList;

    Button btnMovetoNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewItem = findViewById(R.id.RecyclerViewJob);
        btnMovetoNext = findViewById(R.id.button_toDialog);

        jobOfferModelList = new ArrayList<>();


        InsertDataIntoRecyclerView();

        setListener();

       final RecyclerView.Adapter data = new RecyclerViewItem(jobOfferModelList, new onDeleteItem() {
           @Override
           public void deleteItem(int positionToRemove) {
               jobOfferModelList.remove(positionToRemove) ;
               recyclerViewItem.getAdapter().notifyDataSetChanged();
           }
       });

       recyclerViewItem.setAdapter(data);

       recyclerViewItem.setHasFixedSize(true);
       LinearLayoutManager layoutManager = new LinearLayoutManager(this);
       recyclerViewItem.setLayoutManager(layoutManager);
    }

    private void InsertDataIntoRecyclerView()
    {

        jobOfferModelList.add(new JobOfferModel("Cuisinier","Faire à manger",26.1f));
        jobOfferModelList.add(new JobOfferModel("Concièrge","Laver le plancher",6.1f));
        jobOfferModelList.add(new JobOfferModel("Roi","Donner des ordres",2600.1f));

    }

    public interface onDeleteItem
    {
        void deleteItem(int positionToRemove);
    }

    public void setListener(){

        btnMovetoNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoveToActivity2();
            }
        });


    }

    public void MoveToActivity2(){
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }


}
