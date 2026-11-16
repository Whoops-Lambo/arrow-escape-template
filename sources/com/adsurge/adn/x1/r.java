package com.adsurge.adn.x1;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.ironsource.C4664b4;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.h50;
import defpackage.pv1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum a {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");

        public String a;

        public String b() {
            return this.a;
        }

        a(String str) {
            this.a = str;
        }
    }

    public static String b(String str) {
        int iIndexOf = str.indexOf(63);
        if (iIndexOf > 0) {
            str = str.substring(0, iIndexOf);
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0 || iLastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1).toLowerCase();
    }

    public static Pair c(String str, String str2, String str3) {
        String strN = pv1.n("(\\?|&|#)", str2, "=([^&#]*)");
        String strI = h50.i(str2, "=", str3);
        Matcher matcher = Pattern.compile(strN).matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, matcher.group(1) + strI);
            z = true;
        }
        matcher.appendTail(stringBuffer);
        return new Pair(Boolean.valueOf(z), stringBuffer.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r1.equals("jpeg") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r1.equals("png") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r1.equals("jpg") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r1.equals("gif") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r1.equals("bmp") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        return com.adsurge.adn.x1.r.a.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r1.equals("webp") != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.adsurge.adn.x1.r.a a(java.lang.String r1) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto La
            java.lang.String r1 = r1.toLowerCase()
        La:
            int r0 = r1.hashCode()
            switch(r0) {
                case 3401: goto L5c;
                case 97669: goto L51;
                case 98819: goto L46;
                case 102340: goto L3d;
                case 105441: goto L34;
                case 111145: goto L2b;
                case 3213227: goto L24;
                case 3268712: goto L1b;
                case 3645340: goto L12;
                default: goto L11;
            }
        L11:
            goto L67
        L12:
            java.lang.String r0 = "webp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L67
            goto L59
        L1b:
            java.lang.String r0 = "jpeg"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L67
            goto L59
        L24:
            java.lang.String r0 = "html"
            boolean r1 = r1.equals(r0)
            goto L67
        L2b:
            java.lang.String r0 = "png"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L67
            goto L59
        L34:
            java.lang.String r0 = "jpg"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L67
            goto L59
        L3d:
            java.lang.String r0 = "gif"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L67
            goto L59
        L46:
            java.lang.String r0 = "css"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L67
            com.adsurge.adn.x1.r$a r1 = com.adsurge.adn.x1.r.a.CSS
            return r1
        L51:
            java.lang.String r0 = "bmp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L67
        L59:
            com.adsurge.adn.x1.r$a r1 = com.adsurge.adn.x1.r.a.IMAGE
            return r1
        L5c:
            java.lang.String r0 = "js"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L67
            com.adsurge.adn.x1.r$a r1 = com.adsurge.adn.x1.r.a.JS
            return r1
        L67:
            com.adsurge.adn.x1.r$a r1 = com.adsurge.adn.x1.r.a.HTML
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adsurge.adn.x1.r.a(java.lang.String):com.adsurge.adn.x1.r$a");
    }

    public static boolean b(Uri uri) {
        return uri != null && uri.isHierarchical();
    }

    public static String b(String str, String str2, String str3) {
        Pair pairC = c(str, str2, str3);
        if (((Boolean) pairC.first).booleanValue()) {
            return (String) pairC.second;
        }
        return a(str, str2, str3);
    }

    public static boolean c(String str) {
        return c(Uri.parse(str));
    }

    public static boolean c(Uri uri) {
        if (uri == null || uri.getScheme() == null) {
            return false;
        }
        return uri.getScheme().equalsIgnoreCase(com.safedk.android.analytics.brandsafety.creatives.g.e) || uri.getScheme().equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME);
    }

    public static String a(Uri uri) {
        if (uri == null) {
            return "";
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return "";
        }
        int iLastIndexOf = path.lastIndexOf("/0");
        if (iLastIndexOf > 0) {
            path = path.substring(0, iLastIndexOf);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(path);
        return !TextUtils.isEmpty(fileExtensionFromUrl) ? fileExtensionFromUrl.toLowerCase() : "";
    }

    public static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str)) {
            return str;
        }
        return str + (str.contains("?") ? C4664b4.j.c : "?") + str2 + "=" + str3;
    }
}
