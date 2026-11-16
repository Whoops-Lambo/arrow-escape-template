package com.google.android.gms.internal.auth;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfb extends IOException {
    private zzfx a;

    public static zzfb d() {
        return new zzfb("Protocol message contained an invalid tag (zero).");
    }

    public static zzfb f() {
        return new zzfb("Protocol message had invalid UTF-8.");
    }

    public static zzfb g() {
        return new zzfb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzfb h() {
        return new zzfb("Failed to parse the message.");
    }

    public static zzfb j() {
        return new zzfb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzfb i(zzfx zzfxVar) {
        this.a = zzfxVar;
        return this;
    }

    public zzfb(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.a = null;
    }

    public zzfb(String str) {
        super(str);
        this.a = null;
    }
}
