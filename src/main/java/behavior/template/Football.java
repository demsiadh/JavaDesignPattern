package behavior.template;

/**
 * <big>具体的游戏</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/14 下午3:12
 */
public class Football extends Game{
    @Override
    protected void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
