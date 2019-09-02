package com.example.mahe.xoloo;

import android.content.Intent;
import android.media.Image;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

public class musiclist extends AppCompatActivity {
    int[] IMAGES = {R.drawable.ppph,R.drawable.barelityki,R.drawable.airliftt,R.drawable.ssyt,R.drawable.kabir,R.drawable.kknath,R.drawable.royy};
    String[] song={"Kyun Main Jaagon","Nazm Nazm","Soch Na Sake","Paniyon Sa","Bekhayali","Qaafirana","Sooraj Dooba Hai"};
    String[] artist={"Shafqat Amanat [Patiala House]","Arko [Bareilly Ki Barfi","Arjit Singh,Amaal Malik [Airlift]","Atif Aslam [Satyameva Jayate]","Arjit Singh [Kabir Singh]","Arjit Singh, Nikhita Gandhi [Kedarnath]","Amaal Malik, Arjit Singh [Roy]"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musiclist);
        ListView listView=(ListView)findViewById(R.id.listView);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {
                    Intent intent= new Intent(musiclist.this,songplay.class);
                    startActivity(intent);
                }
                if (i==1)
                {
                    Intent intent= new Intent(musiclist.this,songplay2.class);
                    startActivity(intent);
                }
                if (i==2)
                {
                    Intent intent= new Intent(musiclist.this,songplay3.class);
                    startActivity(intent);
                }
                if (i==3)
                {
                    Intent intent= new Intent(musiclist.this,songplay4.class);
                    startActivity(intent);
                }
                if (i==4)
                {
                    Intent intent= new Intent(musiclist.this,songplay5.class);
                    startActivity(intent);
                }
                if (i==5)
                {
                    Intent intent= new Intent(musiclist.this,songplay6.class);
                    startActivity(intent);
                }
                if (i==6)
                {
                    Intent intent= new Intent(musiclist.this,songplay7.class);
                    startActivity(intent);
                }
            }
        });
}
    class CustomAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return IMAGES.length;

        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.listrow_item,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView textView4=(TextView)view.findViewById(R.id.textView4);
            TextView textView5=(TextView)view.findViewById(R.id.textView5);
            imageView.setImageResource(IMAGES[i]);
            textView4.setText(song[i]);
            textView5.setText(artist[i]);
            return view;
        }
    }
}

