package defpackage;

import com.tiktok.appevents.TTAppEventLogger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class yn2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TTAppEventLogger b;

    public /* synthetic */ yn2(TTAppEventLogger tTAppEventLogger, int i) {
        this.a = i;
        this.b = tTAppEventLogger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        TTAppEventLogger tTAppEventLogger = this.b;
        switch (i) {
            case 0:
                tTAppEventLogger.clearAllImmediately();
                break;
            case 1:
                tTAppEventLogger.lambda$new$0();
                break;
            default:
                tTAppEventLogger.lambda$fetchGlobalConfig$7();
                break;
        }
    }
}
