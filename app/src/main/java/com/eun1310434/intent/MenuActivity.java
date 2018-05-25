/*=====================================================================
□ Infomation
  ○ Data : 25.05.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming


□ Function
  ○ android:theme="@style/Theme.AppCompat.Dialog"> 를 사용하여 안내창이 뜸

□ Study
  ○ Intent
     - An Intent provides a facility for performing late runtime binding between the code in different applications.
       Its most significant use is in the launching of activities, where it can be thought of as the glue between activities.
       It is basically a passive data structure holding an abstract description of an action to be performed.
=====================================================================*/
package com.eun1310434.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("key", "eun1310434");
                setResult(3, intent);//3 대신 RESULT_OK를 사용해도 됨
                finish();
            }
        });
    }
}
