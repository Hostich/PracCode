class PersonalDirectory {
    private String PNumber;
    private String PName;

    public PersonalDirectory(String name, String num) { 
        PName = name;
        PNumber = num;
    }

    public String getName() {
        return PName;
    }

    public String getNum() {
        return PNumber;
    }
}