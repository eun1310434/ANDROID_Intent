/*=====================================================================
□ Infomation
  ○ Data : 25.05.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ Function
  ○

□ Study
  ○ Intent
     - An Intent provides a facility for performing late runtime binding between the code in different applications.
       Its most significant use is in the launching of activities, where it can be thought of as the glue between activities.
       It is basically a passive data structure holding an abstract description of an action to be performed.s
=====================================================================*/
package com.eun1310434.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 201;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivityForResult(intent, REQUEST_CODE_MENU);
        //REQUEST_CODE_MENU <- 코드를 통해 어떤 화면에서 전받 받았는지 식별 가능
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {// 응답을 받는 메소드
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_MENU) {
            Toast.makeText(
                    getApplicationContext(),
                    "onActivityResult - "+
                            "requestCode : " + requestCode +
                            ", resultCode : " + resultCode, Toast.LENGTH_LONG).show();

            if (resultCode == 3) {//3 대신 RESULT_OK를 사용해도 됨
                String name = data.getExtras().getString("key");
                Toast.makeText(getApplicationContext(), "key : " + name, Toast.LENGTH_LONG).show();
            }
        }
    }
}
