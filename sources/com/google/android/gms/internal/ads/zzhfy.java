package com.google.android.gms.internal.ads;

import defpackage.dy4;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhfy implements zzhgp {
    public final ByteArrayInputStream a;

    public final zzhvp a() throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.a;
        try {
            zzigm zzigmVar = zzigm.b;
            int i = dy4.a;
            return zzhvp.I(byteArrayInputStream, zzigm.c);
        } finally {
            byteArrayInputStream.close();
        }
    }

    public zzhfy(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }
}
