package defpackage;

import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CrashlyticsCore b;
    public final /* synthetic */ SettingsProvider c;

    public /* synthetic */ sz(CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider, int i) {
        this.a = i;
        this.b = crashlyticsCore;
        this.c = settingsProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SettingsProvider settingsProvider = this.c;
        CrashlyticsCore crashlyticsCore = this.b;
        switch (i) {
            case 0:
                crashlyticsCore.lambda$doBackgroundInitializationAsync$0(settingsProvider);
                break;
            default:
                crashlyticsCore.lambda$finishInitSynchronously$9(settingsProvider);
                break;
        }
    }
}
