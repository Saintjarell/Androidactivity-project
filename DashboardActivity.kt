package com.example.jarellxml

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class DashboardActivity : AppCompatActivity() {
    lateinit var home:CardView
    lateinit var chat:CardView
    lateinit var profile:CardView
    lateinit var widget:CardView
    lateinit var settings:CardView
    lateinit var logout:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        home=findViewById(R.id.cardHome)
        chat=findViewById(R.id.cardChat)
        profile=findViewById(R.id.cardProfile)
        widget=findViewById(R.id.cardWidgets)
        settings=findViewById(R.id.cardSettings)
        logout=findViewById(R.id.cardLogout)

        home.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Home", Toast.LENGTH_LONG).show()
            var map=Intent(this,MapActivity::class.java)
            startActivity(map)
        }
        chat.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Chat", Toast.LENGTH_LONG).show()
            var web=Intent(this,MapsActivity1::class.java)
            startActivity(web)

        }
        profile.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Profile", Toast.LENGTH_LONG).show()
            var keja=Intent(this,ToolbarActivity::class.java)
            startActivity(keja)
        }
        widget.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Widget", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ScrollViewActivity::class.java)
            startActivity(intent)
        }
        settings.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Settings", Toast.LENGTH_LONG).show()
            var intent = Intent(this, FragmentActivity::class.java)
            startActivity(intent)
        }
        logout.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Logout", Toast.LENGTH_LONG).show()
            var box= AlertDialog.Builder(this)

            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("PROCCED", DialogInterface.OnClickListener { dialog, id -> finish()  })
            box.setNegativeButton("CANCEL", DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

            var alert=box.create()
            alert.setTitle("Saint app")
            alert.show()
        }
    }
}