package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz1(Integer number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizz buzz";
        }

        if (number % 3 == 0) {
            return "fizz";
        }

        if (number % 5 == 0) {
            return "buzz";
        }

        return String.valueOf(number);

    }

    public String fizzBuzz(Integer number) {
        return fizzBuzz1(number);
    }

}


