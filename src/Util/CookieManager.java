package Util;

/**
 * Created by pwwpche on 2014/5/6.
 *
 */

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


public class CookieManager {
    public static void addCookie(HttpServletResponse response, String name,
                                 String value, int maxAge) {
        Cookie cookie = new Cookie(name, value);
        if (maxAge > 0)
            cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }

    public static Map<String, Cookie> getAllCookies(HttpServletRequest request) {
        Map<String, Cookie> cookie_map = new HashMap<String, Cookie>();
        Cookie[] cookies = request.getCookies();
        // 如果存在 cookie, 就存入 Map
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                cookie_map.put(cookie.getName(), cookie);
            }
        }
        return cookie_map;
    }

    public static String getSessionIdByNameInCookie(HttpServletRequest request, String name) {
        Map<String, Cookie> cookie_map = getAllCookies(request);
        if (cookie_map.containsKey(name)) {
            Cookie cookie = cookie_map.get(name);
            return cookie.getValue();
        }
        return null;
    }

    public static boolean setCookie(HttpServletRequest request, String name, String value, HttpServletResponse response) {
        System.out.println("setCookie: name=" + name);
        System.out.println("setCookie: value=" + value);
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equalsIgnoreCase(name)) {
                cookie.setValue(value);
                response.addCookie(cookie);
                return true;
            }
        }
        return false;
    }

}
