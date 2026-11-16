package com.adsurge.adn.t1;

import android.content.Context;
import com.adsurge.adn.Y0.w;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    public final w a;

    public final void c(String str) {
    }

    public a(Context context) {
        w wVar = new w();
        this.a = wVar;
        wVar.b();
        wVar.a();
    }

    public int a(String str, int i) {
        c(str);
        Object objA = a(str);
        if (objA != null && (objA instanceof Integer)) {
            return ((Integer) objA).intValue();
        }
        return i;
    }

    public String b(String str) {
        c(str);
        Object objA = a(str);
        if (objA == null) {
            return null;
        }
        return objA.toString();
    }

    public String b(String str, String str2) {
        c(str);
        Object objA = a(str);
        return objA == null ? str2 : objA.toString();
    }

    public Object a(String str, String str2) {
        return null;
    }

    public Object a(String str) {
        return null;
    }

    public int a(String str, String str2, int i) {
        Object objA = a(str, str2);
        return (objA == null || !(objA instanceof Integer)) ? i : ((Integer) objA).intValue();
    }
}
