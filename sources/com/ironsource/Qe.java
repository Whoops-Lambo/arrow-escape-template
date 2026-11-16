package com.ironsource;

import defpackage.dk2;
import defpackage.e80;
import defpackage.kk2;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Qe {

    @Nullable
    private final String a;

    @Nullable
    private final List<String> b;
    private final boolean c;

    public final boolean a() {
        boolean z = this.c;
        List<String> list = this.b;
        if (z) {
            if (list != null && !list.isEmpty()) {
                for (String str : list) {
                    String str2 = this.a;
                    if (str2 != null && kk2.L(str2, str, false)) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (list != null && !list.isEmpty()) {
            for (String str3 : list) {
                String str4 = this.a;
                if (str4 != null && dk2.O(str4, str3, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    public Qe(@Nullable String str, @Nullable List<String> list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public /* synthetic */ Qe(String str, List list, boolean z, int i, e80 e80Var) {
        this(str, list, (i & 4) != 0 ? false : z);
    }
}
