package behavior.template;

/**
 * <big>游戏模板抽象类</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/14 下午3:06
 */
public abstract class Game {
    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();
    // 模板
    public final void play()
    {
        // 初始化游戏
        initialize();
        // 开始游戏
        startPlay();
        // 结束游戏
        endPlay();
    }
}
