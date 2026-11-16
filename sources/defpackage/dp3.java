package defpackage;

import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dp3 implements hp3 {
    public final /* synthetic */ PhoneAuthCredential a;

    @Override // defpackage.hp3
    public final void a(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        onVerificationStateChangedCallbacks.onVerificationCompleted(this.a);
    }

    public dp3(yo3 yo3Var, PhoneAuthCredential phoneAuthCredential) {
        this.a = phoneAuthCredential;
    }
}
