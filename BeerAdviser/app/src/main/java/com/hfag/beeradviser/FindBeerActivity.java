package com.hfag.beeradviser;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class FindBeerActivity extends Activity {
    private BeerExpert beerExpert = new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        //Получить ссылку на TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        // Получить ссылку на Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        // Получить вариант, выбранный в Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        // Вывести выбранный вариант
        String advice = Arrays.toString((beerExpert.getBrands(beerType)).toArray());
        brands.setText(advice);
    }

}
