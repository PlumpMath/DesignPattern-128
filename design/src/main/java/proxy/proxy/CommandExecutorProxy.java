package proxy.proxy;

import proxy.realsubject.CommandExecutorImpl;
import proxy.subject.CommandExecutor;

/**
 * Created by taesu- on 2016-06-29.
 */
public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if ("Yeon".equals(user) && "Moon".equals(pwd))
            isAdmin = true;
        executor = new CommandExecutorImpl();
    }

    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception(
                        "rm command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }

}