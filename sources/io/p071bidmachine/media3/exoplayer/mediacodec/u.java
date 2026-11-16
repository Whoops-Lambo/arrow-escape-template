package io.p071bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface u {
    boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

    int getCodecCount();

    MediaCodecInfo getCodecInfoAt(int i);

    boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

    boolean secureDecodersExplicit();
}
