package defpackage;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import com.unity3d.player.AudioVolumeHandler;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class rd3 extends ContentObserver {
    public final AudioVolumeHandler a;
    public final AudioManager b;
    public final int c;
    public int d;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        AudioVolumeHandler audioVolumeHandler;
        int streamVolume;
        AudioManager audioManager = this.b;
        if (audioManager == null || (audioVolumeHandler = this.a) == null || (streamVolume = audioManager.getStreamVolume(this.c)) == this.d) {
            return;
        }
        this.d = streamVolume;
        audioVolumeHandler.onAudioVolumeChanged(streamVolume);
    }

    public rd3(Handler handler, AudioManager audioManager, AudioVolumeHandler audioVolumeHandler) {
        super(handler);
        this.b = audioManager;
        this.c = 3;
        this.a = audioVolumeHandler;
        this.d = audioManager.getStreamVolume(3);
    }
}
