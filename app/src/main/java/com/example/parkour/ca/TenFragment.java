package com.example.parkour.ca;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by parkour on 2017/9/13.
 */

public class TenFragment  extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ten, container, false);
        return view;
    }


    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button button = (Button) getActivity().findViewById(R.id.btnclear);
        Button button2 = (Button) getActivity().findViewById(R.id.btnok);
        final EditText et1 = (EditText) getActivity().findViewById(R.id.et1);
        final EditText et2= (EditText) getActivity().findViewById(R.id.et2);
        final EditText et3 = (EditText) getActivity().findViewById(R.id.et3);
        final EditText et4 = (EditText) getActivity().findViewById(R.id.et4);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = -1;
                double y = 0;
                if (et1.getText().length()!=0) x = 0;
                else if (et2.getText().length()!=0) x = 1;
                else if (et3.getText().length()!=0) x = 2;
                else if (et4.getText().length()!=0) x = 3;
                switch (x){
                    case 0:
                        y =Double.parseDouble(et1.getText().toString());
                        et2.setText(y*0.15 + "");
                        et3.setText(y*16.79 + "");
                        et4.setText(y*0.11+ "");
                        break;
                    case 1:
                        y =Double.parseDouble(et2.getText().toString());
                        et1.setText(y*6.55 + "");
                        et3.setText(y/110.04 + "");
                        et4.setText(y/0.75 + "");
                        break;
                    case 2:
                        y =Double.parseDouble(et3.getText().toString());
                        et1.setText(y*0.0595 + "");
                        et2.setText(y*0.0091 + "");
                        et4.setText(y*0.0068 + "");
                        break;
                    case 3:
                        y =Double.parseDouble(et4.getText().toString());
                        et1.setText(y*100000 + "");
                        et2.setText(y*10000 + "");
                        et3.setText(y*1000 + "");
                        break;
                    default:
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");

            }
        });
    }
}
