package proxy.realsubject;

import proxy.subject.CommandExecutor;

/**
 * Created by taesu- on 2016-06-29.
 */
public class CommandExecutorImpl implements CommandExecutor {

    public void runCommand(String cmd) throws Exception {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}