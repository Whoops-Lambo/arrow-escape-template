package com.unity3d.ads.core.domain;

import defpackage.e80;
import defpackage.j52;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/IsCronetFallbackAvailable;", "", "className", "", "<init>", "(Ljava/lang/String;)V", "invoke", "", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IsCronetFallbackAvailable {

    @NotNull
    public static final String FALLBACK_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";

    @NotNull
    private final String className;

    public /* synthetic */ IsCronetFallbackAvailable(String str, int i, e80 e80Var) {
        this((i & 1) != 0 ? FALLBACK_PROVIDER_CLASS : str);
    }

    public final boolean invoke() {
        Object j52Var;
        try {
            j52Var = Class.forName(this.className);
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        return !(j52Var instanceof j52);
    }

    public IsCronetFallbackAvailable(@NotNull String str) {
        str.getClass();
        this.className = str;
    }

    public IsCronetFallbackAvailable() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
