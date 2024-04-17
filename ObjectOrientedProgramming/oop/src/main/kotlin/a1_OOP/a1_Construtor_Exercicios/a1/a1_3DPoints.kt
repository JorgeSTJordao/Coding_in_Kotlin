package a1_OOP.a1_Construtor_Exercicios.a1

import kotlin.math.sqrt

class Figure3D(var xyz0: MutableList<Double>, var xyz1: MutableList<Double>){

    var dimensao = 0

    //Dimensão
    constructor(xyz0: MutableList<Double>, xyz1: MutableList<Double>, dimensao: Int):
            this(xyz0, xyz1) {
        this.dimensao = dimensao

        val nomeDimensao = when (xyz0.size) {
            2 -> "Bidimensional"
            3 -> "Tridimensional"
            4 -> "Quadridimensional"
            else -> "Não encontrado"

        }
        println(nomeDimensao)
    }

    //Distância
    fun getDistancePoints(): String{
        var soma = 0.0

        for (i in 0..(xyz0.size - 1)){
            val base = xyz1[i] - xyz0[i]
            soma += Math.pow(base, 2.0)
        }
        return "d = ${sqrt(soma)}"
    }
}


fun main() {
    //l, s, h
    //{x0, y0, z0}
    //{x1, y1, z1}
    val coordenadas0 = mutableListOf(0.0, 0.0, 0.0)
    val coordenadas1 = mutableListOf(8.0, 5.0, 8.0)


    val fg1 = Figure3D(coordenadas0, coordenadas1, coordenadas0.size)
    println(fg1.getDistancePoints())
}