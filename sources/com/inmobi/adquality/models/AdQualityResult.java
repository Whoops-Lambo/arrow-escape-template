package com.inmobi.adquality.models;

import androidx.annotation.Keep;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.e80;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/inmobi/adquality/models/AdQualityResult;", "", "imageLocation", "", "sdkModelResult", "beaconUrl", HandleInvocationsFromAdViewer.KEY_EXTRAS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageLocation", "()Ljava/lang/String;", "setImageLocation", "(Ljava/lang/String;)V", "getSdkModelResult", "setSdkModelResult", "getBeaconUrl", "getExtras", "setExtras", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AdQualityResult {

    @NotNull
    private final String beaconUrl;

    @Nullable
    private String extras;

    @NotNull
    private String imageLocation;

    @Nullable
    private String sdkModelResult;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdQualityResult)) {
            return false;
        }
        AdQualityResult adQualityResult = (AdQualityResult) other;
        return s71.b(this.imageLocation, adQualityResult.imageLocation) && s71.b(this.sdkModelResult, adQualityResult.sdkModelResult) && s71.b(this.beaconUrl, adQualityResult.beaconUrl) && s71.b(this.extras, adQualityResult.extras);
    }

    public static /* synthetic */ AdQualityResult copy$default(AdQualityResult adQualityResult, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adQualityResult.imageLocation;
        }
        if ((i & 2) != 0) {
            str2 = adQualityResult.sdkModelResult;
        }
        if ((i & 4) != 0) {
            str3 = adQualityResult.beaconUrl;
        }
        if ((i & 8) != 0) {
            str4 = adQualityResult.extras;
        }
        return adQualityResult.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageLocation() {
        return this.imageLocation;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSdkModelResult() {
        return this.sdkModelResult;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    @Nullable
    public final String getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getImageLocation() {
        return this.imageLocation;
    }

    @Nullable
    public final String getSdkModelResult() {
        return this.sdkModelResult;
    }

    public int hashCode() {
        int iHashCode = this.imageLocation.hashCode() * 31;
        String str = this.sdkModelResult;
        int iC = n30.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.beaconUrl);
        String str2 = this.extras;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setExtras(@Nullable String str) {
        this.extras = str;
    }

    public final void setSdkModelResult(@Nullable String str) {
        this.sdkModelResult = str;
    }

    @NotNull
    public String toString() {
        String str = this.imageLocation;
        String str2 = this.sdkModelResult;
        return pv1.p(pv1.r("AdQualityResult(imageLocation=", str, ", sdkModelResult=", str2, ", beaconUrl="), this.beaconUrl, ", extras=", this.extras, ")");
    }

    public AdQualityResult(@NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable String str4) {
        str.getClass();
        str3.getClass();
        this.imageLocation = str;
        this.sdkModelResult = str2;
        this.beaconUrl = str3;
        this.extras = str4;
    }

    @NotNull
    public final AdQualityResult copy(@NotNull String imageLocation, @Nullable String sdkModelResult, @NotNull String beaconUrl, @Nullable String extras) {
        imageLocation.getClass();
        beaconUrl.getClass();
        return new AdQualityResult(imageLocation, sdkModelResult, beaconUrl, extras);
    }

    public final void setImageLocation(@NotNull String str) {
        str.getClass();
        this.imageLocation = str;
    }

    public /* synthetic */ AdQualityResult(String str, String str2, String str3, String str4, int i, e80 e80Var) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
