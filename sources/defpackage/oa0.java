package defpackage;

import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class oa0 {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public na0 d;

    public final boolean a(Format format, AudioAttributes audioAttributes) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(Util.getAudioTrackChannelConfig(("audio/eac3-joc".equals(format.sampleMimeType) && format.channelCount == 16) ? 12 : format.channelCount));
        int i = format.sampleRate;
        if (i != -1) {
            channelMask.setSampleRate(i);
        }
        return this.a.canBeSpatialized(audioAttributes.getAudioAttributesV21().audioAttributes, channelMask.build());
    }

    public oa0(Spatializer spatializer) {
        boolean z;
        this.a = spatializer;
        if (spatializer.getImmersiveAudioLevel() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
    }
}
