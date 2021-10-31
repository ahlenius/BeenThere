package dev.ahlenius.beenthere

import android.location.Location
import com.google.firebase.database.FirebaseDatabase

class Database {
    private var database =
        FirebaseDatabase.getInstance("https://beenthere-1-default-rtdb.europe-west1.firebasedatabase.app")

    fun addLocation(lastLocation: Location) {
        val locations = database.getReference("locations")
        locations.updateChildren(mapOf(lastLocation.time.toString() to lastLocation))
    }
}