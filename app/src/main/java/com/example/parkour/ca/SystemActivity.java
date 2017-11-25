package com.example.parkour.ca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.parkour.ca.R.id.et1;
import static com.example.parkour.ca.R.id.et2;
import static com.example.parkour.ca.R.id.et3;
import static com.example.parkour.ca.R.id.et4;

public class SystemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system);

        Button button = (Button) findViewById(R.id.btnclear);
        Button button2 = (Button) findViewById(R.id.btnok);

        final TextView et1 = (EditText) findViewById(R.id.trans_1);
        final TextView et2= (TextView) findViewById(R.id.trans_2);
        final TextView et3 = (TextView) findViewById(R.id.trans_3);
        final TextView et4 = (TextView) findViewById(R.id.trans_4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(et1.getText().toString());
                et2.setText(Integer.toBinaryString(x));
                et3.setText(Integer.toOctalString(x));
                et4.setText(Integer.toHexString(x));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.//填充选项菜单（读取XML文件、解析、加载到Menu组件上）
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //重写OptionsItemSelected(MenuItem item)来响应菜单项(MenuItem)的点击事件（根据id来区分是哪个item）
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.start:
                Intent intent = new Intent(SystemActivity.this, HelpActivity.class);
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
