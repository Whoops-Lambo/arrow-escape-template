package androidx.media3.exoplayer;

import defpackage.gs0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements gs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ m(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.gs0
    public final Object apply(Object obj) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return ExoPlayerImpl.lambda$setAudioSessionId$10(i2, (Integer) obj);
            case 1:
                return ExoPlayerImpl.ComponentListener.lambda$onAudioSessionIdChanged$2(i2, (Integer) obj);
            case 2:
                return ExoPlayerImpl.ComponentListener.lambda$onAudioSessionIdChanged$3(i2, (Integer) obj);
            case 3:
                return StreamVolumeManager.lambda$setVolume$3(i2, (StreamVolumeManager.StreamVolumeState) obj);
            default:
                return StreamVolumeManager.lambda$setStreamType$1(i2, (StreamVolumeManager.StreamVolumeState) obj);
        }
    }
}
