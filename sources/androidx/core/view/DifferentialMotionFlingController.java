package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.VisibleForTesting;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class DifferentialMotionFlingController {
    public final Context a;
    public final DifferentialMotionFlingTarget b;
    public VelocityTracker c;
    public float d;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public final int[] h = {Integer.MAX_VALUE, 0};

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @VisibleForTesting
    public interface DifferentialVelocityProvider {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @VisibleForTesting
    public interface FlingVelocityThresholdCalculator {
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0168  */
    public final void a(MotionEvent motionEvent, int i) {
        int i2;
        int i3;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z;
        float f;
        float yVelocity;
        long j;
        int i4;
        float fSqrt;
        float f2;
        float[] fArr;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i5 = this.f;
        int[] iArr = this.h;
        if (i5 == source && this.g == deviceId && this.e == i) {
            z = false;
            i2 = 1;
            i3 = 0;
        } else {
            Context context = this.a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i2 = 1;
            int i6 = Build.VERSION.SDK_INT;
            i3 = 0;
            if (i6 >= 34) {
                Method method = ViewConfigurationCompat.a;
                scaledMinimumFlingVelocity = ViewConfigurationCompat.Api34Impl.b(viewConfiguration, deviceId2, i, source2);
            } else {
                Method method2 = ViewConfigurationCompat.a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i6 >= 34) {
                scaledMaximumFlingVelocity = ViewConfigurationCompat.Api34Impl.a(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f = source;
            this.g = deviceId;
            this.e = i;
            z = true;
        }
        int i7 = iArr[i3];
        VelocityTracker velocityTracker = this.c;
        if (i7 == Integer.MAX_VALUE) {
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.c = null;
                return;
            }
            return;
        }
        if (velocityTracker == null) {
            this.c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.c;
        Map map = VelocityTrackerCompat.a;
        velocityTracker2.addMovement(motionEvent);
        int i8 = Build.VERSION.SDK_INT;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i9 = 20;
        if (i8 < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = VelocityTrackerCompat.a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new VelocityTrackerFallback());
            }
            VelocityTrackerFallback velocityTrackerFallback = (VelocityTrackerFallback) map2.get(velocityTracker2);
            long[] jArr = velocityTrackerFallback.b;
            long eventTime = motionEvent.getEventTime();
            if (velocityTrackerFallback.d != 0 && eventTime - jArr[velocityTrackerFallback.e] > 40) {
                velocityTrackerFallback.d = i3;
                velocityTrackerFallback.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            int i10 = (velocityTrackerFallback.e + 1) % 20;
            velocityTrackerFallback.e = i10;
            int i11 = velocityTrackerFallback.d;
            if (i11 != 20) {
                velocityTrackerFallback.d = i11 + 1;
            }
            velocityTrackerFallback.a[i10] = motionEvent.getAxisValue(26);
            jArr[velocityTrackerFallback.e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        VelocityTrackerFallback velocityTrackerFallback2 = (VelocityTrackerFallback) VelocityTrackerCompat.a.get(velocityTracker2);
        if (velocityTrackerFallback2 != null) {
            float[] fArr2 = velocityTrackerFallback2.a;
            long[] jArr2 = velocityTrackerFallback2.b;
            int i12 = velocityTrackerFallback2.d;
            if (i12 < 2) {
                fSqrt = 0.0f;
                f = 0.0f;
            } else {
                int i13 = velocityTrackerFallback2.e;
                int i14 = ((i13 + 20) - (i12 - 1)) % 20;
                long j2 = jArr2[i13];
                while (true) {
                    j = jArr2[i14];
                    long j3 = j2 - j;
                    i4 = velocityTrackerFallback2.d;
                    if (j3 <= 100) {
                        break;
                    }
                    velocityTrackerFallback2.d = i4 - 1;
                    i14 = (i14 + 1) % 20;
                }
                if (i4 < 2) {
                    fSqrt = 0.0f;
                    f = 0.0f;
                } else if (i4 == 2) {
                    int i15 = (i14 + 1) % 20;
                    long j4 = jArr2[i15];
                    if (j == j4) {
                        fSqrt = 0.0f;
                        f = 0.0f;
                    } else {
                        fSqrt = fArr2[i15] / (j4 - j);
                        f = 0.0f;
                    }
                } else {
                    float fAbs = 0.0f;
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= velocityTrackerFallback2.d - 1) {
                            break;
                        }
                        int i18 = i17 + i14;
                        long j5 = jArr2[i18 % 20];
                        int i19 = (i18 + 1) % i9;
                        if (jArr2[i19] == j5) {
                            f2 = f3;
                            fArr = fArr2;
                        } else {
                            i16++;
                            f2 = f3;
                            fArr = fArr2;
                            float fSqrt2 = (fAbs < f3 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                            float f4 = fArr[i19] / (jArr2[i19] - j5);
                            fAbs += Math.abs(f4) * (f4 - fSqrt2);
                            if (i16 == i2) {
                                fAbs *= 0.5f;
                            }
                        }
                        i17++;
                        f3 = f2;
                        fArr2 = fArr;
                        i9 = 20;
                        i2 = 1;
                    }
                    f = f3;
                    fSqrt = (fAbs < f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                }
            }
            float f5 = fSqrt * 1000.0f;
            velocityTrackerFallback2.c = f5;
            if (f5 < (-Math.abs((float) r4))) {
                velocityTrackerFallback2.c = -Math.abs(Float.MAX_VALUE);
            } else if (velocityTrackerFallback2.c > Math.abs((float) r4)) {
                velocityTrackerFallback2.c = Math.abs((float) r4);
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = VelocityTrackerCompat.Api34Impl.a(velocityTracker2, i);
        } else if (i == 0) {
            yVelocity = velocityTracker2.getXVelocity();
        } else if (i == 1) {
            yVelocity = velocityTracker2.getYVelocity();
        } else {
            VelocityTrackerFallback velocityTrackerFallback3 = (VelocityTrackerFallback) VelocityTrackerCompat.a.get(velocityTracker2);
            yVelocity = (velocityTrackerFallback3 == null || i != 26) ? f : velocityTrackerFallback3.c;
        }
        DifferentialMotionFlingTarget differentialMotionFlingTarget = this.b;
        float fA = differentialMotionFlingTarget.a() * yVelocity;
        float fSignum = Math.signum(fA);
        if (z || (fSignum != Math.signum(this.d) && fSignum != f)) {
            differentialMotionFlingTarget.c();
        }
        if (Math.abs(fA) < iArr[0]) {
            return;
        }
        int i20 = iArr[1];
        float fMax = Math.max(-i20, Math.min(fA, i20));
        this.d = differentialMotionFlingTarget.b(fMax) ? fMax : f;
    }

    public DifferentialMotionFlingController(Context context, DifferentialMotionFlingTarget differentialMotionFlingTarget) {
        this.a = context;
        this.b = differentialMotionFlingTarget;
    }
}
