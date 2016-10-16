// Learn more about F# at http://fsharp.org
// See the 'F# Tutorial' project for more help.
open System

[<EntryPoint>]
let main argv = 
    let x : int = 5
    let mutable tot = 0;
    for i = x-1 downto 1 do
        tot <- tot * i
    Console.WriteLine(tot)
    Console.ReadLine() |> ignore
    0 // return an integer exit code
