package org.aub.pattern.gof.structural.facade;

public class UserFacade {
    private UserService userService = new UserService();
    private NotificationService notificationService = new NotificationService();

    public void createUser() {
        userService.createUserModel();
        userService.activateUser();
        notificationService.notifyUserCreation();
    }
}
