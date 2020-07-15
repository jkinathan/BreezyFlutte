package com.breezy.app_360_deliveries

import android.os.Bundle

import io.flutter.plugins.GeneratedPluginRegistrant
import android.view.WindowManager.LayoutParams
import io.flutter.app.FlutterFragmentActivity

class MainActivity: FlutterFragmentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GeneratedPluginRegistrant.registerWith(this)
    getWindow().addFlags(LayoutParams.FLAG_SECURE)
  }
}