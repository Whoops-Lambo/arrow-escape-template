package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zziz;
import com.google.android.gms.internal.ads.zzqu;
import com.google.android.gms.internal.ads.zzsc;
import com.google.android.gms.internal.ads.zzsj;
import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zzuh;
import com.google.android.gms.internal.ads.zzvt;
import com.google.android.gms.internal.ads.zzym;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiw;
import com.google.android.gms.internal.p002firebaseauthapi.zzajc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.auth.FirebaseAuth;
import com.singular.sdk.internal.UserDetailsUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r85 implements zzto, zzqu, zzsj, v8, Continuation, zzvt, pa5, zzym {
    public final Object a;

    @Override // defpackage.pa5
    public void zza() {
    }

    @Override // defpackage.pa5
    public void zze() {
    }

    @Override // defpackage.pa5
    public void zzf() {
    }

    @Override // defpackage.pa5
    public void zzg() {
    }

    public /* synthetic */ r85(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.pa5
    public void a(int i, zziz zzizVar, long j, int i2) {
        ((MediaCodec) this.a).queueSecureInputBuffer(i, 0, zzizVar.i, j, i2);
    }

    @Override // defpackage.pa5
    public void b(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    @Override // defpackage.pa5
    public void c(int i, int i2, int i3, long j) {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.v8
    public /* synthetic */ ListenableFuture call() {
        return (c1) this.a;
    }

    public void d(Exception exc) {
        zzeh.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzsc zzscVar = ((zzuh) this.a).F0;
        Handler handler = zzscVar.a;
        if (handler != null) {
            handler.post(new i75(zzscVar, exc, 5));
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) Preconditions.checkNotNull(task.getException()));
        }
        zzaiw zzaiwVar = (zzaiw) task.getResult();
        if (zzaiwVar instanceof zzajc) {
            zzajc zzajcVar = (zzajc) zzaiwVar;
            String strCheckNotEmpty = Preconditions.checkNotEmpty(zzajcVar.b);
            String strCheckNotEmpty2 = Preconditions.checkNotEmpty(zzajcVar.c);
            String strCheckNotEmpty3 = Preconditions.checkNotEmpty(zzajcVar.a);
            FirebaseAuth firebaseAuth = (FirebaseAuth) this.a;
            nl0 nl0Var = new nl0(22);
            Preconditions.checkNotEmpty(strCheckNotEmpty3, "sessionInfo cannot be empty.");
            Preconditions.checkNotNull(firebaseAuth, "firebaseAuth cannot be null.");
            Preconditions.checkNotEmpty(strCheckNotEmpty, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
            Preconditions.checkNotEmpty(strCheckNotEmpty2, "hashAlgorithm cannot be empty.");
            return Tasks.forResult(nl0Var);
        }
        d.r(pv1.n("Response should be an instance of StartTotpMfaEnrollmentResponse but was ", zzaiwVar.getClass().getName(), UserDetailsUtils.UserDetailsLiterals.DOT));
        return null;
    }
}
