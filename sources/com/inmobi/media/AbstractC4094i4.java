package com.inmobi.media;

import defpackage.j52;
import defpackage.kk2;
import defpackage.sr0;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.i4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4094i4 {
    public static final String a(String str, Map map) {
        str.getClass();
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            str = kk2.I(str, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        return str;
    }

    public static final Object a(sr0 sr0Var) {
        sr0Var.getClass();
        try {
            return sr0Var.invoke();
        } catch (Error e) {
            return new j52(e);
        } catch (Exception e2) {
            return new j52(e2);
        }
    }
}
