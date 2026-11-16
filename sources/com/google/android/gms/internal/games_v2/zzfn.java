package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.internal.GmsLogger;
import com.ironsource.C4664b4;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfn {
    public static final GmsLogger a = new GmsLogger("Games");

    public static void a(String str, String str2) {
        a.d(c(str), str2);
    }

    public static void b(String str, String str2) {
        a.w(c(str), str2);
    }

    public static String c(String str) {
        return pv1.n("PlayGamesServices[", str, C4664b4.j.e);
    }
}
