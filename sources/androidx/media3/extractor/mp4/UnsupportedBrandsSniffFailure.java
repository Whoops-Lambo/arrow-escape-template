package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;
import defpackage.x21;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final x21 compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i, @Nullable int[] iArr) {
        x21 x21Var;
        this.majorBrand = i;
        if (iArr == null || iArr.length == 0) {
            x21Var = x21.c;
        } else {
            x21Var = new x21(Arrays.copyOf(iArr, iArr.length));
        }
        this.compatibleBrands = x21Var;
    }
}
