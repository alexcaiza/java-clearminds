package cert;

public class TestHerenciaSnakeHandler {
    
    private Snake snake;
    
    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public static void main(String[] args) {
        
        new TestHerenciaSnakeHandler().setSnake(null);
        //new TestHerenciaSnakeHandler().setSnake(new GardenSnake());
        new TestHerenciaSnakeHandler().setSnake(new Snake());
        new TestHerenciaSnakeHandler().setSnake(new Cobra());
        //new TestHerenciaSnakeHandler().setSnake(new Object());

    }

}

class Snake { }

class GardenSnake { }

class Cobra extends Snake { }


