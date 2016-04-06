package com.jasonhezz.github.rxandroidtemplate.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jasonhezz.github.rxandroidtemplate.R;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.back) public void go2back() {
    startActivity(new Intent(MainActivity.this, BackActivity.class));
  }

  @OnClick(R.id.menu) public void go2Menu() {
    startActivity(new Intent(MainActivity.this, MenuActivity.class));
  }

  @OnClick(R.id.top_tab) public void go2Tab() {
    startActivity(new Intent(MainActivity.this, TabActivity.class));
  }

  @OnClick(R.id.bottom_tab) public void go2BottomTab() {
    startActivity(new Intent(MainActivity.this, BottomTabActivity.class));
  }
}
