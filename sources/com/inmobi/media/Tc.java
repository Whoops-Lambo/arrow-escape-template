package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiFilesBridge;
import defpackage.cn0;
import defpackage.er;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Tc {
    public static final boolean a(String str, String str2, String str3) {
        com.explorestack.protobuf.z.r(str, str2, str3);
        try {
            a(str3);
            File file = new File(str3);
            file.createNewFile();
            FileOutputStream fileOutputStreamFileOutputStreamCtor = InMobiFilesBridge.fileOutputStreamCtor(file);
            byte[] bytes = str2.getBytes(er.a);
            bytes.getClass();
            fileOutputStreamFileOutputStreamCtor.write(bytes);
            fileOutputStreamFileOutputStreamCtor.close();
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    public static final String b(String str) {
        str.getClass();
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            try {
                return cn0.C(file);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final void a(String str) {
        str.getClass();
        File file = new File(str);
        if (file.exists() && file.delete()) {
            file.getName();
        }
    }
}
