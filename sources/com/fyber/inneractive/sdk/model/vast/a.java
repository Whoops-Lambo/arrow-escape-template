package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public a(String str, String str2, String str3) {
        String strTrim;
        String strTrim2;
        boolean z;
        if (str != null) {
            strTrim = str.trim();
        } else {
            strTrim = null;
        }
        this.a = strTrim;
        if (str2 != null) {
            strTrim2 = str2.trim();
        } else {
            strTrim2 = null;
        }
        this.b = strTrim2;
        String strTrim3 = str3 != null ? str3.trim() : null;
        this.c = strTrim3;
        if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2) && !TextUtils.isEmpty(strTrim3) && strTrim3.contains("[TIME]")) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
    }
}
