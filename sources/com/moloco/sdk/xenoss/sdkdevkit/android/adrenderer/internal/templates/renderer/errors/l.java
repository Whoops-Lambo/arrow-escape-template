package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class l extends s {
    public static final l e = new l("net::ERR_PROXY_CONNECTION_FAILED", false, true);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.s
    public final String a() {
        return "net::ERR_PROXY_CONNECTION_FAILED";
    }

    public final String toString() {
        return "ERR_PROXY_CONNECTION_FAILED";
    }

    public final int hashCode() {
        return 120626217;
    }
}
