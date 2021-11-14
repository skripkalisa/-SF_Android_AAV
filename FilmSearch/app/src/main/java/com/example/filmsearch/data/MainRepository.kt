package com.example.filmsearch.data

import com.example.filmsearch.R
import com.example.filmsearch.domain.Film

class MainRepository {
        internal val filmsDataBase = listOf(
        Film(
            "The Shawshank Redemption",
            R.drawable.shawshank,
            "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
            9.7f
        ),
        Film(
            "The Godfather",
            R.drawable.god_father,
            "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
            9.2f
        ),
        Film(
            "The Dark Knight",
            R.drawable.dark_knight,
            "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.",
            8.9f
        ),
        Film(
            "Pulp Fiction",
            R.drawable.pulp,
            "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
            9.0f
        ),
        Film(
            "Inception",
            R.drawable.inception,
            "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.",
            8.7f
        ),
        Film(
            "Hamilton",
            R.drawable.hamilton,
            "The real life of one of America's foremost founding fathers and first Secretary of the Treasury, Alexander Hamilton. Captured live on Broadway from the Richard Rodgers Theater with the original Broadway cast.",
            5.7f
        ),
        Film(
            "Gisaengchung",
            R.drawable.parasite,
            "Greed and class discrimination threaten the newly formed symbiotic relationship between the wealthy Park family and the destitute Kim clan.",
            7.9f
        ),
        Film(
            "Interstellar",
            R.drawable.interstellar,
            "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
            8.4f
        ),
        Film(
            "Joker",
            R.drawable.joker,
            "In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. This path brings him face-to-face with his alter-ego: the Joker.",
            9.2f
        ),
        Film(
            "1917",
            R.drawable.seventeen,
            "April 6th, 1917. As a regiment assembles to wage war deep in enemy territory, two soldiers are assigned to race against time and deliver a message that will stop 1,600 men from walking straight into a deadly trap.",
            6.7f
        )

    )
}