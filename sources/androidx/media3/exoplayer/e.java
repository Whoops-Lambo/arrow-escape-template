package androidx.media3.exoplayer;

import androidx.media3.common.util.BackgroundThreadStateHandler;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements BackgroundThreadStateHandler.StateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuitableOutputChecker.Callback b;

    public /* synthetic */ e(SuitableOutputChecker.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public final void onStateChanged(Object obj, Object obj2) {
        int i = this.a;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        SuitableOutputChecker.Callback callback = this.b;
        switch (i) {
            case 0:
                DefaultSuitableOutputChecker.ImplApi23.lambda$enable$0(callback, bool, bool2);
                break;
            default:
                DefaultSuitableOutputChecker.ImplApi35.lambda$enable$0(callback, bool, bool2);
                break;
        }
    }
}
