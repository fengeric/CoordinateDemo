package com.feng.coordinate;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**@title CoordinateActivity 标题栏滑动页面
 * @author Eric
 * @date 2017/10/20
 **/
public class CoordinateActivity extends Activity {

    Toolbar tb;
    ListView listView;
    ArrayList<String> lists = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinate_layout);


        for (int i = 0; i < 50; i++) {
            lists.add("枫" + i);
        }

        init();
    }

    private void init(){
        tb = (Toolbar) findViewById(R.id.toolbar);

        tb.setTitle("你好");

        listView = (ListView) findViewById(R.id.rvToDoList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, lists);
        listView.setAdapter(adapter);
    }
}
