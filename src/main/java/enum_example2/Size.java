package enum_example2;

/**
 * @author Wojciech Wasilewski
 * @date Created on 03.07.2019
 */
public enum Size {

    SMALL("S", "MALY"),
    MEDIUM("M", "SREDNI"),
    LARGE("L", "DUZY"),
    EXTRA_LARGE("XL", "SUPER_DUZY");

    private String abbreviation;
    private String languagePL;

    Size(String abbreviation, String languagePL) {
        this.abbreviation = abbreviation;
        this.languagePL = languagePL;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getLanguagePL() {
        return languagePL;
    }
}
