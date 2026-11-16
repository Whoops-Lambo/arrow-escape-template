package defpackage;

import com.usercentrics.sdk.ui.secondLayer.component.header.UCSecondLayerHeader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class tw2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UCSecondLayerHeader b;

    public /* synthetic */ tw2(UCSecondLayerHeader uCSecondLayerHeader, int i) {
        this.a = i;
        this.b = uCSecondLayerHeader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        UCSecondLayerHeader uCSecondLayerHeader = this.b;
        switch (i) {
            case 0:
                UCSecondLayerHeader.setupBackButton$lambda$8(uCSecondLayerHeader);
                break;
            default:
                UCSecondLayerHeader.setupLanguage$lambda$6(uCSecondLayerHeader);
                break;
        }
    }
}
