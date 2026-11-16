package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo
public class BiometricViewModel extends ViewModel {
    public BiometricPrompt.AuthenticationCallback d;
    public CancellationSignalProvider e;
    public boolean g;
    public boolean h;
    public boolean i;
    public MutableLiveData j;
    public MutableLiveData k;
    public MutableLiveData l;
    public MutableLiveData m;
    public MutableLiveData n;
    public MutableLiveData p;
    public MutableLiveData r;
    public MutableLiveData s;
    public int f = 0;
    public boolean o = true;
    public int q = 0;

    /* JADX INFO: renamed from: androidx.biometric.BiometricViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    class AnonymousClass1 extends BiometricPrompt.AuthenticationCallback {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class CallbackListener extends AuthenticationCallbackProvider.Listener {
        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        public final void a(int i, CharSequence charSequence) {
            throw null;
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        public final void b() {
            throw null;
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        public final void c(BiometricPrompt.AuthenticationResult authenticationResult) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class DefaultExecutor implements Executor {
        public final Handler a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class NegativeButtonListener implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            throw null;
        }
    }

    public final void c(BiometricErrorData biometricErrorData) {
        if (this.k == null) {
            this.k = new MutableLiveData();
        }
        g(this.k, biometricErrorData);
    }

    public final void d(CharSequence charSequence) {
        if (this.s == null) {
            this.s = new MutableLiveData();
        }
        g(this.s, charSequence);
    }

    public final void e(int i) {
        if (this.r == null) {
            this.r = new MutableLiveData();
        }
        g(this.r, Integer.valueOf(i));
    }

    public final void f(boolean z) {
        if (this.n == null) {
            this.n = new MutableLiveData();
        }
        g(this.n, Boolean.valueOf(z));
    }

    public static void g(MutableLiveData mutableLiveData, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            mutableLiveData.i(obj);
        } else {
            mutableLiveData.j(obj);
        }
    }
}
