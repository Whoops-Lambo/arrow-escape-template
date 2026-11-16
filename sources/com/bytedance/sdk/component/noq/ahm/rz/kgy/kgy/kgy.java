package com.bytedance.sdk.component.noq.ahm.rz.kgy.kgy;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.component.utils.yo;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.safedk.android.internal.partials.PangleFilesBridge;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.n30;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class kgy {
    private File ahm;
    private int kgy;

    public synchronized boolean kgy(String str, byte[] bArr) {
        if (this.kgy > 0 && str != null && bArr != null) {
            File fileRz = rz(str);
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(fileRz);
                    try {
                        fileOutputStreamFileOutputStreamCtor.write(bArr);
                        if (fileRz.exists()) {
                            kgy(fileRz, ahm(str), true);
                        }
                        ra.kgy(fileOutputStreamFileOutputStreamCtor);
                        List<File> listKgy = kgy(this.ahm);
                        if (listKgy != null) {
                            int size = listKgy.size();
                            int i = this.kgy;
                            if (size > i) {
                                kgy((int) (((double) i) * 0.7d));
                            }
                        }
                        return true;
                    } catch (FileNotFoundException e) {
                        e = e;
                        fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                        rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImEQ8RW", "a+8qsQqvYuuSX/Rcjxml", "WO8unQY=", 108);
                        File file = this.ahm;
                        if (file != null) {
                            file.mkdirs();
                        }
                        ra.kgy(fileOutputStream);
                        List<File> listKgy2 = kgy(this.ahm);
                        if (listKgy2 != null) {
                            int size2 = listKgy2.size();
                            int i2 = this.kgy;
                            if (size2 > i2) {
                                kgy((int) (((double) i2) * 0.7d));
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                        rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImEQ8RW", "a+8qsQqvYuuSX/Rcjxml", "WO8unQY=", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
                        ra.kgy(fileOutputStream);
                        List<File> listKgy3 = kgy(this.ahm);
                        if (listKgy3 != null) {
                            int size3 = listKgy3.size();
                            int i3 = this.kgy;
                            if (size3 > i3) {
                                kgy((int) (((double) i3) * 0.7d));
                            }
                        }
                        return false;
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                ra.kgy(null);
                List<File> listKgy4 = kgy(this.ahm);
                if (listKgy4 != null) {
                    int size4 = listKgy4.size();
                    int i4 = this.kgy;
                    if (size4 > i4) {
                        kgy((int) (((double) i4) * 0.7d));
                    }
                }
                throw th3;
            }
        }
        return false;
    }

    private void rz(File file) {
        if (file == null) {
            return;
        }
        try {
            yo.ahm(file);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImEQ8RW", "a+8qsQqvYuuSX/Rcjxml", "Tv4plBe5T86MT/tcnwWNJ1/nK5wGuA==", 205);
        }
    }

    private kgy(int i, File file) {
        this.kgy = i;
        this.ahm = file;
    }

    private List<File> ahm(File file) {
        List<File> listKgy = kgy(file);
        if (listKgy != null && !listKgy.isEmpty()) {
            final HashMap map = new HashMap();
            for (File file2 : listKgy) {
                map.put(file2, Long.valueOf(file2.lastModified()));
            }
            Collections.sort(listKgy, new Comparator<File>() { // from class: com.bytedance.sdk.component.noq.ahm.rz.kgy.kgy.kgy.1
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
                public int compare(File file3, File file4) {
                    if (file3 == null && file4 == null) {
                        return 0;
                    }
                    if (file3 == null) {
                        return 1;
                    }
                    if (file4 == null) {
                        return -1;
                    }
                    return Long.compare(((Long) map.get(file4)).longValue(), ((Long) map.get(file3)).longValue());
                }
            });
            return listKgy;
        }
        return null;
    }

    private static void uq(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private File rz(String str) {
        return new File(this.ahm, n30.m(str, ".temp"));
    }

    private File ahm(String str) {
        return new File(this.ahm, str);
    }

    public synchronized InputStream kgy(String str) {
        FileInputStream fileInputStream;
        if (this.kgy <= 0) {
            return null;
        }
        File fileAhm = ahm(str);
        if (!fileAhm.exists()) {
            return null;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileAhm);
                try {
                    rz(fileAhm);
                    return fileInputStream;
                } catch (FileNotFoundException e) {
                    e = e;
                    rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImEQ8RW", "a+8qsQqvYuuSX/Rcjxml", "XOs5", 58);
                    ra.kgy(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImEQ8RW", "a+8qsQqvYuuSX/Rcjxml", "XOs5", 61);
                return null;
            }
        } catch (FileNotFoundException e2) {
            e = e2;
            fileInputStream = null;
        }
    }

    public static kgy kgy(int i, File file) {
        try {
            kgy kgyVar = new kgy(i, file);
            if (file != null) {
                file.mkdirs();
            }
            return kgyVar;
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImEQ8RW", "a+8qsQqvYuuSX/Rcjxml", "VP4omw==", 39);
            return null;
        }
    }

    private List<File> kgy(File file) {
        File[] fileArrListFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                    List<File> listAsList = Arrays.asList(fileArrListFiles);
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listAsList) {
                        if (file2 != null && file2.isFile() && !TextUtils.isEmpty(file2.getName()) && !file2.getName().endsWith(".temp")) {
                            arrayList.add(file2);
                        }
                    }
                    return arrayList;
                }
                return null;
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImEQ8RW", "a+8qsQqvYuuSX/Rcjxml", "XOs5pwa9ZeuJWcN7hR2lOw==", 141);
            }
        }
        return null;
    }

    public synchronized void kgy(int i) {
        try {
            if (i > this.kgy) {
                return;
            }
            List<File> listAhm = ahm(this.ahm);
            if (listAhm != null && listAhm.size() > i) {
                while (i < listAhm.size()) {
                    File file = listAhm.get(i);
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImEQ8RW", "a+8qsQqvYuuSX/Rcjxml", "T/wkmDezWs6aTw==", 162);
        }
    }

    private void kgy(File file, File file2, boolean z) throws IOException {
        if (z) {
            uq(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
