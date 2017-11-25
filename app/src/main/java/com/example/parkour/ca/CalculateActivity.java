package com.example.parkour.ca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.lang.String;


public class CalculateActivity extends AppCompatActivity implements View.OnClickListener {

    DecimalFormat df = new DecimalFormat("#.##");
    //数字
    private Button num0;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;

    //运算符
    private Button plus_btn;//加
    private Button subtract_btn;//减
    private Button multiply_btn;//乘
    private Button divide_btn;//除
    private Button equal_btn;//等于
    private Button dot_btn;//小数点
    private Button percent_btn;//百分号
    private Button delete_btn;
    private Button ac_btn;//清零
    private Button sin_btn;
    private Button cos_btn;
    private Button brackets_left_btn;//左括号
    private Button brackets_right_btn;//右括号
    private Button log_btn;//正负
    private Button trans_btn;//进制转换

    //结果
    private TextView mResultText;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        initView();
        initEvent();
    }

    /**
     * 初始化控件
     */
    private void initView() {
        //数字
        num0 = (Button) findViewById(R.id.btn0);
        num1 = (Button) findViewById(R.id.btn1);
        num2 = (Button) findViewById(R.id.btn2);
        num3 = (Button) findViewById(R.id.btn3);
        num4 = (Button) findViewById(R.id.btn4);
        num5 = (Button) findViewById(R.id.btn5);
        num6 = (Button) findViewById(R.id.btn6);
        num7 = (Button) findViewById(R.id.btn7);
        num8 = (Button) findViewById(R.id.btn8);
        num9 = (Button) findViewById(R.id.btn9);
        //运算符
        plus_btn = (Button) findViewById(R.id.btn_jia);
        subtract_btn = (Button) findViewById(R.id.btn_jian);
        multiply_btn = (Button) findViewById(R.id.btn_cheng);
        divide_btn = (Button) findViewById(R.id.btn_chu);
        equal_btn = (Button) findViewById(R.id.btn_equal);

        dot_btn = (Button) findViewById(R.id.btn_dot);
        percent_btn = (Button) findViewById(R.id.btn_p);
        delete_btn = (Button) findViewById(R.id.btn_back);
        ac_btn = (Button) findViewById(R.id.btn_c);
        sin_btn = (Button) findViewById(R.id.btn_sin);
        cos_btn = (Button) findViewById(R.id.btn_cos);
        brackets_left_btn = (Button) findViewById(R.id.btn_l);
        brackets_right_btn = (Button) findViewById(R.id.btn_r);
        log_btn = (Button) findViewById(R.id.btn_log);
        trans_btn = (Button) findViewById(R.id.btn_trans);
        //结果
        resultText= (TextView) findViewById(R.id.tvResult);
        mResultText = (TextView) findViewById(R.id.et_down);
    }

    /**
     * 初始化事件
     */
    private void initEvent() {
        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);

        plus_btn.setOnClickListener(this);
        subtract_btn.setOnClickListener(this);
        multiply_btn.setOnClickListener(this);
        divide_btn.setOnClickListener(this);
        equal_btn.setOnClickListener(this);

        dot_btn.setOnClickListener(this);
        percent_btn.setOnClickListener(this);
        delete_btn.setOnClickListener(this);
        ac_btn.setOnClickListener(this);
        sin_btn.setOnClickListener(this);
        cos_btn.setOnClickListener(this);
        brackets_left_btn.setOnClickListener(this);
        brackets_right_btn.setOnClickListener(this);
        log_btn.setOnClickListener(this);
        trans_btn.setOnClickListener(this);
    }

    //点击事件
    @Override
    public void onClick(View view) {

            switch (view.getId()) {
                //数字
                case R.id.btn0:
                    mResultText.setText(mResultText.getText().toString() + "0");
                    break;
                case R.id.btn1:
                    mResultText.setText(mResultText.getText().toString() + "1");
                    break;
                case R.id.btn2:
                    mResultText.setText(mResultText.getText().toString() + "2");
                    break;
                case R.id.btn3:
                    mResultText.setText(mResultText.getText().toString() + "3");
                    break;
                case R.id.btn4:
                    mResultText.setText(mResultText.getText().toString() + "4");
                    break;
                case R.id.btn5:
                    mResultText.setText(mResultText.getText().toString() + "5");
                    break;
                case R.id.btn6:
                    mResultText.setText(mResultText.getText().toString() + "6");
                    break;
                case R.id.btn7:
                    mResultText.setText(mResultText.getText().toString() + "7");
                    break;
                case R.id.btn8:
                    mResultText.setText(mResultText.getText().toString() + "8");
                    break;
                case R.id.btn9:
                    mResultText.setText(mResultText.getText().toString() + "9");
                    break;
                case R.id.btn_jia:
                    mResultText.setText(mResultText.getText().toString() + "+");
                    break;
                case R.id.btn_jian:
                    mResultText.setText(mResultText.getText().toString() + "-");
                    break;
                case R.id.btn_cheng:
                    mResultText.setText(mResultText.getText().toString() + "x");
                    break;
                case R.id.btn_chu:
                    mResultText.setText(mResultText.getText().toString() + "/");
                    break;
                case R.id.btn_dot:
                    mResultText.setText(mResultText.getText().toString() + ".");
                    break;
                case R.id.btn_c:
                    mResultText.setText("");
                    break;
                case R.id.btn_p:
                    mResultText.setText(mResultText.getText().toString() + "^");
                    break;
                case R.id.btn_l:
                    mResultText.setText(mResultText.getText().toString() + "(");
                    break;
                case R.id.btn_r:
                    mResultText.setText(mResultText.getText().toString() + ")");
                    break;
                case R.id.btn_sin:
                    mResultText.setText(mResultText.getText().toString() + "sin");
                    break;
                case R.id.btn_cos:
                    mResultText.setText(mResultText.getText().toString() + "cos");
                    break;
                case R.id.btn_back:
                    if (mResultText.getText().toString().substring(mResultText.getText().toString().length() - 1).equals("s") ||
                            mResultText.getText().toString().substring(mResultText.getText().toString().length() - 1).equals("n"))
                        mResultText.setText(mResultText.getText().toString().substring(0, mResultText.getText().toString().length() - 3));
                    else if (mResultText.getText().toString().substring(mResultText.getText().toString().length() - 1).equals("g"))
                        mResultText.setText(mResultText.getText().toString().substring(0, mResultText.getText().toString().length() - 2));
                    else
                        mResultText.setText(mResultText.getText().toString().substring(0, mResultText.getText().toString().length() - 1));
                    break;
                case R.id.btn_log:
                    mResultText.setText(mResultText.getText().toString() + "lg");
                    break;
                case R.id.btn_equal:
                        String x = new String();
                        x = mResultText.getText().toString();
                        mResultText.setText(equal(mResultText.getText().toString()) + "");
                        resultText.setText(x + "=" + mResultText.getText() + "");

                    break;
            }
        trans_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CalculateActivity.this, SystemActivity.class);
                startActivity(intent);
            }
        });
    }
    //整理字符串
    public String equal(String x) {
        String sum = new String();
        x = x.replaceAll("sin", "s");
        x = x.replaceAll("cos", "c");
        x = x.replaceAll("lg", "l");
        x = x + "&";
        sum = transform(x);
        return sum;
    }
    //分离字符与数字
    public String transform(String x) {
        int start = 0;
        int n = 0, m = 0;
        int i = 0;
        String sum = new String();
        String num[] = new String[x.length()];
        String symbol[] = new String[x.length()];
        for (i = 0; i < x.length(); i++) {
            char a = x.charAt(i);
            if ((a == '+') || (a == '-') || (a == 'x') || (a == '/') || (a == 's') || (a == 'c') || (a == 'l') || (a == '^')
                    || (a == '(') || (a == ')') || (a == '&')) {
                num[n] = x.substring(start, i);
                if ("".equals(num[n])) {
                    n--;
                }
                symbol[m] = String.valueOf(a);
                n++;
                m++;
                start = i + 1;
            }
        }
        sum = calculate(num, symbol);
        return sum;
    }
    //计算
    public String calculate(String[] x, String[] y) {
        /*定义变量*/
        int i = 0, j = 0, p,c, r, z, n, m = 0;
        int t = -1;
        double a, b;
        double sum;
        String[] new_s = new String[10];
        String[] new_n = new String[13];
        /*消除括号*/
        while (!y[i].equals("&")) {

            if (y[i].equals("("))
            {
                j = i;
            }
            else if (y[i].equals(")"))
            {
                for (n = j; n < i + 1; n++)
                {
                    new_n[m] = x[n];
                    m++;
                }
                m = 0;
                for (r = j + 1; r < i; r++)
                {
                    t++;
                    new_s[t] = y[r];
                }
                new_s[t + 1] = "&";
                t = -1;
                x[j] = calculate(new_n,new_s);
                p = i;
                for(c = j+1;c<13;c++)
                {
                   x[c] = x[p];
                   p++;
                   if(x[c].equals("")) break;
                }
                z = i +1;
                for(c = j;c < 10;c++)
                {
                   y[c] = y[z];
                   z++;
                   if(y[c].equals("&"))
                   {
                       break;
                   }
                }
                i = 0;
            }
            i++;
        }

        i = 0;
        while (!y[i].equals("&")) {

            if (y[i].equals("^")) {
                a = Double.valueOf(x[i]);
                b = Double.valueOf(x[i + 1]);
                sum = Math.pow(a, b);
                x[i] = Double.toString(sum);
                for (c = i + 1; c < 13; c++) {
                    if (x[c + 1] == null) break;
                    x[c] = x[c + 1];
                }
                for (c = i; c < 10; c++) {
                    if (y[c + 1] == null) break;
                    y[c] = y[c + 1];
                }
                i--;
            }
            i++;
        }
        i = 0;
        while (!y[i].equals("&")) {
            if (y[i].equals("s")) {
                b = Double.valueOf(x[i]);
                sum = Math.sin(b * (Math.PI) / 180);
                x[i] = df.format(sum);
                for (c = i; c < 10; c++) {
                    if (y[c + 1] == null) break;
                    y[c] = y[c + 1];
                }
                i--;
            }
            else if (y[i].equals("c")) {
                b = Double.valueOf(x[i]);
                sum = Math.cos(b * (Math.PI) / 180);
                x[i] = df.format(sum);
                for (c = i; c < 10; c++) {
                    if (y[c + 1] == null) break;
                    y[c] = y[c + 1];
                }
                i--;
            }
            else if (y[i].equals("l")) {
                b = Double.valueOf(x[i]);
                sum = Math.log(b);
                x[i] = df.format(sum);
                for (c = i; c < 10; c++) {
                    if (y[c + 1] == null) break;
                    y[c] = y[c + 1];
                }
                i--;
            }
            i++;
        }
        i = 0;
        while (!y[i].equals("&")) {

            if (y[i].equals("x")) {
                a = Double.valueOf(x[i]);
                b = Double.valueOf(x[i + 1]);
                sum = a * b;
                x[i] = Double.toString(sum);
                for (c = i + 1; c < 13; c++) {
                    if (x[c + 1] == null) break;
                    x[c] = x[c + 1];
                }
                for (c = i; c < 10; c++) {
                    if (y[c + 1] == null) break;
                    y[c] = y[c + 1];
                }
                i--;
            } else if (y[i].equals("/")) {
                a = Double.valueOf(x[i]);
                b = Double.valueOf(x[i + 1]);
                sum = a / b;
                x[i] = Double.toString(sum);
                for (c = i + 1; c < 13; c++) {
                    if (x[c + 1] == null) break;
                    x[c] = x[c + 1];
                }
                for (c = i; c < 10; c++) {
                    if (y[c + 1] == null) break;
                    y[c] = y[c + 1];
                }
                i--;
            }
            i++;
        }
        i = 0;
        while (!y[i].equals("&")) {

            if (y[i].equals("+")) {
                a = Double.valueOf(x[i]);
                b = Double.valueOf(x[i + 1]);
                sum = a + b;
                x[i] = Double.toString(sum);
                for (c = i + 1; c < 13; c++) {
                    if (x[c + 1] == null) break;
                    x[c] = x[c + 1];
                }
                for (c = i; c < 10; c++) {
                    if (y[c + 1] == null) break;
                    y[c] = y[c + 1];
                }
                i--;
            }
            else if (y[i].equals("-")) {
                a = Double.valueOf(x[i]);
                b = Double.valueOf(x[i + 1]);
                sum = a - b;
                x[i] = Double.toString(sum);
                for (c = i + 1; c < 13; c++) {
                    if (x[c + 1] == null) break;
                    x[c] = x[c + 1];
                }
                for (c = i; c < 10; c++) {
                    if (y[c + 1] == null) break;
                    y[c] = y[c + 1];
                }
                i--;
            }
            i++;
        }
        return x[0];
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
        switch (item.getItemId()) {
            case R.id.start:
                Intent intent = new Intent(CalculateActivity.this, HelpActivity.class);
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




