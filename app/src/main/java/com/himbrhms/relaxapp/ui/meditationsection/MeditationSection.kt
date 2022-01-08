package com.himbrhms.relaxapp.ui.meditationsection

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.himbrhms.relaxapp.R
import com.himbrhms.relaxapp.ui.theme.*
import com.himbrhms.relaxapp.ui.util.waves.WavesPainting

@Composable
fun MeditationSection(
    color: Color = DarkRed
) {
    BoxWithConstraints(
        modifier = Modifier
            .padding(7.5.dp)
            .aspectRatio(3f)
            .clip(RoundedCornerShape(10.dp))
            .background(DarkRed)
    ) {
        WavesPainting(
            maxWidth = constraints.maxWidth,
            maxHeight = constraints.maxHeight,
            color1 = LightRed,
            color2 = MediumRed
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(15.dp)
                .clip(RoundedCornerShape(10.dp))
                .padding(horizontal = 15.dp, vertical = 10.dp)
                .fillMaxWidth()
        ) {
            Column {
                Text(
                    text = "Daily Thought",
                    style = MaterialTheme.typography.h4
                )
                Text(
                    text = "Meditation • 3-10 min",
                    style = MaterialTheme.typography.body1,
                    color = TextWhite
                )
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(ButtonBlue)
                    .padding(10.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_play),
                    contentDescription = "Play",
                    tint = Color.White,
                    modifier = Modifier.size(16.dp)
                )
            }
        }
    }
}
