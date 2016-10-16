using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PGCD
{
    class Program
    {
        static void Main(string[] args)
        {
            int number1 = 3;
            int number2 = 15;
    
            Console.WriteLine(PGCD(number1,number2));
            Console.WriteLine((number1 * number2) / PGCD(number1, number2));

            Console.ReadLine();

        }

        public static int PGCD(int n1, int n2)
        {
            int res = 0;

            if (n2 == 0)
            {
                return n1;
            }

            res = n1 % n2;

            return PGCD(n2, res);
        }
    }
}
