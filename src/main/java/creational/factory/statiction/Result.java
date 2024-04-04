package creational.factory.statiction;

import lombok.Data;

/**
 * <big>响应结果类</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
@Data
public class Result {
    private String code;
    private String message;
    private Object data;
    private Result(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    private Result() {

    }
    public static Result ok(String code, String message, Object data) {
        return new Result(code, message, data);
    }

    public static Result ok(String code, String message) {
        return new Result(code, message, null);
    }
    public static Result ok(String message) {
        return new Result("200", message, null);
    }
    public static Result ok() {
        return new Result("200", "success", null);
    }
    public static Result error(String code, String message) {
        return new Result(code, message, null);
    }
    public static Result error(String message) {
        return new Result("500", message, null);
    }
    public static Result error() {
        return new Result("500", "error", null);
    }
}
