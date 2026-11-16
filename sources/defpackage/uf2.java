package defpackage;

import androidx.media3.common.SimpleBasePlayer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class uf2 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SimpleBasePlayer.State b;
    public final /* synthetic */ int c;

    public /* synthetic */ uf2(SimpleBasePlayer.State state, int i, int i2) {
        this.a = i2;
        this.b = state;
        this.c = i;
    }

    @Override // defpackage.ol2
    public final Object get() {
        switch (this.a) {
            case 0:
                return SimpleBasePlayer.lambda$setDeviceVolume$22(this.b, this.c);
            case 1:
                return SimpleBasePlayer.lambda$setDeviceVolume$23(this.b, this.c);
            default:
                return SimpleBasePlayer.lambda$setRepeatMode$8(this.b, this.c);
        }
    }
}
