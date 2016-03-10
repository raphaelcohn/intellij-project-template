package ${PACKAGE_NAME};

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

#parse("File Header.java")
public class ${NAME} extends AnAction
{
    @Override
    public void actionPerformed(@NotNull final AnActionEvent anActionEvent)
    {
        // TODO: insert action logic here
    }
}
