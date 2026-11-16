package com.adsurge.adn.p067y;

import com.adsurge.adn.X.q;
import com.adsurge.adn.x1.l;
import defpackage.nj2;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public final File a;
    public final long b;

    public abstract List a(File[] fileArr);

    public abstract boolean a(File file);

    public final synchronized void b() {
        try {
            File file = this.a;
            if (file != null && file.isDirectory()) {
                long jA = l.a(this.a);
                if (jA <= this.b) {
                    return;
                }
                File[] fileArrListFiles = this.a.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    List<File> listA = a(fileArrListFiles);
                    if (listA != null && !listA.isEmpty()) {
                        for (File file2 : listA) {
                            if (jA <= this.b) {
                                break;
                            }
                            if (a(file2)) {
                                long length = file2.length();
                                if (file2.delete()) {
                                    jA -= length;
                                    file2.getName();
                                } else {
                                    file2.getName();
                                }
                            } else {
                                file2.getName();
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a() {
        q.b.submit(new nj2(this, 24));
    }

    public a(File file, long j) {
        this.a = file;
        this.b = j;
    }
}
