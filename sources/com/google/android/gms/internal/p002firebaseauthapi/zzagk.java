package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.rp3;
import defpackage.tp3;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzagk implements Runnable {
    public /* synthetic */ rp3 a;
    public /* synthetic */ String b;

    @Override // java.lang.Runnable
    public final void run() {
        rp3 rp3Var = this.a;
        String str = this.b;
        Pattern pattern = rp3.d;
        tp3 tp3Var = (tp3) rp3Var.c.get(str);
        if (tp3Var == null) {
            return;
        }
        if (!tp3Var.i) {
            rp3Var.g(str);
        }
        rp3Var.e(str);
    }
}
