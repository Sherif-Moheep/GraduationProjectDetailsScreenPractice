import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.Adjust
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Issue(
    val title: String,
    val subtitle: String,
    val status: String,
    val createdAt: String
)

val dummyIssues = listOf(
    Issue(
        title = "Bump pyarrow from 7...",
        subtitle = "NONE",
        status = "Open",
        createdAt = "2023-11-9, 23:0 PM"
    ),
    Issue(
        title = "Français",
        subtitle = "NONE",
        status = "Open",
        createdAt = "2023-11-2, 9:38 AM"
    ),
    Issue(
        title = "Bump werkzeug from ...",
        subtitle = "NONE",
        status = "Open",
        createdAt = "2023-10-25, 18:52 PM"
    ),
    Issue(
        title = "Bump urllib3 from 1.2...",
        subtitle = "NONE",
        status = "Open",
        createdAt = "2023-10-17, 22:59 PM"
    ),
    Issue(
        title = "ORQA fine tuning with...",
        subtitle = "NONE",
        status = "Open",
        createdAt = "2023-10-9, 15:3 PM"
    ),
    Issue(
        title = "Bump pillow from 9.2...",
        subtitle = "NONE",
        status = "Open",
        createdAt = "2023-10-4, 0:35 AM"
    )
)


@Composable
fun IssueItem(issue: Issue) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .clickable {  },
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                imageVector = Icons.Outlined.Adjust,
                contentDescription = "",
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = issue.title,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = issue.subtitle,
                    color = Color.DarkGray,
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Created At: ${issue.createdAt}",
                    color = Color.Gray,
                    fontSize = 12.sp
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = issue.status,
                color = Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IssuesScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Issues") },
                navigationIcon = {
                    IconButton(onClick = {  }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = ""
                        ) }
                })
            }
        ) { paddingValues ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                items(dummyIssues) {
                    IssueItem(issue = it)
                }
            }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun IssuesScreenLightPreview() {
    IssuesScreen()
}