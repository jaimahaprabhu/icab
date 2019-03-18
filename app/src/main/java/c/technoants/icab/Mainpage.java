package c.technoants.icab;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class Mainpage extends AppCompatActivity implements View.OnClickListener {
    ImageButton crop,fert,plants;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*String name=getIntent().getStringExtra("name");
        String loc=getIntent().getStringExtra("location");*/
        TextView text1=(TextView)findViewById(R.id.t1);
        TextView text2=(TextView)findViewById(R.id.t2);
        /*crop=findViewById(R.id.imageButton);
        fert=findViewById(R.id.imageButton2);
        plants=findViewById(R.id.imageButton3);*/
        /*crop.setOnClickListener(this);
        fert.setOnClickListener(this);
        plants.setOnClickListener(this);*/
        setContentView(R.layout.activity_mainpage);
        text1.setText("jai");
        text2.setText("jai");
           }

    @Override
    public void onClick(View view) {
        /*switch(view.getId()){
            case R.id.imageButton:
                Intent in=new Intent(Mainpage.this,Options.class);
                startActivity(in);
                break;
            case R.id.imageButton2:
                Intent in2=new Intent(Mainpage.this,FetlizerOptions.class);
                startActivity(in2);
                break;iyhi
            case R.id.imageButton3:
                Intent in3=new Intent(Mainpage.this,crops.class);
                startActivity(in3);
                break;
        }*/
    }
}