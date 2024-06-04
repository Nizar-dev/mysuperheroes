package apps.nb.working.pocnavigation2.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import apps.nb.working.pocnavigation2.R
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(navController: NavController,
               ) {

    Scaffold(
        topBar = { },
        bottomBar = { }
    ) {


        // Vue principale
        Column(modifier = Modifier.padding(it)) {

            Image(painter = painterResource( R.drawable.bellebouche),
                contentDescription = "Belle Bouche")
            Spacer(modifier = Modifier.height(16.dp))
        }
    }


}











