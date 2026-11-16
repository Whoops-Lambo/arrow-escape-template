package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.adsurge.adn.oversea_ad.ITuringIoTFeatureMap;
import defpackage.h50;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzgav {
    public static final Pattern a = Pattern.compile(".*\\.so$", 2);

    /* JADX WARN: Code duplicated, block: B:6:0x0032  */
    public static final zzbet b(Context context, zzfzx zzfzxVar) {
        zzbet zzbetVar;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        boolean zExists = file.exists();
        zzbet zzbetVar2 = zzbet.X86;
        zzbet zzbetVar3 = zzbet.ARM7;
        zzbet zzbetVar4 = zzbet.X86_64;
        zzbet zzbetVar5 = zzbet.ARM64;
        zzbet zzbetVar6 = zzbet.RISCV64;
        zzbet zzbetVar7 = zzbet.UNKNOWN;
        zzbet zzbetVar8 = zzbet.UNSUPPORTED;
        if (zExists) {
            File[] fileArrListFiles = file.listFiles(new zzhce(a));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (zzfzxVar != null) {
                    zzfzxVar.d(5017, "No .so");
                } else {
                    zzfzxVar = null;
                }
                zzbetVar = zzbetVar7;
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                c(bArr, null, zzfzxVar);
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s = ByteBuffer.wrap(bArr2).getShort();
                                if (s == 3) {
                                    zzbetVar = zzbetVar2;
                                } else if (s == 40) {
                                    zzbetVar = zzbetVar3;
                                } else if (s == 62) {
                                    zzbetVar = zzbetVar4;
                                } else if (s == 183) {
                                    zzbetVar = zzbetVar5;
                                } else if (s != 243) {
                                    c(bArr, null, zzfzxVar);
                                    zzbetVar = zzbetVar8;
                                } else {
                                    zzbetVar = zzbetVar6;
                                }
                                fileInputStream.close();
                            }
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    c(null, e.toString(), zzfzxVar);
                }
                zzbetVar = zzbetVar8;
            }
        } else {
            if (zzfzxVar != null) {
                zzfzxVar.d(5017, "No lib/");
            } else {
                zzfzxVar = null;
            }
            zzbetVar = zzbetVar7;
        }
        if (zzbetVar == zzbetVar7) {
            HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
            String property = System.getProperty("os.arch");
            if (TextUtils.isEmpty(property) || !hashSet.contains(property)) {
                try {
                    String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                    if (strArr == null || strArr.length <= 0) {
                        property = Build.CPU_ABI;
                        if (property == null) {
                            property = Build.CPU_ABI2;
                        }
                    } else {
                        property = strArr[0];
                    }
                } catch (IllegalAccessException e2) {
                    if (zzfzxVar != null) {
                        zzfzxVar.c(2024, 0L, e2);
                    }
                } catch (NoSuchFieldException e3) {
                    if (zzfzxVar != null) {
                        zzfzxVar.c(2024, 0L, e3);
                    }
                }
            }
            if (TextUtils.isEmpty(property)) {
                c(null, "Empty dev arch", zzfzxVar);
            } else if (!property.equalsIgnoreCase("i686") && !property.equalsIgnoreCase("x86")) {
                if (property.equalsIgnoreCase("x86_64")) {
                    zzbetVar2 = zzbetVar4;
                } else if (property.equalsIgnoreCase("arm64-v8a")) {
                    zzbetVar2 = zzbetVar5;
                } else if (property.equalsIgnoreCase("armeabi-v7a") || property.equalsIgnoreCase("armv71")) {
                    zzbetVar2 = zzbetVar3;
                } else if (property.equalsIgnoreCase("riscv64")) {
                    zzbetVar2 = zzbetVar6;
                } else {
                    c(null, property, zzfzxVar);
                }
            }
            zzbetVar2 = zzbetVar8;
        } else {
            zzbetVar2 = zzbetVar;
        }
        if (zzfzxVar != null) {
            zzfzxVar.d(5018, zzbetVar2.name());
        }
        return zzbetVar2;
    }

    public static final void c(byte[] bArr, String str, zzfzx zzfzxVar) {
        if (zzfzxVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            h50.x("dbg:", str, sb, ";");
        }
        zzfzxVar.d(ITuringIoTFeatureMap.CIOT_JASPERID, sb.toString());
    }

    public static boolean a(zzbet zzbetVar) {
        int iOrdinal = zzbetVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            return true;
        }
        return false;
    }
}
