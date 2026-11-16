package com.bytedance.adsdk.ahm.uq;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class yo {
    private final ct kgy;

    public File kgy(String str, InputStream inputStream, rz rzVar) throws IOException {
        File file = new File(kgy(), kgy(str, rzVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    private File ahm(String str) throws FileNotFoundException {
        File file = new File(kgy(), kgy(str, rz.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(kgy(), kgy(str, rz.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public yo(ct ctVar) {
        this.kgy = ctVar;
    }

    public Pair<rz, InputStream> kgy(String str) {
        rz rzVar;
        try {
            File fileAhm = ahm(str);
            if (fileAhm == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileAhm);
            if (fileAhm.getAbsolutePath().endsWith(".zip")) {
                rzVar = rz.ZIP;
            } else {
                rzVar = rz.JSON;
            }
            fileAhm.getAbsolutePath();
            return new Pair<>(rzVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public void kgy(String str, rz rzVar) {
        File file = new File(kgy(), kgy(str, rzVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        file2.toString();
        if (zRenameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File kgy() {
        File fileKgy = this.kgy.kgy();
        if (fileKgy.isFile()) {
            fileKgy.delete();
        }
        if (!fileKgy.exists()) {
            fileKgy.mkdirs();
        }
        return fileKgy;
    }

    private static String kgy(String str, rz rzVar, boolean z) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? rzVar.kgy() : rzVar.rz);
        return sb.toString();
    }
}
