package com.jasonhezz.github.rxandroidtemplate.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.jasonhezz.github.rxandroidtemplate.R;

public class MenuActivity extends AppCompatActivity {


  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_menu);
    ButterKnife.bind(this);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_menu, menu);
    return true;
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    int id = item.getItemId();
    switch (id) {
      case R.id.action_notifications:
        Toast.makeText(MenuActivity.this, "点击了通知菜单", Toast.LENGTH_SHORT).show();
        break;
      case R.id.action_favorite:
        Toast.makeText(MenuActivity.this, "点击了喜爱菜单", Toast.LENGTH_SHORT).show();
        break;
      case android.R.id.home:
        this.finish();
        break;
    }
    return super.onOptionsItemSelected(item);
  }
}
