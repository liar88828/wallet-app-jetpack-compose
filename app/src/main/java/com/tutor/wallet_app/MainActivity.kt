package com.tutor.wallet_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tutor.wallet_app.ui.theme.WalletAppTheme
import com.tutor.wallet_app.ui.theme.fontPoppins

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			WalletAppTheme {
				Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
					Greeting(
						name = "Android",
						modifier = Modifier.padding(innerPadding)
					)
				}
			}
		}
	}
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
	Column {

		Text(
			text = "Hello $name!",
			modifier = modifier
		)
		Text(
			text = "Hello $name!",
			fontFamily = fontPoppins
		)
	}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
	WalletAppTheme {
		Greeting("Android")
	}
}