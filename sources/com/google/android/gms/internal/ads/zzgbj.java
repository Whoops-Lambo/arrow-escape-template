package com.google.android.gms.internal.ads;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzgbj {
    public static boolean b(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStreamFileOutputStreamCtor = AdMobFilesBridge.fileOutputStreamCtor(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStreamFileOutputStreamCtor.write(bArr);
                fileOutputStreamFileOutputStreamCtor.flush();
                IOUtils.closeQuietly(fileOutputStreamFileOutputStreamCtor);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                IOUtils.closeQuietly(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                IOUtils.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static File a(String str, String str2, File file) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return new File(c(file, str), str2);
        }
        return null;
    }

    public static File c(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    public static boolean d(File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z = true;
            for (File file2 : fileArrListFiles) {
                if (file2 != null && d(file2) && z) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = true;
        }
        if (file.delete() && z) {
            return true;
        }
        return false;
    }
}
