package com.bykv.vk.openvk.preload.geckox.a;

import com.bykv.vk.openvk.preload.geckox.utils.f;
import defpackage.h50;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    private static List<File> a(File[] fileArr) {
        long j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File file = null;
        long j2 = -1;
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (name.endsWith("--updating")) {
                arrayList.add(file2);
            } else if (name.endsWith("--pending-delete")) {
                a(file2);
            } else {
                try {
                    long j3 = Long.parseLong(name);
                    if (j3 > j2) {
                        if (file != null) {
                            try {
                                arrayList2.add(file);
                            } catch (Exception unused) {
                                j2 = j3;
                                a(file2);
                            }
                        }
                        file = file2;
                        j2 = j3;
                    } else {
                        arrayList2.add(file2);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            File file3 = (File) obj;
            String name2 = file3.getName();
            int iIndexOf = name2.indexOf("--updating");
            if (iIndexOf == -1) {
                a(file3);
            } else {
                try {
                    j = Long.parseLong(name2.substring(0, iIndexOf));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    j = -1;
                }
                if (j <= j2) {
                    a(file3);
                }
            }
        }
        return arrayList2;
    }

    public static boolean b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = File.separator;
            sb.append(str2);
            sb.append("update.lock");
            com.bykv.vk.openvk.preload.geckox.f.a aVarA = com.bykv.vk.openvk.preload.geckox.f.a.a(sb.toString());
            if (aVarA == null) {
                return true;
            }
            try {
                com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(str + str2 + "select.lock");
                try {
                    com.bykv.vk.openvk.preload.geckox.utils.b.c(new File(str));
                } catch (Throwable unused) {
                }
                bVarA.a();
                return true;
            } finally {
                aVarA.a();
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    public static /* synthetic */ void c(String str) throws Exception {
        List<File> listA;
        StringBuilder sbP = h50.p(str);
        String str2 = File.separator;
        sbP.append(str2);
        sbP.append("update.lock");
        com.bykv.vk.openvk.preload.geckox.f.a aVarA = com.bykv.vk.openvk.preload.geckox.f.a.a(sbP.toString());
        if (aVarA != null) {
            try {
                com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(str + str2 + "select.lock");
                try {
                    File[] fileArrListFiles = new File(str).listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.2
                        @Override // java.io.FileFilter
                        public final boolean accept(File file) {
                            return file.isDirectory();
                        }
                    });
                    if (fileArrListFiles != null && fileArrListFiles.length != 0 && fileArrListFiles.length != 1) {
                        listA = a(fileArrListFiles);
                    } else {
                        listA = null;
                    }
                    if (listA != null && !listA.isEmpty()) {
                        Iterator<File> it = listA.iterator();
                        while (it.hasNext()) {
                            com.bykv.vk.openvk.preload.geckox.f.c.c(it.next().getAbsolutePath() + File.separator + "using.lock");
                        }
                        bVarA.a();
                        aVarA.a();
                        return;
                    }
                    bVarA.a();
                    aVarA.a();
                } catch (Throwable th) {
                    bVarA.a();
                    throw th;
                }
            } catch (Throwable th2) {
                aVarA.a();
                throw th2;
            }
        }
    }

    public static void a(final String str) {
        f.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    c.c(str);
                } catch (Throwable th) {
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException("delete old channel version failed，path：" + str, th));
                }
            }
        });
    }

    private static void a(final File file) {
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.3
            @Override // java.lang.Runnable
            public final void run() {
                com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
            }
        });
    }
}
