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

    boolean searchForADigit(Integer number, Integer search) {
        while (number > 0) {
            if (number % 10 == search) {
                return true;
            }

            number = number/10;
        }

        return false;
    }

    boolean identicalDigits(Integer number) {
        Integer search = number % 10;
        number /= 10;
        while (number > 0) {
            if (number % 10 != search) {
                return false;
            }

            number = number / 10;
        }

        return true;
    }

    public String fizzBuzz2(Integer number) {
        String sol = new String();
        boolean isFizz = false;
        if (number % 3 == 0 || searchForADigit(number, 3)) {
            sol += "fizz";
            isFizz = true;
        }

        if (number % 5 == 0 || searchForADigit(number, 5)) {
           if (isFizz) {
               sol += " ";
           }
           sol += "buzz";
        }

        if (sol.isEmpty()) {
            return number.toString();
        }
        return sol;
    }

    public String fizzBuzz3(Integer number) {
        String sol = new String();
        boolean isFizz = false;
        if (number % 3 == 0 || searchForADigit(number, 3)) {
            sol += "fizz";
            isFizz = true;
        }

        if (number % 5 == 0 || searchForADigit(number, 5)) {
            if (isFizz) {
                sol += " ";
            }
            sol += "buzz";
            isFizz = true;
        }

        if (number > 10 && identicalDigits(number)) {
            if (isFizz) {
                sol += " ";
            }

           if (number % 2 == 1) {
               sol += "fake deluxe";
           } else {
               sol += "deluxe";
           }
        }

        if (sol.isEmpty()) {
            return number.toString();
        }
        return sol;
    }

    public String fizzBuzz4(Integer number) {
        String sol = new String();
        boolean isFizz = false;
        if (number % 3 == 0 || searchForADigit(number, 3)) {
            sol += "fizz";
            isFizz = true;
        }

        if (number % 5 == 0 || searchForADigit(number, 5)) {
            if (isFizz) {
                sol += " ";
            }
            sol += "buzz";
            isFizz = true;
        }

        boolean isDeluxe = false;
        if (number % 3 == 0 && searchForADigit(number, 3)) {
            isDeluxe = true;
        }

        if (number % 5 == 0 && searchForADigit(number, 5)) {
            isDeluxe = true;
        }

        if (isDeluxe) {
            if (isFizz) {
                sol += " ";
            }

            if (number % 2 == 1) {
                sol += "fake deluxe";
            } else {
                sol += "deluxe";
            }
        }


        if (sol.isEmpty()) {
            return number.toString();
        }
        return sol;
    }

    public String fizzBuzz(Integer number) {
        return fizzBuzz4(number);
    }

}


