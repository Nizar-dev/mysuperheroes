package apps.nb.working.mysuperheros.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SuperHero(
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val poster: Int,
)
