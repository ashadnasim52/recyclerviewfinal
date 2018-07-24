package com.root.ashad.appmaker.er;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;
    ArrayList<String> extraarray;
    ArrayList<String> titlearray;
    ArrayList<String> complainarray;
    ArrayList<String> namearray;
    ArrayList<String> emailarray;

    RecyclerView recyclerView;

    String title;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    DatabaseReference user=myRef.child("Users");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        extraarray = new ArrayList<>();
        // data to populate the RecyclerView with


        recyclerView = findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));






//        user.addChildEventListener(new ChildEventListener() {
//            @Override
//            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
//                String value=dataSnapshot.getValue().toString();
////                animalNames.add(dataSnapshot.toString());
//                Gson gson = new Gson();
//                String s1 = gson.toJson(dataSnapshot.getValue());
//                try {
//                    JSONObject jsonObject=new JSONObject(value);
//
//                    title=jsonObject.getString("Name");
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//                Log.i("titsdfsdfle","iss "+title);
//
//                animalNames.add(title);
//
//                adapter = new MyRecyclerViewAdapter(getApplicationContext(), animalNames);
//                recyclerView.setAdapter(adapter);
//                adapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
//
//            }
//
//            @Override
//            public void onChildRemoved(DataSnapshot dataSnapshot) {
//
//            }
//
//            @Override
//            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
//
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });animalNames
//
//
//
//









        ChildEventListener childEventListener=new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

//                animalNames.add(dataSnapshot.toString());
                Log.i("datasnapshot","is"+dataSnapshot);

                    Log.i("datasnapshotatonepsio","is "+dataSnapshot);



                    Itemclass itemclass=dataSnapshot.getValue(Itemclass.class);
                    String extra=itemclass.getextra();
                    String name=itemclass.getName();
                    String complaian=itemclass.getComplain();
                    String title=itemclass.getcomplaintitle();
                    String email=itemclass.getEmail();


                extraarray.add(extra);
                complainarray.add(complaian);
                emailarray.add(email);
                namearray.add(name);
                titlearray.add(title);

//                    arraylistofitem.add(itemclass);


//                    String altro = ds.child("Name").getValue(String.class);
//                    String asd=ds.getChildren().toString();
//
//                    Log.i("childrenis","is"+asd);
//                    String as= ds.getKey();
//                    Log.i("dsskeyis","is"+as);
//                    Boolean a=ds.hasChild("LIBg7gn1S0126t1ONnJ");
//                    Log.i("haikinahi"," is" +a);
//
//                    HashMap<String ,String > uid= new HashMap<>();
//                    uid.put("Uid",altro);
//                    Log.i("dataofuid","is of"+uid);
//                    String cognome = ds.child("value").getValue(String.class);
//                    String informazioni = ds.child("Informazioni").getValue(String.class);
//                    String nome = ds.child("Nome").getValue(String.class);
//                    animalNames.add(altro);
//                    animalNames.add(cognome);
//                    animalNames.add(informazioni);
//                    Log.d("TAG", altro + " / " + cognome + " / " + informazioni + " / " + nome);

                adapter = new MyRecyclerViewAdapter(getApplicationContext(), titlearray);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        user.addChildEventListener(childEventListener);

//        ValueEventListener valueEventListener=new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                String value=dataSnapshot.getChildren().toString();
//                Log.i("atag","is "+dataSnapshot);
//
//                try {
//                    JSONObject jsonObject=new JSONObject(value);
//                    title= jsonObject.getString("UId");
//
//                    Log.i("TSsG","is "+title);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
        //                    animalNames.add(title);

////
////                for(DataSnapshot ds : dataSnapshot.getChildren()) {
////                    Log.i("TSG","is "+ds);
////
////                    String altro = ds.child("UId").getValue(String.class);
////                    String cognome = ds.child("value").getValue(String.class);
////                    String informazioni = ds.child("Informazioni").getValue(String.class);
////                    String nome = ds.child("Nome").getValue(String.class);
////                    animalNames.add(altro);
////                    animalNames.add(cognome);
////                    animalNames.add(informazioni);
////                    Log.d("TAG", altro + " / " + cognome + " / " + informazioni + " / " + nome);
////                }
//                adapter = new MyRecyclerViewAdapter(getApplicationContext(), animalNames);
//                recyclerView.setAdapter(adapter);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        };
//        user.addListenerForSingleValueEvent(valueEventListener);


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
//        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }



}
