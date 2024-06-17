package apps.nb.working.mysuperheros.model

import apps.nb.working.mysuperheros.R

object SuperHeroesRepo {
    val heroes = listOf(
        SuperHero(
            name = R.string.hero1,
            description = R.string.description1,
            poster = R.drawable.android_superhero1
        ),
        SuperHero(
            name = R.string.hero2,
            description = R.string.description2,
            poster = R.drawable.android_superhero2
        ),
        SuperHero(
            name = R.string.hero3,
            description = R.string.description3,
            poster = R.drawable.android_superhero3
        ),
        SuperHero(
            name = R.string.hero4,
            description = R.string.description4,
            poster = R.drawable.android_superhero4
        ),
        SuperHero(
            name = R.string.hero5,
            description = R.string.description5,
            poster = R.drawable.android_superhero5
        ),
        SuperHero(
            name = R.string.hero6,
            description = R.string.description6,
            poster = R.drawable.android_superhero6
        )
    )
}