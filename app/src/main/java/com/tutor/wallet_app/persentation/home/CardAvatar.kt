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
import androidx.compose.material.icons.filled.Public
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tutor.wallet_app.ui.theme.fontPoppins

@Composable
fun CardAvatar(modifier: Modifier = Modifier) {
	Column {
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
