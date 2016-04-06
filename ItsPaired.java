package com.allyourcode.p01_06_01;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class ItsPaired extends Activity {

    public String PP1;
    public String PP2;
    public String GP1;
    public int paired1;
    public int paired2;
    public int paired3;
    ImageView Image1;
    ImageView Image2;
    ImageView Image3;
    EditText PairedText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_its_paired);
        Toast.makeText(getApplicationContext(), Test.getInstance().getPerfectPair(), Toast.LENGTH_SHORT).show();
        Image1=(ImageView) findViewById(R.id.image1View);
        Image2=(ImageView) findViewById(R.id.image2View);
        Image3=(ImageView) findViewById(R.id.imageView3);
        PairedText=(EditText) findViewById(R.id.PairedText);
        PP1 = Test.getInstance().getPerfectPair();
        PP2 = Test.getInstance().getPerfectPair2();
        GP1 = Test.getInstance().getGoodPair1();
        //PairedText.setText(PP1.toString());
        paired1 = getResources().getIdentifier("com.allyourcode.p01_06_01:drawable/" + PP1, null, null);
        paired2 = getResources().getIdentifier("com.allyourcode.p01_06_01:drawable/" + PP2, null, null);
        paired3 = getResources().getIdentifier("com.allyourcode.p01_06_01:drawable/" + GP1, null, null);
        Image1.setImageResource(paired1);
        Image2.setImageResource(paired2);
        Image3.setImageResource(paired3);
    }

    public void onDestroy(){
        super.onDestroy();
        Image1.setImageDrawable(null);
        Image2.setImageDrawable(null);
        Image3.setImageDrawable(null);

    }
}
