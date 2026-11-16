package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import defpackage.af;
import defpackage.gr2;
import defpackage.i20;
import defpackage.jp;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Keep
public class CctBackendFactory {
    public gr2 create(i20 i20Var) {
        Context context = ((af) i20Var).a;
        af afVar = (af) i20Var;
        return new jp(context, afVar.b, afVar.c);
    }
}
