package androidsqlite.com.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView=(ListView)findViewById(R.id.list_view_xml);

        String[]pname={"Windos","Mac","Samsung","Apple","Iphone","SYMPHONEY",
                "Windos","Mac","Samsung","Apple","Iphone","SYMPHONEY"};

        int[] pimg={

                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,

                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f


        };

        MyCustomAdapter adapter =new MyCustomAdapter(this,pname,pimg);

        listView.setAdapter(adapter);


    }
}
