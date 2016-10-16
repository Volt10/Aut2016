// Learn more about F# at http://fsharp.org
// See the 'F# Tutorial' project for more help.

open System

[<EntryPoint>]
let main argv = 
    let a = 10
    let mutable b = 100
    for i = a to b do
        if(i % 2 = 0) then
            printfn "%d" i 
    Console.ReadLine() |> ignore
    0 // return an integer exit code
