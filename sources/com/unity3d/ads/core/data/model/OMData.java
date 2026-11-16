package com.unity3d.ads.core.data.model;

import com.explorestack.protobuf.z;
import com.ironsource.C4962rg;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.jc1;
import defpackage.n30;
import defpackage.s71;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/data/model/OMData;", "", "version", "", HandleInvocationsFromAdViewer.KEY_OM_PARTNER, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", C4962rg.b, "()Ljava/lang/String;", "getPartnerName", "getPartnerVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OMData {

    @NotNull
    private final String partnerName;

    @NotNull
    private final String partnerVersion;

    @NotNull
    private final String version;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OMData)) {
            return false;
        }
        OMData oMData = (OMData) other;
        return s71.b(this.version, oMData.version) && s71.b(this.partnerName, oMData.partnerName) && s71.b(this.partnerVersion, oMData.partnerVersion);
    }

    public static /* synthetic */ OMData copy$default(OMData oMData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oMData.version;
        }
        if ((i & 2) != 0) {
            str2 = oMData.partnerName;
        }
        if ((i & 4) != 0) {
            str3 = oMData.partnerVersion;
        }
        return oMData.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPartnerName() {
        return this.partnerName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    @NotNull
    public final String getPartnerName() {
        return this.partnerName;
    }

    @NotNull
    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.partnerVersion.hashCode() + n30.c(this.version.hashCode() * 31, 31, this.partnerName);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OMData(version=");
        sb.append(this.version);
        sb.append(", partnerName=");
        sb.append(this.partnerName);
        sb.append(", partnerVersion=");
        return jc1.q(sb, this.partnerVersion, ')');
    }

    public OMData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        z.r(str, str2, str3);
        this.version = str;
        this.partnerName = str2;
        this.partnerVersion = str3;
    }

    @NotNull
    public final OMData copy(@NotNull String version, @NotNull String partnerName, @NotNull String partnerVersion) {
        version.getClass();
        partnerName.getClass();
        partnerVersion.getClass();
        return new OMData(version, partnerName, partnerVersion);
    }
}
