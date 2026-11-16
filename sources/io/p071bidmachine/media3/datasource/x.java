package io.p071bidmachine.media3.datasource;

import android.net.Uri;
import io.p071bidmachine.media3.exoplayer.upstream.e;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class x implements h {
    public final h a;
    public long b;
    public Uri c;
    public Map d;

    @Override // io.p071bidmachine.media3.datasource.h
    public final long a(k kVar) {
        h hVar = this.a;
        this.c = kVar.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.a(kVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override // io.p071bidmachine.media3.datasource.h
    public final void close() {
        this.a.close();
    }

    @Override // io.p071bidmachine.media3.datasource.h
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // io.p071bidmachine.media3.datasource.h
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // io.p071bidmachine.media3.common.g
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += (long) i3;
        }
        return i3;
    }

    public x(h hVar) {
        hVar.getClass();
        this.a = hVar;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // io.p071bidmachine.media3.datasource.h
    public final void b(e eVar) {
        eVar.getClass();
        this.a.b(eVar);
    }
}
