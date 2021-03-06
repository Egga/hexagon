package de.egga.hexagon.users;

import static java.util.UUID.randomUUID;

public class UserFactory {

    public static User randomUser() {
        return new User(randomUserId());
    }

    public static UserId randomUserId() {
        return new UserId(randomUUID().toString());
    }

}
