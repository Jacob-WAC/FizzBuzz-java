public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (number % 15 == 0){
          return "FizzBuzz";
        } else if (number % 5 == 0){
          return "Buzz";
        } else if (number % 3 == 0){
          return "Fizz";
        }  else {
          String numString = String.valueOf(number);
          return numString;
        }

    }
    
    // NINJA BONUS:
    // Create an overloaded method for fizzBuzz
    public String fizzBuzz(
        // Parameters
        int number,  
        String multOf3Word, 
        String multOf5Word,
        String multOf15Word
        ) {
          if (number % 15 == 0){
            return multOf15Word;
          } else if (number % 5 == 0){
            return multOf5Word;
          } else if (number % 3 == 0){
            return multOf3Word;
          }  else {
            String numString = String.valueOf(number);
            return numString;
          }
        
        
    }
}

