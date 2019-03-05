package com.rakaadinugroho.simpledeeplink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.deeplinkdispatch.DeepLinkHandler

@DeepLinkHandler(AppDeepLinkModule::class)
class HandlerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val delegate = DeepLinkDelegate(AppDeepLinkModuleLoader())
        delegate.dispatchFrom(this)
        finish()
    }
}
