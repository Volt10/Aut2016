using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RecursivitéFactoriel
{
    class Program
    {

        


        static void Main(string[] args)
        {
            int value = 0;
            string res = "";

            Console.WriteLine("Ecrivez la valeur: ");
            value = Int32.Parse(Console.ReadLine());

            //res = CalculerIteration(value).ToString();
            res = CalculerRecursion(value).ToString();

            Console.WriteLine(res);
            Console.ReadLine();
        }

        static int CalculerIteration(int nombre)
        {
            int val = 1;

            for (int i = nombre; i > 0 ; i--)
            {
                val *= val;
            }

            return val;
        }

        static int CalculerRecursion(int nombre)
        {
            if (nombre < 1)            
                return 1;            
            else           
                return nombre *= CalculerRecursion(nombre - 1);            
        }
    }
}
