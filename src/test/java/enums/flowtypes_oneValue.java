package enums;

public enum flowtypes_oneValue {

    NEW("new"),
    AMEND("Amend"),
    CANCEL("Cancel");

    private String key;

    flowtypes_oneValue(String key)
    {
        this.key = key;
    }
}
