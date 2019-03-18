package c.technoants.icab;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.Map;

import javax.annotation.Nullable;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    TextInputEditText T;
    String name, loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        T = findViewById(R.id.textInputEditText);
        b1.setOnClickListener(this);
        /*String val=T.toString();
        if(val.length()<10){
            Toast.makeText(getBaseContext(),"Test",Toast.LENGTH_LONG).show();
        }

        // Write a message to the database
     //   FirebaseDatabase database = FirebaseDatabase.getInstance();
       // DatabaseReference myRef = database.getReference("message");
        final FirebaseFirestore db = FirebaseFirestore.getInstance();
        //For Firestore offline next 4 lines
        FirebaseFirestoreSettings settings = new FirebaseFirestoreSettings.Builder()
                .setPersistenceEnabled(true)
                .build();
        db.setFirestoreSettings(settings);

        // final DocumentReference docRef = db.collection("location").document("loc1");
        //ListenerRegistration listenerRegistration = docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
        db.collection("crops")//livetrackingdatabase
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                                           @Override
                                           public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                               if (task.isSuccessful()) {
                                                   for (QueryDocumentSnapshot document : task.getResult()) {
                                                       DocumentReference docRef = db.collection("crops").document(document.getId());
                                                       docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
                                                           @Override


                                                           @RequiresApi(api = Build.VERSION_CODES.N)
                                                           public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {

                                                               if (e != null) {

                                                                   return;
                                                               }
                                                               if (documentSnapshot != null && documentSnapshot.exists()) {
                                                                   Map<String, Object> m2;
                                                                   m2 = documentSnapshot.getData();
                                                                   assert m2 != null;
                                                                   Object latitude = m2.get("name");
                                            name =latitude.toString();
                                                                   Object longitude = m2.get("location");
                                             loc=longitude.toString();
                                                                System.out.print(latitude + " this " +longitude);
                                                               }
                                                           }
                                                       });
                                                   }
                                               }
                                           }
                    });*/
                    }

    @Override
    public void onClick(View view) {
        Intent in = new Intent(MainActivity.this, Mainpage.class);
                    /*in.putExtra("name",name);
                    in.putExtra("location",loc);*/
        startActivity(in);
    }
}


