public class Main{
    public static void main(String[] args){
        Turtle sky = new Turtle();
        sky.speed(50);
        sky.penColor("black");

        //draw circle for sun
        for (int i = 0; i < 36; i++) {
            sky.forward(60);
            sky.right(20);
        }

        //draw light of sun and moon inside sun
        for (int i = 0; i < 53; i++) {
            sky.left(81.9);
            sky.forward(212.1);
            sky.right(163.8);
            sky.forward(212.1);

            sky.right(298.81);
            sky.forward(60);
            sky.right(20);
            sky.forward(30);
        }

        /////////////////////////////////
        ////////////draw rain////////////
        /////////////////////////////////

        /////draw rain 1/////
        sky.up();
        sky.setPosition(-80,220); //starter for draw rain
        sky.down();
        sky.left(100);

        for(int i = 0; i < 5; i++){ //draw rain 5 line
            sky.forward(45);
            sky.up();
            sky.forward(45);
            sky.down();
        }

        //set starter for draw rain
        sky.up();
        sky.right(180);
        sky.forward(1340);
        sky.down();

        for(int i = 0; i < 9; i++){ //draw rain 9 line
            sky.forward(45);
            sky.up();
            sky.forward(45);
            sky.down();
        }

        /////draw rain 2/////
        sky.up();
        sky.setPosition(-130,210);
        sky.right(180);
        sky.down();

        for(int i = 0; i < 5; i++){ //draw rain 5 line
            sky.forward(45);
            sky.up();
            sky.forward(45);
            sky.down();
        }

        //set starter for draw rain
        sky.up();
        sky.right(180);
        sky.forward(1340);
        sky.down();

        for(int i = 0; i < 9; i++){ //draw rain 9 line
            sky.forward(45);
            sky.up();
            sky.forward(45);
            sky.down();
        }

        /////draw rain 3/////
        sky.up();
        sky.setPosition(-30,230); //starter for draw rain
        sky.down();
        sky.left(180);

        for(int i = 0; i < 5; i++){ //draw rain 5 line
            sky.forward(45);
            sky.up();
            sky.forward(45);
            sky.down();
        }

        //set starter for draw rain
        sky.up();
        sky.right(180);
        sky.forward(1340);
        sky.down();

        for(int i = 0; i < 9; i++){ //draw rain 9 line
            sky.forward(45);
            sky.up();
            sky.forward(45);
            sky.down();
        }

        /////draw rain 4/////
        sky.up();
        sky.setPosition(-180,190); //starter for draw rain
        sky.down();
        sky.left(180);

        for(int i = 0; i < 5; i++){ //draw rain 5 line
            sky.forward(45);
            sky.up();
            sky.forward(45);
            sky.down();
        }

        //set starter for draw rain
        sky.up();
        sky.right(180);
        sky.forward(1320);
        sky.down();

        for(int i = 0; i < 9; i++){ //draw rain 9 line
            sky.forward(45);
            sky.up();
            sky.forward(45);
            sky.down();
        }

        /////draw rain 5/////
        sky.up();
        sky.setPosition(20,240); //starter for draw rain
        sky.down();
        sky.left(180);

        for(int i = 0; i < 5; i++){ //draw rain 5 line
            sky.forward(45);
            sky.up();
            sky.forward(45);
            sky.down();
        }

        //set starter for draw rain
        sky.up();
        sky.right(180);
        sky.forward(1320);
        sky.down();

        for(int i = 0; i < 9; i++){ //draw rain 9 line
            sky.forward(45);
            sky.up();
            sky.forward(45);
            sky.down();
        }
    }
}