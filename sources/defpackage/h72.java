package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzche;
import com.google.android.gms.internal.ads.zzdew;
import com.google.android.gms.internal.ads.zzdgx;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzahq;
import com.google.android.gms.internal.measurement.zzahr;
import com.google.android.gms.internal.p002firebaseauthapi.zzbm;
import com.google.android.gms.internal.p002firebaseauthapi.zzbq;
import com.google.android.gms.internal.p002firebaseauthapi.zzbx;
import com.google.android.gms.internal.p002firebaseauthapi.zzdh;
import com.google.android.gms.internal.p002firebaseauthapi.zzii;
import com.google.android.gms.internal.p002firebaseauthapi.zzqh;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.inmobi.media.core.config.models.CrashConfig;
import defpackage.h72;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h72 implements fs, zzqp, ng0, ry, mq1, fl0, AnalyticsEventLogger, hz3, zzche, zzdjz, zzbq {
    public static final /* synthetic */ h72 b = new h72(1);
    public static final h72 c = new h72(2);
    public static final h72 d = new h72(3);
    public static final h72 e = new h72(4);
    public static final h72 f = new h72(5);
    public static final h72 g = new h72(6);
    public static final h72 h = new h72(7);
    public static final /* synthetic */ h72 i = new h72(18);
    public static final /* synthetic */ h72 j = new h72(20);
    public static final /* synthetic */ h72 k = new h72(21);
    public static final /* synthetic */ h72 l = new h72(22);
    public static final /* synthetic */ h72 m = new h72(23);
    public static final /* synthetic */ h72 n = new h72(24);
    public static final /* synthetic */ h72 o = new h72(25);
    public static final /* synthetic */ h72 p = new h72(26);
    public static final /* synthetic */ h72 q = new h72(28);
    public final /* synthetic */ int a;

    @Override // defpackage.mq1
    public boolean b() {
        return true;
    }

    @Override // defpackage.mq1
    public void shutdown() {
    }

    public /* synthetic */ h72(int i2) {
        this.a = i2;
    }

    public static j41 c() {
        Class clsG = l41.g("com.android.billingclient.api.SkuDetailsParams");
        Class clsG2 = l41.g("com.android.billingclient.api.SkuDetailsParams$Builder");
        if (clsG == null || clsG2 == null) {
            return null;
        }
        Method methodI = l41.i(clsG, "newBuilder", new Class[0]);
        Method methodI2 = l41.i(clsG2, "setType", String.class);
        Method methodI3 = l41.i(clsG2, "setSkusList", List.class);
        Method methodI4 = l41.i(clsG2, "build", new Class[0]);
        if (methodI == null || methodI2 == null || methodI3 == null || methodI4 == null) {
            return null;
        }
        j41 j41Var = new j41(clsG, clsG2, methodI, methodI2, methodI3, methodI4);
        if (!lz.a.contains(j41.class)) {
            try {
                j41.h = j41Var;
            } catch (Throwable th) {
                lz.a(j41.class, th);
            }
        }
        if (lz.a.contains(j41.class)) {
            return null;
        }
        try {
            return j41.h;
        } catch (Throwable th2) {
            lz.a(j41.class, th2);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbq
    public Object a(zzbx zzbxVar, Class cls) throws GeneralSecurityException {
        if (cls == zzbm.class) {
            h72 h72Var = zzdh.a;
            return cls.cast(zzii.a(zzbxVar, new zzqh() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdj
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqh
                public final Object a(zzck zzckVar) throws GeneralSecurityException {
                    h72 h72Var2 = zzdh.a;
                    zzbt zzbtVarZzb = zzckVar.zzb();
                    if (zzbtVarZzb instanceof zzdp) {
                        return zzzs.c((zzdp) zzbtVarZzb);
                    }
                    if (zzbtVarZzb instanceof zzee) {
                        return zzzd.c((zzee) zzbtVarZzb);
                    }
                    if (zzbtVarZzb instanceof zzen) {
                        return zziy.c((zzen) zzbtVarZzb);
                    }
                    if (zzbtVarZzb instanceof zzdx) {
                        return zzzb.c((zzdx) zzbtVarZzb);
                    }
                    if (zzbtVarZzb instanceof zzeu) {
                        zzeu zzeuVar = (zzeu) zzbtVarZzb;
                        zzaau zzaauVar = zzeuVar.c;
                        zzaav zzaavVar = zzeuVar.b;
                        if (!zzhp.d()) {
                            return new zzzh(zzaavVar.c(zzdd.a), zzaauVar.b());
                        }
                        return new zzhp(zzaavVar.c(zzdd.a), zzaauVar.b(), zzhp.c().getProvider());
                    }
                    if (!(zzbtVarZzb instanceof zzgl)) {
                        if (zzbtVarZzb instanceof zzgf) {
                            return zzim.c((zzgf) zzbtVarZzb);
                        }
                        throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(zzbtVarZzb.getClass())));
                    }
                    zzgl zzglVar = (zzgl) zzbtVarZzb;
                    zzaau zzaauVar2 = zzglVar.c;
                    zzaav zzaavVar2 = zzglVar.b;
                    if (!zzhp.d()) {
                        return new zzaar(zzaavVar2.c(zzdd.a), zzaauVar2.b());
                    }
                    return new zzis(zzaavVar2.c(zzdd.a), zzaauVar2.b(), zzhp.c().getProvider());
                }
            }));
        }
        e.d("AeadConfigurationV1 can only create AEADs");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fs
    public void d(zx0 zx0Var, ul2 ul2Var) {
        zx0Var.getClass();
        zx0Var.e.f(fz0.k, new sa0((bs0) ul2Var, (dy) null, 3));
    }

    @Override // defpackage.ng0
    public void f(qg0 qg0Var) {
        int i2;
        String str = qg0Var.a;
        int i3 = qg0Var.d;
        int length = str.length();
        if (i3 < length) {
            char cCharAt = str.charAt(i3);
            i2 = 0;
            while (eu.q(cCharAt) && i3 < length) {
                i2++;
                i3++;
                if (i3 < length) {
                    cCharAt = str.charAt(i3);
                }
            }
        } else {
            i2 = 0;
        }
        if (i2 >= 2) {
            char cCharAt2 = str.charAt(qg0Var.d);
            char cCharAt3 = str.charAt(qg0Var.d + 1);
            if (eu.q(cCharAt2) && eu.q(cCharAt3)) {
                qg0Var.d((char) ((cCharAt3 - '0') + ((cCharAt2 - '0') * 10) + 130));
                qg0Var.d += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
            }
        }
        char cA = qg0Var.a();
        int iB = eu.B(str, qg0Var.d, 0);
        if (iB == 0) {
            if (!eu.r(cA)) {
                qg0Var.d((char) (cA + 1));
                qg0Var.d++;
                return;
            } else {
                qg0Var.d((char) 235);
                qg0Var.d((char) (cA - 127));
                qg0Var.d++;
                return;
            }
        }
        if (iB == 1) {
            qg0Var.d((char) 230);
            qg0Var.e = 1;
            return;
        }
        if (iB == 2) {
            qg0Var.d((char) 239);
            qg0Var.e = 2;
            return;
        }
        if (iB == 3) {
            qg0Var.d((char) 238);
            qg0Var.e = 3;
        } else if (iB == 4) {
            qg0Var.d((char) 240);
            qg0Var.e = 4;
        } else if (iB != 5) {
            e32.i("Illegal mode: ".concat(String.valueOf(iB)));
        } else {
            qg0Var.d((char) 231);
            qg0Var.e = 5;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void g(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // defpackage.q02
    public Object get() {
        ng1 ng1Var = new ng1(16);
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            d.w("Null flags");
            return null;
        }
        map.put(xy1.a, new xf(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, 86400000L, set));
        if (set == null) {
            d.w("Null flags");
            return null;
        }
        map.put(xy1.c, new xf(1000L, 86400000L, set));
        if (set == null) {
            d.w("Null flags");
            return null;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(p72.b)));
        if (setUnmodifiableSet == null) {
            d.w("Null flags");
            return null;
        }
        map.put(xy1.b, new xf(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() >= xy1.values().length) {
            new HashMap();
            return new wf(ng1Var, map);
        }
        e32.i("Not all priorities have been configured");
        return null;
    }

    @Override // defpackage.hz3, com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza */
    public Object mo1232zza() {
        switch (this.a) {
            case 18:
                return new Boolean(((zzahr) zzahq.b.a.a).zza());
            case 19:
            case 24:
            default:
                List list = zzfy.a;
                return zzags.b.get().zzg();
            case 20:
                List list2 = zzfy.a;
                return zzags.b.get().n();
            case 21:
                List list3 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzN());
            case 22:
                List list4 = zzfy.a;
                return Long.valueOf(zzags.b.get().v());
            case 23:
                List list5 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzH());
            case 25:
                List list6 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzche, com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo82zza(Object obj) {
        switch (this.a) {
            case 19:
                zzcgv.f.execute(new b04((zzbtt) obj, 1));
                break;
            case 24:
                ((zzdew) obj).Q();
                break;
            default:
                ((zzdgx) obj).zzk();
                break;
        }
    }
}
