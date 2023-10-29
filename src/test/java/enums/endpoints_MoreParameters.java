package enums;

public enum endpoints_MoreParameters {

    TABLE_PATH("Resource","resource"),
    PEN_PATH("Pen","pen");

    private String resourceName;
    private String resourcePath;

    endpoints_MoreParameters(String resourceName, String resourcePath)
    {
        this.resourceName=resourceName;
        this.resourcePath=resourcePath;
    }

    public String getResourceName()
    {
        return  this.resourceName;
    }

    public String getResourcePath()
    {
        return  this.resourcePath;
    }

}
