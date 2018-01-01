package com.codenotfound.primefaces.view;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelloWorldPage {

  @FindBy(id = "hello-world-form:first-name")
  private WebElement firstNameInput;

  @FindBy(id = "hello-world-form:last-name")
  private WebElement lastNameInput;

  @FindBy(id = "hello-world-form:submit")
  private WebElement submitButton;

  @FindBy(id = "hello-world-form:greeting")
  private WebElement greetingOutput;

  public void submit(String firstName, String lastName) {
    firstNameInput.sendKeys(firstName);
    lastNameInput.sendKeys(lastName);
    submitButton.submit();
  }

  public String getGreeting() {
    return greetingOutput.getAttribute("textContent");
  }
}
