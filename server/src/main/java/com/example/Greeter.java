package com.example;

/**
 * This is a class. Second time to change.
 */
public class Greeter {

  /**
   * This is a constructor. Modify to trigger the pull process in Jenkins.
   */
  public Greeter() {

  }

  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
    /* Third added comment
    */
  }
}
