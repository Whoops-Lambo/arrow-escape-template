package defpackage;

import android.os.Build;
import android.util.Log;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.Map;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l42 implements gd2 {
    public static final int g;
    public static final w32 h;
    public final yp2 a;
    public final FirebaseInstallationsApi b;
    public final z7 c;
    public final m42 d;
    public final rc2 e;
    public final pp1 f;

    static {
        uf0 uf0Var = xe0.b;
        g = (int) xe0.j(vk3.t(24, af0.HOURS), af0.SECONDS);
        h = new w32("com/google/firebase/sessions//");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ab A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:21:0x004a, B:45:0x00a1, B:47:0x00ab, B:50:0x00b6), top: B:62:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b6 A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:21:0x004a, B:45:0x00a1, B:47:0x00ab, B:50:0x00b6), top: B:62:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00b6, please report this as an issue */
    @Override // defpackage.gd2
    public final Object a(dy dyVar) throws Throwable {
        k42 k42Var;
        Mutex mutex;
        Mutex mutex2;
        Mutex mutex3;
        String str;
        Object objE;
        Mutex mutex4;
        if (dyVar instanceof k42) {
            k42Var = (k42) dyVar;
            int i = k42Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                k42Var.u = i - Integer.MIN_VALUE;
            } else {
                k42Var = new k42(this, (fy) dyVar);
            }
        } else {
            k42Var = new k42(this, (fy) dyVar);
        }
        Object obj = k42Var.s;
        int i2 = k42Var.u;
        rc2 rc2Var = this.e;
        int i3 = 1;
        int i4 = 2;
        az2 az2Var = az2.a;
        dy dyVar2 = null;
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                pp1 pp1Var = this.f;
                if (!pp1Var.d() && !rc2Var.b()) {
                    return az2Var;
                }
                k42Var.r = pp1Var;
                k42Var.u = 1;
                Object objE2 = pp1Var.e(k42Var);
                mutex = pp1Var;
                if (objE2 != dzVar) {
                }
                return dzVar;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    Mutex mutex5 = k42Var.r;
                    try {
                        wz2.a0(obj);
                        mutex3 = mutex5;
                        str = ((t61) obj).a;
                        if (str.equals("")) {
                            Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            ((pp1) mutex3).g(null);
                            return az2Var;
                        }
                        dt1 dt1Var = new dt1("X-Crashlytics-Installation-ID", str);
                        String str2 = Build.MANUFACTURER + Build.MODEL;
                        w32 w32Var = h;
                        dt1 dt1Var2 = new dt1("X-Crashlytics-Device-Model", w32Var.d(str2, ""));
                        String str3 = Build.VERSION.INCREMENTAL;
                        str3.getClass();
                        dt1 dt1Var3 = new dt1("X-Crashlytics-OS-Build-Version", w32Var.d(str3, ""));
                        String str4 = Build.VERSION.RELEASE;
                        str4.getClass();
                        dt1 dt1Var4 = new dt1("X-Crashlytics-OS-Display-Version", w32Var.d(str4, ""));
                        this.c.getClass();
                        Map mapY = qh1.Y(dt1Var, dt1Var2, dt1Var3, dt1Var4, new dt1("X-Crashlytics-API-Client-Version", "3.0.8"));
                        Log.d("FirebaseSessions", "Fetching settings from server.");
                        m42 m42Var = this.d;
                        g9 g9Var = new g9(this, dyVar2, 7);
                        kj kjVar = new kj(i4, dyVar2, i3);
                        k42Var.r = mutex3;
                        k42Var.u = 3;
                        objE = tb5.E(m42Var.b, new bm(m42Var, mapY, g9Var, kjVar, (dy) null, 5), k42Var);
                        if (objE != dzVar) {
                            objE = az2Var;
                        }
                        if (objE != dzVar) {
                            mutex4 = mutex3;
                            ((pp1) mutex4).g(null);
                            return az2Var;
                        }
                        return dzVar;
                    } catch (Throwable th) {
                        th = th;
                        mutex2 = mutex5;
                    }
                } else {
                    if (i2 != 3) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutex2 = k42Var.r;
                    try {
                        wz2.a0(obj);
                        mutex4 = mutex2;
                        ((pp1) mutex4).g(null);
                        return az2Var;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                ((pp1) mutex2).g(null);
                throw th;
            }
            Mutex mutex6 = k42Var.r;
            wz2.a0(obj);
            mutex = mutex6;
            if (!rc2Var.b()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                ((pp1) mutex).g(null);
                return az2Var;
            }
            nl0 nl0Var = t61.c;
            FirebaseInstallationsApi firebaseInstallationsApi = this.b;
            k42Var.r = mutex;
            k42Var.u = 2;
            Object objC = nl0Var.c(firebaseInstallationsApi, k42Var);
            if (objC != dzVar) {
                mutex3 = mutex;
                obj = objC;
                str = ((t61) obj).a;
                if (str.equals("")) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    ((pp1) mutex3).g(null);
                    return az2Var;
                }
                dt1 dt1Var5 = new dt1("X-Crashlytics-Installation-ID", str);
                String str5 = Build.MANUFACTURER + Build.MODEL;
                w32 w32Var2 = h;
                dt1 dt1Var6 = new dt1("X-Crashlytics-Device-Model", w32Var2.d(str5, ""));
                String str6 = Build.VERSION.INCREMENTAL;
                str6.getClass();
                dt1 dt1Var7 = new dt1("X-Crashlytics-OS-Build-Version", w32Var2.d(str6, ""));
                String str7 = Build.VERSION.RELEASE;
                str7.getClass();
                dt1 dt1Var8 = new dt1("X-Crashlytics-OS-Display-Version", w32Var2.d(str7, ""));
                this.c.getClass();
                Map mapY2 = qh1.Y(dt1Var5, dt1Var6, dt1Var7, dt1Var8, new dt1("X-Crashlytics-API-Client-Version", "3.0.8"));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                m42 m42Var2 = this.d;
                g9 g9Var2 = new g9(this, dyVar2, 7);
                kj kjVar2 = new kj(i4, dyVar2, i3);
                k42Var.r = mutex3;
                k42Var.u = 3;
                objE = tb5.E(m42Var2.b, new bm(m42Var2, mapY2, g9Var2, kjVar2, (dy) null, 5), k42Var);
                if (objE != dzVar) {
                    objE = az2Var;
                }
                if (objE != dzVar) {
                    mutex4 = mutex3;
                    ((pp1) mutex4).g(null);
                    return az2Var;
                }
            }
            return dzVar;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
        }
    }

    @Override // defpackage.gd2
    public final Double b() {
        return this.e.a().b;
    }

    @Override // defpackage.gd2
    public final Boolean c() {
        return this.e.a().a;
    }

    @Override // defpackage.gd2
    public final xe0 d() {
        Integer num = this.e.a().c;
        if (num == null) {
            return null;
        }
        uf0 uf0Var = xe0.b;
        return new xe0(vk3.t(num.intValue(), af0.SECONDS));
    }

    public l42(yp2 yp2Var, FirebaseInstallationsApi firebaseInstallationsApi, z7 z7Var, m42 m42Var, rc2 rc2Var) {
        yp2Var.getClass();
        firebaseInstallationsApi.getClass();
        z7Var.getClass();
        m42Var.getClass();
        rc2Var.getClass();
        this.a = yp2Var;
        this.b = firebaseInstallationsApi;
        this.c = z7Var;
        this.d = m42Var;
        this.e = rc2Var;
        this.f = new pp1();
    }
}
