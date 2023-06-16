package com.example.jarellxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var names= arrayOf("Laureen","Daniel","Tony","Angela","Saint","Mulwa","Kabubo")

        var myadapter= ArrayAdapter(this,R.layout.listitem,names)

        var mylist:ListView=findViewById(R.id.list)
        mylist.setAdapter(myadapter)
    }
}