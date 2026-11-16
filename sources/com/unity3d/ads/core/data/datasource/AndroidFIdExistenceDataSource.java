package com.unity3d.ads.core.data.datasource;

import defpackage.j52;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidFIdExistenceDataSource;", "Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;", "className", "", "<init>", "(Ljava/lang/String;)V", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidFIdExistenceDataSource implements FIdExistenceDataSource {

    @NotNull
    private final String className;

    @Override // com.unity3d.ads.core.data.datasource.FIdExistenceDataSource
    public boolean invoke() {
        Object j52Var;
        try {
            j52Var = Class.forName(this.className);
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        return !(j52Var instanceof j52);
    }

    public AndroidFIdExistenceDataSource(@NotNull String str) {
        str.getClass();
        this.className = str;
    }
}
