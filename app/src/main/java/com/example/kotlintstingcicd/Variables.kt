package com.example.kotlintstingcicd
/**
 * This is a documentation comment
 * Variables in Kotlin can be declared using either var or val
 * var is like a general variable
 * val is like a constant
 *
 * Kotlin is a statically typed language, meaning that the type of every variable is known at compile-time
 * Kotlin has a feature called type inference, which allows the compiler to infer types
 *
 * naming convention for variables and functions is camelCase
 */
fun main() {
	println("Hello, world!!!")
	numericTypes()
	alfabet()
	stringExample()
}

fun numericTypes() {
	val a: Byte = 1
	val b: Short = 2
	val c: Int = 3
	// Int -2147483649..2147483647 (32-bit)
	val d: Long = 4
	// Long -9223372036854775809..9223372036854775807 (64-bit)val a: Byte = 1
	val e: Float = 5.0f
	val f: Double = 6.0
	// Double 4.9E-324..1.7976931348623157E308 (64-bit)
	val g: Char = 'a'
	// Char '\u0000'..'\uffff' (16-bit) (Unicode) (UTF-16)
	val h: Boolean = true
}

fun alfabet() {
	val alfabet = 'a'..'z'
	println(alfabet)
}

fun stringExample() {
	val name = "John"
	val surname = "Doe"
	val fullname: String = "$name $surname"
	println(fullname)
}