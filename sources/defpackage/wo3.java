package defpackage;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaax;
import com.google.android.gms.internal.p002firebaseauthapi.zzafu;
import com.google.android.gms.internal.p002firebaseauthapi.zzafz;
import com.google.android.gms.internal.p002firebaseauthapi.zzagg;
import com.google.android.gms.internal.p002firebaseauthapi.zzaha;
import com.google.android.gms.internal.p002firebaseauthapi.zzaht;
import com.google.android.gms.internal.p002firebaseauthapi.zzahw;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import com.google.android.gms.internal.p002firebaseauthapi.zzaib;
import com.google.android.gms.internal.p002firebaseauthapi.zzaik;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiw;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class wo3 implements zzafz {
    public final int a;
    public FirebaseApp c;
    public FirebaseUser d;
    public Object e;
    public pw3 f;
    public zzafu g;
    public Executor i;
    public zzaia j;
    public zzaht k;
    public zzaha l;
    public zzaik m;
    public AuthCredential n;
    public String o;
    public zzaax p;
    public zzaib q;
    public zzahw r;
    public zzaiw s;
    public boolean t;
    public final yo3 b = new yo3(this);
    public final ArrayList h = new ArrayList();

    public final void c(Status status) {
        this.t = true;
        this.g.a(null, status);
    }

    public abstract void i();

    public final void j(Object obj) {
        this.t = true;
        this.g.a(obj, null);
    }

    public final void d(FirebaseApp firebaseApp) {
        this.c = (FirebaseApp) Preconditions.checkNotNull(firebaseApp, "firebaseApp cannot be null");
    }

    public final void e(FirebaseUser firebaseUser) {
        this.d = (FirebaseUser) Preconditions.checkNotNull(firebaseUser, "firebaseUser cannot be null");
    }

    public final void f(Object obj) {
        this.e = Preconditions.checkNotNull(obj, "external callback cannot be null");
    }

    public final void h(pw3 pw3Var) {
        this.f = (pw3) Preconditions.checkNotNull(pw3Var, "external failure callback cannot be null");
    }

    public wo3(int i) {
        this.a = i;
    }

    public static /* synthetic */ void g(wo3 wo3Var) {
        wo3Var.i();
        Preconditions.checkState(wo3Var.t, "no success or failure set on method implementation");
    }

    public final void b(Activity activity, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, String str, Executor executor) {
        zzagg.a(str, this);
        op3 op3Var = new op3(str, onVerificationStateChangedCallbacks);
        synchronized (this.h) {
            this.h.add((PhoneAuthProvider.OnVerificationStateChangedCallbacks) Preconditions.checkNotNull(op3Var));
        }
        if (activity != null) {
            ArrayList arrayList = this.h;
            LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
            if (((uo3) fragment.getCallbackOrNull("PhoneAuthActivityStopCallback", uo3.class)) == null) {
                new uo3(fragment, arrayList);
            }
        }
        this.i = (Executor) Preconditions.checkNotNull(executor);
    }
}
