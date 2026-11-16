package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzsc {
    public static final File a(Uri uri) throws zzsi {
        if (uri.getScheme().equals("file")) {
            if (TextUtils.isEmpty(uri.getQuery())) {
                if (TextUtils.isEmpty(uri.getAuthority())) {
                    return new File(uri.getPath());
                }
                throw new zzsi("Did not expect uri to have authority");
            }
            throw new zzsi("Did not expect uri to have query");
        }
        throw new zzsi("Scheme must be 'file'");
    }
}
