package com.unity3d.ads.core.data.model;

import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.e80;
import defpackage.hg0;
import defpackage.jc1;
import defpackage.s71;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;", "", "placementId", "", "adMarkup", "mediationAdUnitId", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/MediationInfo;Ljava/util/Map;)V", "getPlacementId", "()Ljava/lang/String;", "getAdMarkup", "getMediationAdUnitId", "getMediationInfo", "()Lcom/unity3d/ads/MediationInfo;", "getExtras", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LoadConfigurationInternal {

    @Nullable
    private final String adMarkup;

    @NotNull
    private final Map<String, String> extras;

    @Nullable
    private final String mediationAdUnitId;

    @Nullable
    private final MediationInfo mediationInfo;

    @NotNull
    private final String placementId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadConfigurationInternal)) {
            return false;
        }
        LoadConfigurationInternal loadConfigurationInternal = (LoadConfigurationInternal) other;
        return s71.b(this.placementId, loadConfigurationInternal.placementId) && s71.b(this.adMarkup, loadConfigurationInternal.adMarkup) && s71.b(this.mediationAdUnitId, loadConfigurationInternal.mediationAdUnitId) && s71.b(this.mediationInfo, loadConfigurationInternal.mediationInfo) && s71.b(this.extras, loadConfigurationInternal.extras);
    }

    public /* synthetic */ LoadConfigurationInternal(String str, String str2, String str3, MediationInfo mediationInfo, Map map, int i, e80 e80Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : mediationInfo, (i & 16) != 0 ? hg0.a : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoadConfigurationInternal copy$default(LoadConfigurationInternal loadConfigurationInternal, String str, String str2, String str3, MediationInfo mediationInfo, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loadConfigurationInternal.placementId;
        }
        if ((i & 2) != 0) {
            str2 = loadConfigurationInternal.adMarkup;
        }
        if ((i & 4) != 0) {
            str3 = loadConfigurationInternal.mediationAdUnitId;
        }
        if ((i & 8) != 0) {
            mediationInfo = loadConfigurationInternal.mediationInfo;
        }
        if ((i & 16) != 0) {
            map = loadConfigurationInternal.extras;
        }
        Map map2 = map;
        String str4 = str3;
        return loadConfigurationInternal.copy(str, str2, str4, mediationInfo, map2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAdMarkup() {
        return this.adMarkup;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMediationAdUnitId() {
        return this.mediationAdUnitId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    @NotNull
    public final Map<String, String> component5() {
        return this.extras;
    }

    @Nullable
    public final String getAdMarkup() {
        return this.adMarkup;
    }

    @NotNull
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    @Nullable
    public final String getMediationAdUnitId() {
        return this.mediationAdUnitId;
    }

    @Nullable
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    public int hashCode() {
        int iHashCode = this.placementId.hashCode() * 31;
        String str = this.adMarkup;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mediationAdUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MediationInfo mediationInfo = this.mediationInfo;
        return this.extras.hashCode() + ((iHashCode3 + (mediationInfo != null ? mediationInfo.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LoadConfigurationInternal(placementId=");
        sb.append(this.placementId);
        sb.append(", adMarkup=");
        sb.append(this.adMarkup);
        sb.append(", mediationAdUnitId=");
        sb.append(this.mediationAdUnitId);
        sb.append(", mediationInfo=");
        sb.append(this.mediationInfo);
        sb.append(", extras=");
        return jc1.r(sb, this.extras, ')');
    }

    @NotNull
    public final LoadConfigurationInternal copy(@NotNull String placementId, @Nullable String adMarkup, @Nullable String mediationAdUnitId, @Nullable MediationInfo mediationInfo, @NotNull Map<String, String> extras) {
        placementId.getClass();
        extras.getClass();
        return new LoadConfigurationInternal(placementId, adMarkup, mediationAdUnitId, mediationInfo, extras);
    }

    public LoadConfigurationInternal(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable MediationInfo mediationInfo, @NotNull Map<String, String> map) {
        str.getClass();
        map.getClass();
        this.placementId = str;
        this.adMarkup = str2;
        this.mediationAdUnitId = str3;
        this.mediationInfo = mediationInfo;
        this.extras = map;
    }
}
