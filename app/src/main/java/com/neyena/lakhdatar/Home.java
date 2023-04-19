package com.neyena.lakhdatar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    GridView gridView;

    String[] fruitNames = {" श्री गणेश आरती", "श्री श्याम आरती", "श्री कृष्णा आरती", "श्री हनुमान जी आरती", "आरती श्री लखदातार", "श्री श्याम स्तुति"};
    int[] fruitImages = {R.raw.ganpati, R.raw.baba1, R.raw.krishna, R.raw.hanuman, R.raw.baba2, R.raw.baba3 };
    int[] godaudio = {R.raw.ganesh, R.raw.aarti, R.raw.krishnamp, R.raw.hanumanamp, R.raw.lakhdatar, R.raw.stuti};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //finding listview
        gridView = findViewById(R.id.gridview);



        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),GridItemActivity.class);
                intent.putExtra("name",fruitNames[i]);
                intent.putExtra("image",fruitImages[i]);
                intent.putExtra("audio",godaudio[i]);
                intent.putExtra("lyrics", Lyrics.aarti_lyrics[i]);
                startActivity(intent);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return fruitImages.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.fruits);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(fruitNames[i]);
            image.setImageResource(fruitImages[i]);
            return view1;
        }
    }

}
