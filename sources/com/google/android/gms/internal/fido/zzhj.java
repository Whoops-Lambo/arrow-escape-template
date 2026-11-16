package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhj extends IOException {
    public zzhj(String str, Throwable th) {
        super("Error in decoding CborValue from bytes", th);
    }

    public zzhj(String str) {
        super(str);
    }
}
