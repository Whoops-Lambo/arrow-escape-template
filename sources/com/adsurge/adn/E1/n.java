package com.adsurge.adn.E1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {
    public static final Pattern a = Pattern.compile("<head(\\s[^>]*)?>", 2);
    public static final Pattern b = Pattern.compile("<head(\\s[^>]*)?/>", 2);
    public static final Pattern c = Pattern.compile("<body(\\s[^>]*)?>", 2);
    public static final Pattern d = Pattern.compile("<html(\\s[^>]*)?>", 2);
    public static final Pattern e = Pattern.compile("<!DOCTYPE[^>]*>", 2);
    public static final Pattern f = Pattern.compile("<meta[^>]*name\\s*=\\s*[\"']viewport[\"'][^>]*>", 2);

    public static String a(String str) {
        if (str == null || str.trim().isEmpty()) {
            return str;
        }
        String strConcat = (!f.matcher(str).find() ? "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\">" : "").concat("<style>html,body{margin:0;padding:0;}body{overflow:hidden;}</style>");
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            return a(str, matcher.end(), strConcat);
        }
        Matcher matcher2 = b.matcher(str);
        if (!matcher2.find()) {
            Matcher matcher3 = c.matcher(str);
            if (matcher3.find()) {
                return a(str, matcher3.start(), strConcat);
            }
            Matcher matcher4 = d.matcher(str);
            if (matcher4.find()) {
                return a(str, matcher4.end(), strConcat);
            }
            Matcher matcher5 = e.matcher(str);
            return matcher5.find() ? a(str, matcher5.end(), strConcat) : strConcat.concat(str);
        }
        String strSubstring = str.substring(matcher2.start(), matcher2.end());
        return str.substring(0, matcher2.start()) + strSubstring.substring(0, strSubstring.length() - 2).concat(">") + strConcat + "</head>" + str.substring(matcher2.end());
    }

    public static String a(String str, int i, String str2) {
        return str.substring(0, i) + str2 + str.substring(i);
    }
}
