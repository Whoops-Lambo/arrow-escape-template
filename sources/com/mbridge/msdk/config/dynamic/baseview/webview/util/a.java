package com.mbridge.msdk.config.dynamic.baseview.webview.util;

import android.net.Uri;
import android.text.TextUtils;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    public static String a(String str) {
        String queryParameter;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        Object[] array = uri.getQueryParameterNames().toArray();
        if (!TextUtils.isEmpty(scheme) && scheme.equals("js")) {
            return "javascript:" + uri.getQueryParameter(String.valueOf(array[0]));
        }
        if (!TextUtils.isEmpty(scheme) && scheme.equals("mv")) {
            String queryParameter2 = uri.getQueryParameter(String.valueOf(array[0]));
            if (array.length > 1) {
                queryParameter = uri.getQueryParameter(String.valueOf(array[1]));
            } else {
                queryParameter = "";
            }
            StringBuilder sb = new StringBuilder("javascript:window.WindVane.");
            sb.append(uri.getHost());
            sb.append("(");
            sb.append(queryParameter2);
            sb.append(",");
            return nj.q(sb, queryParameter, ");");
        }
        return str;
    }
}
