package defpackage;

import android.util.Log;
import androidx.datastore.core.DataStore;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ff2 {
    public final ec2 a;
    public final tb2 b;
    public final sb2 c;
    public final yp2 d;
    public final DataStore e;
    public final gz1 f;
    public final sy g;
    public ib2 h;
    public boolean i;
    public boolean j;
    public String k;

    public final void b() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        tb5.t(kc2.a(this.g), null, null, new bf2(this, null, 1), 3);
    }

    public final void c() {
        this.i = true;
        ib2 ib2Var = this.h;
        if (ib2Var == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        dy dyVar = null;
        if (ib2Var == null) {
            s71.D("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
        if (e(ib2Var) || d(ib2Var)) {
            tb5.t(kc2.a(this.g), null, null, new g9(this, ib2Var, dyVar, 8), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ff2 ff2Var, String str, cf2 cf2Var, dy dyVar) throws Throwable {
        ef2 ef2Var;
        String str2;
        if (dyVar instanceof ef2) {
            ef2Var = (ef2) dyVar;
            int i = ef2Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ef2Var.v = i - Integer.MIN_VALUE;
            } else {
                ef2Var = new ef2(ff2Var, dyVar);
            }
        } else {
            ef2Var = new ef2(ff2Var, dyVar);
        }
        Object objB = ef2Var.t;
        dz dzVar = dz.a;
        int i2 = ef2Var.v;
        if (i2 == 0) {
            wz2.a0(objB);
            if (s71.b(ff2Var.k, str)) {
                return az2.a;
            }
            ff2Var.k = str;
            do0 do0Var = do0.a;
            ef2Var.r = str;
            ef2Var.s = cf2Var;
            ef2Var.v = 1;
            objB = do0Var.b(ef2Var);
            if (objB == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf2Var = ef2Var.s;
            str = ef2Var.r;
            wz2.a0(objB);
        }
        for (CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber : ((Map) objB).values()) {
            bc2 bc2Var = new bc2(str);
            crashlyticsAppQualitySessionsSubscriber.getClass();
            String str3 = "App Quality Sessions session changed: " + bc2Var;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            ls lsVar = crashlyticsAppQualitySessionsSubscriber.b;
            synchronized (lsVar) {
                if (!Objects.equals((String) lsVar.d, str)) {
                    ls.G((FileStore) lsVar.b, (String) lsVar.c, str);
                    lsVar.d = str;
                }
            }
            int iOrdinal = cf2Var.ordinal();
            if (iOrdinal == 0) {
                str2 = "Notified " + ac2.a + " of new session " + str;
            } else {
                if (iOrdinal != 1) {
                    e.b();
                    return null;
                }
                str2 = "Notified " + ac2.a + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return az2.a;
    }

    public final boolean d(ib2 ib2Var) {
        Map map = ib2Var.c;
        boolean z = true;
        gz1 gz1Var = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + gz1Var.a());
            return true;
        }
        gz1Var.getClass();
        ez1 ez1Var = (ez1) map.get(gz1Var.a());
        if (ez1Var != null && ez1Var.a == gz1Var.c && s71.b(ez1Var.b, (String) gz1Var.d.getValue())) {
            z = false;
        }
        if (z) {
            Log.d("FirebaseSessions", "Process " + gz1Var.a() + " is stale");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    public final boolean e(ib2 ib2Var) {
        xe0 xe0VarD;
        long jT;
        up2 up2Var = ib2Var.b;
        nb2 nb2Var = ib2Var.a;
        if (up2Var == null) {
            Log.d("FirebaseSessions", "Session " + nb2Var.a + " has not backgrounded yet");
            return false;
        }
        this.d.getClass();
        up2 up2VarA = yp2.a();
        uf0 uf0Var = xe0.b;
        long jX = vk3.x(up2VarA.a - up2Var.a, af0.MILLISECONDS);
        ec2 ec2Var = this.a;
        xe0 xe0VarD2 = ec2Var.a.d();
        if (xe0VarD2 != null) {
            jT = xe0VarD2.a;
            if (jT <= 0 || xe0.g(jT)) {
                xe0VarD = ec2Var.b.d();
                if (xe0VarD != null) {
                    jT = xe0VarD.a;
                    if (jT > 0 || xe0.g(jT)) {
                        jT = vk3.t(30, af0.MINUTES);
                    }
                } else {
                    jT = vk3.t(30, af0.MINUTES);
                }
            }
        } else {
            xe0VarD = ec2Var.b.d();
            if (xe0VarD != null) {
                jT = xe0VarD.a;
                if (jT > 0) {
                    jT = vk3.t(30, af0.MINUTES);
                } else {
                    jT = vk3.t(30, af0.MINUTES);
                }
            } else {
                jT = vk3.t(30, af0.MINUTES);
            }
        }
        boolean z = xe0.c(jX, jT) > 0;
        if (z) {
            Log.d("FirebaseSessions", "Session " + nb2Var.a + " is expired");
        }
        return z;
    }

    public ff2(ec2 ec2Var, tb2 tb2Var, sb2 sb2Var, yp2 yp2Var, DataStore dataStore, gz1 gz1Var, sy syVar) {
        ec2Var.getClass();
        tb2Var.getClass();
        sb2Var.getClass();
        yp2Var.getClass();
        dataStore.getClass();
        gz1Var.getClass();
        syVar.getClass();
        this.a = ec2Var;
        this.b = tb2Var;
        this.c = sb2Var;
        this.d = yp2Var;
        this.e = dataStore;
        this.f = gz1Var;
        this.g = syVar;
        this.k = "";
        tb5.t(kc2.a(syVar), null, null, new bf2(this, null, 0), 3);
    }
}
