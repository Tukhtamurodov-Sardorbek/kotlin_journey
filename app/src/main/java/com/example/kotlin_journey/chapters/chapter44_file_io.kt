package com.example.kotlin_journey.chapters

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main(){
    val file = File("exampleFile.txt").also {
        if(!it.exists()){
            it.createNewFile()
            it.writeText("Example text")
        }
    }

    file.readLines().forEach{
        println(it)
    }

    // BufferedReader is better than readLines
    val bufferedReaderExample = BufferedReader(FileReader(file))
    val bufferedReaderExample2 = file.bufferedReader()
    var line: String?

    bufferedReaderExample2.use {
        while((bufferedReaderExample2.readLine().also { line = it}) != null){
            println(line)
        }
    }

    val buffereWriterExample = file.bufferedWriter()

}