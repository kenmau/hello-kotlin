package Spices

// Lesson 4.12 Data Classes
data class SpiceContainer(val spice: Spice, val label: String = "Spice: " + spice.name) {}