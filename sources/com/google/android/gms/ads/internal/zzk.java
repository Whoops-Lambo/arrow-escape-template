package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzaxk;
import com.google.android.gms.internal.ads.zzaxl;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzazx;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbbl;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbda;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzfzx;
import com.google.android.gms.internal.ads.zzgav;
import com.google.android.gms.internal.ads.zzgbp;
import com.google.android.gms.internal.ads.zzheh;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import defpackage.jx3;
import defpackage.rj4;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzk implements Runnable, zzbbj {
    private static final long zzc = System.currentTimeMillis();

    @VisibleForTesting
    protected boolean zza;
    private final boolean zzg;
    private final boolean zzh;
    private final Executor zzi;
    private final zzfzx zzj;
    private Context zzk;
    private final Context zzl;
    private VersionInfoParcel zzm;
    private final VersionInfoParcel zzn;
    private final boolean zzo;
    private int zzp;
    private final List zzd = new Vector();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            if (((Boolean) zzba.zzc().a(zzbjr.D4)).booleanValue()) {
                this.zza = zzm();
            }
            boolean z2 = this.zzm.isClientJar;
            final boolean z3 = false;
            if (!((Boolean) zzba.zzc().a(zzbjr.Q1)).booleanValue() && z2) {
                z3 = true;
            }
            if (zzp() == 1) {
                zzr(z3);
                if (this.zzp == 2) {
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzn(z3);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    zzbbg zzbbgVarZzu = zzu(this.zzk, this.zzm, z3, this.zzo);
                    this.zzf.set(zzbbgVarZzu);
                    if (this.zzh) {
                        synchronized (zzbbgVarZzu) {
                            z = zzbbgVarZzu.q;
                        }
                        if (!z) {
                            this.zzp = 1;
                            zzr(z3);
                        }
                    }
                } catch (NullPointerException e) {
                    this.zzp = 1;
                    zzr(z3);
                    this.zzj.c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
        } catch (Throwable th) {
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final String zzl(Context context) {
        return zzb(context, null);
    }

    private final void zzq() {
        List<Object[]> list = this.zzd;
        zzbbj zzbbjVarZzs = zzs();
        if (list.isEmpty() || zzbbjVarZzs == null) {
            return;
        }
        for (Object[] objArr : list) {
            try {
                int length = objArr.length;
                if (length == 1) {
                    zzbbjVarZzs.zzd((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzbbjVarZzs.zze(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        this.zzd.clear();
    }

    private final void zzr(boolean z) {
        String str = this.zzm.afmaVersion;
        Context contextZzt = zzt(this.zzk);
        zzaxk zzaxkVarI = zzaxl.I();
        zzaxkVarI.l();
        ((zzaxl) zzaxkVarI.b).K(z);
        zzaxkVarI.l();
        ((zzaxl) zzaxkVarI.b).J(str);
        zzbbl zzbblVar = new zzbbl((zzaxl) zzaxkVarI.m());
        synchronized (zzbbm.class) {
            if (!zzbbm.y) {
                zzbbm.z = System.currentTimeMillis() / 1000;
                zzbbk.u = zzbbm.h(contextZzt, zzbblVar.a);
                zzbbm.A = zzbbu.a(contextZzt);
                ExecutorService executorService = zzbbk.u.b;
                zzbbm.B = zzbda.a(contextZzt, executorService);
                zzbbm.C = new zzbcs();
                zzbbr zzbbrVar = new zzbbr(contextZzt, executorService);
                zzbbm.E = zzbbrVar;
                zzbbm.D = new zzbal(contextZzt, executorService, zzbblVar.c, zzbbrVar);
                zzbbm.y = true;
            }
        }
        this.zze.set(new zzbbn(contextZzt, zzbblVar));
    }

    public final boolean zza() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final String zzc() {
        int i = this.zzp;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? "2" : "1";
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbbj zzbbjVarZzs;
        zzbbj zzbbjVarZzs2;
        try {
            if (((Boolean) zzba.zzc().a(zzbjr.Q3)).booleanValue()) {
                if (this.zzb.getCount() != 0 || (zzbbjVarZzs2 = zzs()) == null) {
                    return;
                }
                zzbbjVarZzs2.zzi(stackTraceElementArr);
                return;
            }
            if (!zza() || (zzbbjVarZzs = zzs()) == null) {
                return;
            }
            zzbbjVarZzs.zzi(stackTraceElementArr);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final String zzj(Context context, View view, Activity activity) {
        try {
            if (!((Boolean) zzba.zzc().a(zzbjr.tc)).booleanValue()) {
                zzbbj zzbbjVarZzs = zzs();
                if (((Boolean) zzba.zzc().a(zzbjr.uc)).booleanValue()) {
                    zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzM(view, 2, null);
                }
                return zzbbjVarZzs != null ? zzbbjVarZzs.zzj(context, view, activity) : "";
            }
            if (!zza()) {
                return "";
            }
            zzbbj zzbbjVarZzs2 = zzs();
            if (((Boolean) zzba.zzc().a(zzbjr.uc)).booleanValue()) {
                zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzM(view, 2, null);
            }
            return zzbbjVarZzs2 != null ? zzbbjVarZzs2.zzj(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final String zzk(final Context context) {
        try {
            return (String) zzheh.c(this.zzi, new Callable() { // from class: com.google.android.gms.ads.internal.zzj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb(context, null);
                }
            }).get(((Integer) zzba.zzc().a(zzbjr.J3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.zzn.afmaVersion;
            long j = zzc;
            String strEncodeToString = "E";
            try {
                zzazw zzazwVarE = zzazx.E();
                zzazwVarE.l();
                ((zzazx) zzazwVarE.b).G(str);
                zzazwVarE.l();
                ((zzazx) zzazwVarE.b).F("0.933379543");
                String packageName = context.getPackageName();
                zzazwVarE.l();
                ((zzazx) zzazwVarE.b).I(packageName);
                long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
                zzazwVarE.l();
                ((zzazx) zzazwVarE.b).K(jCurrentTimeMillis);
                long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                zzazwVarE.l();
                ((zzazx) zzazwVarE.b).H(jCurrentTimeMillis2);
                if (((Boolean) zzba.zzc().a(zzbjr.C4)).booleanValue()) {
                    try {
                        Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                        if (signatureArr != null && signatureArr.length > 0) {
                            byte[] bArrDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(signatureArr[0].toByteArray());
                            StringBuilder sb = new StringBuilder();
                            for (byte b : bArrDigest) {
                                String hexString = Integer.toHexString(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                if (hexString.length() == 1) {
                                    sb.append('0');
                                }
                                sb.append(hexString);
                            }
                            strEncodeToString = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 11);
                        }
                    } catch (Exception unused3) {
                    }
                    zzazwVarE.l();
                    ((zzazx) zzazwVarE.b).L(strEncodeToString);
                }
                try {
                    long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    zzazwVarE.l();
                    ((zzazx) zzazwVarE.b).J(j2);
                } catch (PackageManager.NameNotFoundException unused4) {
                    zzazwVarE.l();
                    ((zzazx) zzazwVarE.b).J(-1L);
                }
                zzbad zzbadVarB = jx3.b(null, ((zzazx) zzazwVarE.m()).h());
                zzbadVarB.l();
                ((zzbae) zzbadVarB.b).H(5);
                zzbadVarB.l();
                ((zzbae) zzbadVarB.b).I(2);
                return Base64.encodeToString(((zzbae) zzbadVarB.m()).h(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused5) {
                return Integer.toString(7);
            }
        }
    }

    public final boolean zzm() {
        Context context = this.zzk;
        zzh zzhVar = new zzh(this);
        zzfzx zzfzxVar = this.zzj;
        zzgbp zzgbpVar = new zzgbp(this.zzk, zzgav.b(context, zzfzxVar), zzhVar, ((Boolean) zzba.zzc().a(zzbjr.t3)).booleanValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzgbp.f) {
            try {
                zzbfc zzbfcVarF = zzgbpVar.f(1);
                if (zzbfcVarF == null) {
                    zzgbpVar.e(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileC = zzgbpVar.c(zzbfcVarF.E());
                if (!new File(fileC, "pcam.jar").exists()) {
                    zzgbpVar.e(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileC, "pcbc").exists()) {
                    zzgbpVar.e(5019, jCurrentTimeMillis);
                    return true;
                }
                zzgbpVar.e(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ zzfzx zzo() {
        return this.zzj;
    }

    public final int zzp() {
        if (!this.zzg || this.zza) {
            return this.zzp;
        }
        return 1;
    }

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzk = context;
        this.zzl = context;
        this.zzm = versionInfoParcel;
        this.zzn = versionInfoParcel;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.zzi = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(zzbjr.v3)).booleanValue();
        this.zzo = zBooleanValue;
        this.zzj = zzfzx.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzg = ((Boolean) zzba.zzc().a(zzbjr.s3)).booleanValue();
        this.zzh = ((Boolean) zzba.zzc().a(zzbjr.w3)).booleanValue();
        if (((Boolean) zzba.zzc().a(zzbjr.u3)).booleanValue()) {
            this.zzp = 2;
        } else {
            this.zzp = 1;
        }
        if (!((Boolean) zzba.zzc().a(zzbjr.D4)).booleanValue()) {
            this.zza = zzm();
        }
        if (((Boolean) zzba.zzc().a(zzbjr.y4)).booleanValue()) {
            zzcgv.a.execute(this);
            return;
        }
        zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzB()) {
            zzcgv.a.execute(this);
        } else {
            run();
        }
    }

    @Nullable
    private final zzbbj zzs() {
        if (zzp() == 2) {
            return (zzbbj) this.zzf.get();
        }
        return (zzbbj) this.zze.get();
    }

    private static final Context zzt(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    private static final zzbbg zzu(Context context, VersionInfoParcel versionInfoParcel, boolean z, boolean z2) {
        zzbbg zzbbgVarD;
        zzaxk zzaxkVarI = zzaxl.I();
        zzaxkVarI.l();
        ((zzaxl) zzaxkVarI.b).K(z);
        String str = versionInfoParcel.afmaVersion;
        zzaxkVarI.l();
        ((zzaxl) zzaxkVarI.b).J(str);
        zzaxl zzaxlVar = (zzaxl) zzaxkVarI.m();
        Context contextZzt = zzt(context);
        synchronized (zzbbg.class) {
            rj4 rj4Var = new rj4();
            rj4Var.b = false;
            byte b = (byte) (rj4Var.f | 1);
            rj4Var.c = true;
            rj4Var.d = 100L;
            rj4Var.e = 300L;
            rj4Var.f = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16)) | 32);
            String strE = zzaxlVar.E();
            if (strE != null) {
                rj4Var.a = strE;
                rj4Var.b = zzaxlVar.F();
                rj4Var.f = (byte) (rj4Var.f | 1);
                zzbbgVarD = zzbbg.d(contextZzt, Executors.newCachedThreadPool(), rj4Var.a(), z2);
            } else {
                throw new NullPointerException("Null clientVersion");
            }
        }
        return zzbbgVarD;
    }

    public final String zzb(Context context, byte[] bArr) {
        zzbbj zzbbjVarZzs;
        if (zza() && (zzbbjVarZzs = zzs()) != null) {
            zzq();
            try {
                return zzbbjVarZzs.zzl(zzt(context));
            } catch (NullPointerException unused) {
                return "";
            }
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final void zzd(MotionEvent motionEvent) {
        zzbbj zzbbjVarZzs = zzs();
        if (zzbbjVarZzs != null) {
            zzq();
            try {
                zzbbjVarZzs.zzd(motionEvent);
                return;
            } catch (NullPointerException unused) {
                return;
            }
        }
        this.zzd.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final void zze(int i, int i2, int i3) {
        zzbbj zzbbjVarZzs = zzs();
        if (zzbbjVarZzs != null) {
            zzq();
            try {
                zzbbjVarZzs.zze(i, i2, i3);
                return;
            } catch (NullPointerException unused) {
                return;
            }
        }
        this.zzd.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (zza()) {
            zzbbj zzbbjVarZzs = zzs();
            if (((Boolean) zzba.zzc().a(zzbjr.uc)).booleanValue()) {
                zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzM(view, 4, null);
            }
            if (zzbbjVarZzs != null) {
                zzq();
                try {
                    return zzbbjVarZzs.zzf(zzt(context), str, view, activity);
                } catch (NullPointerException unused) {
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final void zzh(View view) {
        zzbbj zzbbjVarZzs = zzs();
        if (zzbbjVarZzs != null) {
            try {
                zzbbjVarZzs.zzh(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    public final /* synthetic */ void zzn(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zzu(this.zzl, this.zzn, z, this.zzo).b();
        } catch (NullPointerException e) {
            this.zzj.c(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
    }
}
