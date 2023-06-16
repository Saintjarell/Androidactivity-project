package com.example.jarellxml

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.NonCancellable.cancel

class AlertDialogueActivity : AppCompatActivity() {
    lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialogue)

        btn=findViewById(R.id.Btn)

        btn.setOnClickListener {
            var box=AlertDialog.Builder(this)
            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("PROCCED",DialogInterface.OnClickListener { dialog, id -> finish()  })
            box.setNegativeButton("CANCEL",DialogInterface.OnClickListener { dialog, id -> cancel()  })

            var alert=box.create()
            alert.setTitle("Saint app")
            alert.show()
    }
  }
}