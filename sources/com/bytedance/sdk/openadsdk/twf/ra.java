package com.bytedance.sdk.openadsdk.twf;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ra {
    private final AudioManager kgy;
    private int ahm = -1;
    private boolean rz = false;

    public void kgy(boolean z, boolean z2) {
        if (this.kgy == null) {
            return;
        }
        int i = 0;
        if (z) {
            int iYo = DeviceUtils.yo();
            if (iYo != 0) {
                this.ahm = iYo;
            } else if (!z2) {
                return;
            }
            kgy(3, 0, 0);
            this.rz = true;
            return;
        }
        int iGf = this.ahm;
        if (iGf != 0) {
            if (iGf == -1) {
                if (!z2) {
                    return;
                } else {
                    iGf = DeviceUtils.gf() / 15;
                }
            }
            this.ahm = -1;
            kgy(3, iGf, i);
            this.rz = true;
        }
        iGf = DeviceUtils.gf() / 15;
        i = 1;
        this.ahm = -1;
        kgy(3, iGf, i);
        this.rz = true;
    }

    public ra(Context context) {
        this.kgy = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public void kgy(boolean z) {
        kgy(z, false);
    }

    public int kgy() {
        return this.ahm;
    }

    private void kgy(int i, int i2, int i3) {
        try {
            this.kgy.setStreamVolume(i, i2, i3);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4YCrCFI+iibBq4=", "beEhgA65Ss+BRNBYoxOzLUn4KIc=", "SOs5pheubMaNfNhRmRyl", 88);
        }
    }
}
