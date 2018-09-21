package com.test.kazbekborash.secondapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList
import android.support.v4.view.accessibility.AccessibilityEventCompat.setAction



class MainActivity : AppCompatActivity() {

    var persons = ArrayList<Person>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ListAdapter(persons)
        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler.adapter = adapter

        fab.setOnClickListener {
            persons.add(Person("Natsu", 16))
            recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            recycler.adapter = adapter
        }

        if (savedInstanceState != null) {
            persons = savedInstanceState.getParcelableArray("pers") as ArrayList<Person>

        }
    }



    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelableArray("pars", persons as Array<out Parcelable>)
    }


}
