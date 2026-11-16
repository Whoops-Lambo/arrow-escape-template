package io.p071bidmachine.media3.exoplayer.upstream;

import android.net.Uri;
import io.p071bidmachine.media3.datasource.h;
import io.p071bidmachine.media3.datasource.j;
import io.p071bidmachine.media3.datasource.k;
import io.p071bidmachine.media3.datasource.x;
import io.p071bidmachine.media3.exoplayer.source.u;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class o implements i {
    public final long a = u.c.getAndIncrement();
    public final k b;
    public final int c;
    public final x d;
    public final n e;
    public volatile Object f;

    @Override // io.p071bidmachine.media3.exoplayer.upstream.i
    public final void cancelLoad() {
    }

    @Override // io.p071bidmachine.media3.exoplayer.upstream.i
    public final void load() {
        this.d.b = 0L;
        j jVar = new j(this.d, this.b);
        try {
            jVar.a.a(jVar.b);
            jVar.d = true;
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.j(uri, jVar);
        } finally {
            int i = io.p071bidmachine.media3.common.util.x.a;
            try {
                jVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public o(h hVar, k kVar, int i, n nVar) {
        this.d = new x(hVar);
        this.b = kVar;
        this.c = i;
        this.e = nVar;
    }
}
