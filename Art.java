public class Art {
    public static void main(String[] args){
        Turtle bob = new Turtle(0,-180);
        Turtle bob2 = new Turtle(0,-180);
        Turtle bob3 = new Turtle(180, 90);
        Turtle bob4 = new Turtle(-180, 90);

        bob.speed(2);
        bob2.speed(2);
        bob3.speed(2);
        bob4.speed(2);

        for(int i = 0; i < 36; i++){
            bob.backward(5);
            bob2.forward(5);
        }
        for(int i = 0; i < 10; i++){
                bob3.setDirection(140);
                bob4.setDirection(40);
                bob.setDirection(90);
                bob2.setDirection(90);
                bob.forward(27);
                bob2.forward(27);
                if(i < 5){
                bob3.forward(45.5);
                bob4.forward(45.5);
                }
        }
        for(int i = 0; i<51; i++){
            bob.setDirection(0);
            bob.forward(7.07);
        }
        Turtle bob5 = new Turtle(-45, -180);
        bob5.speed(2);
        for(int i = 0; i < 100;i++){
            if(i < 25){
            bob5.setDirection(90);
            bob5.forward(4);
        }
            if(i > 25 & i < 50){
                bob5.setDirection(0);
                bob5.forward(4);
            }
            if(i > 50 & i < 75){
                bob5.setDirection(270);
                bob5.forward(4);                
            }
        }
    }
}