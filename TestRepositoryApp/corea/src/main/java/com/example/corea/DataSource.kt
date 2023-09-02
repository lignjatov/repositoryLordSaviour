package com.example.corea
import com.example.corea.entities.Planet
import com.example.corea.entities.UserResponse

//Interface koji definira metode koje svi drugi moduli moraju implementirati. Tu se može dodati stvari ako je potrebno
//Ideja je ako ti treba nešto, onda neka bude tu definirano jer nije potrebno da se sve moguće treba
interface DataSource {
    fun loadUser(username : String) : List<UserResponse>
    //npr trebaju ti planeti
    //fun loadPlanets() : List<Planet>
}