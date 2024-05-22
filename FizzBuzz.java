interface FizzBuzz{
    public void print(int from, int to);
}

class ConsoleBasedFizzBuzz implements FizzBuzz{
    @Override
    public void print(int from, int to){
        for(int i = from; i <= to; i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
class Main{
    public static void main(String [] args){
        ConsoleBasedFizzBuzz Prueba1 = new ConsoleBasedFizzBuzz();
        Prueba1.print(1, 100);
    }
}