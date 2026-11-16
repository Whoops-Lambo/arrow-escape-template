package defpackage;

import androidx.media3.common.SimpleBasePlayer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sf2 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ sf2(int i, Object obj, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = z;
    }

    @Override // defpackage.ol2
    public final Object get() {
        switch (this.a) {
            case 0:
                return SimpleBasePlayer.lambda$setPlayWhenReady$1((SimpleBasePlayer.State) this.b, this.c);
            case 1:
                return SimpleBasePlayer.lambda$setShuffleModeEnabled$9((SimpleBasePlayer.State) this.b, this.c);
            case 2:
                return SimpleBasePlayer.lambda$setDeviceMuted$28((SimpleBasePlayer.State) this.b, this.c);
            case 3:
                return SimpleBasePlayer.lambda$setDeviceMuted$29((SimpleBasePlayer.State) this.b, this.c);
            default:
                return com.google.android.exoplayer2.SimpleBasePlayer.lambda$setPlayWhenReady$1((com.google.android.exoplayer2.SimpleBasePlayer.State) this.b, this.c);
        }
    }
}
