package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends s {
    public static final a e = new a("net::ERR_CERT_AUTHORITY_INVALID", false, true);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.s
    public final String a() {
        return "net::ERR_CERT_AUTHORITY_INVALID";
    }

    public final String toString() {
        return "ERR_CERT_AUTHORITY_INVALID";
    }

    public final int hashCode() {
        return -932810174;
    }
}
