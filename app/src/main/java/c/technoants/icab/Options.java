package c.technoants.icab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.net.*;
import java.util.List;
import c.technoants.icab.Example;
import android.util.Log;
import com.cloudant.client.api.*;

public class Options extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        // Create a new CloudantClient instance for account endpoint example.cloudant.com
       /* CloudantClient client = ClientBuilder.account("https://ac8c54e7-f8c5-44a2-aae0-572dbdca8ebb-bluemix.cloudantnosqldb.appdomain.cloud")
                .username("ac8c54e7-f8c5-44a2-aae0-572dbdca8ebb-bluemix")
                .build();



        // Get a List of all the databases this Cloudant account
        List<String> databases = client.getAllDbs();
        Database db = client.database("farm", false);

        // Get an ExampleDocument out of the database and deserialize the JSON into a Java type
        Example doc = db.find(Example.class,"farm1");
        Log.i("doc","jai");
    */
    }

}
