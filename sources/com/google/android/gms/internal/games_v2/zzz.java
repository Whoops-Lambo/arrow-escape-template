package com.google.android.gms.internal.games_v2;

import defpackage.d;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzz {
    public static String a(int i) {
        if (i == 0) {
            return "DAILY";
        }
        if (i == 1) {
            return "WEEKLY";
        }
        if (i == 2) {
            return "ALL_TIME";
        }
        d.r(pv1.l(i, "Unknown time span ", new StringBuilder(String.valueOf(i).length() + 18)));
        return null;
    }
}
