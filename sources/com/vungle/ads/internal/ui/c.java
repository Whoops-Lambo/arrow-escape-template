package com.vungle.ads.internal.ui;

import android.content.Intent;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends rc1 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Intent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, int i2, Intent intent) {
        super(0);
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onActivityResult: ");
        sbA.append(this.a);
        sbA.append(", ");
        sbA.append(this.b);
        sbA.append(", ");
        sbA.append(this.c);
        return sbA.toString();
    }
}
