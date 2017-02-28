package com.aleksa.matejic.app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class NewProfileActivity extends Activity
{
    private RelativeLayout rlPlayGame;
    private EditText etInputName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_profile);

        rlPlayGame = (RelativeLayout) findViewById(R.id.rlPlayGame);
        etInputName = (EditText) findViewById(R.id.etInputName);

        rlPlayGame.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(etInputName.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Input your name!", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent myIntent = new Intent(NewProfileActivity.this, GameActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
