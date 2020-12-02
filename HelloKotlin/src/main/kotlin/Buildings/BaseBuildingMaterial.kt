package Buildings

// Lesson 5.11
open class BaseBuildingMaterial(open val numberNeeded: Int = 1) {

}

class Wood: BaseBuildingMaterial(4)

class Brick: BaseBuildingMaterial(8)

class Building<T: BaseBuildingMaterial>(val material: T) {
    var baseMaterialsNeeded: Int = 100
    var actualMaterialsNeeded: Int = material.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("Type: ${material::class.simpleName}. Number Needed: ${actualMaterialsNeeded}")
    }
}

fun main(args: Array<String>) {
    val building = Building<Wood>(Wood()).build()
}