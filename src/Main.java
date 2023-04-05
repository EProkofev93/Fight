public class Main {
    public static void main(String[] args) {
        Throll Ork = new Throll();
        Dwarf Thorin = new Dwarf();

        Fight();

        if (!Throll.alive) {
            System.out.println("Троль погиб");
        }
        if (!Dwarf.alive) {
            System.out.println("Гном погиб");
        }
    }


        public static void Fight() {
            while (Throll.alive && Dwarf.alive) {

                Dwarf.hp = Dwarf.hp - Throll.strong;
                Dwarf.alive = Dwarf.hp > 0;
                System.out.println(Dwarf.hp);

                Throll.hp = Throll.hp - Dwarf.strong;
                Throll.alive = Throll.hp > 0;

                System.out.println(Throll.hp);


            }


        }


    }
