package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;
import defpackage.vl1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface MetadataDecoderFactory {
    public static final MetadataDecoderFactory DEFAULT = new vl1();

    MetadataDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
