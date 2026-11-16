package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaax;
import com.google.android.gms.internal.p002firebaseauthapi.zzaay;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.internal.p002firebaseauthapi.zzaha;
import com.google.android.gms.internal.p002firebaseauthapi.zzaht;
import com.google.android.gms.internal.p002firebaseauthapi.zzahw;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import com.google.android.gms.internal.p002firebaseauthapi.zzaib;
import com.google.android.gms.internal.p002firebaseauthapi.zzaik;
import com.google.android.gms.internal.p002firebaseauthapi.zzaip;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiw;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.zzc;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yo3 implements zzaer {
    public final /* synthetic */ wo3 a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void b(Status status, PhoneAuthCredential phoneAuthCredential) {
        wo3 wo3Var = this.a;
        int i = wo3Var.a;
        Preconditions.checkState(i == 2, "Unexpected response type " + i);
        pw3 pw3Var = wo3Var.f;
        if (pw3Var != null) {
            pw3Var.a(status);
        }
        wo3Var.n = phoneAuthCredential;
        wo3Var.o = null;
        pw3 pw3Var2 = wo3Var.f;
        if (pw3Var2 != null) {
            pw3Var2.a(status);
        }
        wo3Var.c(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void c(zzaik zzaikVar) {
        wo3 wo3Var = this.a;
        int i = wo3Var.a;
        Preconditions.checkState(i == 4, "Unexpected response type " + i);
        wo3Var.m = zzaikVar;
        wo3.g(wo3Var);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void d(String str) {
        wo3 wo3Var = this.a;
        int i = wo3Var.a;
        Preconditions.checkState(i == 7, "Unexpected response type " + i);
        wo3.g(wo3Var);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void e(zzaay zzaayVar) {
        Status status = zzaayVar.a;
        zzc zzcVar = zzaayVar.b;
        String str = zzaayVar.c;
        wo3 wo3Var = this.a;
        pw3 pw3Var = wo3Var.f;
        if (pw3Var != null) {
            pw3Var.a(status);
        }
        wo3Var.n = zzcVar;
        wo3Var.o = str;
        pw3 pw3Var2 = wo3Var.f;
        if (pw3Var2 != null) {
            pw3Var2.a(status);
        }
        wo3Var.c(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void f(zzaip zzaipVar) {
        wo3.g(this.a);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void g(zzaax zzaaxVar) {
        wo3 wo3Var = this.a;
        wo3Var.p = zzaaxVar;
        wo3Var.c(rd1.t("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void h(zzaia zzaiaVar, zzaht zzahtVar) {
        wo3 wo3Var = this.a;
        int i = wo3Var.a;
        Preconditions.checkState(i == 2, "Unexpected response type: " + i);
        wo3Var.j = zzaiaVar;
        wo3Var.k = zzahtVar;
        wo3.g(wo3Var);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void i(PhoneAuthCredential phoneAuthCredential) {
        wo3 wo3Var = this.a;
        int i = wo3Var.a;
        Preconditions.checkState(i == 8, "Unexpected response type " + i);
        wo3Var.t = true;
        o(new dp3(this, phoneAuthCredential));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void j(zzaiw zzaiwVar) {
        wo3 wo3Var = this.a;
        wo3Var.s = zzaiwVar;
        wo3.g(wo3Var);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void k(zzahw zzahwVar) {
        wo3 wo3Var = this.a;
        wo3Var.r = zzahwVar;
        wo3.g(wo3Var);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void l(zzaib zzaibVar) {
        wo3 wo3Var = this.a;
        wo3Var.q = zzaibVar;
        wo3.g(wo3Var);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void m(zzaia zzaiaVar) {
        wo3 wo3Var = this.a;
        int i = wo3Var.a;
        Preconditions.checkState(i == 1, "Unexpected response type: " + i);
        wo3Var.j = zzaiaVar;
        wo3.g(wo3Var);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void n(zzaha zzahaVar) {
        wo3 wo3Var = this.a;
        int i = wo3Var.a;
        Preconditions.checkState(i == 3, "Unexpected response type " + i);
        wo3Var.l = zzahaVar;
        wo3.g(wo3Var);
    }

    public final void o(hp3 hp3Var) {
        this.a.i.execute(new fp3(this, hp3Var));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(String str) {
        wo3 wo3Var = this.a;
        int i = wo3Var.a;
        Preconditions.checkState(i == 8, "Unexpected response type " + i);
        wo3Var.t = true;
        o(new bp3(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zzb(String str) {
        int i = this.a.a;
        Preconditions.checkState(i == 8, "Unexpected response type " + i);
        o(new xo3(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zzc() {
        wo3 wo3Var = this.a;
        int i = wo3Var.a;
        Preconditions.checkState(i == 9, "Unexpected response type " + i);
        wo3.g(wo3Var);
    }

    public yo3(wo3 wo3Var) {
        this.a = wo3Var;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void a(Status status) {
        String statusMessage = status.getStatusMessage();
        if (statusMessage != null) {
            if (statusMessage.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (statusMessage.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (statusMessage.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (statusMessage.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (statusMessage.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (statusMessage.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (statusMessage.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (statusMessage.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (statusMessage.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (statusMessage.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        wo3 wo3Var = this.a;
        if (wo3Var.a == 8) {
            wo3Var.t = true;
            o(new gp3(this, status));
        } else {
            pw3 pw3Var = wo3Var.f;
            if (pw3Var != null) {
                pw3Var.a(status);
            }
            wo3Var.c(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zzb() {
        wo3 wo3Var = this.a;
        int i = wo3Var.a;
        Preconditions.checkState(i == 6, "Unexpected response type " + i);
        wo3.g(wo3Var);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza() {
        wo3 wo3Var = this.a;
        int i = wo3Var.a;
        Preconditions.checkState(i == 5, "Unexpected response type " + i);
        wo3.g(wo3Var);
    }
}
