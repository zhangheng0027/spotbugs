package com.zh.findbugs;

import edu.umd.cs.findbugs.LaunchAppropriateUI;
import org.junit.Test;

public class Text001 {

    @Test
    public void aa() throws Exception {
        String[] args = {"-textui", "e:\\project\\2022\\findbugs\\target\\classes\\com\\zh\\error"};
        LaunchAppropriateUI launcher = new LaunchAppropriateUI(args);
        launcher.launch();
    }

}
