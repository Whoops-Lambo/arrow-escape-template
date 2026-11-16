package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class DecoderException extends Exception {
    public DecoderException(String str) {
        super(str);
    }

    public DecoderException(@Nullable Throwable th) {
        super(th);
    }

    public DecoderException(String str, @Nullable Throwable th) {
        super(str, th);
    }
}
