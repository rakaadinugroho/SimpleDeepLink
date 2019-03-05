package com.rakaadinugroho.simpledeeplink

import android.content.Context
import android.content.Intent
import com.airbnb.deeplinkdispatch.DeepLink
import com.airbnb.deeplinkdispatch.DeepLinkModule

@DeepLinkModule
class AppDeepLinkModule

@DeepLink("grab://payment")
fun openPayment(context: Context): Intent{
    return Intent(context, DetailPaymentActivity::class.java)
}