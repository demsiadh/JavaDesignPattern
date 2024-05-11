package behavior.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <big>算法枚举类</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/11 下午2:52
 */
public enum OperationEnum {
    ADD() {
        @Override
        public double deOperation(double num1, double num2) {
            return BigDecimal.valueOf(num1).add(BigDecimal.valueOf(num2)).doubleValue();
        }
    },
    SUBTRACT() {
        @Override
        public double deOperation(double num1, double num2) {
            return BigDecimal.valueOf(num1).subtract(BigDecimal.valueOf(num2)).doubleValue();
        }
    },
    MULTIPLY() {
        @Override
        public double deOperation(double num1, double num2) {
            return BigDecimal.valueOf(num1).multiply(BigDecimal.valueOf(num2)).doubleValue();
        }
    },
    DIVIDE() {
        @Override
        public double deOperation(double num1, double num2) {
            // 保留两位小数，四舍五入
            return BigDecimal.valueOf(num1).divide(BigDecimal.valueOf(num2), 2, RoundingMode.HALF_UP).doubleValue();
        }
    };

    /**
     * 对传入数字进行运算
     * @param num1 数字1
     * @param num2 数字2
     * @return 算术结果
     */
    public abstract double deOperation(double num1, double num2);
}
