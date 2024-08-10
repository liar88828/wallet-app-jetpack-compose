package com.tutor.wallet_app.persentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Upload
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tutor.wallet_app.ui.theme.fontPoppins

@Composable
fun ActionCard(modifier: Modifier = Modifier) {
	Row(
		modifier = modifier
			.fillMaxWidth()
			.padding(10.dp),
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
			modifier = modifier
				.shadow(
					shape = CircleShape,
					elevation = 5.dp,
//					clip = true,
				)
				.size(60.dp)
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

@Preview(showBackground = true)
@Composable
private fun ActionCardPrev() {
	ActionCard()
}