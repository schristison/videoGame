public class Character{
    private String name;
    private int energy;
    private int lifes;
    private int attackPoints;
    

    //create a constructor
    public Character(String name, int energy, int attackPoints){
        this.name=name;
        this.energy=energy;
        this.attackPoints=attackPoints;
        this.lifes=3;
    }

    //getters
    public String getName(){
        return this.name;
    }

        public int getenergy(){
            return this.energy;
        }

        
        public int getAttackPoints(){
            return this.attackPoints;
        }
    //methods
        public void display(){
            System.out.println("__________________");
            System.out.println(" =D " + this.lifes);
            System.out.println("Name: " + this.name);
            System.out.println("Life Points: " + this.energy);
            System.out.println("Attack Points: " + this.attackPoints);
        }

        //create attack methods

        public void attack(Character opponent){
            System.out.println(this.name + " is attacking ... " + opponent.name);

            //create some variables
            /*int opponentLP=opponent.energy;
            int attackp=this.attackPoints;

            int newLP = opponentLP-attackp;*/

            //replace the above three lines of code with one line

            int newLP = opponent.energy-this.attackPoints;


            //assignation
            opponent.energy=newLP;
            opponent.display();

            if(opponent.energy <= 0){
                opponent.lifes=opponent.lifes-1;
                opponent.energy=100;
                opponent.display();

                 //when the characters have 0 lifes, print gameover on the console

             if(opponent.lifes == 0){
                System.out.println("Game over");
                System.exit(1);
            }


            }

            

        }

}