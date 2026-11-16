package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface l {
    public static final l a = new a();

    void a(int i, b bVar);

    boolean a(int i, com.mbridge.msdk.thrid.okio.e eVar, int i2, boolean z) throws IOException;

    boolean a(int i, List<c> list);

    boolean a(int i, List<c> list, boolean z);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a implements l {
        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public boolean a(int i, com.mbridge.msdk.thrid.okio.e eVar, int i2, boolean z) throws IOException {
            eVar.skip(i2);
            return true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public boolean a(int i, List<c> list) {
            return true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public boolean a(int i, List<c> list, boolean z) {
            return true;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.l
        public void a(int i, b bVar) {
        }
    }
}
