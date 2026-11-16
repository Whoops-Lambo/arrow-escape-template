package defpackage;

import android.media.AudioDeviceInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioSink;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class z50 {
    @DoNotInline
    public static void a(AudioSink audioSink, @Nullable Object obj) {
        audioSink.setPreferredDevice((AudioDeviceInfo) obj);
    }
}
