using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PPCM
{
    class Program
    {
        static void Main(string[] args)
        {
            int number1 = 24;
            int number2 = 30;

            Console.WriteLine(PPCM(number1, number2));
            Console.ReadLine();
        }

        public static int PPCM(int n1, int n2)
        {
            if (n2 == 0)
            {
                return n1;
            }

            return PPCM(n2, n1 % n2);

        }
    }
}
