using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SuiteFibonacci
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(CalculerSuite(9));
            Console.ReadLine();
        }

        static int CalculerSuite(int nombre)
        {
            if (nombre <= 0)
                return 0;
            if (nombre <= 1)
                return 1;
            
            return CalculerSuite(nombre - 1) + CalculerSuite(nombre - 2);
        }
    }
}
