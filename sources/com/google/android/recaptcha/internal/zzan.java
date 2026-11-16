package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import defpackage.az2;
import defpackage.cz;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fv;
import defpackage.gv;
import defpackage.pp1;
import defpackage.s71;
import defpackage.tb5;
import defpackage.wz2;
import defpackage.xa0;
import java.util.Timer;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzan {
    public fv zza;

    @NotNull
    private final cz zzb;

    @NotNull
    private final zzek zzc;

    @NotNull
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;

    @NotNull
    private zzao zze = zzao.zza;

    @NotNull
    private final Mutex zzg = new pp1();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzi(dy dyVar) throws Exception {
        zzag zzagVar;
        if (dyVar instanceof zzag) {
            zzagVar = (zzag) dyVar;
            int i = zzagVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzagVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzagVar = new zzag(this, dyVar);
            }
        } else {
            zzagVar = new zzag(this, dyVar);
        }
        Object obj = zzagVar.zza;
        int i2 = zzagVar.zzc;
        if (i2 != 0) {
            if (i2 == 1) {
                wz2.a0(obj);
                return obj;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(obj);
        xa0 xa0VarZza = zzbx.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
        zzagVar.zzc = 1;
        Object objAwait = xa0VarZza.await(zzagVar);
        dz dzVar = dz.a;
        return objAwait == dzVar ? dzVar : objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r8 == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(java.lang.String r7, defpackage.dy r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            int r1 = r0.zzc
            r2 = 0
            r3 = 2
            r4 = 1
            dz r5 = defpackage.dz.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.wz2.a0(r8)
            goto L6b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r6)
            return r2
        L31:
            java.lang.String r7 = r0.zzd
            defpackage.wz2.a0(r8)
            goto L4a
        L37:
            defpackage.wz2.a0(r8)
            fv r6 = r6.zzf()
            r0.zzd = r7
            r0.zzc = r4
            gv r6 = (defpackage.gv) r6
            java.lang.Object r8 = r6.m(r0)
            if (r8 == r5) goto L72
        L4a:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r8
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r6.setRequestHash(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r8.request(r6)
            xa0 r6 = com.google.android.recaptcha.internal.zzbx.zza(r6)
            r0.zzd = r2
            r0.zzc = r3
            java.lang.Object r8 = r6.await(r0)
            if (r8 != r5) goto L6b
            goto L72
        L6b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r8
            java.lang.String r6 = r8.token()
            return r6
        L72:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzj(java.lang.String, dy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r10 != r6) goto L32;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull defpackage.dy r10) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            int r1 = r0.zzc
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            dz r6 = defpackage.dz.a
            if (r1 == 0) goto L44
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.wz2.a0(r10)
            goto L73
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r8)
            return r2
        L34:
            java.lang.String r8 = r0.zze
            com.google.android.recaptcha.internal.zzan r9 = r0.zzd
            defpackage.wz2.a0(r10)
            goto L67
        L3c:
            java.lang.String r9 = r0.zze
            com.google.android.recaptcha.internal.zzan r8 = r0.zzd
            defpackage.wz2.a0(r10)     // Catch: java.lang.Exception -> L57
            goto L54
        L44:
            defpackage.wz2.a0(r10)
            r0.zzd = r8     // Catch: java.lang.Exception -> L57
            r0.zze = r9     // Catch: java.lang.Exception -> L57
            r0.zzc = r5     // Catch: java.lang.Exception -> L57
            java.lang.Object r10 = r8.zzj(r9, r0)     // Catch: java.lang.Exception -> L57
            if (r10 != r6) goto L54
            goto L76
        L54:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L57
            return r10
        L57:
            r0.zzd = r8
            r0.zze = r9
            r0.zzc = r4
            java.lang.Object r10 = r8.zze(r0)
            if (r10 != r6) goto L64
            goto L76
        L64:
            r7 = r9
            r9 = r8
            r8 = r7
        L67:
            r0.zzd = r2
            r0.zze = r2
            r0.zzc = r3
            java.lang.Object r10 = r9.zzj(r8, r0)
            if (r10 == r6) goto L76
        L73:
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L76:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzc(java.lang.String, dy):java.lang.Object");
    }

    @Nullable
    public final Object zzd(long j, @NotNull dy dyVar) {
        this.zzf = j;
        return az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object zze(@NotNull dy dyVar) {
        zzak zzakVar;
        pp1 pp1Var;
        Mutex mutex;
        if (dyVar instanceof zzak) {
            zzakVar = (zzak) dyVar;
            int i = zzakVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzakVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzakVar = new zzak(this, dyVar);
            }
        } else {
            zzakVar = new zzak(this, dyVar);
        }
        Object obj = zzakVar.zzb;
        int i2 = zzakVar.zzd;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                Mutex mutex2 = this.zzg;
                zzakVar.zze = this;
                zzakVar.zza = mutex2;
                zzakVar.zzd = 1;
                pp1Var = (pp1) mutex2;
                if (pp1Var.e(zzakVar) != dzVar) {
                }
                mutex = pp1Var;
                return dzVar;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    wz2.a0(obj);
                    return az2Var;
                }
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Mutex mutex3 = (Mutex) zzakVar.zza;
            zzan zzanVar = zzakVar.zze;
            wz2.a0(obj);
            mutex = mutex3;
            this = zzanVar;
            mutex = pp1Var;
            if (!s71.b(this.zze, zzao.zza)) {
                ((pp1) mutex).g(null);
                return az2Var;
            }
            this.zze = zzao.zzb;
            ((pp1) mutex).g(null);
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzekVar.zzb(2);
            zzen zzenVarZzf = zzekVar.zzf(38);
            this.zza = new gv();
            tb5.t(this.zzb, null, null, new zzam(this, zzenVarZzf, null), 3);
            zzakVar.zze = null;
            zzakVar.zza = null;
            zzakVar.zzd = 2;
            if (!this.zzh) {
                new Timer().schedule(new zzai(this), 28800000L, 28800000L);
                this.zzh = true;
            }
            if (az2Var != dzVar) {
                return az2Var;
            }
            mutex = pp1Var;
            return dzVar;
        } catch (Throwable th) {
            ((pp1) mutex).g(null);
            throw th;
        }
    }

    @NotNull
    public final fv zzf() {
        fv fvVar = this.zza;
        if (fvVar != null) {
            return fvVar;
        }
        return null;
    }

    public zzan(@NotNull Context context, @NotNull cz czVar, @NotNull zzek zzekVar, @NotNull StandardIntegrityManager standardIntegrityManager, long j) {
        this.zzb = czVar;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }
}
