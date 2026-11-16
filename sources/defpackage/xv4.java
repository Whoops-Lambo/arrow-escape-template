package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzabt;
import com.google.android.gms.internal.ads.zzabu;
import com.google.android.gms.internal.ads.zzabv;
import com.google.android.gms.internal.ads.zzacb;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzhof;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzqn;
import com.google.android.gms.internal.ads.zzth;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlr;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.internal.zzh;
import io.p071bidmachine.media3.exoplayer.audio.x;
import io.p071bidmachine.media3.exoplayer.source.w0;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xv4 implements OnCompleteListener, zzabv, RemoteCall, v15, qp4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, w15] */
    public /* synthetic */ xv4(z15 z15Var, Context context) {
        this.a = 6;
        this.d = z15Var;
        this.b = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: w15
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                z15 z15Var2 = (z15) this.a.d;
                if (z15Var2.T) {
                    return;
                }
                z15Var2.p(1, 19, Integer.valueOf(i));
            }
        };
        this.c = r0;
        context.registerDeviceIdChangeListener(new qn3(z15Var.t.a(z15Var.r, null), 1), r0);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public synchronized void b(zzabu zzabuVar) {
        ((zzjn) this.d).c.b(zzabuVar);
        while (zzabuVar != null) {
            zzabt zzabtVar = (zzabt) ((w0) zzabuVar).c;
            zzabtVar.getClass();
            g(zzabtVar);
            zzabuVar = ((w0) zzabuVar).zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public synchronized void c(zzabt zzabtVar) {
        ((zzjn) this.d).c.c(zzabtVar);
        g(zzabtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public synchronized zzabt zza() {
        zzabt zzabtVarZza;
        zzjn zzjnVar = (zzjn) this.d;
        zzacb zzacbVar = zzjnVar.c;
        HashMap map = (HashMap) this.b;
        zzabtVarZza = zzacbVar.zza();
        zzqn zzqnVar = (zzqn) this.c;
        map.put(zzabtVarZza, zzqnVar);
        k05 k05Var = (k05) zzjnVar.n.get(zzqnVar);
        if (k05Var != null) {
            synchronized (k05Var) {
                k05Var.d++;
            }
        }
        return zzabtVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public synchronized void zzd() {
        ((zzjn) this.d).c.zzd();
    }

    public static void e(wv4 wv4Var, xv4 xv4Var) {
        xv4 xv4Var2 = wv4Var.a;
        long[] jArr = (long[]) xv4Var.b;
        long[] jArr2 = (long[]) xv4Var2.b;
        long[] jArr3 = wv4Var.b;
        zzhof.e(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) xv4Var.c;
        long[] jArr5 = (long[]) xv4Var2.c;
        long[] jArr6 = (long[]) xv4Var2.d;
        zzhof.e(jArr4, jArr5, jArr6);
        zzhof.e((long[]) xv4Var.d, jArr6, jArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[PHI: r10
  0x0033: PHI (r10v9 int) = (r10v1 int), (r10v0 int) binds: [B:9:0x0018, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x006a  */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    @Override // defpackage.v15
    public void a(int i, Throwable th, byte[] bArr) {
        zzlr zzlrVar;
        zzlj zzljVar = (zzlj) this.b;
        zzljVar.t();
        zzom zzomVar = (zzom) this.d;
        if (i == 200 || i == 204) {
            if (th == null) {
                zzgu zzguVar = ((zzic) zzljVar.a).f;
                zzic.l(zzguVar);
                zzguVar.n.b(Long.valueOf(zzomVar.a), "[sgtm] Upload succeeded for row_id");
                zzlrVar = zzlr.SUCCESS;
            } else {
                zzgu zzguVar2 = ((zzic) zzljVar.a).f;
                zzic.l(zzguVar2);
                zzguVar2.i.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.a), Integer.valueOf(i), th);
                if (Arrays.asList(((String) zzfy.u.a(null)).split(",")).contains(String.valueOf(i))) {
                    zzlrVar = zzlr.BACKOFF;
                } else {
                    zzlrVar = zzlr.FAILURE;
                }
            }
        } else if (i == 304) {
            i = 304;
            if (th == null) {
                zzgu zzguVar3 = ((zzic) zzljVar.a).f;
                zzic.l(zzguVar3);
                zzguVar3.n.b(Long.valueOf(zzomVar.a), "[sgtm] Upload succeeded for row_id");
                zzlrVar = zzlr.SUCCESS;
            } else {
                zzgu zzguVar4 = ((zzic) zzljVar.a).f;
                zzic.l(zzguVar4);
                zzguVar4.i.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.a), Integer.valueOf(i), th);
                if (Arrays.asList(((String) zzfy.u.a(null)).split(",")).contains(String.valueOf(i))) {
                    zzlrVar = zzlr.BACKOFF;
                } else {
                    zzlrVar = zzlr.FAILURE;
                }
            }
        } else {
            zzgu zzguVar5 = ((zzic) zzljVar.a).f;
            zzic.l(zzguVar5);
            zzguVar5.i.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.a), Integer.valueOf(i), th);
            if (Arrays.asList(((String) zzfy.u.a(null)).split(",")).contains(String.valueOf(i))) {
                zzlrVar = zzlr.BACKOFF;
            } else {
                zzlrVar = zzlr.FAILURE;
            }
        }
        AtomicReference atomicReference = (AtomicReference) this.c;
        zznl zznlVarO = ((zzic) zzljVar.a).o();
        long j = zzomVar.a;
        zzaf zzafVar = new zzaf(j, zzlrVar.a, zzomVar.f);
        zznlVarO.t();
        zznlVarO.u();
        zzr zzrVarJ = zznlVarO.J(true);
        Preconditions.checkNotNull(zzrVarJ);
        zznlVarO.H(new kw0(zznlVarO, zzrVarJ, zzafVar, false, 29));
        zzgu zzguVar6 = ((zzic) zzljVar.a).f;
        zzic.l(zzguVar6);
        zzguVar6.n.c(Long.valueOf(j), zzlrVar, "[sgtm] Updated status for row_id");
        synchronized (atomicReference) {
            atomicReference.set(zzlrVar);
            atomicReference.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        zzkt zzktVar = (zzkt) ((zzku) obj).getService();
        v05 v05Var = new v05((zzkk) this.b, (ListenerHolder) this.d);
        String str = (String) this.c;
        Parcel parcelZ1 = zzktVar.z1();
        parcelZ1.writeString(str);
        zzbn.c(parcelZ1, v05Var);
        zzktVar.A1(28, parcelZ1);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x006b A[Catch: all -> 0x0023, PHI: r12
  0x006b: PHI (r12v3 int) = (r12v1 int), (r12v0 int) binds: [B:14:0x0030, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.qp4
    public void d(String str, int i, Throwable th, byte[] bArr, Map map) {
        zzgz zzgzVar;
        ow3 ow3Var;
        String strSubstring;
        Object obj;
        int i2 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i2) {
            case 7:
                ((zzpg) obj3).z(true, i, th, bArr, (String) obj2, (ArrayList) obj4, map);
                return;
            default:
                long j = ((zzpj) obj4).a;
                zzpg zzpgVar = (zzpg) obj3;
                String str2 = (String) obj2;
                zzpgVar.e().t();
                zzpgVar.l0();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } finally {
                        zzpgVar.u = false;
                        zzpgVar.O();
                    }
                }
                if (i == 200) {
                    if (th == null) {
                        ow3 ow3Var2 = zzpgVar.c;
                        zzpg.T(ow3Var2);
                        ow3Var2.A(Long.valueOf(j));
                        zzpgVar.c().n.c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                        zzgzVar = zzpgVar.b;
                        zzpg.T(zzgzVar);
                        if (zzgzVar.x()) {
                            ow3Var = zzpgVar.c;
                            zzpg.T(ow3Var);
                            if (ow3Var.z(str2)) {
                                zzpgVar.t(str2);
                            } else {
                                zzpgVar.N();
                            }
                        } else {
                            zzpgVar.N();
                        }
                    } else {
                        String str3 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str3.substring(0, Math.min(32, str3.length()));
                        zzgs zzgsVar = zzpgVar.c().k;
                        Integer numValueOf = Integer.valueOf(i);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        zzgsVar.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                        ow3 ow3Var3 = zzpgVar.c;
                        zzpg.T(ow3Var3);
                        ow3Var3.F(Long.valueOf(j));
                        zzpgVar.N();
                    }
                } else if (i == 204) {
                    i = 204;
                    if (th == null) {
                        ow3 ow3Var4 = zzpgVar.c;
                        zzpg.T(ow3Var4);
                        ow3Var4.A(Long.valueOf(j));
                        zzpgVar.c().n.c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                        zzgzVar = zzpgVar.b;
                        zzpg.T(zzgzVar);
                        if (zzgzVar.x()) {
                            ow3Var = zzpgVar.c;
                            zzpg.T(ow3Var);
                            if (ow3Var.z(str2)) {
                                zzpgVar.t(str2);
                            } else {
                                zzpgVar.N();
                            }
                        } else {
                            zzpgVar.N();
                        }
                    } else {
                        String str4 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str4.substring(0, Math.min(32, str4.length()));
                        zzgs zzgsVar2 = zzpgVar.c().k;
                        Integer numValueOf2 = Integer.valueOf(i);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        zzgsVar2.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                        ow3 ow3Var5 = zzpgVar.c;
                        zzpg.T(ow3Var5);
                        ow3Var5.F(Long.valueOf(j));
                        zzpgVar.N();
                    }
                } else {
                    String str5 = new String(bArr, StandardCharsets.UTF_8);
                    strSubstring = str5.substring(0, Math.min(32, str5.length()));
                    zzgs zzgsVar3 = zzpgVar.c().k;
                    Integer numValueOf3 = Integer.valueOf(i);
                    obj = th;
                    if (th == null) {
                        obj = strSubstring;
                    }
                    zzgsVar3.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
                    ow3 ow3Var6 = zzpgVar.c;
                    zzpg.T(ow3Var6);
                    ow3Var6.F(Long.valueOf(j));
                    zzpgVar.N();
                }
                return;
        }
    }

    public byte[] f() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = (long[]) this.d;
        zzhof.f(jArr4, jArr14);
        zzhof.f(jArr13, jArr4);
        zzhof.f(jArr12, jArr13);
        zzhof.e(jArr5, jArr12, jArr14);
        zzhof.e(jArr6, jArr5, jArr4);
        zzhof.f(jArr12, jArr6);
        zzhof.e(jArr7, jArr12, jArr5);
        zzhof.f(jArr12, jArr7);
        zzhof.f(jArr13, jArr12);
        zzhof.f(jArr12, jArr13);
        zzhof.f(jArr13, jArr12);
        zzhof.f(jArr12, jArr13);
        zzhof.e(jArr8, jArr12, jArr7);
        zzhof.f(jArr12, jArr8);
        zzhof.f(jArr13, jArr12);
        for (int i = 2; i < 10; i += 2) {
            zzhof.f(jArr12, jArr13);
            zzhof.f(jArr13, jArr12);
        }
        zzhof.e(jArr9, jArr13, jArr8);
        zzhof.f(jArr12, jArr9);
        zzhof.f(jArr13, jArr12);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            zzhof.f(jArr12, jArr13);
            zzhof.f(jArr13, jArr12);
        }
        zzhof.e(jArr12, jArr13, jArr9);
        zzhof.f(jArr13, jArr12);
        zzhof.f(jArr12, jArr13);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            zzhof.f(jArr13, jArr12);
            zzhof.f(jArr12, jArr13);
        }
        zzhof.e(jArr10, jArr12, jArr8);
        zzhof.f(jArr12, jArr10);
        zzhof.f(jArr13, jArr12);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            zzhof.f(jArr12, jArr13);
            zzhof.f(jArr13, jArr12);
        }
        zzhof.e(jArr11, jArr13, jArr10);
        zzhof.f(jArr13, jArr11);
        zzhof.f(jArr12, jArr13);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            zzhof.f(jArr13, jArr12);
            zzhof.f(jArr12, jArr13);
        }
        zzhof.e(jArr13, jArr12, jArr11);
        zzhof.f(jArr12, jArr13);
        zzhof.f(jArr13, jArr12);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            zzhof.f(jArr12, jArr13);
            zzhof.f(jArr13, jArr12);
        }
        zzhof.e(jArr12, jArr13, jArr10);
        zzhof.f(jArr13, jArr12);
        zzhof.f(jArr12, jArr13);
        zzhof.f(jArr13, jArr12);
        zzhof.f(jArr12, jArr13);
        zzhof.f(jArr13, jArr12);
        zzhof.e(jArr, jArr13, jArr6);
        zzhof.e(jArr2, (long[]) this.b, jArr);
        zzhof.e(jArr3, (long[]) this.c, jArr);
        byte[] bArrH = zzhof.h(jArr3);
        bArrH[31] = (byte) (bArrH[31] ^ ((zzhof.h(jArr2)[0] & 1) << 7));
        return bArrH;
    }

    public void g(zzabt zzabtVar) {
        zzqn zzqnVar = (zzqn) ((HashMap) this.b).remove(zzabtVar);
        zzqnVar.getClass();
        k05 k05Var = (k05) ((zzjn) this.d).n.get(zzqnVar);
        if (k05Var != null) {
            synchronized (k05Var) {
                k05Var.d--;
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        PhoneAuthOptions phoneAuthOptions = (PhoneAuthOptions) this.b;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            jc1.x("Error while validating application identity: ", exception != null ? exception.getMessage() : "", "FirebaseAuth");
            if (exception != null && ((exception instanceof mn0) || ((exception instanceof FirebaseAuthException) && ((FirebaseAuthException) exception).getErrorCode().endsWith("UNAUTHORIZED_DOMAIN")))) {
                FirebaseAuth.zza((FirebaseException) exception, phoneAuthOptions, (String) this.c);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
        }
        ((FirebaseAuth) this.d).zza(phoneAuthOptions, (zzh) task.getResult());
    }

    public /* synthetic */ xv4(Object obj, Serializable serializable, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, long[]] */
    public xv4() {
        this(new long[10], (Serializable) new long[10], new long[10], 0);
        this.a = 0;
    }

    public xv4(zzjn zzjnVar, zzqn zzqnVar) {
        this.a = 3;
        this.d = zzjnVar;
        this.b = new HashMap();
        this.c = zzqnVar;
    }

    public /* synthetic */ xv4(zzth zzthVar) {
        this.a = 9;
        this.d = zzthVar;
        Handler handlerP = zzfq.p();
        this.b = handlerP;
        x xVar = new x(this, 1);
        this.c = xVar;
        zzthVar.a.registerStreamEventCallback(new bf3(handlerP, 3), xVar);
    }

    public xv4(FirebaseAuth firebaseAuth, PhoneAuthOptions phoneAuthOptions, String str) {
        this.a = 1;
        this.b = phoneAuthOptions;
        this.c = str;
        Objects.requireNonNull(firebaseAuth);
        this.d = firebaseAuth;
    }

    public /* synthetic */ xv4(zzpg zzpgVar, String str, Object obj, int i) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = zzpgVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xv4(wv4 wv4Var) {
        this();
        this.a = 0;
        e(wv4Var, this);
    }

    public xv4(xv4 xv4Var) {
        this.a = 0;
        this.b = Arrays.copyOf((long[]) xv4Var.b, 10);
        this.c = Arrays.copyOf((long[]) xv4Var.c, 10);
        this.d = Arrays.copyOf((long[]) xv4Var.d, 10);
    }
}
