package com.tutor.wallet_app.persentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.Upload
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tutor.wallet_app.ui.theme.fontPoppins

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
	val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
	Scaffold(
		modifier = modifier
			.fillMaxWidth()
			.nestedScroll(scrollBehavior.nestedScrollConnection),
		topBar = { TopBar(scrollBehavior = scrollBehavior) },
	) { paddingValue ->
		Column(
			modifier = modifier
				.padding(paddingValue)
				.fillMaxWidth()
				.padding(16.dp)
		) {
			CardAvatar()
			ActionCard(modifier = Modifier.fillMaxSize())
		}
	}
}

@Composable
private fun CardAvatar(modifier: Modifier = Modifier) {
	Box(modifier) {
		Box(
			modifier = Modifier
				.fillMaxWidth()
				.padding(horizontal = 20.dp)
				.height(100.dp)
				.clip(MaterialTheme.shapes.medium)
				.background(
					brush = Brush.horizontalGradient(
						listOf(
							MaterialTheme.colorScheme.primaryContainer,
							MaterialTheme.colorScheme.primaryContainer.copy(red = 0.5f)
						)
					)
				)
		)
		ElevatedCard(
			modifier = Modifier
				.fillMaxWidth()
				.height(240.dp)
				.padding(vertical = 10.dp),
			elevation = CardDefaults.cardElevation(6.dp),
//			shape = RoundedCornerShape(20.dp)
		) {
			CardContent(modifier = Modifier.fillMaxSize())

		}
	}

}

@Composable
fun ActionCard(modifier: Modifier = Modifier) {
	Row(
		modifier = modifier.padding(10.dp),
		horizontalArrangement = Arrangement.SpaceBetween
	) {

		ActionItem(Icons.Default.Upload, title = "Send")
		ActionItem(Icons.Default.Download, title = "Received")
		ActionItem(Icons.Default.History, title = "History")
		ActionItem(Icons.Default.Person, title = "Profile")
	}

}

@Composable
fun ActionItem(
	icon: ImageVector,
	modifier: Modifier = Modifier,
	title: String
) {
	Column(
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.spacedBy(8.dp)
	) {
		IconButton(
			onClick = {},
			colors = IconButtonDefaults.iconButtonColors(
				contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
				containerColor = MaterialTheme.colorScheme.primaryContainer,
			),
			modifier = modifier.size(60.dp)
		) {
			Icon(
				imageVector = icon,
				contentDescription = "Icon Up",
				modifier = modifier
					.size(30.dp)

			)
		}
		Text(
			text = title,
			style = MaterialTheme.typography.titleMedium,
			fontFamily = fontPoppins,
			fontWeight = FontWeight.SemiBold
		)
	}
}

@Composable
fun CardContent(modifier: Modifier = Modifier) {
	Box(
		modifier = modifier.background(
			brush = Brush.linearGradient(
				listOf(
					MaterialTheme.colorScheme.primaryContainer.copy(blue = 0.5f),
					MaterialTheme.colorScheme.primaryContainer,
				)
			)
		)
	)
	{
		Icon(
			imageVector = Icons.Default.Public,
			contentDescription = "Icon globle",
			tint = MaterialTheme.colorScheme.background,
			modifier = Modifier
				.align(Alignment.BottomEnd)
				.size(200.dp)
				.offset(
					x = 30.dp,
					y = 50.dp
				)
		)
		Column(
			modifier = Modifier
				.fillMaxWidth()
				.padding(22.dp)
				.align(Alignment.TopCenter),
			verticalArrangement = Arrangement.spacedBy(8.dp)

		) {
			Text(
				"My Balance",
				fontFamily = fontPoppins,
				fontWeight = FontWeight.SemiBold,
				style = MaterialTheme.typography.headlineSmall,
			)
			Text(
				text = "$500.00",
				fontFamily = fontPoppins,
				style = MaterialTheme.typography.titleLarge,

				)
			Text(
				text = "5169-4756-2985-4852",
				fontFamily = fontPoppins,
				fontWeight = FontWeight.Bold,
				style = MaterialTheme.typography.titleLarge,
			)
			Row(
				modifier = Modifier.fillMaxWidth(),
				horizontalArrangement = Arrangement.SpaceBetween
			) {
				Text("")
				Text(
					text = "Vista",
					fontFamily = fontPoppins,
					fontWeight = FontWeight.Bold,
					fontSize = 40.sp,
					style = TextStyle(
						brush = Brush.linearGradient(
							colors = listOf(
								MaterialTheme.colorScheme.primary,
								MaterialTheme.colorScheme.primary.copy(green = 0.5f)
							)
						)
					)
				)
			}

		}
	}

}

@Preview
@Composable
private fun HomeScreenPrev() {
	HomeScreen()
}
