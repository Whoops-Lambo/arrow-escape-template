package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class z {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a extends z {
        final /* synthetic */ u a;
        final /* synthetic */ int b;
        final /* synthetic */ byte[] c;
        final /* synthetic */ int d;

        public a(u uVar, int i, byte[] bArr, int i2) {
            this.a = uVar;
            this.b = i;
            this.c = bArr;
            this.d = i2;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
            dVar.write(this.c, this.d, this.b);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public u b() {
            return this.a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public long a() {
            return this.b;
        }
    }

    public abstract long a() throws IOException;

    public abstract void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException;

    public abstract u b();

    public static z a(u uVar, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            com.mbridge.msdk.thrid.okhttp.internal.c.a(bArr.length, i, i2);
            return new a(uVar, i2, bArr, i);
        }
        defpackage.d.w("content == null");
        return null;
    }

    public static z a(u uVar, byte[] bArr) {
        return a(uVar, bArr, 0, bArr.length);
    }
}
