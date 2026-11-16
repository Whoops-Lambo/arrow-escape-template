package com.google.android.gms.nearby.connection;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.nearby.zzsq;
import com.google.android.gms.internal.nearby.zzsu;
import com.safedk.android.analytics.brandsafety.m;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.x75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class Payload {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class File {
        public static File a(java.io.File file, ParcelFileDescriptor parcelFileDescriptor, long j, Uri uri) {
            java.io.File file2 = (java.io.File) Preconditions.checkNotNull(file, "Cannot create Payload.File from null java.io.File.");
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor.");
            return new File(file2, parcelFileDescriptor2, j);
        }

        public File(java.io.File file, ParcelFileDescriptor parcelFileDescriptor, long j) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Stream {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public @interface Type {
    }

    static {
        x75 x75Var = zzsq.b;
        Object[] objArr = {"/", "\\", "../"};
        zzsu.a(3, objArr);
        zzsq.t(3, objArr);
        Object[] objArr2 = new Object[15];
        objArr2[0] = "../";
        objArr2[1] = "/";
        objArr2[2] = "\\";
        objArr2[3] = "?";
        objArr2[4] = "*";
        objArr2[5] = "\"";
        objArr2[6] = "<";
        objArr2[7] = ">";
        objArr2[8] = m.ad;
        objArr2[9] = ":";
        objArr2[10] = "\u0000";
        objArr2[11] = "\n";
        System.arraycopy(new String[]{"\r", "\t", "\f"}, 0, objArr2, 12, 3);
        zzsu.a(15, objArr2);
        zzsq.t(15, objArr2);
        Object[] objArr3 = {"..", UserDetailsUtils.UserDetailsLiterals.DOT, "\\", "/"};
        zzsu.a(4, objArr3);
        zzsq.t(4, objArr3);
        Object[] objArr4 = {"\\"};
        zzsu.a(1, objArr4);
        zzsq.t(1, objArr4);
        Object[] objArr5 = {"../", "..\\"};
        zzsu.a(2, objArr5);
        zzsq.t(2, objArr5);
        Object[] objArr6 = {"?", "*", "\"", m.ad, ":", "\u0000", "\n", "\r", "\t", "\f"};
        zzsu.a(10, objArr6);
        zzsq.t(10, objArr6);
        Object[] objArr7 = {"\\"};
        zzsu.a(1, objArr7);
        zzsq.t(1, objArr7);
        Object[] objArr8 = {"\\", "/"};
        zzsu.a(2, objArr8);
        zzsq.t(2, objArr8);
    }

    public Payload(long j, int i, byte[] bArr, File file, Stream stream) {
    }
}
