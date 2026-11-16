package com.unity3d.ads.injection;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.gd1;
import defpackage.sr0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\r\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/injection/Factory;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lgd1;", "Lkotlin/Function0;", "initializer", "<init>", "(Lsr0;)V", "", "isInitialized", "()Z", "Lsr0;", "getValue", "()Ljava/lang/Object;", "value", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Factory<T> implements gd1 {

    @NotNull
    private final sr0 initializer;

    @Override // defpackage.gd1
    public boolean isInitialized() {
        return false;
    }

    @Override // defpackage.gd1
    public T getValue() {
        return (T) this.initializer.invoke();
    }

    public Factory(@NotNull sr0 sr0Var) {
        sr0Var.getClass();
        this.initializer = sr0Var;
    }
}
