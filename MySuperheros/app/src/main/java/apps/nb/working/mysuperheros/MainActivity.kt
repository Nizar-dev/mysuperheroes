package apps.nb.working.mysuperheros

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import apps.nb.working.mysuperheros.model.SuperHeroesRepo
import apps.nb.working.mysuperheros.ui.theme.MySuperherosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MySuperherosTheme {
                SuperHeroesApp()
            }
        }
    }
}

@Composable
fun SuperHeroesApp(){
    Scaffold(modifier = Modifier.fillMaxSize(),
        topBar = {
            SuperHeroesTopAppBar()
        }) { it ->

        LazyColumn(contentPadding = it) {
            items(SuperHeroesRepo.heroes) {
                HeroElement(it)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SuperHeroesTopAppBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Super Heroes",
                style = MaterialTheme.typography.displayLarge)
        },
        modifier = Modifier.padding(16.dp))
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MySuperherosTheme {
        SuperHeroesApp()
    }
}