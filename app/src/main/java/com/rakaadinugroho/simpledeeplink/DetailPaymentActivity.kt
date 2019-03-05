package com.rakaadinugroho.simpledeeplink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.airbnb.deeplinkdispatch.DeepLink

class DetailPaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_payment)
        val title = findViewById<TextView>(R.id.title)
        if (intent.getBooleanExtra(DeepLink.IS_DEEP_LINK, false)) {
            val params = intent.extras
            title.text = "ID Payment ${params.getString("id")} "
        }
    }
}