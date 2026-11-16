package com.inmobi.media;

import defpackage.az2;
import defpackage.wr0;
import okhttp3.Call;

/* JADX INFO: renamed from: com.inmobi.media.on, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4280on implements wr0 {
    public final /* synthetic */ Call a;

    public C4280on(Call call) {
        this.a = call;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        this.a.cancel();
        return az2.a;
    }
}
