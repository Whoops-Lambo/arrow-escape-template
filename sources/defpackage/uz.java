package defpackage;

import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CrashlyticsCore b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ uz(CrashlyticsCore crashlyticsCore, String str, String str2, int i) {
        this.a = i;
        this.b = crashlyticsCore;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        CrashlyticsCore crashlyticsCore = this.b;
        switch (i) {
            case 0:
                crashlyticsCore.lambda$setCustomKey$5(str2, str);
                break;
            default:
                crashlyticsCore.lambda$setInternalKey$7(str2, str);
                break;
        }
    }
}
