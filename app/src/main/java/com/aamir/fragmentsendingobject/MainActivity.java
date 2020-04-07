package com.aamir.fragmentsendingobject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText ed1,ed2,ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        ed1=findViewById(R.id.editText);
        ed2=findViewById(R.id.editText2);
        ed3=findViewById(R.id.editText3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MalikFragment malikFragment=new MalikFragment();
                String fname=ed1.getText().toString();
                String flastname=ed2.getText().toString();
                int age= Integer.parseInt(ed3.getText().toString());
                Person p=new Person(fname,flastname,age);
                Bundle bundle=new Bundle();
                bundle.putParcelable("key",p);
                malikFragment.setArguments(bundle);

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frameLayout,malikFragment)
                        .commit();

            }
        });
    }
}
