package stringbuilder;

public class NameBuilder {

    private String familyName;
    private String middleName;
    private String givenName;

    public NameBuilder(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    StringBuilder sb = new StringBuilder("");

    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title) {

        sb.append(familyName).append(middleName).append(givenName).append(title);
     return sb.toString();
    }


    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String interMediateName) {
        this.middleName = middleName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

}
