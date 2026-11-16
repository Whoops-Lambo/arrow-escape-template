package com.lofelt.haptics;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.annotation.RequiresApi;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Arrays;
import java.util.stream.LongStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@RequiresApi
class Player {
    private boolean clipLoaded = false;
    private boolean clipLoopingEnabled = false;
    private final Context context;
    private VibrationEffect effect;
    private Vibrator vibrator;

    private VibrationEffect getPaddedEffect(long[] jArr, int[] iArr) {
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length + 1);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        long jCalculatePaddingTiming = calculatePaddingTiming(jArr);
        if (jCalculatePaddingTiming <= 0) {
            return VibrationEffect.createWaveform(jArr, iArr, getRepeatValue());
        }
        jArrCopyOf[jArr.length] = jCalculatePaddingTiming;
        iArrCopyOf[iArr.length] = 1;
        return VibrationEffect.createWaveform(jArrCopyOf, iArrCopyOf, getRepeatValue());
    }

    private void loadCallback(long[] jArr, int[] iArr, boolean z) {
        this.clipLoaded = true;
        this.clipLoopingEnabled = z;
        if (jArr.length == 0 || iArr.length == 0 || Arrays.stream(jArr).allMatch(new a()) || Arrays.stream(iArr).allMatch(new b())) {
            this.effect = null;
            return;
        }
        this.vibrator = (Vibrator) this.context.getSystemService("vibrator");
        if (Build.VERSION.SDK_INT > 30 || this.clipLoopingEnabled) {
            this.effect = VibrationEffect.createWaveform(jArr, iArr, getRepeatValue());
        } else {
            this.effect = getPaddedEffect(jArr, iArr);
        }
    }

    private void seekCallback(long[] jArr, int[] iArr) {
        loadCallback(jArr, iArr, false);
        stopCallback();
    }

    private void unloadCallback() {
        this.clipLoaded = false;
        this.clipLoopingEnabled = false;
        this.vibrator = null;
        this.effect = null;
    }

    private int getRepeatValue() {
        return this.clipLoopingEnabled ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$loadCallback$0(long j) {
        return j == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$loadCallback$1(int i) {
        return i == 0;
    }

    private void playCallback() {
        if (!this.clipLoaded) {
            y.j("Unable to play, no clip loaded");
            return;
        }
        if (this.effect == null) {
            return;
        }
        if (this.vibrator == null) {
            y.j("Unable to play, Vibrator service unavailable");
        } else {
            stopCallback();
            this.vibrator.vibrate(this.effect);
        }
    }

    private void stopCallback() {
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    public Player(Context context) {
        this.context = context;
    }

    private long calculatePaddingTiming(long[] jArr) {
        double dSum = LongStream.of(jArr).sum();
        double length = jArr.length;
        if (dSum >= 100.0d && length >= 50.0d) {
            return Math.round(((Math.log(dSum) * 0.39d) - 1.53d) * length * 4.0d);
        }
        return 0L;
    }
}
