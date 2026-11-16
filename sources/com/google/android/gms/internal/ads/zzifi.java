package com.google.android.gms.internal.ads;

import defpackage.dy4;
import defpackage.oy4;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzifi implements zziiq {
    static {
        zzigm zzigmVar = zzigm.b;
        int i = dy4.a;
    }

    @Override // com.google.android.gms.internal.ads.zziiq
    public final zzihc a(FileInputStream fileInputStream, zzigm zzigmVar) throws zzihu {
        oy4 oy4Var = new oy4(fileInputStream);
        zzihc zzihcVarR = zzihc.r(((zzigx) this).a, oy4Var, zzigmVar);
        oy4Var.j(0);
        if (zzihc.B(zzihcVarR, true)) {
            return zzihcVarR;
        }
        throw new zzijj(zzihcVarR).d();
    }
}
