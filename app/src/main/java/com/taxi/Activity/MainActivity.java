package com.taxi.Activity;

import com.taxi.Adapter.NavigationAdapter;
import com.taxi.Model.NavigationDetails;
import com.taxi.R;
import com.taxi.Utils.ClickListener;
import com.taxi.Utils.RecyclerTouchListener;
import com.taxi.Utils.SimpleDividerItemDecoration;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        /*implements NavigationView.OnNavigationItemSelectedListener */ {

    private LinearLayout navigationDrawerLinear;
    private ArrayList<NavigationDetails> arrayListNavi;
    private NavigationAdapter mAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        arrayListNavi = new ArrayList<>();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navigationDrawerLinear = (LinearLayout) findViewById(R.id.activity_main_navigation_linear);
        recyclerView = (RecyclerView) findViewById(R.id.activity_main_recycler);
        NavigationDetails details = new NavigationDetails();
        details.setImage(R.mipmap.ic_home);
        details.setTitle("home");
        arrayListNavi.add(details);

        details = new NavigationDetails();
        details.setImage(R.mipmap.ic_user);
        details.setTitle("Profile");
        arrayListNavi.add(details);

        details = new NavigationDetails();
        details.setImage(R.mipmap.ic_refresh_ride);
        details.setTitle("Previous Ride");
        arrayListNavi.add(details);

        details = new NavigationDetails();
        details.setImage(R.mipmap.ic_setting);
        details.setTitle("Setting");
        arrayListNavi.add(details);

        details = new NavigationDetails();
        details.setImage(R.mipmap.ic_support);
        details.setTitle("Support");
        arrayListNavi.add(details);

        details = new NavigationDetails();
        details.setImage(R.mipmap.ic_car);
        details.setTitle("Be Captain");
        arrayListNavi.add(details);


        mAdapter = new NavigationAdapter(MainActivity.this, arrayListNavi);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(MainActivity.this,
                recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, final int position) {
                Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        }));
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(this));

//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//
//        if (id == R.id.nav_camera) {
//            // Handle the camera action
//        } else if (id == R.id.nav_gallery) {
//
//        } else if (id == R.id.nav_slideshow) {
//
//        } else if (id == R.id.nav_manage) {
//
//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
//
//        }
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }
}
