package github.com.passmesomesugar.builder_pattern;

public class User {
  private String firstName;

  public String getFirstName() {
    return firstName;
  }

  public static UserBuilder newBuilder() {
    return new User().new UserBuilder();
  }

  public class UserBuilder {
    public UserBuilder() {}

    public UserBuilder setFirstName(final String firstNameInput) {
      User.this.firstName = firstNameInput;
      return this;
    }

    public User build() {
      return User.this;
    }
  }
}
