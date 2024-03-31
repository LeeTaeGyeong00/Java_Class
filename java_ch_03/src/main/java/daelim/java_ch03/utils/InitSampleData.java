package daelim.java_ch03.utils;

public class InitSampleData {

    private String[] sNums = {"test001","test002","test003","test004","test005"};
    private String[] sIds = {"rabbit", "hippo", "raccoon", "elephant", "lion"};
    private String[] sPws = {"1111", "2222", "3333", "4444", "5555"};
    private String[] sNames = {"user01", "user02", "user03", "user04", "user05"};
    private int[] sAges = {19,20,21,22,23};
    private char[] sGeners = {'M','W','W','M','M'};
    private String[] sMajors = {"AAA", "BBB", "CCC", "DDD", "EEE"};

    public String[] getsNums() {
        return sNums;
    }

    public void setsNums(String[] sNums) {
        this.sNums = sNums;
    }

    public String[] getsIds() {
        return sIds;
    }

    public void setsIds(String[] sIds) {
        this.sIds = sIds;
    }

    public String[] getsPws() {
        return sPws;
    }

    public void setsPws(String[] sPws) {
        this.sPws = sPws;
    }

    public String[] getsNames() {
        return sNames;
    }

    public void setsNames(String[] sNames) {
        this.sNames = sNames;
    }

    public int[] getsAges() {
        return sAges;
    }

    public void setsAges(int[] sAges) {
        this.sAges = sAges;
    }

    public char[] getsGeners() {
        return sGeners;
    }

    public void setsGeners(char[] sGeners) {
        this.sGeners = sGeners;
    }

    public String[] getsMajors() {
        return sMajors;
    }

    public void setsMajors(String[] sMajors) {
        this.sMajors = sMajors;
    }
}
