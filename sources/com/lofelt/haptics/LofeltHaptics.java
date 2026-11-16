package com.lofelt.haptics;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi
public class LofeltHaptics {
    private static final String LOG_TAG = "lofelt-sdk";
    private final Context context;
    private long controllerHandle;

    private native long create(Object obj);

    private native void destroy(long j);

    private native float getClipDuration(long j);

    private native void load(long j, byte[] bArr);

    private native void loop(long j, boolean z);

    private native void play(long j);

    private native void seek(long j, float f);

    private native void setAmplitudeMultiplication(long j, float f);

    private native void stop(long j);

    @ChecksSdkIntAtLeast
    public static boolean deviceSupportsMinimumPlatformVersion() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public void finalize() throws Throwable {
        try {
            Log.d(LOG_TAG, "Finalizing LofeltHaptics instance");
            if (deviceMeetsMinimumRequirements()) {
                destroy(this.controllerHandle);
            }
            this.controllerHandle = 0L;
        } catch (RuntimeException e) {
            Log.e(LOG_TAG, "Error finalizing LofeltHaptics: " + e);
        } finally {
            super.finalize();
        }
    }

    public long getControllerHandle() {
        return this.controllerHandle;
    }

    static {
        if (deviceSupportsMinimumPlatformVersion()) {
            Log.d(LOG_TAG, "Initializing Lofelt SDK version null");
            System.loadLibrary("lofelt_sdk");
        } else {
            Log.d(LOG_TAG, "Lofelt SDK shared library was not loaded. It only can be loaded from API level 26 on");
        }
    }

    public LofeltHaptics(Context context) {
        this.controllerHandle = 0L;
        Log.d(LOG_TAG, "Creating LofeltHaptics instance");
        this.context = context;
        if (deviceMeetsMinimumRequirements()) {
            this.controllerHandle = create(new Player(context));
        }
    }

    public boolean deviceMeetsMinimumRequirements() {
        Vibrator vibrator;
        if (deviceSupportsMinimumPlatformVersion() && (vibrator = (Vibrator) this.context.getSystemService("vibrator")) != null && vibrator.hasVibrator() && vibrator.hasAmplitudeControl()) {
            return true;
        }
        return false;
    }

    public float getClipDuration() {
        if (deviceMeetsMinimumRequirements()) {
            return getClipDuration(this.controllerHandle);
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void load(byte[] bArr) {
        if (deviceMeetsMinimumRequirements()) {
            load(this.controllerHandle, bArr);
        }
    }

    public void loop(boolean z) {
        if (deviceMeetsMinimumRequirements()) {
            loop(this.controllerHandle, z);
        }
    }

    public void play() {
        if (deviceMeetsMinimumRequirements()) {
            play(this.controllerHandle);
        } else {
            y.j("Unable to play, device doesn't meet the minimum requirements to play haptics");
        }
    }

    public void seek(float f) {
        if (deviceMeetsMinimumRequirements()) {
            seek(this.controllerHandle, f);
        }
    }

    public void setAmplitudeMultiplication(float f) {
        if (deviceMeetsMinimumRequirements()) {
            setAmplitudeMultiplication(this.controllerHandle, f);
        }
    }

    public void stop() {
        if (deviceMeetsMinimumRequirements()) {
            stop(this.controllerHandle);
        }
    }
}
