package com.adsurge.adn.X;

import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class y {
    public static String d;
    public static Boolean e;
    public static String g;
    public static final String a = com.adsurge.adn.I0.l.a("YXJtNjQtdjhh");
    public static final String b = com.adsurge.adn.I0.l.a("YXJtZWFiaS12N2E");
    public static final String c = com.adsurge.adn.I0.l.a("YXJtZWFiaQ");
    public static int f = 0;

    public static String a() {
        if (d == null) {
            try {
                String line = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.product.cpu.abi").getInputStream())).readLine();
                if (TextUtils.isEmpty(line)) {
                    d = c;
                } else if (line.contains("x86")) {
                    d = "x86";
                } else {
                    String str = a;
                    if (line.contains(str)) {
                        d = str;
                    } else {
                        String str2 = b;
                        if (line.contains(str2)) {
                            d = str2;
                        } else {
                            d = c;
                        }
                    }
                }
            } catch (Exception unused) {
                d = c;
            }
        }
        return d;
    }

    public static String b() throws Throwable {
        if (g == null) {
            int iA = a("/proc/" + Process.myTid() + "/exe");
            if (iA == 3) {
                g = c;
                f = 3;
            } else if (iA == 40) {
                g = c;
                f = 1;
            } else if (iA == 62) {
                g = a;
                f = 4;
            } else if (iA != 183) {
                g = "unknown";
                f = 999;
            } else {
                g = a;
                f = 2;
            }
        }
        return g;
    }

    public static boolean c() {
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!Process.is64Bit()) {
            e = Boolean.FALSE;
            return false;
        }
        String strA = a();
        String str = a;
        TextUtils.equals(strA, str);
        TextUtils.equals(b(), str);
        e = Boolean.TRUE;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static int a(String str) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
                try {
                    randomAccessFile2.seek(18L);
                    int i = randomAccessFile2.read();
                    randomAccessFile2.close();
                    return i;
                } catch (Exception unused) {
                    randomAccessFile = randomAccessFile2;
                    str = 0;
                    str = 0;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    return str;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused3) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused4) {
            return str;
        }
    }
}
