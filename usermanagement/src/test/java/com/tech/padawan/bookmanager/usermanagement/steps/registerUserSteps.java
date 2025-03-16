package com.tech.padawan.bookmanager.usermanagement.steps;

import com.tech.padawan.bookmanager.usermanagement.application.dto.UserRegister;
import com.tech.padawan.bookmanager.usermanagement.application.dto.UserResponse;
import com.tech.padawan.bookmanager.usermanagement.domain.model.user.UserType;
import com.tech.padawan.bookmanager.usermanagement.services.RegisterUserService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class registerUserSteps {

    private UserRegister user;
    private UserResponse userResponse;
    private RegisterUserService userService = new RegisterUserService();

    @Given("I have the following user data:")
    public void iHaveTheFollowingUserData(Map<String, String> data) {
        user = new UserRegister(
                data.get("name"),
                data.get("email"),
                data.get("password"),
                UserType.valueOf(data.get("type"))
        );
    }

    @When("I create a UserResponse object for the registered user")
    public void iCreateAUserResponseObjectForTheRegisteredUser() {
        userResponse = userService.registerUser(user);
    }

    @Then("the UserResponse object should contain the following details:")
    public void theUserResponseObjectShouldContainTheFollowingDetails(Map<String, String> expectedData) {
        long expectedId = Long.parseLong(expectedData.get("id"));
        assertEquals(expectedId, userResponse.id());

        assertEquals(expectedData.get("name"), userResponse.name());
        assertEquals(expectedData.get("email"), userResponse.email());
        assertEquals(UserType.valueOf(expectedData.get("type")), userResponse.type());
    }
}