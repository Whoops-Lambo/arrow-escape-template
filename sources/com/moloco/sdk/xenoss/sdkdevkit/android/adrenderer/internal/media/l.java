package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class l {
    public static final k a = new k(1.0d, 512000, false);

    public static final g a(Exception exc) {
        if (exc instanceof UnknownHostException) {
            return g.q;
        }
        if (exc instanceof SocketException) {
            return g.i;
        }
        if (exc instanceof SSLHandshakeException) {
            return g.j;
        }
        if (exc instanceof IOException) {
            return g.f;
        }
        if (exc instanceof SecurityException) {
            return g.g;
        }
        if (exc instanceof m) {
            return g.m;
        }
        return exc instanceof NumberFormatException ? g.l : g.r;
    }
}
