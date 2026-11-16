package com.unity3d.ads.adplayer.webviewpool;

import android.webkit.WebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import defpackage.s71;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/adplayer/webviewpool/PoolEntry;", "", "webView", "Landroid/webkit/WebView;", "client", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "<init>", "(Landroid/webkit/WebView;Lcom/unity3d/ads/adplayer/AndroidWebViewClient;)V", "getWebView", "()Landroid/webkit/WebView;", "getClient", "()Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PoolEntry {

    @NotNull
    private final AndroidWebViewClient client;

    @NotNull
    private final WebView webView;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PoolEntry)) {
            return false;
        }
        PoolEntry poolEntry = (PoolEntry) other;
        return s71.b(this.webView, poolEntry.webView) && s71.b(this.client, poolEntry.client);
    }

    public static /* synthetic */ PoolEntry copy$default(PoolEntry poolEntry, WebView webView, AndroidWebViewClient androidWebViewClient, int i, Object obj) {
        if ((i & 1) != 0) {
            webView = poolEntry.webView;
        }
        if ((i & 2) != 0) {
            androidWebViewClient = poolEntry.client;
        }
        return poolEntry.copy(webView, androidWebViewClient);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WebView getWebView() {
        return this.webView;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AndroidWebViewClient getClient() {
        return this.client;
    }

    @NotNull
    public final AndroidWebViewClient getClient() {
        return this.client;
    }

    @NotNull
    public final WebView getWebView() {
        return this.webView;
    }

    public int hashCode() {
        return this.client.hashCode() + (this.webView.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PoolEntry(webView=" + this.webView + ", client=" + this.client + ')';
    }

    public PoolEntry(@NotNull WebView webView, @NotNull AndroidWebViewClient androidWebViewClient) {
        webView.getClass();
        androidWebViewClient.getClass();
        this.webView = webView;
        this.client = androidWebViewClient;
    }

    @NotNull
    public final PoolEntry copy(@NotNull WebView webView, @NotNull AndroidWebViewClient client) {
        webView.getClass();
        client.getClass();
        return new PoolEntry(webView, client);
    }
}
