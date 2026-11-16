package defpackage;

import com.google.firebase.auth.FirebaseAuthException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class mn0 extends FirebaseAuthException {
    public mn0() {
        super("ERROR_MISSING_ACTIVITY", "App verification failed - a valid Activity is required to complete the Recaptcha flow");
    }
}
