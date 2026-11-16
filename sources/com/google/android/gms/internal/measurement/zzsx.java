package com.google.android.gms.internal.measurement;

import android.net.Uri;
import defpackage.pv1;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface zzsx {
    String zzc();

    default OutputStream a(Uri uri) throws zzsk {
        throw new zzsk("openForWrite not supported by ".concat(zzc()));
    }

    default void b(Uri uri) throws zzsk {
        throw new zzsk("deleteFile not supported by ".concat(zzc()));
    }

    default InputStream c(Uri uri) throws zzsk {
        throw new zzsk("openForRead not supported by ".concat(zzc()));
    }

    default boolean d(Uri uri) throws zzsk {
        throw new zzsk("exists not supported by ".concat(zzc()));
    }

    default File e(Uri uri) throws zzsk {
        String strZzc = zzc();
        String strValueOf = String.valueOf(uri);
        throw new zzsk(pv1.p(new StringBuilder(strZzc.length() + 28 + strValueOf.length()), "Cannot convert uri to file ", strZzc, " ", strValueOf));
    }

    default void f(Uri uri, Uri uri2) throws zzsk {
        throw new zzsk("rename not supported by ".concat(zzc()));
    }
}
