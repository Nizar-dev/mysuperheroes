package apps.nb.working.mysuperheros

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import apps.nb.working.mysuperheros.model.SuperHero

/**
 * List Element that represents a superhero
 */

@Composable
fun HeroElement(hero: SuperHero) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        modifier = Modifier
            .padding(16.dp)

    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)

                .fillMaxWidth()) {
            Column(
                modifier = Modifier.weight(1f).height(72.dp)
            ) {
                Text(
                    text = stringResource(id = hero.name),
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(top = 4.dp)
                )
                Text(
                    text = stringResource(id = hero.description),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }

            Image(
                painter = painterResource(id = hero.poster),
                contentDescription = "hero image",
                modifier = Modifier
                    .size(72.dp)
                    .width(72.dp)
                    .clip(MaterialTheme.shapes.small ),
                contentScale = ContentScale.Crop,
            )
        }
    }
}
