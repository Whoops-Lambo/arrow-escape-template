package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzamd extends IOException {
    private boolean a;

    public final void r() {
        this.a = true;
    }

    public static zzamg d() {
        return new zzamg("Protocol message tag had invalid wire type.");
    }

    public static zzamd f() {
        return new zzamd("Protocol message end-group tag did not match expected tag.");
    }

    public static zzamd g() {
        return new zzamd("Protocol message contained an invalid tag (zero).");
    }

    public static zzamd h() {
        return new zzamd("Protocol message had invalid UTF-8.");
    }

    public static zzamd i() {
        return new zzamd("CodedInputStream encountered a malformed varint.");
    }

    public static zzamd j() {
        return new zzamd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzamd k() {
        return new zzamd("Failed to parse the message.");
    }

    public static zzamd n() {
        return new zzamd("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static zzamd o() {
        return new zzamd("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public static zzamd q() {
        return new zzamd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final boolean t() {
        return this.a;
    }

    public zzamd(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public zzamd(String str) {
        super(str);
    }
}
