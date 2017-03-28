package androidsqlite.com.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Yazdani on 1/23/2017.
 */

public class MyCustomAdapter extends BaseAdapter {

    String[] textname;
    int[] imagename;
    Context ct;

    private static LayoutInflater layoutInflater=null;

    public MyCustomAdapter(MainActivity mainact,String[] name,int[] img){

        textname=name;
        imagename=img;
        ct=mainact;

        layoutInflater=(LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return textname.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    public class Myholder{

        ImageView cusimg;
        TextView custext;

    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        Myholder myh=new Myholder();

        View myview=layoutInflater.inflate(R.layout.custom_list,null);

        myh.custext=(TextView)myview.findViewById(R.id.text_view_id);
        myh.cusimg=(ImageView)myview.findViewById(R.id.image_view_id);
        myh.custext.setText(textname[i]);
        myh.cusimg.setImageResource(imagename[i]);


        myview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (i){

                    case 0:
                        Toast.makeText(ct,"Clicked on ",Toast.LENGTH_SHORT).show();

                }

                //
            }
        });

        return myview;


    }
}
