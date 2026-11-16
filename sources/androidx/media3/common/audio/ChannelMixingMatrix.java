package androidx.media3.common.audio;

import androidx.annotation.IntRange;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public final class ChannelMixingMatrix {
    private final float[] coefficients;
    private final int inputChannelCount;
    private final boolean isDiagonal;
    private final boolean isIdentity;
    private final boolean isZero;
    private final int outputChannelCount;

    private static float[] checkCoefficientsValid(float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            if (fArr[i] < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                d.r(jc1.k(i, "Coefficient at index ", " is negative."));
                return null;
            }
        }
        return fArr;
    }

    private static float[] createConstantPowerMixingCoefficients(int i, int i2) {
        if (i2 == 1) {
            return getConstantPowerCoefficientsToMono(i);
        }
        if (i2 == 2) {
            return getConstantPowerCoefficientsToStereo(i);
        }
        if (i == i2) {
            return initializeIdentityMatrix(i2);
        }
        d.u(jc1.n("Default constant power channel mixing coefficients for ", i, "->", i2, " are not implemented."));
        return null;
    }

    private static float[] createConstantGainMixingCoefficients(int i, int i2) {
        if (i == i2) {
            return initializeIdentityMatrix(i2);
        }
        if (i == 1 && i2 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i == 2 && i2 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        d.u(jc1.n("Default channel mixing coefficients for ", i, "->", i2, " are not yet implemented."));
        return null;
    }

    public static ChannelMixingMatrix createForConstantGain(@IntRange int i, @IntRange int i2) {
        return new ChannelMixingMatrix(i, i2, createConstantGainMixingCoefficients(i, i2));
    }

    public static ChannelMixingMatrix createForConstantPower(@IntRange int i, @IntRange int i2) {
        return new ChannelMixingMatrix(i, i2, createConstantPowerMixingCoefficients(i, i2));
    }

    private static float[] initializeIdentityMatrix(int i) {
        float[] fArr = new float[i * i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[(i * i2) + i2] = 1.0f;
        }
        return fArr;
    }

    public int getInputChannelCount() {
        return this.inputChannelCount;
    }

    public float getMixingCoefficient(int i, int i2) {
        return this.coefficients[(i * this.outputChannelCount) + i2];
    }

    public int getOutputChannelCount() {
        return this.outputChannelCount;
    }

    public boolean isDiagonal() {
        return this.isDiagonal;
    }

    public boolean isIdentity() {
        return this.isIdentity;
    }

    public boolean isSquare() {
        return this.inputChannelCount == this.outputChannelCount;
    }

    public boolean isZero() {
        return this.isZero;
    }

    public ChannelMixingMatrix scaleBy(float f) {
        float[] fArr = new float[this.coefficients.length];
        int i = 0;
        while (true) {
            float[] fArr2 = this.coefficients;
            if (i >= fArr2.length) {
                return new ChannelMixingMatrix(this.inputChannelCount, this.outputChannelCount, fArr);
            }
            fArr[i] = fArr2[i] * f;
            i++;
        }
    }

    public ChannelMixingMatrix(int i, int i2, float[] fArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z, "Input channel count must be positive.");
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2, "Output channel count must be positive.");
        if (fArr.length == i * i2) {
            z3 = true;
        } else {
            z3 = false;
        }
        Assertions.checkArgument(z3, "Coefficient array length is invalid.");
        this.inputChannelCount = i;
        this.outputChannelCount = i2;
        this.coefficients = checkCoefficientsValid(fArr);
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                float mixingCoefficient = getMixingCoefficient(i3, i4);
                if (i3 == i4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (mixingCoefficient != 1.0f && z5) {
                    z9 = false;
                }
                if (mixingCoefficient != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    z7 = false;
                    if (!z5) {
                        z8 = false;
                    }
                }
            }
        }
        this.isZero = z7;
        if (isSquare() && z8) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isDiagonal = z4;
        if (z4 && z9) {
            z6 = true;
        }
        this.isIdentity = z6;
    }

    @Deprecated
    public static ChannelMixingMatrix create(@IntRange int i, @IntRange int i2) {
        return createForConstantGain(i, i2);
    }

    private static float[] getConstantPowerCoefficientsToMono(int i) {
        switch (i) {
            case 1:
                return new float[]{1.0f};
            case 2:
                return new float[]{0.7071f, 0.7071f};
            case 3:
                return new float[]{0.7071f, 0.7071f, 1.0f};
            case 4:
                return new float[]{0.7071f, 0.7071f, 0.5f, 0.5f};
            case 5:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.5f, 0.5f};
            case 6:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.7071f, 0.5f, 0.5f};
            default:
                d.u(jc1.k(i, "Default constant power channel mixing coefficients for ", "->1 are not implemented."));
                return null;
        }
    }

    private static float[] getConstantPowerCoefficientsToStereo(int i) {
        switch (i) {
            case 1:
                return new float[]{0.7071f, 0.7071f};
            case 2:
                return new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
            case 3:
                return new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.7071f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.7071f};
            case 4:
                return new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.7071f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.7071f};
            case 5:
                return new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.7071f, 0.7071f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.7071f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.7071f};
            case 6:
                return new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.7071f, 0.5f, 0.7071f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.7071f, 0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.7071f};
            default:
                d.u(jc1.k(i, "Default constant power channel mixing coefficients for ", "->2 are not implemented."));
                return null;
        }
    }
}
