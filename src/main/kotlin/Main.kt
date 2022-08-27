fun main(args: Array<String>) {
/*
    var persona1 = Persona() //creacion objeto tipo Persona
    persona1.rut="12.345.678-9"
    persona1.nombre="JUANITO PÉREZ"
    persona1.edad=40
    persona1.altura = 1.85
    persona1.peso=80.0

    persona1.Verificar()
    persona1.Imprimir()
*/
    //ingresoDatos()
    var persona2 = Persona("12.345.567-8","Juliana",34,1.68,76.0)
    persona2.Verificar()
    persona2.Imprimir()
}

fun ingresoDatos(){

    var cualquierPersona = Persona()
    println("Ingrese su RUT")
    cualquierPersona.rut = readln()
    println("Ingrese su nombre")
    cualquierPersona.nombre = readln()
    println("Ingrese edad")
    cualquierPersona.edad = readln().toInt()
    println("Ingrese altura")
    cualquierPersona.altura = readln().toDouble()
    println("Ingrese peso")
    cualquierPersona.peso = readln().toDouble()
    //mostrar información ingresada
    println("Información ingresada")
    cualquierPersona.Verificar()
    //mostrar resultado
    cualquierPersona.Imprimir()

}

