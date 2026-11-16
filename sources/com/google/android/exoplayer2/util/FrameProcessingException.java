package com.google.android.exoplayer2.util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class FrameProcessingException extends Exception {
    public final long presentationTimeUs;

    public static FrameProcessingException from(Exception exc, long j) {
        return exc instanceof FrameProcessingException ? (FrameProcessingException) exc : new FrameProcessingException(exc, j);
    }

    public FrameProcessingException(String str) {
        this(str, -9223372036854775807L);
    }

    public FrameProcessingException(String str, long j) {
        super(str);
        this.presentationTimeUs = j;
    }

    public FrameProcessingException(String str, Throwable th) {
        this(str, th, -9223372036854775807L);
    }

    public FrameProcessingException(String str, Throwable th, long j) {
        super(str, th);
        this.presentationTimeUs = j;
    }

    public static FrameProcessingException from(Exception exc) {
        return from(exc, -9223372036854775807L);
    }

    public FrameProcessingException(Throwable th) {
        this(th, -9223372036854775807L);
    }

    public FrameProcessingException(Throwable th, long j) {
        super(th);
        this.presentationTimeUs = j;
    }
}
