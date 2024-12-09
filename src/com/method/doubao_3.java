package com.method;

public class doubao_3 {
    public static String solution(String s) {
        s = s.replaceFirst("^0+(?!\\.)", "");

        // 2. 分割整数部分和小数部分
        String[] parts = s.split("\\.");
        String integerPart = parts[0];
        String decimalPart = parts.length > 1 ? parts[1] : "";

        // 3. 将整数部分添加千分位逗号
        String formattedIntegerPart = addCommasToInteger(integerPart);

        // 4. 组合整数部分和小数部分
        if (!decimalPart.isEmpty()) {
            return formattedIntegerPart + "." + decimalPart;
        } else {
            return formattedIntegerPart;
        }
    }
    private static String addCommasToInteger(String integerPart) {
        if (integerPart.isEmpty()) {
            return "0";
        }
        // 使用 StringBuilder 和倒序遍历实现千分位逗号添加
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = integerPart.length() - 1; i >= 0; i--) {
            result.append(integerPart.charAt(i));
            count++;
            if (count % 3 == 0 && i > 0) {
                result.append(",");
            }
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {

    }
}
