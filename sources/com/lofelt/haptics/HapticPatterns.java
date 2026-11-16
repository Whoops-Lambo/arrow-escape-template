package com.lofelt.haptics;

import android.content.Context;
import android.os.Vibrator;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi
public class HapticPatterns {
    private final Vibrator vibrator;

    public void playMaximumAmplitudePattern(float[] fArr) {
        Vibrator vibrator = this.vibrator;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        if (fArr.length > 1) {
            long[] jArr = new long[fArr.length];
            jArr[0] = 0;
            for (int i = 1; i < fArr.length; i++) {
                jArr[i] = (long) ((fArr[i] - fArr[i - 1]) * 1000.0f);
            }
            this.vibrator.vibrate(jArr, -1);
        }
    }

    public void stopPattern() {
        Vibrator vibrator = this.vibrator;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        this.vibrator.cancel();
    }

    public HapticPatterns(Context context) {
        this.vibrator = (Vibrator) context.getSystemService("vibrator");
    }
}
