package defpackage;

import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bp3 implements hp3 {
    public final /* synthetic */ String a;

    @Override // defpackage.hp3
    public final void a(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        onVerificationStateChangedCallbacks.onCodeAutoRetrievalTimeOut(this.a);
    }

    public bp3(yo3 yo3Var, String str) {
        this.a = str;
    }
}
