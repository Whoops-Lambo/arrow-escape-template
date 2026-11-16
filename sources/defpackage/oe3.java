package defpackage;

import com.bytedance.sdk.openadsdk.fpz.rz;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class oe3 implements za3 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public synchronized void f() {
        try {
            ArrayList arrayListD = d();
            int size = arrayListD.size();
            HashSet hashSetG = null;
            int i = 0;
            while (i < size) {
                Object obj = arrayListD.get(i);
                i++;
                te3 te3Var = (te3) obj;
                File[] fileArr = te3Var.a;
                if (fileArr != null && fileArr.length >= te3Var.b) {
                    if (hashSetG == null) {
                        hashSetG = g();
                    }
                    int i2 = te3Var.b - 2;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    c(te3Var.a, i2, hashSetG);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void c(File[] fileArr, int i, HashSet hashSet) {
        if (i >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i) {
                    List listAsList = Arrays.asList(fileArr);
                    Collections.sort(listAsList, new zm(16));
                    while (i < listAsList.size()) {
                        if (!hashSet.contains(((File) listAsList.get(i)).getAbsolutePath())) {
                            ((File) listAsList.get(i)).delete();
                        }
                        i++;
                    }
                }
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5O1kmNAq89Se0o2wC9as+F", "duspnAKfaMSIT/NUnjitOFc=", "WOIolBGfaMSITw==", 187);
            }
        }
    }

    public static HashSet g() {
        zg3 zg3Var;
        zg3 zg3Var2;
        HashSet hashSet = new HashSet();
        for (ne3 ne3Var : ne3.e.values()) {
            if (ne3Var != null && (zg3Var2 = ne3Var.d) != null) {
                hashSet.add(s71.a(zg3Var2.ct(), zg3Var2.xh()).getAbsolutePath());
                hashSet.add(s71.x(zg3Var2.ct(), zg3Var2.xh()).getAbsolutePath());
            }
        }
        for (eb3 eb3Var : bh3.a.values()) {
            if (eb3Var != null && (zg3Var = eb3Var.a) != null) {
                hashSet.add(s71.a(zg3Var.ct(), zg3Var.xh()).getAbsolutePath());
                hashSet.add(s71.x(zg3Var.ct(), zg3Var.xh()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    public String a() {
        if (this.d == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            this.d = nj.q(sb, File.separator, "video_splash");
            File file = new File(this.d);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.d;
    }

    public String b() {
        if (this.b == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            this.b = nj.q(sb, File.separator, "video_reward_full");
            File file = new File(this.b);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.b;
    }

    public ArrayList d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new te3(new File(b()).listFiles(), u12.i));
        arrayList.add(new te3(new File(a()).listFiles(), u12.h));
        if (this.c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            this.c = nj.q(sb, File.separator, "video_brand");
            File file = new File(this.c);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        arrayList.add(new te3(new File(this.c).listFiles(), u12.j));
        arrayList.add(new te3(new File(e()).listFiles(), u12.k));
        return arrayList;
    }

    public String e() {
        if (this.e == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            this.e = nj.q(sb, File.separator, "video_default");
            File file = new File(this.e);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.e;
    }
}
