package com.adsurge.adn.I0;

import android.os.Process;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final String a = "k";
    public static final String b = l.a("YXJtNjQtdjhh");
    public static final String c = l.a("YXJtZWFiaQ");
    public static volatile String d;

    public static String a() throws Throwable {
        if (d == null) {
            int iA = a("/proc/" + Process.myTid() + "/exe");
            if (iA == 3 || iA == 40) {
                d = c;
            } else if (iA == 62 || iA == 183) {
                d = b;
            } else {
                d = "unknown";
            }
        }
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static int a(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                try {
                    randomAccessFile = new RandomAccessFile(str, "r");
                    try {
                        randomAccessFile.seek(18L);
                        int i = randomAccessFile.read();
                        randomAccessFile.close();
                        return i;
                    } catch (Exception e) {
                        e = e;
                        randomAccessFile2 = randomAccessFile;
                        com.adsurge.adn.J0.a.b(a, "read ELF exception " + e);
                        str = 0;
                        str = 0;
                        if (randomAccessFile2 != null) {
                            randomAccessFile2.close();
                        }
                        return str;
                    } catch (Throwable th) {
                        th = th;
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = randomAccessFile2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (IOException unused2) {
        }
    }
}
