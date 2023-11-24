package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
    public String hello1(String friendName) {
        return "Hello, World!";
    }

    public String hello2(String friendName) {
        return "Hello, " + friendName;
    }
    public String hello(String friendName) {
        return hello2(friendName);
    }
}

