package defpackage;

import androidx.media3.common.SimpleBasePlayer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class xf2 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SimpleBasePlayer.State b;

    public /* synthetic */ xf2(SimpleBasePlayer.State state, int i) {
        this.a = i;
        this.b = state;
    }

    @Override // defpackage.ol2
    public final Object get() {
        int i = this.a;
        SimpleBasePlayer.State state = this.b;
        switch (i) {
            case 0:
                return SimpleBasePlayer.lambda$setVideoSurface$17(state);
            case 1:
                return SimpleBasePlayer.lambda$increaseDeviceVolume$25(state);
            case 2:
                return SimpleBasePlayer.lambda$decreaseDeviceVolume$26(state);
            case 3:
                return SimpleBasePlayer.lambda$release$13(state);
            case 4:
                return SimpleBasePlayer.lambda$clearVideoOutput$21(state);
            case 5:
                return SimpleBasePlayer.lambda$increaseDeviceVolume$24(state);
            case 6:
                return SimpleBasePlayer.lambda$prepare$7(state);
            default:
                return SimpleBasePlayer.lambda$decreaseDeviceVolume$27(state);
        }
    }
}
