package enum_example;

/**
 * @author Wojciech Wasilewski
 * @date Created on 03.07.2019
 */
public enum Size {

    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL");

    private String abbreviation; //short version (S,M,L,XL)

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
