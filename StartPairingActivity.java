package com.allyourcode.p01_06_01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class StartPairingActivity extends Activity implements OnItemSelectedListener {

//Creates four spinners

  Spinner wineorfood,wifo_cat1,wifo_cat2,wifo_cat3;


//These ints are going to hold our values
  int winefood;
  int winetype;
  int wineflav;
  int foodtype;
  int foodflav;
  Intent intent;
  int selectionsmade;
  ImageView imageView5;

//Test Box to see if certain events are happening when testing

  EditText test_box;



  ArrayAdapter<String> food_cat1,red_meats,white_meats,seafood,soft_cheese,
  pungent_cheese,hard_cheese,allums_greens,roots_squash,nightshades,funghi,nuts_beans,
  hot_spicy,herbs_spices,starches_grains,sweet_starchy,sweet_items,wine_cat1,bold_red,
  med_red,light_red,rose_red,rich_white,light_white,sparkling_white,sweet_white,dessert;
  String option_1,foodcat1_option,redmeats_option,whitemeats_option,seafood_option,softcheese_option,
  pungcheese_option,hardcheese_option,allgreens_option,rootssquash_option,night_option,
  funghi_option,nutbean_option,hotspicy_option,herbspice_option,starchgrain_option,
  sweetstarcth_option,sweet_option,winetop_option,boldred_option,medred_option,lightred_option,
  rosered_option,richwhite_option,lightwhite_option,sparklewhite_option,sweetwhite_option,
  dessert_option;

  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.start_prng_activity);
    wineorfood=(Spinner) findViewById(R.id.wineorfood);
    wifo_cat1=(Spinner) findViewById(R.id.wifo_cat1);
    wifo_cat2=(Spinner) findViewById(R.id.wifo_cat2);
    wifo_cat3=(Spinner) findViewById(R.id.wifo_cat3);
    test_box=(EditText) findViewById(R.id.test_box);
    imageView5=(ImageView) findViewById(R.id.imageView5);
    selectionsmade = 0;

    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.wine_food,
            android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    wineorfood.setAdapter(adapter);
    wineorfood.setOnItemSelectedListener(this);

  }

public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

    if (parent.getId() == wineorfood.getId() & pos == 2){

      ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.food_cat1,
              android.R.layout.simple_spinner_item);
      adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
      wifo_cat1.setAdapter(adapter1);
      wifo_cat1.setOnItemSelectedListener(this);
      winefood = pos;
      selectionsmade = 0;

    }

    if (parent.getId() == wineorfood.getId() & pos == 1){

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.wine_cat1,
                android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat1.setAdapter(adapter1);
        wifo_cat1.setOnItemSelectedListener(this);
        winefood = pos;
        selectionsmade = 0;


    }

    if (parent.getId() == wifo_cat1.getId() & pos == 1 & winefood == 1){

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource
                (this, R.array.red_wine_cat, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat2.setAdapter(adapter2);
        wifo_cat2.setOnItemSelectedListener(this);
        winetype = pos;
        wifo_cat3.setVisibility(View.VISIBLE);
        selectionsmade = 0;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 1 & winefood == 1 & winetype == 1){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.bold_red, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        wineflav = pos;
        wifo_cat3.setVisibility(View.VISIBLE);
        selectionsmade = 0;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 1 & winetype == 1 & wineflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("cheddar_cheese");
        Test.getInstance().setPerfectPair2("asiago");
        Test.getInstance().setGoodPair1("garlic");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 1 & winetype == 1 & wineflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("parmesan");
        Test.getInstance().setPerfectPair2("pecorino");
        Test.getInstance().setGoodPair1("scallion");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 1 & winetype == 1 & wineflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("manchego");
        Test.getInstance().setPerfectPair2("roquefort");
        Test.getInstance().setGoodPair1("tomato");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 4 & winefood == 1 & winetype == 1 & wineflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("beef");
        Test.getInstance().setPerfectPair2("venison");
        Test.getInstance().setGoodPair1("pork_chop");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 5 & winefood == 1 & winetype == 1 & wineflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("manchego");
        Test.getInstance().setPerfectPair2("venison");
        Test.getInstance().setGoodPair1("bacon");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 6 & winefood == 1 & winetype == 1 & wineflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("lamb");
        Test.getInstance().setPerfectPair2("beef");
        Test.getInstance().setGoodPair1("bresaola");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 2 & winefood == 1 & winetype == 1){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.med_red, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        wineflav = pos;
        wifo_cat3.setVisibility(View.VISIBLE);

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 1 & winetype == 1 & wineflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("pork_chop");
        Test.getInstance().setPerfectPair2("tenderloin");
        Test.getInstance().setGoodPair1("chicken");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 1 & winetype == 1 & wineflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("beef");
        Test.getInstance().setPerfectPair2("bleu_cheese");
        Test.getInstance().setGoodPair1("turkey");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 1 & winetype == 1 & wineflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("pork_chop");
        Test.getInstance().setPerfectPair2("garlic");
        Test.getInstance().setGoodPair1("cheddar_cheese");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 4 & winefood == 1 & winetype == 1 & wineflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("roquefort");
        Test.getInstance().setPerfectPair2("bleu_cheese");
        Test.getInstance().setGoodPair1("parmesan");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 5 & winefood == 1 & winetype == 1 & wineflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("beef");
        Test.getInstance().setPerfectPair2("pork_chop");
        Test.getInstance().setGoodPair1("duck");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 3 & winefood == 1 & winetype == 1){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.light_red, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        wineflav = pos;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 1 & winetype == 1 & wineflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("salami");
        Test.getInstance().setPerfectPair2("prosciutto");
        Test.getInstance().setGoodPair1("onion");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 1 & winetype == 1 & wineflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("bresaola");
        Test.getInstance().setPerfectPair2("bacon");
        Test.getInstance().setGoodPair1("shallot");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 1 & winetype == 1 & wineflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("brie");
        Test.getInstance().setPerfectPair2("mascarpone");
        Test.getInstance().setGoodPair1("garlic");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 4 & winefood == 1 & winetype == 1 & wineflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("creme_fraiche");
        Test.getInstance().setPerfectPair2("brie");
        Test.getInstance().setGoodPair1("scallion");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat1.getId() & pos == 2 & winefood == 1){

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource
                (this, R.array.white_wine_cat, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat2.setAdapter(adapter2);
        wifo_cat2.setOnItemSelectedListener(this);
        winetype = pos;
        wifo_cat3.setVisibility(View.VISIBLE);

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 1 & winefood == 1 & winetype == 2){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.rich_white, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        wineflav = pos;
        wifo_cat3.setVisibility(View.VISIBLE);

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 1 & winetype == 2 & wineflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("prawn");
        Test.getInstance().setPerfectPair2("crab");
        Test.getInstance().setGoodPair1("turkey");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 1 & winetype == 2 & wineflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("crab");
        Test.getInstance().setPerfectPair2("prawn");
        Test.getInstance().setGoodPair1("duck");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 1 & winetype == 2 & wineflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("crab");
        Test.getInstance().setPerfectPair2("mascarpone");
        Test.getInstance().setGoodPair1("duck");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 4 & winefood == 1 & winetype == 2 & wineflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("creme_fraiche");
        Test.getInstance().setPerfectPair2("brie");
        Test.getInstance().setGoodPair1("trout");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 5 & winefood == 1 & winetype == 2 & wineflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("prawn");
        Test.getInstance().setPerfectPair2("mascarpone");
        Test.getInstance().setGoodPair1("tuna");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 6 & winefood == 1 & winetype == 2 & wineflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("pasta");
        Test.getInstance().setPerfectPair2("bread");
        Test.getInstance().setGoodPair1("prawn");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 2 & winefood == 1 & winetype == 2){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.light_white, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        wineflav = pos;
        wifo_cat3.setVisibility(View.VISIBLE);

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 1 & winetype == 2 & wineflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);

        //Maybe?
        Test.getInstance().setPerfectPair("chickpea");

        //I made this up
        Test.getInstance().setPerfectPair2("bell_pep");
        Test.getInstance().setGoodPair1("almonds");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 1 & winetype == 2 & wineflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("pinto");
        Test.getInstance().setPerfectPair2("chickpea");
        Test.getInstance().setGoodPair1("peanuts");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 1 & winetype == 2 & wineflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("???");
        Test.getInstance().setPerfectPair2("???");
        Test.getInstance().setGoodPair1("sesame");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 4 & winefood == 1 & winetype == 2 & wineflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("???");
        Test.getInstance().setPerfectPair2("taro");
        Test.getInstance().setGoodPair1("peanuts");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 5 & winefood == 1 & winetype == 2 & wineflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("???");
        Test.getInstance().setPerfectPair2("???");
        Test.getInstance().setGoodPair1("asiago");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 3 & winefood == 1 & winetype == 2){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.sweet_white, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        wineflav = pos;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 1 & winetype == 2 & wineflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("quinoa");
        Test.getInstance().setPerfectPair2("swt_pot");
        Test.getInstance().setGoodPair1("bread");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 1 & winetype == 2 & wineflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("strawberry");
        Test.getInstance().setPerfectPair2("apple");
        Test.getInstance().setGoodPair1("pasta");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 1 & winetype == 2 & wineflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("rice");
        Test.getInstance().setPerfectPair2("yucca");
        Test.getInstance().setGoodPair1("ice_cream");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 4 & winefood == 1 & winetype == 2 & wineflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("swt_pot");
        Test.getInstance().setPerfectPair2("rice");
        Test.getInstance().setGoodPair1("crem_brule");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }


    if (parent.getId() == wifo_cat1.getId() & pos == 3 & winefood == 1){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.dessert,
                android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat2.setAdapter(adapter3);
        wifo_cat2.setOnItemSelectedListener(this);
        winetype = pos;
        wineflav = 4;
        wifo_cat3.setVisibility(View.GONE);
        imageView5.setVisibility(View.GONE);

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 1 & winefood == 1 & winetype == 3 & wineflav == 4){

        wifo_cat2.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("chocolate");
        Test.getInstance().setPerfectPair2("allspice");
        Test.getInstance().setGoodPair1("apple");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 2 & winefood == 1 & winetype == 3 & wineflav == 4){

        wifo_cat2.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("chocolate");
        Test.getInstance().setPerfectPair2("strawberry");
        Test.getInstance().setGoodPair1("cinnamon");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 3 & winefood == 1 & winetype == 3 & wineflav == 4){

        wifo_cat2.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("chocolate");
        Test.getInstance().setPerfectPair2("crem_brule");
        Test.getInstance().setGoodPair1("cinnamon");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat1.getId() & pos == 1 & winefood == 2){

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource
                (this, R.array.red_meats, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat2.setAdapter(adapter2);
        wifo_cat2.setOnItemSelectedListener(this);
        foodtype = pos;
        wifo_cat3.setVisibility(View.GONE);
        imageView5.setVisibility(View.GONE);


    }

    if (parent.getId() == wifo_cat2.getId() & pos == 1 & winefood == 2 & foodtype == 1){

        wifo_cat2.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("petite_sirah");
        Test.getInstance().setPerfectPair2("cab_sauv");
        Test.getInstance().setGoodPair1("merlot");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 2 & winefood == 2 & foodtype == 1){

        wifo_cat2.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("malbec");
        Test.getInstance().setPerfectPair2("syrah");
        Test.getInstance().setGoodPair1("sangiovese");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 3 & winefood == 2 & foodtype == 1){

        wifo_cat2.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("petite_sirah");
        Test.getInstance().setPerfectPair2("cab_sauv");
        Test.getInstance().setGoodPair1("zinfandel");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 4 & winefood == 2 & foodtype == 1){

        wifo_cat2.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("pinot_noir");
        Test.getInstance().setPerfectPair2("gamay");
        Test.getInstance().setGoodPair1("tempranillo");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 5 & winefood == 2 & foodtype == 1){

        wifo_cat2.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("gamay");
        Test.getInstance().setPerfectPair2("grenache");
        Test.getInstance().setGoodPair1("white_zin");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 6 & winefood == 2 & foodtype == 1){

        wifo_cat2.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("petite_sirah");
        Test.getInstance().setPerfectPair2("pinot_noir");
        Test.getInstance().setGoodPair1("white_zin");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 7 & winefood == 2 & foodtype == 1){

        wifo_cat2.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("cab_franc");
        Test.getInstance().setPerfectPair2("zinfandel");
        Test.getInstance().setGoodPair1("tempranillo");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 8 & winefood == 2 & foodtype == 1){

        wifo_cat2.setOnItemSelectedListener(this);
        Test.getInstance().setPerfectPair("merlot");
        Test.getInstance().setPerfectPair2("zinfandel");
        Test.getInstance().setGoodPair1("white_zin");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 9 & winefood == 2 & foodtype == 1){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("tempranillo");
        Test.getInstance().setPerfectPair2("zinfandel");
        Test.getInstance().setGoodPair1("petite_sirah");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat1.getId() & pos == 2 & winefood == 2){

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.white_meats,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat2.setAdapter(adapter2);
        wifo_cat2.setOnItemSelectedListener(this);
        foodtype = pos;
        wifo_cat3.setVisibility(View.GONE);
        imageView5.setVisibility(View.GONE);

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 1 & winefood == 2 & foodtype == 2){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("pinot_gris");
        Test.getInstance().setPerfectPair2("pinot_blanc");
        Test.getInstance().setGoodPair1("sangiovese");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 2 & winefood == 2 & foodtype == 2){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("sauv_blanc");
        Test.getInstance().setPerfectPair2("trebbiano");
        Test.getInstance().setGoodPair1("merlot");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 3 & winefood == 2 & foodtype == 2){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("pinot_gris");
        Test.getInstance().setPerfectPair2("sauv_blanc");
        Test.getInstance().setGoodPair1("cab_franc");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat1.getId() & pos == 3 & winefood == 2){

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.seafood,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat2.setAdapter(adapter2);
        wifo_cat2.setOnItemSelectedListener(this);
        foodtype = pos;
        wifo_cat3.setVisibility(View.GONE);
        imageView5.setVisibility(View.GONE);

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 1 & winefood == 2 & foodtype == 3){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("chardonnay");
        Test.getInstance().setPerfectPair2("???");
        Test.getInstance().setGoodPair1("pinot_blanc");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 2 & winefood == 2 & foodtype == 3){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("chardonnay");
        Test.getInstance().setPerfectPair2("???");
        Test.getInstance().setGoodPair1("sauv_blanc");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 3 & winefood == 2 & foodtype == 3){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("chardonnay");
        Test.getInstance().setPerfectPair2("???");
        Test.getInstance().setGoodPair1("trebbiano");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 4 & winefood == 2 & foodtype == 3){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("pinot_gris");
        Test.getInstance().setPerfectPair2("sauv_blanc");
        Test.getInstance().setGoodPair1("chardonnay");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 5 & winefood == 2 & foodtype == 3){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("pinot_gris");
        Test.getInstance().setPerfectPair2("sauv_blanc");
        Test.getInstance().setGoodPair1("chardonnay");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 6 & winefood == 2 & foodtype == 3){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("pinot_gris");
        Test.getInstance().setPerfectPair2("sauv_blanc");
        Test.getInstance().setGoodPair1("chardonnay");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 7 & winefood == 2 & foodtype == 3){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("viognier");
        Test.getInstance().setPerfectPair2("chardonnay");
        Test.getInstance().setGoodPair1("pinot_blanc");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 8 & winefood == 2 & foodtype == 3){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("viognier");
        Test.getInstance().setPerfectPair2("chardonnay");
        Test.getInstance().setGoodPair1("pinot_blanc");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat1.getId() & pos == 4 & winefood == 2){

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.dairy,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat2.setAdapter(adapter2);
        wifo_cat2.setOnItemSelectedListener(this);
        foodtype = pos;
        wifo_cat3.setVisibility(View.VISIBLE);

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 1 & winefood == 2 & foodtype == 4){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.soft_cheese, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        foodflav = pos;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 2 & foodtype == 4 & foodflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("pinot_noir");
        Test.getInstance().setPerfectPair2("gamay");
        Test.getInstance().setGoodPair1("merlot");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 2 & foodtype == 4 & foodflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("carignane");
        Test.getInstance().setPerfectPair2("viognier");
        Test.getInstance().setGoodPair1("pinot_blanc");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 2 & foodtype == 4 & foodflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("rousanne");
        Test.getInstance().setPerfectPair2("marsanne");
        Test.getInstance().setGoodPair1("riesling");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 2 & winefood == 2 & foodtype == 4){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.pungent_cheese, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        foodflav = pos;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 2 & foodtype == 4 & foodflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("tempranillo");
        Test.getInstance().setPerfectPair2("sangiovese");
        Test.getInstance().setGoodPair1("pinotage");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 2 & foodtype == 4 & foodflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("cab_franc");
        Test.getInstance().setPerfectPair2("zinfandel");
        Test.getInstance().setGoodPair1("malbec");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 2 & foodtype == 4 & foodflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("sangiovese");
        Test.getInstance().setPerfectPair2("merlot");
        Test.getInstance().setGoodPair1("chardonnay");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 3 & winefood == 2 & foodtype == 4){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.hard_cheese, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        foodflav = pos;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 2 & foodtype == 4 & foodflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("syrah");
        Test.getInstance().setPerfectPair2("petite_sirah");
        Test.getInstance().setGoodPair1("cab_franc");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 2 & foodtype == 4 & foodflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("cab_sauv");
        Test.getInstance().setPerfectPair2("mourvedre");
        Test.getInstance().setGoodPair1("merlot");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 2 & foodtype == 4 & foodflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("petite_sirah");
        Test.getInstance().setPerfectPair2("pinotage");
        Test.getInstance().setGoodPair1("semillon");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 4 & winefood == 2 & foodtype == 4 & foodflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("mourvedre");
        Test.getInstance().setPerfectPair2("cab_sauv");
        Test.getInstance().setGoodPair1("tempranillo");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 5 & winefood == 2 & foodtype == 4 & foodflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("syrah");
        Test.getInstance().setPerfectPair2("malbec");
        Test.getInstance().setGoodPair1("cab_franc");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat1.getId() & pos == 5 & winefood == 2){

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource
                (this, R.array.vegetables, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat2.setAdapter(adapter2);
        wifo_cat2.setOnItemSelectedListener(this);
        foodtype = pos;
        wifo_cat3.setVisibility(View.VISIBLE);

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 1 & winefood == 2 & foodtype == 5){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.allums_greens, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        foodflav = pos;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 2 & foodtype == 5 & foodflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("sangiovese");
        Test.getInstance().setPerfectPair2("cab_franc");
        Test.getInstance().setGoodPair1("gamay");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 2 & foodtype == 5 & foodflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("tempranillo");
        Test.getInstance().setPerfectPair2("merlot");
        Test.getInstance().setGoodPair1("carignane");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 2 & foodtype == 5 & foodflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("merlot");
        Test.getInstance().setPerfectPair2("cab_franc");
        Test.getInstance().setGoodPair1("pinot_noir");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 4 & winefood == 2 & foodtype == 5 & foodflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("zinfandel");
        Test.getInstance().setPerfectPair2("merlot");
        Test.getInstance().setGoodPair1("semillon");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 5 & winefood == 2 & foodtype == 5 & foodflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("pinot_blanc");
        Test.getInstance().setPerfectPair2("mel_bourg");
        Test.getInstance().setGoodPair1("pinot_gris");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 6 & winefood == 2 & foodtype == 5 & foodflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("trebbiano");
        Test.getInstance().setPerfectPair2("pinot_gris");
        Test.getInstance().setGoodPair1("pinot_blanc");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 2 & winefood == 2 & foodtype == 5){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.roots_squash, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        foodflav = pos;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 2 & foodtype == 5 & foodflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("white_zin");
        Test.getInstance().setPerfectPair2("chardonnay");
        Test.getInstance().setGoodPair1("riesling");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 2 & foodtype == 5 & foodflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("semillon");
        Test.getInstance().setPerfectPair2("white_zin");
        Test.getInstance().setGoodPair1("moscato");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 2 & foodtype == 5 & foodflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("white_zin");
        Test.getInstance().setPerfectPair2("marsanne");
        Test.getInstance().setGoodPair1("gewurz");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 4 & winefood == 2 & foodtype == 5 & foodflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("rousanne");
        Test.getInstance().setPerfectPair2("white_zin");
        Test.getInstance().setGoodPair1("riesling");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 3 & winefood == 2 & foodtype == 5){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.nightshades, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        foodflav = pos;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 2 & foodtype == 5 & foodflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("merlot");
        Test.getInstance().setPerfectPair2("sangiovese");
        Test.getInstance().setGoodPair1("pinotage");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 2 & foodtype == 5 & foodflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("zinfandel");
        Test.getInstance().setPerfectPair2("cab_franc");
        Test.getInstance().setGoodPair1("petite_sirah");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 2 & foodtype == 5 & foodflav == 3){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("tempranillo");
        Test.getInstance().setPerfectPair2("merlot");
        Test.getInstance().setGoodPair1("cab_sauv");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 4 & winefood == 2 & foodtype == 5){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.funghi, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        foodflav = pos;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 2 & foodtype == 5 & foodflav == 4){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("merlot");
        Test.getInstance().setPerfectPair2("zinfandel");
        Test.getInstance().setGoodPair1("pinotage");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 2 & foodtype == 5 & foodflav == 4){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("tempranillo");
        Test.getInstance().setPerfectPair2("semillon");
        Test.getInstance().setGoodPair1("petite_sirah");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 2 & foodtype == 5 & foodflav == 4){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("marsanne");
        Test.getInstance().setPerfectPair2("carignane");
        Test.getInstance().setGoodPair1("cab_sauv");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 5 & winefood == 2 & foodtype == 5){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.nuts_beans, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        foodflav = pos;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 2 & foodtype == 5 & foodflav == 5){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("moscato");
        Test.getInstance().setPerfectPair2("chen_blanc");
        Test.getInstance().setGoodPair1("viognier");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 2 & foodtype == 5 & foodflav == 5){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("riesling");
        Test.getInstance().setPerfectPair2("gewurz");
        Test.getInstance().setGoodPair1("rousanne");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 2 & foodtype == 5 & foodflav == 5){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("gewurz");
        Test.getInstance().setPerfectPair2("riesling");
        Test.getInstance().setGoodPair1("pinot_gris");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 4 & winefood == 2 & foodtype == 5 & foodflav == 5){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("pinot_blanc");
        Test.getInstance().setPerfectPair2("pinot_gris");
        Test.getInstance().setGoodPair1("viognier");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 5 & winefood == 2 & foodtype == 5 & foodflav == 5){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("sauv_blanc");
        Test.getInstance().setPerfectPair2("trebbiano");
        Test.getInstance().setGoodPair1("semillon");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat1.getId() & pos == 6 & winefood == 2){

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource
                (this, R.array.herbs_spices, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat2.setAdapter(adapter2);
        wifo_cat2.setOnItemSelectedListener(this);
        foodtype = pos;
        wifo_cat3.setVisibility(View.GONE);
        imageView5.setVisibility(View.GONE);

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 1 & winefood == 2 & foodtype == 6){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("port");
        Test.getInstance().setPerfectPair2("sherry");
        Test.getInstance().setGoodPair1("riesling");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 2 & winefood == 2 & foodtype == 6){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("vin_santo");
        Test.getInstance().setPerfectPair2("port");
        Test.getInstance().setGoodPair1("chen_blanc");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 3 & winefood == 2 & foodtype == 6){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("merlot");
        Test.getInstance().setPerfectPair2("zinfandel");
        Test.getInstance().setGoodPair1("gamay");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 4 & winefood == 2 & foodtype == 6){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("cab_franc");
        Test.getInstance().setPerfectPair2("sangiovese");
        Test.getInstance().setGoodPair1("pinot_noir");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 5 & winefood == 2 & foodtype == 6){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("merlot");
        Test.getInstance().setPerfectPair2("tempranillo");
        Test.getInstance().setGoodPair1("carignane");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat1.getId() & pos == 7 & winefood == 2){

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource
                (this, R.array.starches, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat2.setAdapter(adapter2);
        wifo_cat2.setOnItemSelectedListener(this);
        foodtype = pos;
        wifo_cat3.setVisibility(View.VISIBLE);

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 1 & winefood == 2 & foodtype == 7){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.starches_grains, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        foodflav = pos;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 2 & foodtype == 7 & foodflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("merlot");
        Test.getInstance().setPerfectPair2("zinfandel");
        Test.getInstance().setGoodPair1("syrah");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 2 & foodtype == 7 & foodflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("gamay");
        Test.getInstance().setPerfectPair2("grenache");
        Test.getInstance().setGoodPair1("semillon");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 2 & foodtype == 7 & foodflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("moscato");
        Test.getInstance().setPerfectPair2("riesling");
        Test.getInstance().setGoodPair1("marsanne");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 4 & winefood == 2 & foodtype == 7 & foodflav == 1){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("riesling");
        Test.getInstance().setPerfectPair2("chen_blanc");
        Test.getInstance().setGoodPair1("rousanne");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 2 & winefood == 2 & foodtype == 7){

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.sweet_starchy, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat3.setAdapter(adapter3);
        wifo_cat3.setOnItemSelectedListener(this);
        foodflav = pos;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 1 & winefood == 2 & foodtype == 7 & foodflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("riesling");
        Test.getInstance().setPerfectPair2("chen_blanc");
        Test.getInstance().setGoodPair1("pinot_blanc");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 2 & winefood == 2 & foodtype == 7 & foodflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("moscato");
        Test.getInstance().setPerfectPair2("gewurz");
        Test.getInstance().setGoodPair1("trebbiano");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat3.getId() & pos == 3 & winefood == 2 & foodtype == 7 & foodflav == 2){

        wifo_cat3.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("gewurz");
        Test.getInstance().setPerfectPair2("riesling");
        Test.getInstance().setGoodPair1("rousanne");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat1.getId() & pos == 8 & winefood == 2){

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource
                (this, R.array.sweet_items, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wifo_cat2.setAdapter(adapter2);
        wifo_cat2.setOnItemSelectedListener(this);
        foodtype = pos;
        wifo_cat3.setVisibility(View.GONE);
        imageView5.setVisibility(View.GONE);

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 1 & winefood == 2 & foodtype == 8){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("riesling");
        Test.getInstance().setPerfectPair2("gewurz");
        Test.getInstance().setGoodPair1("port");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 2 & winefood == 2 & foodtype == 8){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("chen_blanc");
        Test.getInstance().setPerfectPair2("gewurz");
        Test.getInstance().setGoodPair1("vin_santo");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 3 & winefood == 2 & foodtype == 8){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("moscato");
        Test.getInstance().setPerfectPair2("riesling");
        Test.getInstance().setGoodPair1("sherry");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 4 & winefood == 2 & foodtype == 8){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("chen_blanc");
        Test.getInstance().setPerfectPair2("gewurz");
        Test.getInstance().setGoodPair1("port");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    if (parent.getId() == wifo_cat2.getId() & pos == 5 & winefood == 2 & foodtype == 8){

        wifo_cat2.setOnItemSelectedListener(this);
        
        Test.getInstance().setPerfectPair("port");
        Test.getInstance().setPerfectPair2("sherry");
        Test.getInstance().setGoodPair1("moscato");
        intent = new Intent(getApplicationContext(),ItsPaired.class);
        selectionsmade = 1;

    }

    else {
        intent = new Intent(getApplicationContext(),ItsPaired.class);
    }

    }

  public void onNothingSelected(AdapterView<?> parent) {
    // Another interface callback

  }


  public void PairIt(View view) {
        if (selectionsmade == 0){
            test_box.setText("Please make a pairing selection.");
        }

        if (selectionsmade == 1){
            startActivity(intent);
        }
    }



  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_other, menu);
    return true;
  }


  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
