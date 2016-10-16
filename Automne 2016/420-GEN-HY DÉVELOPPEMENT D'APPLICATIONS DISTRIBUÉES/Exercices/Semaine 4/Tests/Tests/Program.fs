// Learn more about F# at http://fsharp.org
// See the 'F# Tutorial' project for more help.
open System

// Test 1

//let redefineX() =
//    let x = "One"
//    printfn "Redefining:\r\nx = %s" x
//    if true then
//        let x = "Two"
//        printfn "x = %s" x
//    printfn "x = %s" x
//
//let mutableX() = 
//    let mutable x = "One"
//    printfn "Redefining:\r\nx = %s" x
//    if true then
//        let x = "Two"
//        printfn "x = %s" x
//    printfn "x = %s" x
//
//redefineX()
//mutableX()
    
// Test 2
let main argv =
    let x=10
    let x = 6 in x * x
    printfn "WhoopingWombat x = : %d" x
    Console.ReadLine() |> ignore
    0