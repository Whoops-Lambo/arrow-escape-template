package com.moloco.sdk.internal.error.crash.delivery;

import defpackage.ks0;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n extends ks0 implements sr0 {
    public static final n b = new n(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);

    @Override // defpackage.sr0
    public final Object invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
