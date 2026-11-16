package androidx.media3.exoplayer;

import android.media.AudioManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ AudioFocusManager a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.a.handlePlatformAudioFocusChange(i);
    }

    public /* synthetic */ c(AudioFocusManager audioFocusManager) {
        this.a = audioFocusManager;
    }
}
