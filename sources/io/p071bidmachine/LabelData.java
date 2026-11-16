package io.p071bidmachine;

import android.graphics.Bitmap;
import defpackage.n30;
import defpackage.s71;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lio/bidmachine/LabelData;", "", "widthDp", "", "heightDp", "image", "Landroid/graphics/Bitmap;", "positionData", "Lio/bidmachine/PositionData;", "(FFLandroid/graphics/Bitmap;Lio/bidmachine/PositionData;)V", "getHeightDp", "()F", "getImage", "()Landroid/graphics/Bitmap;", "getPositionData", "()Lio/bidmachine/PositionData;", "getWidthDp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class LabelData {
    private final float heightDp;

    @NotNull
    private final Bitmap image;

    @NotNull
    private final PositionData positionData;
    private final float widthDp;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelData)) {
            return false;
        }
        LabelData labelData = (LabelData) other;
        return Float.compare(this.widthDp, labelData.widthDp) == 0 && Float.compare(this.heightDp, labelData.heightDp) == 0 && s71.b(this.image, labelData.image) && this.positionData == labelData.positionData;
    }

    public static /* synthetic */ LabelData copy$default(LabelData labelData, float f, float f2, Bitmap bitmap, PositionData positionData, int i, Object obj) {
        if ((i & 1) != 0) {
            f = labelData.widthDp;
        }
        if ((i & 2) != 0) {
            f2 = labelData.heightDp;
        }
        if ((i & 4) != 0) {
            bitmap = labelData.image;
        }
        if ((i & 8) != 0) {
            positionData = labelData.positionData;
        }
        return labelData.copy(f, f2, bitmap, positionData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getWidthDp() {
        return this.widthDp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getHeightDp() {
        return this.heightDp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PositionData getPositionData() {
        return this.positionData;
    }

    public final float getHeightDp() {
        return this.heightDp;
    }

    @NotNull
    public final Bitmap getImage() {
        return this.image;
    }

    @NotNull
    public final PositionData getPositionData() {
        return this.positionData;
    }

    public final float getWidthDp() {
        return this.widthDp;
    }

    public int hashCode() {
        return this.positionData.hashCode() + ((this.image.hashCode() + n30.b(this.heightDp, Float.hashCode(this.widthDp) * 31, 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "LabelData(widthDp=" + this.widthDp + ", heightDp=" + this.heightDp + ", image=" + this.image + ", positionData=" + this.positionData + ')';
    }

    public LabelData(float f, float f2, @NotNull Bitmap bitmap, @NotNull PositionData positionData) {
        bitmap.getClass();
        positionData.getClass();
        this.widthDp = f;
        this.heightDp = f2;
        this.image = bitmap;
        this.positionData = positionData;
    }

    @NotNull
    public final LabelData copy(float widthDp, float heightDp, @NotNull Bitmap image, @NotNull PositionData positionData) {
        image.getClass();
        positionData.getClass();
        return new LabelData(widthDp, heightDp, image, positionData);
    }
}
