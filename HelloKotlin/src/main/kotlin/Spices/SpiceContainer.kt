package Spices

// Lesson 4.12 Data Classes
// For creating objects that only have properties without additional functionality
data class SpiceContainer(val spice: Spice, val label: String = "Spice: " + spice.name) {}