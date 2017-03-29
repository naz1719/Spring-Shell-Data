package org.shell.bostcrew.commands;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliAvailabilityIndicator;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldCommands implements CommandMarker {

    @CliCommand(value = "hw simple", help = "Print a simple hello world message")
    public String simple(
            @CliOption(key = {"message"}, mandatory = true, help = "The hello world message", specifiedDefaultValue = "At work")
                    final String message) {

        return "Message = [" + message + "] ";
    }
}
