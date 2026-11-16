package com.vungle.ads.internal.platform;

import defpackage.rc1;
import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d extends rc1 implements wr0 {
    public static final d a = new d();

    public d() {
        super(1);
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        th.getClass();
        return th.getCause();
    }
}
