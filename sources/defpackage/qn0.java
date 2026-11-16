package defpackage;

import com.google.firebase.installations.FirebaseInstallations;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class qn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseInstallations b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qn0(FirebaseInstallations firebaseInstallations, boolean z, int i) {
        this.a = i;
        this.b = firebaseInstallations;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        boolean z = this.c;
        FirebaseInstallations firebaseInstallations = this.b;
        switch (i) {
            case 0:
                firebaseInstallations.lambda$doRegistrationOrRefresh$3(z);
                break;
            default:
                firebaseInstallations.lambda$getToken$2(z);
                break;
        }
    }
}
