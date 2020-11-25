public class OutOfStockException extends Exception{
    public OutOfStockException() {
        super("You are trying to buy more than there is stock. - this is an Exception");
    }
}
