#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public final class ${NAME}
{
    @NotNull private static final ${NAME} ourInstance = new ${NAME}();
	
	@NotNull
    public static ${NAME} getInstance()
    {
        return ourInstance;
    }
	
    private ${NAME}()
    {
    }
}
