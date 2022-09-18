package org.dungap.mylibrary;

public class NumberToSymbol {

    protected String intToSS(int ten) {

        String stem;

        switch (ten) {
            case 1: stem = "甲"; break;
            case 2: stem = "乙"; break;
            case 3: stem = "丙"; break;
            case 4: stem = "丁"; break;
            case 5: stem = "戊"; break;
            case 6: stem = "己"; break;
            case 7: stem = "庚"; break;
            case 8: stem = "辛"; break;
            case 9: stem = "壬"; break;
            case 0: stem = "癸"; break;
            default: stem = ""; break;
        }

        return stem;
    }

    protected String intToBB(int twelve) {

        String branch;

        switch (twelve) {
            case 1: branch = "子"; break;
            case 2: branch = "丑"; break;
            case 3: branch = "寅"; break;
            case 4: branch = "卯"; break;
            case 5: branch = "辰"; break;
            case 6: branch = "巳"; break;
            case 7: branch = "午"; break;
            case 8: branch = "未"; break;
            case 9: branch = "申"; break;
            case 10: branch = "酉"; break;
            case 11: branch = "戌"; break;
            case 0: branch = "亥"; break;
            default: branch = ""; break;
        }

        return branch;
    }
}
