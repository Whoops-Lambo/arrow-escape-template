package com.unity3d.services.core.network.core;

import defpackage.az2;
import defpackage.j52;
import defpackage.k52;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u000eJ'\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/unity3d/services/core/network/core/UnityAdsUrlRequestCallback;", "Lorg/chromium/net/UrlRequest$Callback;", "<init>", "()V", "Lorg/chromium/net/UrlRequest;", "request", "Lorg/chromium/net/UrlResponseInfo;", "info", "", "newLocationUrl", "Laz2;", "onRedirectReceived", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Ljava/lang/String;)V", "onResponseStarted", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;)V", "Ljava/nio/ByteBuffer;", "byteBuffer", "onReadCompleted", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Ljava/nio/ByteBuffer;)V", "onSucceeded", "", "bodyBytes", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;[B)V", "Ljava/io/ByteArrayOutputStream;", "bytesReceived", "Ljava/io/ByteArrayOutputStream;", "Ljava/nio/channels/WritableByteChannel;", "kotlin.jvm.PlatformType", "receiveChannel", "Ljava/nio/channels/WritableByteChannel;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class UnityAdsUrlRequestCallback extends UrlRequest.Callback {
    private static final int BYTE_BUFFER_CAPACITY_BYTES = 16384;

    @NotNull
    private final ByteArrayOutputStream bytesReceived;
    private final WritableByteChannel receiveChannel;

    public abstract void onSucceeded(@NotNull UrlRequest request, @NotNull UrlResponseInfo info, @NotNull byte[] bodyBytes);

    public UnityAdsUrlRequestCallback() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.bytesReceived = byteArrayOutputStream;
        this.receiveChannel = Channels.newChannel(byteArrayOutputStream);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(@NotNull UrlRequest request, @NotNull UrlResponseInfo info, @NotNull ByteBuffer byteBuffer) {
        Object j52Var;
        request.getClass();
        info.getClass();
        byteBuffer.getClass();
        byteBuffer.flip();
        try {
            this.receiveChannel.write(byteBuffer);
            byteBuffer.clear();
            request.read(byteBuffer);
            j52Var = az2.a;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        if (k52.b(j52Var) != null) {
            request.cancel();
            onFailed(request, info, null);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(@NotNull UrlRequest request, @Nullable UrlResponseInfo info, @Nullable String newLocationUrl) {
        request.getClass();
        request.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(@NotNull UrlRequest request, @NotNull UrlResponseInfo info) {
        request.getClass();
        info.getClass();
        request.read(ByteBuffer.allocateDirect(16384));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(@NotNull UrlRequest request, @NotNull UrlResponseInfo info) {
        Object j52Var;
        request.getClass();
        info.getClass();
        try {
            j52Var = this.bytesReceived.toByteArray();
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        if (!(j52Var instanceof j52)) {
            byte[] bArr = (byte[]) j52Var;
            bArr.getClass();
            onSucceeded(request, info, bArr);
        }
        if (k52.b(j52Var) != null) {
            onFailed(request, info, null);
        }
    }
}
