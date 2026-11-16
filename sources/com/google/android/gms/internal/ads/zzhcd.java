package com.google.android.gms.internal.ads;

import defpackage.dr0;
import defpackage.vs4;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhcd {
    public static void a(File file, byte[] bArr) {
        vs4 vs4Var = new vs4(file, new zzhcb[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(vs4Var.a, vs4Var.b.contains(zzhcb.a));
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void b(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            dr0.h("Unable to create parent directories of ".concat(file.toString()));
        }
    }
}
