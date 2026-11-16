package io.p071bidmachine.rendering.model;

import defpackage.n30;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class v {
    public final y a;
    public final String b;
    public final List c;
    public final String d;

    public v(y yVar, String str, String str2, List list) {
        yVar.getClass();
        str.getClass();
        this.a = yVar;
        this.b = str2;
        this.c = list;
        Locale locale = Locale.ENGLISH;
        this.d = n30.p(locale, str, locale);
    }
}
