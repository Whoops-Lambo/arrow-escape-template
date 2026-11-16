package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class l2 extends rc1 implements sr0 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(Context context) {
        super(0);
        this.a = context;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        return ServiceLocator.d.a(this.a).getService(PathProvider.class);
    }
}
