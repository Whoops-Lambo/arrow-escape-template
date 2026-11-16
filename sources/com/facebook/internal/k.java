package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import defpackage.h50;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class k {
    public Uri a;

    public k(Bundle bundle, String str) {
        Uri uriB;
        String str2;
        bundle = bundle == null ? new Bundle() : bundle;
        int[] iArrE = h50.E(2);
        ArrayList arrayList = new ArrayList(iArrE.length);
        for (int i : iArrE) {
            if (i != 1) {
                if (i == 2) {
                    str2 = "join_tournament";
                } else {
                    throw null;
                }
            } else {
                str2 = "context_choose";
            }
            arrayList.add(str2);
        }
        if (arrayList.contains(str)) {
            com.facebook.a0 a0Var = com.facebook.a0.a;
            uriB = v0.b(String.format("%s", Arrays.copyOf(new Object[]{"fb.gg"}, 1)), bundle, "/dialog/".concat(str));
        } else {
            uriB = v0.b(m0.f(), bundle, com.facebook.a0.d() + "/dialog/" + str);
        }
        this.a = uriB;
    }
}
