class Persona {
    //atributos
    lateinit var rut :String
    lateinit var nombre :String
    var edad :Int =0
    var altura = 0.0   //metros por ejemplo 1.85 metros será equivalente a 185cm
    var peso = 0.0




    //métodos /funciones / acciones / procedimientos

    fun IMC(): Double
    {

        var imc = 0.0 //variable local
        imc = this.peso/(this.altura*this.altura)
        //imc =this.peso/Math.pow(this.altura,2.0)
        return imc

    }

    fun Verificar()
    {
       println("Rut: ${this.rut}")
       println("Nombre: ${this.nombre}")
       println("Edad: ${this.edad} años")
       println("Altura: ${this.altura} metros")
       println("Peso ${this.peso} kg")

    }

    fun Clasificacion(imc:Double ) {

        println("Clasificación IMC $imc")

        if (imc<16.0)
            println("INFRAPESO: Delgadez Severa")
        else if(imc>=16.0 && imc<=16.99)
            println("INFRAPESO: Delgadez Moderada")
        else if(imc>=17.0 && imc<=18.49)
            println("INFRAPESO: Delgadez Aceptable")
        else if(imc>=18.5 && imc<=24.99)
            println("Peso Normal")
        else if(imc>=25.0 && imc<=29.99)
            println("Sobrepeso")
        else if(imc>=30.0 && imc<=34.99)
            println("OBESO: Tipo I")
        else if(imc>=35.0 && imc<=40.0)
            println("OBESO: Tipo II")
        else
            println(" OBESO: Tipo III")

    }


    fun Imprimir()
    {
        val imc_local = IMC()
        println("el IMC es $imc_local")
        Clasificacion(imc_local)




    }

    //construtores
    constructor()
    {

    }

    constructor(rut:String,nombre:String,edad:Int,altura:Double,peso:Double)
    {
       this.rut = rut
       this.nombre=nombre
       this.edad = edad
       this.altura=altura
       this.peso=peso
    }


}