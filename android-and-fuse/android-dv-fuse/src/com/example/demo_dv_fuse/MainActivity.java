package com.example.demo_dv_fuse;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import com.example.demo_dv_fuse.model.Flight;
import com.example.demo_dv_fuse.model.FlightParcelable;

public class MainActivity extends Activity {

    private Spinner spinner1;
    private Button button1;
    String[] items;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addItemsOnSpinner1();
        addListenerOnButton();

    }

    // add items into spinner dynamically
    public void addItemsOnSpinner1() {

        spinner1 = (Spinner)findViewById(R.id.spinner1);
        List list = new ArrayList();
        list.add("Atlanta (ATL)");
        list.add("Charleston (CHS)");
        ArrayAdapter dataAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);
    }

    public void addListenerOnButton() {

        spinner1 = (Spinner)findViewById(R.id.spinner1);
        button1 = (Button)findViewById(R.id.btnPrevious);
        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick( View v ) {
                Flight flight = new Flight("American Airlines", "AA", "8307", "1:10 PM", "ORD", "4:59 PM", "LAS", "1",
                                           "C24", "DELAYED");
                Parcelable data = new FlightParcelable(flight);

                Intent intent = new Intent(MainActivity.this, DetailsScreen.class);
                intent.putExtra(FlightParcelable.SELECTED_FLIGHT, data);
                MainActivity.this.startActivity(intent);
            }
        });
    }

}
