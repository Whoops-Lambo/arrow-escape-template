package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgvt {
    public static final void a(StringBuilder sb, Iterator it, String str) {
        CharSequence string;
        CharSequence string2;
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    string = (CharSequence) next;
                } else {
                    string = next.toString();
                }
                sb.append(string);
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        string2 = (CharSequence) next2;
                    } else {
                        string2 = next2.toString();
                    }
                    sb.append(string2);
                }
            }
        } catch (IOException e) {
            defpackage.d.p(e);
        }
    }
}
