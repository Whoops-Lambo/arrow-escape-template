package androidx.media3.exoplayer;

import defpackage.gs0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements gs0 {
    public final /* synthetic */ int a;

    public /* synthetic */ e0(int i) {
        this.a = i;
    }

    @Override // defpackage.gs0
    public final Object apply(Object obj) {
        StreamVolumeManager.StreamVolumeState streamVolumeState = (StreamVolumeManager.StreamVolumeState) obj;
        switch (this.a) {
            case 0:
                return StreamVolumeManager.lambda$release$11(streamVolumeState);
            case 1:
                return StreamVolumeManager.lambda$increaseVolume$5(streamVolumeState);
            default:
                return StreamVolumeManager.lambda$decreaseVolume$7(streamVolumeState);
        }
    }
}
