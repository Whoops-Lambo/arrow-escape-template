package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import defpackage.cz;
import defpackage.tb5;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfw {

    @NotNull
    private final WebView zza;

    @NotNull
    private final cz zzb;

    public final void zzb(@NotNull String str, @NotNull String... strArr) {
        tb5.t(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }

    public zzfw(@NotNull WebView webView, @NotNull cz czVar) {
        this.zza = webView;
        this.zzb = czVar;
    }
}
