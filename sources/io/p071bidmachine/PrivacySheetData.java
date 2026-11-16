package io.p071bidmachine;

import defpackage.s71;
import io.p071bidmachine.rendering.model.s0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lio/bidmachine/PrivacySheetData;", "", "Lio/bidmachine/LabelData;", "labelData", "Lio/bidmachine/rendering/model/s0;", "privacySheetParams", "<init>", "(Lio/bidmachine/LabelData;Lio/bidmachine/rendering/model/s0;)V", "component1", "()Lio/bidmachine/LabelData;", "component2", "()Lio/bidmachine/rendering/model/s0;", "copy", "(Lio/bidmachine/LabelData;Lio/bidmachine/rendering/model/s0;)Lio/bidmachine/PrivacySheetData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/bidmachine/LabelData;", "getLabelData", "Lio/bidmachine/rendering/model/s0;", "getPrivacySheetParams", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class PrivacySheetData {

    @NotNull
    private final LabelData labelData;

    @NotNull
    private final s0 privacySheetParams;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacySheetData)) {
            return false;
        }
        PrivacySheetData privacySheetData = (PrivacySheetData) other;
        return s71.b(this.labelData, privacySheetData.labelData) && s71.b(this.privacySheetParams, privacySheetData.privacySheetParams);
    }

    public static /* synthetic */ PrivacySheetData copy$default(PrivacySheetData privacySheetData, LabelData labelData, s0 s0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            labelData = privacySheetData.labelData;
        }
        if ((i & 2) != 0) {
            s0Var = privacySheetData.privacySheetParams;
        }
        return privacySheetData.copy(labelData, s0Var);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LabelData getLabelData() {
        return this.labelData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final s0 getPrivacySheetParams() {
        return this.privacySheetParams;
    }

    @NotNull
    public final LabelData getLabelData() {
        return this.labelData;
    }

    @NotNull
    public final s0 getPrivacySheetParams() {
        return this.privacySheetParams;
    }

    public int hashCode() {
        return this.privacySheetParams.hashCode() + (this.labelData.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PrivacySheetData(labelData=" + this.labelData + ", privacySheetParams=" + this.privacySheetParams + ')';
    }

    public PrivacySheetData(@NotNull LabelData labelData, @NotNull s0 s0Var) {
        labelData.getClass();
        s0Var.getClass();
        this.labelData = labelData;
        this.privacySheetParams = s0Var;
    }

    @NotNull
    public final PrivacySheetData copy(@NotNull LabelData labelData, @NotNull s0 privacySheetParams) {
        labelData.getClass();
        privacySheetParams.getClass();
        return new PrivacySheetData(labelData, privacySheetParams);
    }
}
