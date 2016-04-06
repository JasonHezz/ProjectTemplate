package com.jasonhezz.github.rxandroidtemplate.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.jasonhezz.github.rxandroidtemplate.R;
import com.jasonhezz.github.rxandroidtemplate.ui.adapter.SectionsPagerAdapter;

public class TabActivity extends AppCompatActivity {

  @Bind(R.id.toolbar) Toolbar mToolbar;
  @Bind(R.id.tabs) TabLayout mTabs;
  @Bind(R.id.container) ViewPager mContainer;
  private SectionsPagerAdapter mSectionsPagerAdapter;


  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tab);
    ButterKnife.bind(this);

    setSupportActionBar(mToolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
    mContainer.setAdapter(mSectionsPagerAdapter);
    mTabs.setupWithViewPager(mContainer);
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_tab, menu);
    return true;
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {

    int id = item.getItemId();
    switch (id) {
      case android.R.id.home:
        this.finish();
        break;
    }
    return super.onOptionsItemSelected(item);
  }
}
