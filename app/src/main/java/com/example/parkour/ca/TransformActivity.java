package com.example.parkour.ca;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class TransformActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transform);
        replaceFragment(new ContentFragment());
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        Button button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button3);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.button19);
        button3.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button:
                replaceFragment(new ContentFragment());
                break;
            case R.id.button2:
                replaceFragment(new AnotherContentFragment());
                break;
            case R.id.button3:
                replaceFragment(new TenFragment());
                break;
            case R.id.button19:
                replaceFragment(new SixteenFragment());
                break;
            default:
        }
    }

    private void replaceFragment(Fragment fragment) {
        //调用 getSupportFragmentManager() 方法获取 FragmentManager  
         FragmentManager fragmentManager = getSupportFragmentManager();
        //通过 beginTransaction() 方法开启一个事务  
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //通过 replace() 方法向容器添加或替换 Fragment  
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        //通过 commit() 方法来提交事务  
        fragmentTransaction.commit();
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
                Intent intent = new Intent(TransformActivity.this,HelpActivity.class);
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
