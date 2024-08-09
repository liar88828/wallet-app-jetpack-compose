package com.tutor.wallet_app.persentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tutor.wallet_app.R
import com.tutor.wallet_app.ui.theme.fontPoppins

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
	scrollBehavior: TopAppBarScrollBehavior,
	modifier: Modifier = Modifier
) {

	TopAppBar(
		modifier = modifier.fillMaxWidth(),
		scrollBehavior = scrollBehavior,
		title = {
			Box(
				modifier
					.fillMaxWidth()
					.padding(end = 20.dp)
			) {
				Box(
					modifier
						.clip(CircleShape)
						.size(40.dp)
						.background(MaterialTheme.colorScheme.primaryContainer)
						.align(Alignment.CenterStart)
				)
				Text(
					text = "Wallet App",
					fontSize = 26.sp,
					fontFamily = fontPoppins,
					fontWeight = FontWeight.SemiBold,
					color = MaterialTheme.colorScheme.onBackground,
					modifier = Modifier
						.padding(start = 12.dp)
						.align(Alignment.CenterStart)
				)
				Image(
					painter = painterResource(id = R.drawable.ic_launcher_foreground),
					contentDescription = "image user avatar",
					modifier = modifier
						.size(50.dp)
						.clip(MaterialTheme.shapes.medium)
						.align(Alignment.CenterEnd)
				)

			}
		},
		actions = {
			// Actions
		}
	)
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
private fun TopBarPrev() {
	TopBar(
		scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
	)
}
