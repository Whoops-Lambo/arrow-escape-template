package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import com.google.android.exoplayer2.upstream.DataSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements DataSource.Factory {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ g c;

    public /* synthetic */ e(String str, g gVar, int i) {
        this.a = i;
        this.b = str;
        this.c = gVar;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public final DataSource createDataSource() {
        int i = this.a;
        g gVar = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return new c(str, ((a) gVar).c);
            default:
                d dVar = (d) gVar;
                c cVar = new c(str, dVar.c);
                dVar.q = cVar;
                return cVar;
        }
    }
}
