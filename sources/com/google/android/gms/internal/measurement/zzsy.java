package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzsy implements zzsx {
    public abstract zzsd g();

    public Uri h(Uri uri) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final OutputStream a(Uri uri) {
        return g().a(h(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void b(Uri uri) throws IOException {
        g().b(h(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void f(Uri uri, Uri uri2) throws IOException {
        g().f(h(uri), h(uri2));
    }
}
