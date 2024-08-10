package com.tutor.wallet_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.tutor.wallet_app.persentation.home.HomeScreen
import com.tutor.wallet_app.ui.theme.WalletAppTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			WalletAppTheme {
				HomeScreen()
			}
		}
	}
}

