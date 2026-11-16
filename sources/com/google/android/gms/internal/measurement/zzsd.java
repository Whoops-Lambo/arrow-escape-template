package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import defpackage.wx;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzsd implements zzsx {
    public zzsd() {
        new zzsh();
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final String zzc() {
        return "file";
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final OutputStream a(Uri uri) throws IOException {
        File fileA = zzsc.a(uri);
        wx.g(fileA);
        return new zzsm(AdMobFilesBridge.fileOutputStreamCtor(fileA), fileA);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void b(Uri uri) throws IOException {
        File fileA = zzsc.a(uri);
        if (!fileA.isDirectory()) {
            if (!fileA.delete()) {
                if (!fileA.exists()) {
                    throw new FileNotFoundException(String.format("%s does not exist", uri));
                }
                throw new IOException(String.format("%s could not be deleted", uri));
            }
            return;
        }
        throw new FileNotFoundException(String.format("%s is a directory", uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final InputStream c(Uri uri) throws zzsi {
        File fileA = zzsc.a(uri);
        return new zzsl(new FileInputStream(fileA), fileA);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final boolean d(Uri uri) {
        return zzsc.a(uri).exists();
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final File e(Uri uri) {
        return zzsc.a(uri);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void f(Uri uri, Uri uri2) throws IOException {
        File fileA = zzsc.a(uri);
        File fileA2 = zzsc.a(uri2);
        wx.g(fileA2);
        if (fileA.renameTo(fileA2)) {
        } else {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }
}
