package com.tutor.wallet_app.persentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Games
import androidx.compose.material.icons.rounded.LocalHospital
import androidx.compose.material.icons.rounded.Restaurant
import androidx.compose.material.icons.rounded.ShoppingBag
import androidx.compose.material.icons.rounded.Subscriptions
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.tutor.wallet_app.ui.theme.fontPoppins
import kotlin.random.Random

@Composable
fun SpendingSelection(modifier: Modifier = Modifier) {
	Column(
		modifier
			.fillMaxWidth()
			.padding(5.dp)
	) {
		Text(
			"Spending Breakdown",
			fontFamily = fontPoppins,
			fontWeight = FontWeight.SemiBold,
			style = MaterialTheme.typography.titleLarge
		)
		LazyRow(
			modifier = modifier.padding(vertical = 10.dp),
			horizontalArrangement = Arrangement.spacedBy(10.dp)
		) {
			items(spendingList) {
				SpendingItem(it)
			}
		}
	}

}

@Composable
private fun SpendingItem(
	spendingList: SpendingData,

	modifier: Modifier = Modifier
) {
	ElevatedCard(
		modifier
			.size(width = 150.dp, height = 130.dp)
			.fillMaxWidth(),
		colors = CardDefaults.cardColors(
			containerColor = spendingList.color
		),
		elevation = CardDefaults.elevatedCardElevation(4.dp)
	) {
		Column(
			modifier = modifier
				.fillMaxWidth()
				.padding(20.dp)
		) {
			Icon(
				imageVector = spendingList.icon,
				contentDescription = "Icon ${spendingList.name}",
				tint = MaterialTheme.colorScheme.onPrimaryContainer,
				modifier = modifier.size(30.dp)

			)
			Column(
				modifier = modifier.padding(top = 10.dp),
			) {
				Text(
					spendingList.name,
					fontFamily = fontPoppins,
					maxLines = 1,
					overflow = TextOverflow.Ellipsis
				)
				Text(
					"$${spendingList.amount}",
					fontFamily = fontPoppins,
					fontWeight = FontWeight.SemiBold,
					style = MaterialTheme.typography.titleMedium
				)
			}
		}
	}
}

val spendingList = listOf(
	SpendingData(
		name = "Food",
		amount = 100f,
		color = randomColor(),
		icon = Icons.Rounded.Restaurant
	),
	SpendingData(
		name = "Shopping",
		amount = 177f,
		color = randomColor(),
		icon = Icons.Rounded.ShoppingBag
	),
	SpendingData(
		name = "Subscriptions",
		amount = 76f,
		color = randomColor(),
		icon = Icons.Rounded.Subscriptions
	),
	SpendingData(
		name = "Health",
		amount = 143f,
		color = randomColor(),
		icon = Icons.Rounded.LocalHospital
	),
	SpendingData(
		name = "Play",
		amount = 744f,
		color = randomColor(),
		icon = Icons.Rounded.Games
	),

	)

data class SpendingData(
	val name: String,
	val amount: Float,
	val color: Color,
	val icon: ImageVector
)

fun randomColor(brightness: Int = 100): Color {
	val random = Random
	val red = Random.nextInt(brightness, 256)
	val green = Random.nextInt(brightness, 256)
	val blue = Random.nextInt(brightness, 256)
	return Color(red, green, blue)
}

fun oldRandomColor(): Color {
	val random = java.util.Random()
	val red = random.nextFloat()
	val green = random.nextFloat()
	val blue = random.nextFloat()
	return Color(red, green, blue)
}
