using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InverserMot
{
    class Program
    {
        static void Main(string[] args)
        {
            string mot;
            mot = "";

            Console.WriteLine(InverserMot(mot));
            Console.ReadLine();
        }

        static string InverserMot(string mot)
        {
            if (mot.Length > 0)
                return mot[mot.Length - 1] + InverserMot(mot.Substring(0, mot.Length - 1));
            else
                return mot;
        }
    }
}
