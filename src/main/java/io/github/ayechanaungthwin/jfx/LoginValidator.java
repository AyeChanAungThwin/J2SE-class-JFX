package io.github.ayechanaungthwin.jfx;

public class LoginValidator {

	public static boolean isSuccessfulLogin(String username, String password) {
		return (username.equals("user")&&password.equals("123"))?true:false;
	}
}
