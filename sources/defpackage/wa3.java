package defpackage;

import com.bytedance.sdk.component.ahm.kgy.at;
import com.bytedance.sdk.component.ahm.kgy.nu;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class wa3 {
    public final boolean a;
    public final File d;
    public final File e;
    public final long f;
    public RandomAccessFile j;
    public final zg3 k;
    public volatile long l;
    public volatile long b = -2147483648L;
    public final Object c = new Object();
    public volatile int g = -100;
    public volatile boolean h = false;
    public volatile boolean i = false;

    public static void b(wa3 wa3Var, int i, String str) {
        JSONObject jSONObjectRz;
        wa3Var.i = false;
        wa3Var.g = i;
        wa3Var.b = -1L;
        sx.ahm("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i), " ", str);
        if (!wa3Var.k.kgy() || (jSONObjectRz = wa3Var.k.rz()) == null) {
            return;
        }
        try {
            jSONObjectRz.put("error_real_code", i);
            jSONObjectRz.put("error_real_msg", str);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5O1kmNAq89Se0o2wC9as+F", "duspnAKYZtCORthciCGsKULNLJYLuUDKkEY=", "U+8jkQ+5T8aJRuVYnwGvJkjr", Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);
            sx.kgy("CSJ_MediaDLPlay", "handleFailResponse: ", th);
        }
    }

    public static void c(wa3 wa3Var) {
        synchronized (wa3Var.c) {
            if (wa3Var.e.exists()) {
                wa3Var.k.dg();
                wa3Var.k.xh();
                return;
            }
            try {
                if (!wa3Var.d.renameTo(wa3Var.e)) {
                    throw new IOException("Error renaming file " + wa3Var.d + " to " + wa3Var.e + " for completion!");
                }
                RandomAccessFile randomAccessFile = wa3Var.j;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                wa3Var.j = new RandomAccessFile(wa3Var.e, "rw");
                wa3Var.k.xh();
                wa3Var.k.dg();
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5O1kmNAq89Se0o2wC9as+F", "duspnAKYZtCORthciCGsKULNLJYLuUDKkEY=", "WOEghQ+5fcI=", 333);
                th.getMessage();
            }
        }
    }

    public wa3(zg3 zg3Var) {
        this.f = 0L;
        this.j = null;
        this.k = zg3Var;
        try {
            String strCt = zg3Var.ct();
            String strXh = zg3Var.xh();
            File fileA = s71.a(strCt, strXh);
            this.d = fileA;
            File fileX = s71.x(strCt, strXh);
            this.e = fileX;
            if (fileX.exists()) {
                this.j = new RandomAccessFile(fileX, "r");
            } else {
                this.j = new RandomAccessFile(fileA, "rw");
            }
            if (!fileX.exists()) {
                this.f = fileA.length();
                a();
            }
            this.a = u12.n == 2;
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5O1kmNAq89Se0o2wC9as+F", "duspnAKYZtCORthciCGsKULNLJYLuUDKkEY=", "B+cjnBfi", 94);
            zg3Var.dg();
        }
    }

    public final void a() {
        nu.kgy kgyVar;
        if (xg3.b() != null) {
            kgyVar = xg3.b().rz();
        } else {
            kgyVar = new nu.kgy("v_cache");
        }
        zg3 zg3Var = this.k;
        long jFpp = zg3Var.fpp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kgyVar.kgy(jFpp, timeUnit).ahm(zg3Var.sx(), timeUnit).rz(zg3Var.gm(), timeUnit);
        nu nuVarKgy = kgyVar.kgy();
        zg3Var.xh();
        nuVarKgy.kgy(new at.kgy().kgy("RANGE", jc1.m(this.f, "-", new StringBuilder("bytes="))).ahm(zg3Var.dg()).kgy().kgy("videoLoadWhenPlaying").kgy(9).ahm()).kgy(new w13(this, 6));
    }
}
