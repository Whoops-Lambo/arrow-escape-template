package com.vungle.ads.internal.presenter;

import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class l extends rc1 implements sr0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, String str2) {
        super(0);
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Blocked sub-frame MRAID command: ");
        sbA.append(this.a);
        sbA.append(' ');
        sbA.append(this.b);
        return sbA.toString();
    }
}
