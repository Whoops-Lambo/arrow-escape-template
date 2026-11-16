package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbc {
    public static final void a(StringBuilder sb, Iterator it, zzbd zzbdVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(zzbd.a(entry.getKey()));
            sb.append(" : ");
            sb.append(zzbd.a(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(zzbd.a(entry2.getKey()));
                sb.append(" : ");
                sb.append(zzbd.a(entry2.getValue()));
            }
        }
    }
}
