package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.system.Os;
import com.ironsource.C4664b4;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzux {
    public static IOException c(File file, IOException iOException, String str) {
        String strConcat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + C4664b4.j.e;
            StringBuilder sb = new StringBuilder(str2.length() + 16);
            sb.append("Inoperable file:");
            sb.append(str2);
            strConcat = sb.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + C4664b4.j.e;
                StringBuilder sb2 = new StringBuilder(strConcat.length() + str3.length());
                sb2.append(strConcat);
                sb2.append(str3);
                strConcat = sb2.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    public static IOException a(zzru zzruVar, Uri uri, IOException iOException, String str) {
        try {
            zzsr zzsrVarB = zzsr.b();
            zzsrVarB.a = true;
            File file = (File) zzruVar.a(uri, zzsrVarB);
            if (file.exists()) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.canWrite()) {
                            return b(file, iOException, str);
                        }
                        return b(file, iOException, str);
                    }
                    if (file.canWrite()) {
                        return b(file, iOException, str);
                    }
                    return b(file, iOException, str);
                }
                if (file.canRead()) {
                    if (file.canWrite()) {
                        return b(file, iOException, str);
                    }
                    return b(file, iOException, str);
                }
                if (file.canWrite()) {
                    return b(file, iOException, str);
                }
                return b(file, iOException, str);
            }
            return b(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static IOException b(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return c(file, iOException, str);
        }
        if (parentFile.exists()) {
            if (parentFile.isDirectory()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return c(file, iOException, str);
                    }
                    return c(file, iOException, str);
                }
                if (parentFile.canWrite()) {
                    return c(file, iOException, str);
                }
                return c(file, iOException, str);
            }
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return c(file, iOException, str);
                }
                return c(file, iOException, str);
            }
            if (parentFile.canWrite()) {
                return c(file, iOException, str);
            }
            return c(file, iOException, str);
        }
        return c(file, iOException, str);
    }
}
