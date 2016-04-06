package com.jasonhezz.github.rxandroidtemplate.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.jasonhezz.github.rxandroidtemplate.R;

public class BackActivity extends AppCompatActivity {

  @Bind(R.id.toolbar) Toolbar mToolbar;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_back);
    ButterKnife.bind(this);
    setSupportActionBar(mToolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    int id = item.getItemId();
    if (id == android.R.id.home) BackActivity.this.finish();
    return super.onOptionsItemSelected(item);
  }
}
