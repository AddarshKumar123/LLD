package Managers;

import Strategy.PlayStrategy;
import Strategy.RandomPlayStrategy;
import Strategy.SequentialPlayStrategy;
import enums.PlayStrategyType;

public class StrategyManager {
    private SequentialPlayStrategy sequentialPlayStrategy;
    private RandomPlayStrategy randomPlayStrategy;

    private StrategyManager(){
        sequentialPlayStrategy=new SequentialPlayStrategy();
        randomPlayStrategy = new RandomPlayStrategy();
    }

    private static class SingletonHelper{
        private static final StrategyManager INSTANCE = new StrategyManager();
    }

    public static StrategyManager getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public PlayStrategy getStrategy(PlayStrategyType type){
        if(type==PlayStrategyType.SEQUENTIAL){
            return sequentialPlayStrategy;
        }else{
            return randomPlayStrategy;
        }
    }
}
