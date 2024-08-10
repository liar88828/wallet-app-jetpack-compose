package com.tutor.wallet_app.persentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tutor.wallet_app.ui.theme.fontPoppins
import me.bytebeats.views.charts.bar.BarChart
import me.bytebeats.views.charts.bar.BarChartData
import me.bytebeats.views.charts.bar.render.label.SimpleLabelDrawer
import me.bytebeats.views.charts.bar.render.xaxis.SimpleXAxisDrawer
import me.bytebeats.views.charts.bar.render.yaxis.SimpleYAxisDrawer

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
			ActionCard()
			SpendingSelection()
			SpendingGraph()
		}
	}
}

@Preview
@Composable
private fun HomeScreenPrev() {
	HomeScreen()
}

@Composable
fun SpendingGraph(modifier: Modifier = Modifier) {
	Column(
		modifier
			.fillMaxWidth()
			.padding(5.dp)
	) {
		Text(
			"Spending Breakdown",
			fontFamily = fontPoppins,
			fontWeight = FontWeight.SemiBold,
			style = MaterialTheme.typography.titleLarge,
			modifier = modifier.padding(bottom = 20.dp)
		)

		BarChart(
			modifier = modifier,
			barChartData = BarChartData(spendingByDay),
			xAxisDrawer = SimpleXAxisDrawer(
				axisLineThickness = 2.dp,
				axisLineColor = colorScheme.onBackground.copy(alpha = 0.5f),
			),
			yAxisDrawer = SimpleYAxisDrawer(
				labelValueFormatter = { "${it.toInt()}" },
				axisLineThickness = 2.dp,
				axisLineColor = colorScheme.onBackground.copy(alpha = 0.5f),
			),
			labelDrawer = SimpleLabelDrawer(
				drawLocation = SimpleLabelDrawer.DrawLocation.XAxis,
				axisLabelFormatter = { "$it" },
			)
		)

	}
}

val spendingByDay = listOf(
	BarChartData.Bar(
		label = "Mon",
		value = 100f,
		color = randomColor()
	),
	BarChartData.Bar(
		label = "Tue",
		value = 177f,
		color = randomColor()
	),
	BarChartData.Bar(
		label = "Wed",
		value = 76f,
		color = randomColor()
	),
	BarChartData.Bar(
		label = "Thu",
		value = 143f,
		color = randomColor()
	),
	BarChartData.Bar(
		label = "Fri",
		value = 744f,
		color = randomColor()
	),
	BarChartData.Bar(
		label = "Sat",
		value = 100f,
		color = randomColor()
	),
	BarChartData.Bar(
		label = "Sun",
		value = 177f,
		color = randomColor()
	),

	)