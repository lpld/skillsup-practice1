package ua.skillsup.javacourse.practice1.db;

/**
 * @author leopold
 * @since 27/02/16
 */
public class DbException extends RuntimeException {

  public DbException(String message) {
    super(message);
  }

  public DbException(String message, Throwable cause) {
    super(message, cause);
  }
}