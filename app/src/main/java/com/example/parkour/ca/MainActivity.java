package com.example.parkour.ca;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btcal = (Button)this.findViewById(R.id.cal);
        btcal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculateActivity.class);
                startActivity(intent);
            }
        });

        Button bttrans = (Button)this.findViewById(R.id.bttrans);
        bttrans.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,TransformActivity.class);
                startActivity(intent);
            }
        });


        Button bthelp = (Button)this.findViewById(R.id.bthelp);
        bthelp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,HelpActivity.class);
                startActivity(intent);
            }
        });

             }


    //重写onCreateOptionMenu(Menu menu)方法，当菜单第一次被加载时调用
    @Override
     public boolean onCreateOptionsMenu(Menu menu) {
                 // Inflate the menu; this adds items to the action bar if it is present.//填充选项菜单（读取XML文件、解析、加载到Menu组件上）
                 getMenuInflater().inflate(R.menu.menu_main, menu);
                return true;
            }

    //重写OptionsItemSelected(MenuItem item)来响应菜单项(MenuItem)的点击事件（根据id来区分是哪个item）
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.start:
                Intent intent = new Intent(MainActivity.this,HelpActivity.class);
                startActivity(intent);
                break;
            case R.id.over:
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
