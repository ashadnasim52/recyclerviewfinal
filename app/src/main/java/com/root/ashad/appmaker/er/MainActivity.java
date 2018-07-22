package com.root.ashad.appmaker.er;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;
    ArrayList<String> animalNames;
    RecyclerView recyclerView;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    DatabaseReference user=myRef.child("Users");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animalNames = new ArrayList<>();
        // data to populate the RecyclerView with


        recyclerView = findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goaadt");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goadat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goadat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goaassdt");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goat");
        animalNames.add("Goassdat");
        animalNames.add("Goaassdt");
        animalNames.add("Goat");
        animalNames.add("Goasdat");
        animalNames.add("Gadoat");
        animalNames.add("Goat");
        animalNames.add("Goaadadaaadt");
        animalNames.add("Godadadat");
        animalNames.add("Gosadaat");
        animalNames.add("Goaasdt");
        animalNames.add("Goaat");
        animalNames.add("Goaasdat");

        ValueEventListener valueEventListener=new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for(DataSnapshot ds : dataSnapshot.getChildren()) {
                    Log.i("TSG","is "+ds);

                    String altro = ds.child("key").getValue(String.class);
                    String cognome = ds.child("value").getValue(String.class);
                    String informazioni = ds.child("Informazioni").getValue(String.class);
                    String nome = ds.child("Nome").getValue(String.class);
                    animalNames.add(altro);
                    animalNames.add(cognome);
                    animalNames.add(informazioni);
                    Log.d("TAG", altro + " / " + cognome + " / " + informazioni + " / " + nome);
                }
                adapter = new MyRecyclerViewAdapter(getApplicationContext(), animalNames);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        user.addListenerForSingleValueEvent(valueEventListener);


        // set up the RecyclerView



//        recyclerView.addItemDecoration(
//                new DividerItemDecoration(getApplicationContext(), R.drawable.my_divider));
//        recyclerView.addItemDecoration(new DividerItemDecoration(getAct,R.drawable.my_divider));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
            DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);



    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}
