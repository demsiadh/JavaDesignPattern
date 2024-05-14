package behavior.template;

/**
 * <big>具体的游戏</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/14 下午3:11
 */
public class Cricket extends Game{
    @Override
    protected void initialize() {
        System.out.println("Cricket Game Initialized!");
    }

    @Override
    protected void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
