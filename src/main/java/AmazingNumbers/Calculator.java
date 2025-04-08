package AmazingNumbers;

public class Calculator {

    private boolean isEven (Long natNum) {
        return natNum % 2 == 0;
    }

    private boolean isBuzz (Long natNum) {
        long firstNum = natNum % 10;
        return (natNum % 7 == 0) || (firstNum == 7);
    }

    private boolean isDuck (long natNum) {
        while (natNum > 0) {
            if (natNum % 10 == 0)
                return true;
            natNum /= 10;
        }
        return false;
    }

    private boolean isPalindromic(long natNum) {
        if (natNum < 10) return true;

        long originalNatNum = natNum;
        long reversedNatNum = 0;

        while (natNum > 0) {
            long digit = natNum % 10;
            reversedNatNum = reversedNatNum * 10 + digit;
            natNum /= 10;
        }
        return originalNatNum == reversedNatNum;
    }

    private boolean isGapful(Long natNum) {
        Long lastNum = natNum % 10;
        Long firstNum = natNum;
        while (firstNum >= 10) {
            firstNum /= 10;
        }

        Long divider = (firstNum * 10) + lastNum;

        return natNum % divider == 0;
    }


    public void printDetailedProperties(long natNum) {
        System.out.printf(" Properties of %d%n even: %b%n odd: %b%n buzz: %b%n duck: %b%n palindromic: %b%n gapful: %b%n ", natNum, isEven(natNum), !isEven(natNum), isBuzz(natNum), isDuck(natNum),isPalindromic(natNum),isGapful(natNum));
    }

    public void printInlineProperties(long natNum) {
        StringBuilder result = new StringBuilder();
        result.append(natNum).append(" is");

        if (isBuzz(natNum)) result.append(" buzz,");
        if (isDuck(natNum)) result.append(" duck,");
        if (isGapful(natNum)) result.append(" gapful ");
        if (isPalindromic(natNum)) result.append(" palindromic,");
        if (isEven(natNum)) result.append(" even,");
        else result.append(" odd,");

        if (result.charAt(result.length() - 1) == ',') {
            result.deleteCharAt(result.length() - 1);
        }

        System.out.println(result);
    }

}