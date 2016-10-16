using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hanoi
{
    class Program
    {
        static void Main(string[] args)
        {
            int nbdisk = 8;

            Hanoi(nbdisk, 0, 2, 1);

            Console.ReadLine();
        }

        public static void Hanoi(int nb, int from, int to,int autre)
        {
            if (nb > 0)
            {
                Hanoi(nb - 1, from, autre, to);
                Console.WriteLine($"Déplacé le disque: {nb} de la tour: {from} a la tour: {to}");
                Hanoi(nb - 1, autre, to, from);
            }

        }
    }
}
