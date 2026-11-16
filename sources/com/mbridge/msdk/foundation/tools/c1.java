package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class c1 {
    public static boolean e(String str) {
        return str != null && str.length() > 5 && str.substring(0, 6).equalsIgnoreCase("tcp://");
    }

    public static String a(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? "" : new URL(str).getHost();
        } catch (Exception e) {
            q0.b("UriUtil", e.getMessage());
            return "";
        }
    }

    public static String b(String str) {
        try {
            if (!TextUtils.isEmpty(str) && URLUtil.isValidUrl(str)) {
                return new URL(str).getPath();
            }
            return str;
        } catch (Exception e) {
            q0.b("UriUtil", e.getMessage());
            return "";
        }
    }

    public static int c(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (URLUtil.isValidUrl(str) || e(str)) {
                    return Uri.parse(str).getQueryParameterNames().size();
                }
                return 0;
            }
            return 0;
        } catch (Exception e) {
            q0.b("UriUtil", e.getMessage());
            return 0;
        }
    }

    public static String d(String str) {
        try {
            Uri uri = Uri.parse(str);
            return uri.getScheme() + "://" + uri.getHost() + uri.getPath();
        } catch (Exception e) {
            q0.b("UriUtil", e.getMessage());
            return "";
        }
    }

    public static String a(String str, String str2) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : Uri.parse(str).getQueryParameter(str2);
        } catch (Exception e) {
            q0.b("UriUtil", e.getMessage());
            return "";
        }
    }
}
