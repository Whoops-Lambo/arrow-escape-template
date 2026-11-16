package com.google.android.exoplayer2.util;

import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class SurfaceInfo {
    public final int height;
    public final int orientationDegrees;
    public final Surface surface;
    public final int width;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurfaceInfo)) {
            return false;
        }
        SurfaceInfo surfaceInfo = (SurfaceInfo) obj;
        return this.width == surfaceInfo.width && this.height == surfaceInfo.height && this.orientationDegrees == surfaceInfo.orientationDegrees && this.surface.equals(surfaceInfo.surface);
    }

    public int hashCode() {
        return (((((this.surface.hashCode() * 31) + this.width) * 31) + this.height) * 31) + this.orientationDegrees;
    }

    public SurfaceInfo(Surface surface, int i, int i2, int i3) {
        boolean z;
        if (i3 != 0 && i3 != 90 && i3 != 180 && i3 != 270) {
            z = false;
        } else {
            z = true;
        }
        Assertions.checkArgument(z, "orientationDegrees must be 0, 90, 180, or 270");
        this.surface = surface;
        this.width = i;
        this.height = i2;
        this.orientationDegrees = i3;
    }

    public SurfaceInfo(Surface surface, int i, int i2) {
        this(surface, i, i2, 0);
    }
}
