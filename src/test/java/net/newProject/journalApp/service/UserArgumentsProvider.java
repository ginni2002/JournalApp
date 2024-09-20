package net.newProject.journalApp.service;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import net.newProject.journalApp.entity.User;


import java.util.stream.Stream;

public class UserArgumentsProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception{
        return Stream.of(
                Arguments.of(User.builder().userName("Giridhari").password("Giridhari").build()),
                Arguments.of(User.builder().userName("Bisht").password("Bisht").build())
        );
    }
}
