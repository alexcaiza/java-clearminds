package com.herencia;

public class HerenciaSnakeHandler {
    
    private Snake snake;
    
    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public static void main(String[] args) {
        
        new HerenciaSnakeHandler().setSnake(null);
        //new TestHerenciaSnakeHandler().setSnake(new GardenSnake());
        new HerenciaSnakeHandler().setSnake(new Snake());
        new HerenciaSnakeHandler().setSnake(new Cobra());
        //new TestHerenciaSnakeHandler().setSnake(new Object());

    }

}

class Snake { }

class GardenSnake { }

class Cobra extends Snake { }


