package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class n implements h {
    public final h a;
    public final s b;
    public final d c;
    public final f d;
    public h e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) {
        if (this.e != null) {
            io.p071bidmachine.media3.extractor.ts.y.b();
            return 0L;
        }
        String scheme = kVar.a.getScheme();
        Uri uri = kVar.a;
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || scheme2.equals("file")) {
            if (kVar.a.getPath().startsWith("/android_asset/")) {
                this.e = this.c;
            } else {
                this.e = this.b;
            }
        } else if ("asset".equals(scheme)) {
            this.e = this.c;
        } else if ("content".equals(scheme)) {
            this.e = this.d;
        } else {
            this.e = this.a;
        }
        return this.e.a(kVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        h hVar = this.e;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.e = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i, int i2) {
        return this.e.read(bArr, i, i2);
    }

    public n(Context context, m mVar, h hVar) {
        hVar.getClass();
        this.a = hVar;
        this.b = new s(mVar);
        this.c = new d(context, mVar);
        this.d = new f(context, mVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        h hVar = this.e;
        if (hVar == null) {
            return null;
        }
        return hVar.a();
    }
}
