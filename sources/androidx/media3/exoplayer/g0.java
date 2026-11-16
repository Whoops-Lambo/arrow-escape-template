package androidx.media3.exoplayer;

import defpackage.gs0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g0 implements gs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ g0(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
        this.c = i;
    }

    @Override // defpackage.gs0
    public final Object apply(Object obj) {
        int i = this.a;
        int i2 = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((StreamVolumeManager) obj2).lambda$increaseVolume$6(i2, (StreamVolumeManager.StreamVolumeState) obj);
            case 1:
                return ((StreamVolumeManager) obj2).lambda$decreaseVolume$8(i2, (StreamVolumeManager.StreamVolumeState) obj);
            case 2:
                return ((StreamVolumeManager) obj2).lambda$setStreamType$2(i2, (StreamVolumeManager.StreamVolumeState) obj);
            default:
                return ((ExoPlayerImpl) obj2).lambda$setAudioSessionId$11(i2, (Integer) obj);
        }
    }
}
