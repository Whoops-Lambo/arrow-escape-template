package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class x3 {
    private a a;
    private String b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    public String b() {
        return this.b;
    }

    public x3(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    public static x3 a(c3 c3Var) {
        String strT = c3Var.T();
        MaxAdFormat format = c3Var.getFormat();
        if (!TextUtils.isEmpty(strT) && format != null) {
            return new u3(new n3(strT, format));
        }
        return null;
    }

    public static x3 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new x3(a.AD_UNIT_ID, str);
    }

    public static x3 a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new x3(a.AD_FORMAT, label);
    }

    public a a() {
        return this.a;
    }
}
